package homework.lesson3.anighazaryan.additionaltasks;


public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {3,6,9,12,15};
        shiftLeft(array, 2);

        // replace with lesson2.print()

        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
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

        if (a.length ==0) {
            return;
        }

        int length = a.length;

        if (length <= shiftSize) {
            shiftSize -= length;
        }

        while (shiftSize != 0) {
            for (int i = 0; i < length - 1; i++) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
            shiftSize--;
        }

    }

}
