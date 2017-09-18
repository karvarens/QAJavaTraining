package homework.lesson2.bagrat.util;


public class ArrayUtilTest {

    public static void main(String[] args) {
        printTest();
        sortByOddAndEvenTest();
        getMaximumTest();
        getMinimumTest();
        getSumTest();
        reverseTest();
        reverseInSameArrayTest();
    }

    static void printTest() {
        int a0[] = {};
        int a1[] = { 1 };
        int a2[] = { 1, 3, 4, 2, 7, 9, 5, 6, 8 };

        System.out.println("################################################################################");
        System.out.println("Testing ArrayUtil.print");
        System.out.println();

        System.out.println("Printing {} with default delimiter");
        ArrayUtil.print(a0);
        System.out.println("Printing {} with delimiter \"-\"");
        ArrayUtil.print(a0,"-");
        System.out.println("Printing {1} with default delimiter");
        ArrayUtil.print(a1);
        System.out.println("Printing {1} with delimiter \"-\"");
        ArrayUtil.print(a1,"-");
        System.out.println("Printing { 1, 3, 4, 2, 7, 9, 5, 6, 8 } with default delimiter");
        ArrayUtil.print(a2);
        System.out.println("Printing { 1, 3, 4, 2, 7, 9, 5, 6, 8 } with delimiter \"-\"");
        ArrayUtil.print(a2,"-");

        System.out.println("################################################################################");
        System.out.println();
    }

    static void sortByOddAndEvenTest() {
        int a0[] = {};
        int a1[] = { 1 };
        int a2[] = { 1, 3, 4, 2, 7, 9, 5, 6, 8 };

        System.out.println("################################################################################");
        System.out.println("Testing ArrayUtil.sortByOddAndEven");
        System.out.println();

        System.out.println("Sorting {}");
        ArrayUtil.sortByOddAndEven(a0);
        ArrayUtil.print(a0);
        System.out.println("Sorting {1}");
        ArrayUtil.sortByOddAndEven(a1);
        ArrayUtil.print(a1);
        System.out.println("Sorting { 1, 3, 4, 2, 7, 9, 5, 6, 8 }");
        ArrayUtil.sortByOddAndEven(a2);
        ArrayUtil.print(a2);

        System.out.println("################################################################################");
        System.out.println();
    }

    static void getMaximumTest() {
        int a1[] = { 1 };
        int a2[] = { 1, 3, 4, 2, 7, 9, 5, 6, 8 };
        
        System.out.println("################################################################################");
        System.out.println("Testing ArrayUtil.getMaximum");
        System.out.println();

        System.out.println("Getting the maximum of {1}");
        System.out.println(ArrayUtil.getMaximum(a1));
        System.out.println("Getting the maximum of { 1, 3, 4, 2, 7, 9, 5, 6, 8 }");
        System.out.println(ArrayUtil.getMaximum(a2));
        
        System.out.println("################################################################################");
        System.out.println();
    }

    static void getMinimumTest() {
        int a1[] = { 1 };
        int a2[] = { 1, 3, 4, 2, 7, 9, 5, 6, 8 };

        System.out.println("################################################################################");
        System.out.println("Testing ArrayUtil.getMinimum");
        System.out.println();

        System.out.println("Getting the minimum of {1}");
        System.out.println(ArrayUtil.getMinimum(a1));
        System.out.println("Getting the minimum of { 1, 3, 4, 2, 7, 9, 5, 6, 8 }");
        System.out.println(ArrayUtil.getMinimum(a2));

        System.out.println("################################################################################");
        System.out.println();
    }

    static void getSumTest() {
        int a0[] = {};
        int a1[] = { 1 };
        int a2[] = { 1, 3, 4, 2, 7, 9, 5, 6, 8 };

        System.out.println("################################################################################");
        System.out.println("Testing ArrayUtil.getSum");
        System.out.println();

        System.out.println("Getting the sum of {}");
        System.out.println(ArrayUtil.getSum(a0));
        System.out.println("Getting the sum of {1}");
        System.out.println(ArrayUtil.getSum(a1));
        System.out.println("Getting the sum of { 1, 3, 4, 2, 7, 9, 5, 6, 8 }");
        System.out.println(ArrayUtil.getSum(a2));

        System.out.println("################################################################################");
        System.out.println();
    }

    static void reverseTest() {
        int a0[] = {};
        int a1[] = { 1 };
        int a2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("################################################################################");
        System.out.println("Testing ArrayUtil.reverse");
        System.out.println();

        System.out.println("Reversing {}");
        ArrayUtil.print(ArrayUtil.reverse(a0));
        System.out.println("Reversing {1}");
        ArrayUtil.print(ArrayUtil.reverse(a1));
        System.out.println("Reversing { 1, 2, 3, 4, 5, 6, 7, 8, 9 }");
        ArrayUtil.print(ArrayUtil.reverse(a2));

        System.out.println("################################################################################");
        System.out.println();
    }

    static void reverseInSameArrayTest() {
        int a0[] = {};
        int a1[] = { 1 };
        int a2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int a3[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("################################################################################");
        System.out.println("Testing ArrayUtil.reverseInSameArray");
        System.out.println();

        System.out.println("Reversing {}");
        ArrayUtil.reverseInSameArray(a0);
        ArrayUtil.print(a0);
        System.out.println("Reversing {1}");
        ArrayUtil.reverseInSameArray(a1);
        ArrayUtil.print(a1);
        System.out.println("Reversing { 1, 2, 3, 4, 5, 6, 7, 8, 9 }");
        ArrayUtil.reverseInSameArray(a2);
        ArrayUtil.print(a2);
        System.out.println("Reversing { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }");
        ArrayUtil.reverseInSameArray(a3);
        ArrayUtil.print(a3);

        System.out.println("################################################################################");
        System.out.println();
    }
}