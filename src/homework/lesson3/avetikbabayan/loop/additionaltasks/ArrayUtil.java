package homework.lesson3.avetikbabayan.loop.additionaltasks;


public class ArrayUtil {
    public static void main(String[] args) {
        int [] Arr = {2,4,6,8,0,1,3,5,7,9};
        shiftLeft(Arr, 2);
    }


    /**
     * Shifts each element of the specified array to left such that:
     * lets initial array is
     * {1, 2, 3, 4, 5, 6, 7} and shiftSize is 2,
     * after the method call order of array element should be
     * {3, 4, 5, 6, 7, 1, 2}
     *
     * @param a
     * @param shiftSize
     */
    public static void shiftLeft(int arr[], int shiftSize) {

        int Matr = shiftSize-arr.length;
        int [] arr_back = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - shiftSize)
                arr_back[i] = arr[i + shiftSize];
            else
                arr_back[i] = arr[Matr + i];
        }

        arr = arr_back.clone();
        printArray(arr);
    }


    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}
