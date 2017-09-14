package homework.lesson2.davidgevorgyan.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilTest {
    @Test
    void sortByOddAndEven() {
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