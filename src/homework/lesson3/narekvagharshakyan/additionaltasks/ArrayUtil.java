package homework.lesson3.narekvagharshakyan.additionaltasks;


import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] matrix = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shiftLeft(matrix, 3);
    }


    /**
     * Shifts each element of the specified array to left such that:
     * lets initial array is
     * {1, 2, 3, 4, 5, 6, 7} and shiftSize is 2,
     * after the method call order of array element should be
     * {3, 4, 5, 6, 7, 1, 2}
     * @param array
     * @param shiftSize
     */
    public static void shiftLeft(int array[], int shiftSize) {
        int temp = 0 - array.length + shiftSize;

        int [] array_reserve = array.clone();
        for (int i = 0; i < array.length; i++) {
            if(i < array.length - shiftSize)
                array_reserve[i] = array[i + shiftSize];
            else
                array_reserve[i] = array[temp + i];
        }

        array = array_reserve.clone();
        printArray(array);
    }


    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

}
