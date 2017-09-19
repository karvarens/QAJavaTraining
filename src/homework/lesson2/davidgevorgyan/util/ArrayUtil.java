package homework.lesson2.davidgevorgyan.util;

import java.util.Random;
/**
 * This class contains utility methods for array
 * manipulation.
 */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] a = new int[9];
        fillRandomArray(a,10);
        int [] z;
        System.out.println("Original array #1 is:");
        print(a,";");

        System.out.println("\nReverse in another array:");
        z=reverse(a);
        print(z,";");

        System.out.println("\nSwap second and third values in an array:");
        swap(a,1,2);
        print(a,";");

        System.out.println("\nReverse in same array:");
        reverseInSameArray(a);
        print(a,";");

        System.out.println("\nArray values summary is: "+getSum(a));
        System.out.println("\nArray minimal value is: "+getMinimum(a));
        System.out.println("\nArray maximal value is: "+getMaximum(a));
        int[] b = new int[1000000];
        fillRandomArray(b,1000);
        int[] c = b.clone();
        sortByOddAndEvenDavid(b);
        sortByOddAndEvenKaren(c);
    }


    /**
     * Sorts the util elements by odd and even number. Algorithm by David.
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEvenDavid(int[] array) {
        for (int i = 0, j = 1; j < array.length;) {
            if((array[i] + array[j]) % 2 != 0 ) {
                swap(array, i + 1, j);
                i++;
            }
            else
                j++;
        }
    }

    /**
     * Sorts the util elements by odd and even number. Algorithm by Karen.
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEvenKaren(int[] array){
        long startTime = System.currentTimeMillis();
        int stepsCount = array.length - 2;
        for (int i = 0; i < stepsCount; i++) {
            int j = i + 1;
            while ((array[i] + array[j]) % 2 == 0 ) {
                j++;
                if(j >= array.length){
                    return;
                }
            }
            if(j > i + 1 ){
                swap(array, i + 1, j);
            }
        }
    }

     public static void sortByOddAndEvenDavid0 (int[] array) {
        for (int i = 0, j = 1; j < array.length;) {
            if(Math.abs(array[i] % 2) != Math.abs(array[j] % 2)) {
                swap(array, i + 1, j);
                i++;
            } else {
                j++;
            }
        }
    }

    public static void sortByOddAndEvenKaren0 (int[] array) {
        int stepsCount = array.length - 2;
        for (int i = 0; i < stepsCount; i++) {
            int j = i + 1;
            while ((array[i] + array[j]) % 2 == 0 ) {
                if(++j >= array.length){
                    return;
                }
            }
            if(j > i + 1 ){
                swap(array, i + 1, j);
            }
        }
    }

    /**
     * Calculates maximal value of an array
     * @param array int array
     * @return maximal value
     */

    public static int getMaximum(int[] array) {
        int max = 0;
        for (int a: array) {
            if (max < a)
                max = a;
        }
        return max;
    }

    /**
     * Calculates minimal value of an array
     * @param array int array
     * @return minimal value
     */
    public static int getMinimum(int[] array) {
        int min = 0;
        for (int a: array) {
            if (min > a)
                min = a;
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
        for (int s: array) {
            sum = sum + s;
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
        int l=array.length;
        int [] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i]=array[l-1-i];
        }
        return a;
    }


    /**
     * Reverses the elements order of the specified array
     * @param array  an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            swap(array, i, array.length - i - 1);
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
        int s = array[i];
        array[i] = array[j];
        array[j] = s;
    }


    public static void print(int[] a) {
        print(a, " ");
    }


    /**
     * Prints all elements in an array by using specified delimiter between elements.
     *
     * @param array the util to print
     */
    public static void print(int[] array, String delimiter) {
        for (int a: array) {
            System.out.print(a+delimiter+" ");
        }
        System.out.println("");
    }


    /**
     *
     * @param a array name
     */
    public static void fillRandomArray(int [] a,int mod) {
        int length = a.length;
        Random generator = new Random();
        for (int i = 0; i < length; i++) {
            a[i] = generator.nextInt() % mod;
        }
    }

    public static int[] randomIntArray(int length, int n) {
        int[] a = new int[length];
        Random generator = new Random();

        for (int i = 0; i < a.length; i++)
            a[i] = generator.nextInt(n);

        return a;
    }

}
      
