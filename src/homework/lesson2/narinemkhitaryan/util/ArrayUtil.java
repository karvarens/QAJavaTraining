package homework.lesson2.narinemkhitaryan.util;

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
//        TODO   implement
    }

    public static int getMaximum(int[] array) {
        int i;
        int max; // max element for array
        max = array[0];
        for (i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;

        }
        return max;
    }


    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }

        return min;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array  an array corresponding to which must be created reversed array
     * @return new created reversed array to the specified parameter "array"
     */
    public static int[] reverse(int[] array) {
        int[] arrayNew = new int[array.length];
        for (int i = array.length - 1; i >= 0 ; --i) {
            arrayNew[array.length - (i + 1)] = array [i];

        }
//
        return arrayNew;
    }

    public static void main(String[] args) {
        int [] arrayTest = {2, 45, 6, 7, 12, 34, 90};
        int [] arrayReverse = reverse(arrayTest);
        for (int i = 0; i < arrayTest.length; i++) {
            System.out.println(arrayReverse[i]);

        }
        print(arrayTest, " - ");
    }
    /**
     * Reverses the elements order of the specified array
     * @param array  an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
        for (int i = 0; i < array.length / 2 ; i++) {
            int temp = array [i];
            array [i] = array [array.length - 1 - i];
            array [array.length -1 -i] = temp;

        }
//        TODO implement

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
        int temp = array [i];
        array [i] = array [j];
        array [j] = temp;

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
        for (int i = 0; i < a.length -2; i++) {
            System.out.print(a[i] + delimiter);
        }
        System.out.println(a[a.length-1]);
    }


}
      
