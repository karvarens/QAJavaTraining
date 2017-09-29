package homework.lesson3.davidgevorgyan.additionaltasks;


public class ArrayUtil {
    public static void main(String[] args) {
        int[] a = new int[1_000_000];
        homework.lesson2.davidgevorgyan.util.ArrayUtil.fillRandomArray(a,1000);
        int[] b= a.clone();
        shiftLeftWithArray(a, 999);
        shiftLeftWithoutArray(b, 999);

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
    public static void shiftLeftWithArray(int[] array, int shiftSize) {
        int length = array.length;
        int[] b= array.clone();
        for (int i = 0; i < length ; i++) {
            if (shiftSize > i)
                array[length - shiftSize + i] = b[i];
            if (shiftSize + i < length)
                array[i] = b[i + shiftSize];
        }
    }

    /**
     * Shifts each element of the specified array to left without temporary array
     * @param array
     * @param shiftSize
     */
    public static void shiftLeftWithoutArray(int[] array, int shiftSize) {
        int timesShifted = 0;
        while (timesShifted < shiftSize) {
            for (int i = 0; i < array.length - 1; i++) {
                homework.lesson2.davidgevorgyan.util.ArrayUtil.swap(array, i, i+1);
            }
            timesShifted++;
        }

    }

}