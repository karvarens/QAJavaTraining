package homework.lesson2.asyagrigoryan.util;

import java.util.logging.XMLFormatter;

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
    public static void sortByOddAndEven(int [] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {

                if (array[i]%2 != array[j]%2){

                    swap(array, i + 1, j);

                }

            }


        }
    }

    public static int getMaximum(int[] array) {
        int max = array[0];

        for(int i=1; i<array.length; i++) {

            if (array[i] > max)
                max = array[i];
        }
        return max;
    }


    public static int getMinimum(int[] array) {
        int min = array[0];

        for (int i = 0; i<array.length; i++){

            if (array[i] < min)
                min = array[i];
        }
//
        return min;
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
        int Sum = 0;

        for (int i = 0; i < array.length; i++)
            Sum = Sum + array[i];

        return Sum;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array  an array corresponding to which must be created reversed array
     * @return new created reversed array to the specified parameter "array"
     */
    public static int[] reverse(int[] array) {

        int[] arrayNew = new int[array.length];

        for (int i = array.length - 1 ; i >= 0; i--){

            arrayNew [array.length - i - 1] = array[i];

        }

        return arrayNew;
    }

    /**
     * Reverses the elements order of the specified array
     * @param array  an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {

        for (int i = 0; i < array.length/2; i++){

            int a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;
        }

    }

    /**
    * Swaps the elements at the specified positions in the specified array.
    * (If the specified positions are equal, invoking this method leaves
    * the array unchanged.)
    *
    * @param array The array in which to swap elements.
    * @param i the index of one element to be swapped.
    * @param j the index of the other element to be swapped.
    */
    private static void swap(int[] array, int i, int j) {

        int a = array[i];
        array[i] = array[j];
        array[j] = a;

    }

    public static void print(int[] a) {
        print(a, " ^ ");
    }

    /**
     * Prints all elements in an array by using specified delimiter between elements.
     *
     * @param a the util to print
     */
    public static void print(int[] a, String delimiter) {

        System.out.println("Array with delimiter: ");

        for (int i = 0; i <= a.length - 2; i++) {

        System.out.print(a[i] + delimiter);

        }

        System.out.println(a[a.length - 1]);
    }

    public static void print(int[][] a, String delimiter) {

        System.out.println("Matrix with delimiter: ");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {

                System.out.print(a[i][j] + delimiter);
            }

            System.out.println(a[i][a.length - 1]);

        }

    }

    public static void main(String[] args) {
        int[] array = {-15, 7, 19, -5, 3, 14, 0};
        int max = getMaximum(array);
        System.out.println("Maximum of array: " + max);
        int min = getMinimum(array);
        System.out.println("Minimum of array: " + min);
        int Sum = getSum(array);
        System.out.println("Sum of array: " + Sum);
        //int [] arrayNew = reverse(array);

        reverseInSameArray(array);

       // print(array);

        print(array, "^");

        int[][] matrix = {{12, 1, -3},
        {13, 67, 0},
        {2, 0, -7}};

        print(matrix, "*");

    }
}
      
