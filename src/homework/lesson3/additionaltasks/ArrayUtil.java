package homework.lesson3.additionaltasks;


public class ArrayUtil {
    public static void main(String[] args) {
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
    public static void shiftLeft(int array[], int shiftSize) {
        int length = array.length;
        if (shiftSize>length)
            shiftSize = shiftSize
        for (int i =0, i<length; i++) {
            if (shiftSize > i)
                array[length-shiftSize+i]=
        }
    }



}
