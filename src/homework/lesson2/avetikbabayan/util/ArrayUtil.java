package homework.lesson2.avetikbabayan.util;

/**
 * This class contains utility methods for array
 * manipulation.
 */
public class ArrayUtil {
    //testAvetik**
    /**
     * Sorts the util elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */

//    public static int Array (int[] array) {
//
//    }

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 15;
        array[1] = 10;
        array[2] = 25;
        array[3] = 20;
        array[4] = 50;
        array[5] = -15;
        array[6] = -50;
        array[7] = 30;
        array[8] = 16;
        array[9] = 150;
    }
    public static void sortByOddAndEven(int [] array) {
//        TODO   implement
    }

    public static int getMaximum(int[] array) {
    int max = 0;
         for (int arraya:array) {
             if (max < arraya);
             max = arraya;
//             return max;
         }
        return max;
    }

    public static int getMinimum(int[] array) {
    int min = 0;
        for (int arraya:array) {
            if (min > arraya) //  ;
            min = arraya;
        }
            return min;
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
        int sum = 0;
        for (int arraya : array) {
            sum = sum + arraya;
//            return sum;
        }
        return sum;

    }

    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array  an array corresponding to which must be created reversed array
     * @return new created reversed array to the specified parameter "array"
     */
    public static int[] reverse (int[] array){
            int[] reversed =new int[array.length];

        for (int i = 0; i < array.length / 2; i++) {
             reversed [i] = array[array.length - i - 1];

        }
//        return arraya[i];
        return reversed;
    }

    public int[] reverse3(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }
        return reversed;
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

