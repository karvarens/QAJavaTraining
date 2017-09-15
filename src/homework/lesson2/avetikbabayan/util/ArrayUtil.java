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
    }

    public static void main(String[] args) {
        int[] arraya = new int[10];
        arraya[0] = 15;
        arraya[1] = 10;
        arraya[2] = 25;
        arraya[3] = 20;
        arraya[4] = 50;
        arraya[5] = -15;
        arraya[6] = -50;
        arraya[7] = 30;
        arraya[8] = 16;
        arraya[9] = 150;
    }
    public static void sortByOddAndEven(int [] array) {
//        TODO   implement
    }

    public static int getMaximum(int[] array) {
    int max = 0;
         for (int arraya:array) {
             if (max < arraya);
             max = arraya;
             return max;
         }
    }

    public static int getMinimum(int[] array) {
    int min = 0;
        for (int arraya:array) {
            if (min > arraya);
            min = arraya;
            return min;
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified util elements
     */
    public static int[] getSum(int[] array) {
        int sum = 0;
    for (int arraya:array) {
        sum = sum + arraya;
        return sum;
    }

    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array  an array corresponding to which must be created reversed array
     * @return new created reversed array to the specified parameter "array"
     */
    public static int[] reverse (int[] arraya)
    {
            int[] reversed =new int[arraya.length];
        for (int i = 0; i < arraya.length / 2; i++) {
             reversed [i] = arraya[arraya.length - i - 1];
                  }
        return reversed;
    }

       /**
     * Reverses the elements order of the specified array
     * @param array  an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] arraya) {
            for (int sw = 0; sw < (arraya.length / 2); sw++) {
                    swap(arraya,sw,arraya.length - sw - 1);
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
    private static void swap(int[] arraya, int i, int j) {
         int change = arraya [i];
         arraya [i] = arraya [j];
         arraya [j] = change;
    return array [i]; arraya [j];
    }

    public static void print(int[] a) {
        print (a );
    }

    /**
     * Prints all elements in an array by using specified delimiter between elements.
     *
     * @param a the util to print
     */
    public static void print1 (int[] arrayi; String delimeter) {
            for (int arra: arrayi) {
                System.out.print(arra+ delimeter+" ");
            }
            System.out.println("");

        }
}

    private static void print(int[] a) {
    }