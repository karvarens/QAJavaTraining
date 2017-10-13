package homework.lesson3.vardankhalatyan.additionaltasks;



public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        shiftLeft(array, 4);
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
        for (int j = 1; j <= shiftSize; j++){
            for(int i = 0; i < (a.length - 1); i++) {
                homework.lesson2.vardankhalatyan.util.ArrayUtil.swap(a, i, i + 1);
            }
        }
        homework.lesson2.vardankhalatyan.util.ArrayUtil.print(a);

    }
}


