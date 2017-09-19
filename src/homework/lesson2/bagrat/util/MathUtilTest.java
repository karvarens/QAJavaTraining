package homework.lesson2.bagrat.util;

public class MathUtilTest {
    public static void main(String[] args) {
        powTest();
        gcdTest();
        factorialTest();
        absTest();
        printIntAsBinaryTest();
        reverseTest();
    }

    static void powTest() {
        System.out.println("################################################################################");
        System.out.println("Testing MathUtil.pow");
        System.out.println();

        System.out.println("0^0 = " + MathUtil.pow(0,  0));
        System.out.println("0^7 = " + MathUtil.pow(0, 7));
        System.out.println("1^0 = " + MathUtil.pow(1, 0));
        System.out.println("1^5 = " + MathUtil.pow(1, 5));
        System.out.println("-1^0 = " + MathUtil.pow(-1, 0));
        System.out.println("-1^5 = " + MathUtil.pow(-1, 5));
        System.out.println("7^0 = " + MathUtil.pow(7, 0));
        System.out.println("10^7 = " + MathUtil.pow(7,7));
        System.out.println("-2^8 = " + MathUtil.pow(-2,8));
        System.out.println("-11^0 = " + MathUtil.pow(-11, 0));

        System.out.println("################################################################################");
        System.out.println();
    }

    static void gcdTest() {
        System.out.println("################################################################################");
        System.out.println("Testing MathUtil.gcd");
        System.out.println();

        System.out.println("GCD of 6 and 2 is: " + MathUtil.gcd(6, 2));
        System.out.println("GCD of 5 and 2 is: " + MathUtil.gcd(5, 2));
        System.out.println("GCD of 0 and 2 is: " + MathUtil.gcd(0, 2));
        System.out.println("GCD of 0 and 0 is: " + MathUtil.gcd(0, 0));
        System.out.println("GCD of -5 and 25 is: " + MathUtil.gcd(-5, 25));
        System.out.println("GCD of 1071 and 462 is: " + MathUtil.gcd(1071, 462));

        System.out.println("################################################################################");
        System.out.println();
    }
    
    static void factorialTest() {
        System.out.println("################################################################################");
        System.out.println("Testing MathUtil.factorial");
        System.out.println();

        System.out.println("0! = " + MathUtil.factorial(0));
        System.out.println("1! = " + MathUtil.factorial(1));
        System.out.println("10! = " + MathUtil.factorial(10));

        System.out.println("################################################################################");
        System.out.println();
    }

    static void absTest() {
        System.out.println("################################################################################");
        System.out.println("Testing MathUtil.abs");
        System.out.println();

        System.out.println("abs(0) = " + MathUtil.abs(0));
        System.out.println("abs(1) = " + MathUtil.abs(1));
        System.out.println("abs(-1) = " + MathUtil.abs(-1));

        System.out.println("################################################################################");
        System.out.println();
    }

    static void printIntAsBinaryTest() {
        System.out.println("################################################################################");
        System.out.println("Testing MathUtil.printIntAsBinary");
        System.out.println();

        System.out.print("0 as a binary is: ");
        MathUtil.printIntAsBinary(0);
        System.out.print("1 as a binary is: ");
        MathUtil.printIntAsBinary(1);
        System.out.print("2 as a binary is: ");
        MathUtil.printIntAsBinary(2);
        System.out.print("3 as a binary is: ");
        MathUtil.printIntAsBinary(3);
        System.out.print("4 as a binary is: ");
        MathUtil.printIntAsBinary(4);
        System.out.print("5 as a binary is: ");
        MathUtil.printIntAsBinary(5);
        System.out.print("6 as a binary is: ");
        MathUtil.printIntAsBinary(6);
        System.out.print("7 as a binary is: ");
        MathUtil.printIntAsBinary(7);
        System.out.print("8 as a binary is: ");
        MathUtil.printIntAsBinary(8);
        System.out.print("9 as a binary is: ");
        MathUtil.printIntAsBinary(9);
        System.out.print("10 as a binary is: ");
        MathUtil.printIntAsBinary(10);
        System.out.print("128 as a binary is: ");
        MathUtil.printIntAsBinary(128);
        System.out.print("1024 as a binary is: ");
        MathUtil.printIntAsBinary(1024);
        System.out.print("1025 as a binary is: ");
        MathUtil.printIntAsBinary(1025);

        System.out.println("################################################################################");
        System.out.println();
    }

    static void reverseTest() {
        System.out.println("################################################################################");
        System.out.println("Testing MathUtil.reverse");
        System.out.println();

        System.out.println("123456789 reversed: " + MathUtil.reverse(123456789));
        System.out.println("0 reversed: " + MathUtil.reverse(0));
        System.out.println("7 reversed: " + MathUtil.reverse(7));
        System.out.println("-1234 reversed: " + MathUtil.reverse(-1234));
        System.out.println("300 reversed: " + MathUtil.reverse(300));

        System.out.println("################################################################################");
        System.out.println();
    }
}
