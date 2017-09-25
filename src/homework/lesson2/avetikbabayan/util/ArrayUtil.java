package homework.lesson2.avetikbabayan.util;

// **
//  * This class contains utility methods for array
//  * manipulation.
//  */
  public class ArrayUtil {
//     //testAvetik**
//     /**
//      * Sorts the util elements by odd and even number
//      * such that if first number is odd then second must be even number
//      * this means that it will be found the next even number and swap with the second element
//      * if the second element is odd. And so on for the next elements of the util
//      */
    }
//    public static void sortByOddAndEven(int [] array) {
////        TODO   implement
//    }
//
    public static int getMaximum (int[] array) {
     int max = 0;
          for (int i=1; i<array.length; i++) {
             if (max < array[i]);
             max = array[i];
             }
      return max;
     }

    public static int getMinimum(int[] array) {
        int min = 0;
        for (int i=1; i<array.length; i++) {
            if (min > array [i]) ;
            min = array[i];
        }
        return min;
     }

     public static int getSum(int[] array) {
          int sum = 0;
          for (int i=1; i<array.length; i++) {
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

     public static void reverseInSameArray (int[] arraya) {
             for (int sw = 0; sw < (arraya.length / 2); sw++) {
                    swap(arraya,sw,arraya.length - sw - 1);
             }
     }

      public static int swap(int[] array, int i, int j) {
           int change = array [i];
          array [i] = array [j];
          array [j] = change;
     return array[i];
         }

    public static void print(int[] arrayb, String s) {
        print (arrayb, ";");
    }

    public static void print1 (int[] arrayb) {
            for (int arra: arrayb) {
                System.out.print(arra+ " ;");
            }
            System.out.println("");
        }

    public static void printIntAsBinary (int n) {
        for (int i =31; i>=0; i--){
            System.out.print(n >>i & 1);
        }
        System.out.println();
    }
}

public static void main(String[] args) {
        System.out.println("Base:");
        System.out.print(array);
        System.out.println("\n");
        System.out.println("Swap sixth and seventh values :");
        swap(array,5,6);

        System.out.println("\n");

        System.out.println("Reverse in another array:");
        z=reverse(array);
        print(z,";");

        System.out.println("\n");

        System.out.println(" Reverse in same array:");
        reverseInSameArray(array);
        print(arraya,";");

        System.out.println("Min: "+getMinimum(array));


        System.out.println("Total sum: "+ getSum(arraya));

        System.out.println("Max: "+getMaximum(arraya));

        int[] arrayb = new int[9];

        System.out.println("Array2 is:");
        print(arrayb,";");