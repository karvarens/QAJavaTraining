package homework.lesson2.armenmarutyan.util;

public class ArrayUtil {
    /**
     * This class contains utility methods for array
     * manipulation.
     */
         /**
         * Sorts the util elements by odd and even number
         * such that if first number is odd then second must be even number
         * this means that it will be found the next even number and swap with the second element
         * if the second element is odd. And so on for the next elements of the util
         */
        public static void sortByOddAndEven(int [] array) {
            int stepsCount = array.length - 2;
            for (int i = 0; i < stepsCount ; i++) {
                int j = i + 1;
                while ( (array[i] + array[j]) % 2  == 0) {
                    j++;
                    if( j>= array.length){
                        return;
                    }
                }
                if ( j > i + 1 ){
                    swap(array, i+1, j);
                }
            }

        }

        public static int getMaximum(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
//
            return max;   // this must be replaced by correct code
        }


        public static int getMinimum(int[] array) {
          int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
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
            int sum=0;
            for (int i = 0; i < array.length; i++) {
                sum +=array[i];
            }

            return sum;
         }


        /**
         * Creates the reversed to specified array new array and returns it.
         *
         * @param array  an array corresponding to which must be created reversed array
         * @return new created reversed array to the specified parameter "array"
         */
        public static int[] reverse(int array[]) {
            for (int i = 0; i < array.length / 2; i++) {
                int rev;
                rev = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length -1-i] = rev;

            }
            return array;   // this must be replaced by correct code
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
        public static void swap(int[] array, int i, int j) {
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

            for (int i = 0; i < a.length ; i++) {
                System.out.print(a[i] + delimiter);
            }
        }




    }
