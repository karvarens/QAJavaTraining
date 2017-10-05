package homework.lesson2.avetikbabayan.util;
//
//// **
////  * This class contains utility methods for array
////  * manipulation.
////  */
public class ArrayUtil {

    public static int getMaximum (int[] array) {
        int max = 0;
        for (int i=0; i<array.length; i++) {
        if (max < array[i])
        max = array[i];
        }
        return max;
        }

    public static int getMinimum(int[] array) {
        int min = 0;
        for (int i=0; i<array.length; i++) {
            if (min > array [i])
                min = array[i];
        }
        return min;
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int[] reverse (int[] array)
    {       int length = array.length;
        int[] reversed =new int[length];
        for (int i = 0; i < length / 2; i++) {
            reversed [i] = array[length - i - 1];
        }
        return reversed;
    }

    public static void reverseInSameArray (int[] array) {
        for (int sw = 0; sw < (array.length / 2); sw++) {
            swap(array,sw,array.length - sw - 1);
        }
    }

    public static int swap(int[] array, int i, int j) {
        int change = array [i];
        array [i] = array [j];
        array [j] = change;
        return array[i];
    }

    public static void print(int[] Array1) {
        for (int i = 0; i <Array1.length ; i++) {
            System.out.print(Array1[i]+ " ");
        }
        System.out.println();
    }

    public static void printIntAsBinary (int n) {
        for (int i =31; i>=0; i--){
            System.out.print(n >>i & 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] Array1 = {7,17,5,14,10,-10,80};
        System.out.println();
        printIntAsBinary(29);
        print(Array1);
        System.out.println();
        swap(Array1, 3,5);
        print(Array1);
        reverse(Array1);
        reverseInSameArray(Array1);
        print(Array1);
        System.out.println(getSum(Array1));
        System.out.println(getMaximum(Array1));
        System.out.println(getMinimum(Array1));
    }
}