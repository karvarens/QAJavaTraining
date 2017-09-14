package homework.lesson2.vardankhalatyan.util;

public class ArrayUtilTest {


    public static void main(String[] args) {

        int [] arrayMy = {0, 22, 1, -4, 33, 2, 3, 3, 3, 4, 6, 7, 8, 8};
//        ArrayUtil.sortByOddAndEven(arrayMy);
        System.out.println("get max");
        System.out.println(ArrayUtil.getMaximum(arrayMy));
        System.out.println("get min");
        System.out.println(ArrayUtil.getMinimum(arrayMy));
        System.out.println("get sum");
        System.out.println(ArrayUtil.getSum(arrayMy));
        System.out.println("print");
        ArrayUtil.print(arrayMy);
        System.out.println("reverse");
        ArrayUtil.reverse(arrayMy);
        ArrayUtil.print(arrayMy);
        System.out.println("rreverse");
        ArrayUtil.reverseInSameArray(arrayMy);
        ArrayUtil.print(arrayMy);
    }

    // todo add test methods
}