package homework.lesson3.davidgevorgyan.additionaltasks;


public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = new int[7];
        homework.lesson2.davidgevorgyan.util.ArrayUtil.fillRandomArray(array,100);
        homework.lesson2.davidgevorgyan.util.ArrayUtil.print(array," ");
        shiftLeft(array, 2);
        homework.lesson2.davidgevorgyan.util.ArrayUtil.print(array," ");

    }


    /**
     * Shifts each element of the specified array to left such that:
     * lets initial array is
     * {1, 2, 3, 4, 5, 6, 7} and shiftSize is 2,
     * after the method call order of array element should be
     * {3, 4, 5, 6, 7, 1, 2}
     * @param a
     * @param shiftSize
     */
    public static void shiftLeft(int a[], int shiftSize) {
        int length = a.length;
        int b[] = a.clone();
        for (int i = 0; i < length ; i++) {
            if (shiftSize > i)
                a[length - shiftSize + i] = b[i];
            if (shiftSize + i < length)
                a[i] = b[i + shiftSize];
        }
    }
}