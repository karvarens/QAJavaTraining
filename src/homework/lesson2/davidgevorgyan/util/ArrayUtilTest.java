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
        int [] a = new int[20];
        int [] b;
        ArrayUtil.fillRandomArray(a,1000);
        b=ArrayUtil.reverse(a);
        for (int i = 0; i < 10 ; i++) {
            assertEquals(true,a[i] == b[19 - i]);
        }
    }

    @Test
    void reverseInSameArray() {
        int [] a = new int[20];
        ArrayUtil.fillRandomArray(a,1000);
        int[] b = a.clone();
        ArrayUtil.reverseInSameArray(a);
        for (int i = 0; i < 10 ; i++) {
            assertEquals(true,a[i] == b[19 - i]);
        }
    }
}