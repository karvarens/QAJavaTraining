package homework.lesson3.avetikbabayan.loop.additionaltasks;


public class ArrayUtil {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,0,1,3,5,7,9};
        printArray(arr);
        shiftLeft(arr, 7);
        printArray(arr);
    }


    /**
     * Shifts each element of the specified array to left such that:
     * lets initial array is
     * {1, 2, 3, 4, 5, 6, 7} and shiftSize is 2,
     * after the method call order of array element should be
     * {3, 4, 5, 6, 7, 1, 2}
     *
     * @param arr
     * @param shiftSize
     */
    public static void shiftLeft(int arr[], int shiftSize) {
        int length = arr.length; //
        if(shiftSize >= arr.length ) {
            shiftSize = shiftSize % arr.length;
        }

//        codding convention violation arr_back do not use underscore in non final variables names
        int [] arrBack = arr.clone();
        for (int i = 0; i < shiftSize; i++) {
            int tmp = arr[0];
            for (int j = 1; j < length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[length - 1] = tmp;
//            if(i < arr.length - shiftSize)
//                arrBack[i] = arr[i + shiftSize];
//            else
//                arrBack[i] = arr[matrix + i];
        }

        arr = arrBack.clone();
    }


    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
