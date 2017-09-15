package homework.lesson2.davidgevorgyan.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilTest {
    private void verifySortedByEvenOdd(int[] array){
        int i = 0;
        int temp = array.length - 2;
        while ((array[i] + array[i + 1]) % 2 != 0)
            i++;
        while ((array[i] + array[i + 1]) % 2 == 0 && i < temp)
            i++;
        assertEquals(temp,i);
    }

    @Test
    void sortByOddAndEven() {
        int[] a = new int[1000000];
        ArrayUtil.fillRandomArray(a,1000);
        int[] b = a.clone();

        ArrayUtil.sortByOddAndEvenDavid(a);
        verifySortedByEvenOdd(a);

        ArrayUtil.sortByOddandEvenKaren(b);
        verifySortedByEvenOdd(b);
    }

    @Test
    void getMaximum() {
        int[] array={2,0,-5,-2,11};
        int result = ArrayUtil.getMaximum(array);
        assertEquals(11,result);
    }

    @Test
    void getMinimum() {
        int[] array={2,0,-5,-2,11};
        int result = ArrayUtil.getMinimum(array);
        assertEquals(-5,result);
    }

    @Test
    void getSum() {
        int[] array={2,0,-5,-2,11};
        int result = ArrayUtil.getSum(array);
        assertEquals(6,result);
    }

    @Test
    void reverse() {
    }

    @Test
    void reverseInSameArray() {
    }

    @Test
    void print() {
    }

    @Test
    void print1() {
    }

    @Test
    void fillRandomArray() {
    }


    public static void main(String[] args) {
        // todo : Organize all test methods calls here
    }


    // todo add test methods
}