package homework.lesson2.avetikbabayan.util;

/**
 * Created by AvetikAdmin on 9/25/17.
 */
public class MathUtilTest {


    public static void main(String[] args) {
        power();
        gcdTest();
        factorial();
        abs();
        printIntAsBinaryTest();
//        reverseTest();
    }

    static void power() {
        System.out.println("Power");
        System.out.println();

        System.out.println("5 power 5 = " + MathUtil.power(5,  5));
        System.out.println("1 power 7 = " + MathUtil.power(1, 7));
        System.out.println("-5 power 0 = " + MathUtil.power(-5, 0));
        System.out.println("10 power 7 = " + MathUtil.power(10,7));
        System.out.println("4 power 0 = " + MathUtil.power(4, 0));
        System.out.println();
    }

    static void gcdTest() {
        System.out.println("GCD");
        System.out.println();

        System.out.println("GCD of 10 and 20 is: " + MathUtil.gcd(10, 20));
        System.out.println("GCD of 0 and 2 is: " + MathUtil.gcd(0, 2));
        System.out.println("GCD of -5 and -2 is: " + MathUtil.gcd(-5, -2));
        System.out.println("GCD of -15 and 16 is: " + MathUtil.gcd(-15, 16));
        System.out.println();
    }

    static void factorial() {
        System.out.println("Factorial");
        System.out.println();
        System.out.println("0! = " + MathUtil.factorial(0));
        System.out.println("-10! = " + MathUtil.factorial(-10));
        System.out.println("15! = " + MathUtil.factorial(15));
        System.out.println();
    }

    static void abs() {
        System.out.println("Abs");
        System.out.println();
        System.out.println("abs(0) = " + MathUtil.abs(0));
        System.out.println("abs(100) = " + MathUtil.abs(1));
        System.out.println("abs(-100) = " + MathUtil.abs(-1));
        System.out.println();
    }

    static void printIntAsBinaryTest() {
        System.out.println("Print as Binary");
        System.out.println();
        System.out.print("1 as a binary is: ");
        MathUtil.printIntAsBinary(1);
        System.out.print("5 as a binary is: ");
        MathUtil.printIntAsBinary(5);
        System.out.print("9 as a binary is: ");
        MathUtil.printIntAsBinary(9);
        System.out.print("31 as a binary is: ");
        MathUtil.printIntAsBinary(31);
        System.out.print("37 as a binary is: ");
        MathUtil.printIntAsBinary(37);
        System.out.print("64 as a binary is: ");
        MathUtil.printIntAsBinary(64);
        System.out.print("127 as a binary is: ");
        MathUtil.printIntAsBinary(127);
        System.out.print("1024 as a binary is: ");
        MathUtil.printIntAsBinary(1024);
        System.out.print("1999 as a binary is: ");
        MathUtil.printIntAsBinary(1999);
        System.out.println();
    }
    }
}
