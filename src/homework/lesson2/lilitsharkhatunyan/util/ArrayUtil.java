package homework.lesson2.lilitsharkhatunyan.util;

import java.util.Arrays;


/**
 * This class contains utility methods for array
 * manipulation.
 */
public class ArrayUtil {

    /**
     * Sorts the util elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEven(int[] array) {

        // int [] arraySample = {2, 1, 3, 5, 4, 9, 8, 11};

        int length = array.length - 2;

        for (int i = 0; i < length; i++) {
            int j = i + 1;

            while ((array[i] % 2) == (array[j] % 2)) {
                j++;
                if (j >= length) {
                    print(array);
                    return;
                }
            }

            if (j > i + 1) {
                swap(array, i + 1, j);
            }
        }
    }

    public static int getMaximum(int[] array) {

        int[] arrayA = array;

        Arrays.sort(arrayA);
        int length = arrayA.length;

        System.out.println("Maximum number is: " + arrayA[length - 1]);

        return arrayA[length - 1];
    }


    public static int getMinimum(int[] array) {
        int[] arrayA = array;

        Arrays.sort(arrayA);
        System.out.println("Minimum number is: " + arrayA[0]);

        return arrayA[0];
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {

        int[] arrayA = array;
        int length = arrayA.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += arrayA[i];
        }

        System.out.println("Sum of array elements is: " + sum);

        return sum;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array an array corresponding to which must be created reversed array
     * @return new created reversed array to the specified parameter "array"
     */
    public static int[] reverse(int[] array) {

        int length = array.length;
        int[] result = new int[length];


        for (int j = length - 1; j >= 0; j--) {

            result[j] = array[length - j - 1];

        }

        System.out.println("reverse");
        print(result);

        return result;   // this must be replaced by correct code
    }

    /**
     * Reverses the elements order of the specified array
     *
     * @param array an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {

        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            swap(array, i, length / 2);

        }

        System.out.println("reverseInSameArray");
        print(array);
    }

    /**
     * Swaps the elements at the specified positions in the specified array.
     * (If the specified positions are equal, invoking this method leaves
     * the array unchanged.)
     *
     * @param array The array in which to swap elements.
     * @param i     the index of one element to be swapped.
     * @param j     the index of the other element to be swapped.
     */
    private static void swap(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void print(int[] a) {
        print(a, " ");
    }

    /**
     * Prints all elements in an array by using specified delimiter between elements.
     *
     * @param a the util to print
     */

    public static void print(int[] a, String delimiter) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + delimiter);
        }
        System.out.println();
    }


}
      
