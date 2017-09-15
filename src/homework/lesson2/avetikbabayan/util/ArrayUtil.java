//package homework.lesson2.avetikbabayan.util;
//
///**
// * This class contains utility methods for array
// * manipulation.
// */
//public class ArrayUtil {
//    //testAvetik**
//    /**
//     * Sorts the util elements by odd and even number
//     * such that if first number is odd then second must be even number
//     * this means that it will be found the next even number and swap with the second element
//     * if the second element is odd. And so on for the next elements of the util
//     */
//    }
//
//    public static void main(String[] args) {
//        int[] arraya = new int[10];
//        arraya[0] = 15;
//        arraya[1] = 10;
//        arraya[2] = 25;
//        arraya[3] = 20;
//        arraya[4] = 50;
//        arraya[5] = -15;
//        arraya[6] = -50;
//        arraya[7] = 30;
//        arraya[8] = 16;
//        arraya[9] = 150;
//
//        int [] z;
//        System.out.println("Base:");
//        print(arraya, ";");
//
//        System.out.println("\n");
//
//        System.out.println("Swap sixth and seventh values :");
//        swap(arraya,5,6);
//        print(arraya, ";");
//
//        System.out.println("\n");
//
//        System.out.println("Reverse in another array:");
//        z=reverse(arraya);
//        print(z,";");
//
//        System.out.println("\n");
//
//        System.out.println(" Reverse in same array:");
//        reverseInSameArray(arraya);
//        print(arraya,";");
//
//        System.out.println("Min: "+getMinimum(arraya));
//
//
//        System.out.println("Total sum: "+ getSum(arraya));
//
//        System.out.println("Max: "+getMaximum(arraya));
//
//        int[] arrayb = new int[9];
//
//        System.out.println("Array2 is:");
//        print(arrayb,";");
//
//    }
//    public static void sortByOddAndEven(int [] array) {
////        TODO   implement
//    }
//
//    public static int getMaximum(int[] array) {
//    int max = 0;
//         for (int arraya:array) {
//             if (max < arraya);
//             max = arraya;
//             }
//        return max;
//    }
//
//    public static int getMinimum(int[] array) {
//        int min = 0;
//        for (int arraya : array) {
//            if (min > arraya) ;
//            min = arraya;
//        }
//        return min;
//    }
//
//     public static int getSum(int[] array) {
//         int sum = 0;
//         for (int arraya : array) {
//             sum = sum + arraya;
//         }
//         return sum;
//     }
//    public static int[] reverse (int[] arraya)
//    {
//            int[] reversed =new int[arraya.length];
//        for (int i = 0; i < arraya.length / 2; i++) {
//             reversed [i] = arraya[arraya.length - i - 1];
//                  }
//        return reversed;
//    }
//
//    public static void reverseInSameArray(int[] arraya) {
//            for (int sw = 0; sw < (arraya.length / 2); sw++) {
//                    swap(arraya,sw,arraya.length - sw - 1);
//            }
//    }

//    private static int swap(int[] arraya, int i, int j) {
//         int change = arraya [i];
//         arraya [i] = arraya [j];
//         arraya [j] = change;
//    return arraya [i,j];
//        }
//
//    public static void print(int[] arraya, String s) {
//        print (arraya, ";");
//    }
//
//    public static void print1 (int[] arraya) {
//            for (int arra: arraya) {
//                System.out.print(arra+ " ;");
//            }
//            System.out.println("");
//        }
//}