package homework.lesson2.vardankhalatyan.util;

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
     * @param array
     */
    public static void sortByOddAndEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                if (array[i+1] % 2 == 0) {
                    continue;
                } else {
                    int tmp = array[i+1];
                    int j = i+1;
                    while (array[j] % 2 == 0) {
                        if (array[j+1] % 2 == 0) {
                            array[i+1] = array[j+1];
                            array[j+1] = tmp;
                            j++;
                        }
                    }
                }
            }
            if (array[i] % 2 == 0) {
                if (array[i+1] % 2 != 0) {
                    continue;
                } else {
                    int tmp = array[i+1];
                    int j = i+1;
                    while (array[j] % 2 != 0) {
                        if (array[j+1] % 2 != 0) {
                            array[i+1] = array[j+1];
                            array[j+1] = tmp;
                            j++;
                        }
                    }
                }
            }
        }
    }

    public static int getMaximum(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i+1] > array[i] ) {
                j = array[i+1];
            }
        }
//        TODO   implement
        return j;
    }


    public static int getMinimum(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i+1] ) {
                j = array[i];
            }
        }
//        TODO implement
        return j;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
//        TODO implement
        return 0;   // this must be replaced by correct code
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array  an array corresponding to which must be created reversed array
     * @return new created reversed array to the specified parameter "array"
     */
    public static int[] reverse(int[] array) {
//        TODO implement
        return null;   // this must be replaced by correct code
    }

    /**
     * Reverses the elements order of the specified array
     * @param array  an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
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
        //todo: implement
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
        // todo implement
    }


}
      
