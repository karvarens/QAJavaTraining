package homework.lesson2.avetikbabayan.util;

public class ArrayUtilTest {

public static void main(String[] args) {
    int[] ar = {12, 23, 34, 45};
    ArrayUtil.getMaximum(ar);
    System.out.print("Maximum is " + ArrayUtil.getMaximum(ar));
    System.out.println("Minimum is " + ArrayUtil.getMinimum(ar));
    System.out.println("Sum is " + ArrayUtil.getSum(ar));
    ArrayUtil.reverseInSameArray(ar);
    ArrayUtil.print(ar);
    System.out.println("Swapped elements 2 and 3 are " + ArrayUtil.swap(ar, 2, 3));
    }
    }