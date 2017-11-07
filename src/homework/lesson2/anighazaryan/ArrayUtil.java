package homework.lesson2.anighazaryan;

public class ArrayUtil {
    /**
     * Sorts the util elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEven(int[] array) {

        System.out.println("hahaha");
        int l = array.length - 2;
        for (int i = 0; i < l; ++i) {
            for (int j = i + 1; j <= l; ++j) {
                if (array[i] % 2 != array[j] % 2) {
                    swap(array, i + 1, j);
                    break;
                }
            }
        }

        System.out.println("Yuhuuu");
    }

    public static int getMaximum(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int maximum = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        return maximum;
    }


    public static int getMinimum(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int minimum = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        return sum;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array an array corresponding to which must be created reversed array
     * @return new created reversed array to the specified parameter "array"
     */
    public static int[] reverse(int[] array) {

        if (array.length == 0) {
            return array;
        }

        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            reverseArray[array.length - 1 - i] = array[i];
        }
        return reverseArray;
    }

    /**
     * Reverses the elements order of the specified array
     *
     * @param array an array: Elements order of which must be reversed
     */
    public static void reverseInSameArray(int[] array) {

        int temp;
        int l = array.length;
//        int[] reverseArray = new int[array.length];
        for (int i = 0; i < l / 2; ++i) {
            temp = array[i];
            array[i] = array[l - i - 1];
            array[l - i - 1] = temp;
        }

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

    /**
     * Prints all elements in an array by using specified delimiter between elements.
     *
     * @param a the util to print
     */
    public static void print(int[] array, String delimiter) {
        System.out.print(array[0]);
        for (int i = 1; i < array.length; ++i) {
            System.out.print(" " + delimiter + " " + array[i]);
        }
    }

    public static void main(String args[]) {
        int[] declaredArray = {12, 10, 4, 6, 7, 5, 12};
        int maximum = getMaximum(declaredArray);
        System.out.println("Maximum value of array " + maximum);
        int minimum = getMinimum(declaredArray);
        System.out.println("Minimum value of array " + minimum);
        int sum = getSum(declaredArray);
        System.out.println("Sum of array " + sum);

        // int[] reverseArray = reverse(declaredArray);
        //print(declaredArray, "~~~");

        System.out.println("in main");

        //reverseInSameArray(declaredArray);
        //print(declaredArray, "***");

        sortByOddAndEven(declaredArray);
        print(declaredArray, "...");
    }

}

