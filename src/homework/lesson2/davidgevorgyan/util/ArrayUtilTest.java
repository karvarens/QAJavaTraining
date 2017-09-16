package homework.lesson2.davidgevorgyan.util;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilTest {
    private void verifySortedByEvenOdd(int[] array){
        int count = array.length - 2;
        int i = 0;
        while (i < count && (array[i] + array[i + 1]) % 2 != 0) {
            i++;
        }
        while (i < count && (array[i] + array[i + 1]) % 2 == 0) {
            i++;
        }
        assertEquals(count,i);
    }

    @Test
    void sortByOddAndEven() {
        int[] a = new int[1000000];
        ArrayUtil.fillRandomArray(a,1000);
        int[] b = a.clone();

        ArrayUtil.sortByOddAndEvenDavid(a);
        verifySortedByEvenOdd(a);

        ArrayUtil.sortByOddAndEvenKaren(b);
        verifySortedByEvenOdd(b);
    }

    @Test
    public void comparePerformance () {
        int countOfTries = 2;
        long averageOfAlgorithmKaren = 0;
        long averageOfAlgorithmDavid = 0;

        for (int i = 0; i < countOfTries; i++) {
            int[] a = ArrayUtil.randomIntArray (1_000_000, 1000);

            averageOfAlgorithmDavid += getSortingTimeMillisDavidAlgorithm(a.clone());
            averageOfAlgorithmKaren += getSortingTimeMillisKarenAlgorithm(a);
        }

        String result = "Average Time of Karen's algorithm " + countOfTries + " tries: " + averageOfAlgorithmKaren/countOfTries + '\n'
                      + "Average Time of David's algorithm " + countOfTries + " tries: " + averageOfAlgorithmDavid/countOfTries;
        JOptionPane.showMessageDialog(null, result);

    }

    private void verifySortedArray (int[] array) {
        int countOfSteps = array.length - 1;
        int i = 0;
        while (i < countOfSteps && (array[i] + array[i + 1]) % 2 != 0) {
            i++;
        }
        while (i < countOfSteps && (array[i] + array[i + 1]) % 2 == 0) {
            i++;
        }
        assertEquals(countOfSteps, i);
    }

    private long getSortingTimeMillisKarenAlgorithm (int[] array) {
        long startTime =  System.currentTimeMillis();
        ArrayUtil.sortByOddAndEvenKaren0(array);
        long elapsedTime = System.currentTimeMillis() - startTime;

        verifySortedArray(array);

        return elapsedTime;
    }

    private long getSortingTimeMillisDavidAlgorithm (int[] array) {
        long startTime =  System.currentTimeMillis();
        ArrayUtil.sortByOddAndEvenDavid0(array);
        long elapsedTime = System.currentTimeMillis() - startTime;

        verifySortedArray(array);

        return elapsedTime;
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

    @Test
    void print1() {
    }

    @Test
    void fillRandomArray() {
    }
}