package homework.lesson3.davidgevorgyan.additionaltasks;


import org.junit.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilTest {


    @Test
    public void comparePerformance () {
        int countOfTries = 2;
        int shiftSize=1000;
        long averageOfAlgorithmWithArray = 0;
        long averageOfAlgorithmWithoutArray = 0;

        for (int i = 0; i < countOfTries; i++) {
            int[] a = homework.lesson2.davidgevorgyan.util.ArrayUtil.randomIntArray (1_000_000, 1000);

            averageOfAlgorithmWithArray += getSortingTimeMillisWithArray(a.clone(), shiftSize);
            averageOfAlgorithmWithoutArray += getSortingTimeMillisWithoutArray(a, shiftSize);
        }

        String result = "Average Time of algorithm With Array " + countOfTries + " tries: " + averageOfAlgorithmWithArray/countOfTries + '\n'
                      + "Average Time of algorithm Without Array " + countOfTries + " tries: " + averageOfAlgorithmWithoutArray/countOfTries;
        JOptionPane.showMessageDialog(null, result);

    }

    private void verifyShift (int[] array, int check) {
        assertEquals(array[0], check); //checking that element matching shiftSize is now first one in the array
    }

    private long getSortingTimeMillisWithArray (int[] array, int shiftSize) {
        long startTime =  System.currentTimeMillis();
        int check = array[shiftSize];
        homework.lesson3.davidgevorgyan.additionaltasks.ArrayUtil.shiftLeftWithArray(array, shiftSize);
        long elapsedTime = System.currentTimeMillis() - startTime;
        verifyShift(array, check);

        return elapsedTime;
    }

    private long getSortingTimeMillisWithoutArray (int[] array, int shiftSize) {
        long startTime =  System.currentTimeMillis();
        int check = array[shiftSize];
        homework.lesson3.davidgevorgyan.additionaltasks.ArrayUtil.shiftLeftWithoutArray(array, shiftSize);
        long elapsedTime = System.currentTimeMillis() - startTime;

       verifyShift(array, check);

        return elapsedTime;
    }


}