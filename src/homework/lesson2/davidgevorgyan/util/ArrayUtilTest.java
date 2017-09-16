package homework.lesson2.davidgevorgyan.util;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilTest {
    @Test
    void sortByOddAndEvenDavid() {
        int[] array = new int[1000000];
        int temp=array.length-2;
        ArrayUtil.fillRandomArray(array,1000);
        int i=0;
        ArrayUtil.sortByOddAndEvenDavid(array);
        while ((array[i] + array[i + 1]) % 2 != 0 && i<temp)
            i++;
        while ((array[i] + array[i + 1]) % 2 == 0 && i<temp)
            i++;
        assertEquals(temp,i);
        }


    @Test
    void sortByOddAndEvenKaren() {
        int[] array = new int[1000000];
        int temp=array.length - 2;
        ArrayUtil.fillRandomArray(array,1000);
        int i=0;
        ArrayUtil.sortByOddAndEvenKaren(array);
        while ((array[i] + array[i + 1]) % 2 != 0)
            i++;
        while ((array[i] + array[i + 1]) % 2 == 0 && i<temp)
            i++;
        assertEquals(temp,i);
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
}