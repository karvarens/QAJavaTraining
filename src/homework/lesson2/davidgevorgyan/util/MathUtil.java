package homework.lesson2.davidgevorgyan.util;

import java.util.Scanner;

public class MathUtil {

    public static void main(String[] args) {
        //int a=-12, n=4, b=96;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Digit #1: ");
        int a = in.nextInt();
        System.out.print("Enter Digit: #2: ");
        int b = in.nextInt();
        System.out.print("Enter Digit: #3: ");
        int n = in.nextInt();


        System.out.println(a+"^"+n+"="+pow(a,n));
        System.out.println("GCD of "+a+" and "+b+" is: "+gcd(a,b));
        System.out.println("Factorial of "+n+" is: "+factorial(n));
        System.out.println("Bin value of "+a+" is: "+printIntAsBinary(a));
        System.out.println(a + " after revert is: "+ reverse(a));

    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow (int a, int n) {
        int pow = 1;
        for (int i = 0; i < n ; i++) {
            pow = pow * a;
        }
        return pow;
    }

    /**
     * Calculates and returns Greatest common divisor for 2 digits
     *
     * @param x integer #1
     * @param y integer #2
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        int temp = 1;
        for (int i = 1; i <= minAbs(x,y); i++) {
            if (x % i == 0 && y % i == 0)
                temp = i;
        }

        return temp;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        int temp = 1;
        for (int i = n; i > 0 ; i--) {
            temp = temp * i;
        }
        return temp;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        if(n < 0)
            n = n * (-1);
        return n;
    }

    /**
     * Calculates and returns the minimal absolute value between 2 vars
     * @param a first value
     * @param b second value
     * @return minimal value
     */
    public static int minAbs(int a, int b) {

        return (abs (a) < abs (b)) ?  abs (a) : abs (b);

    }

    /**
     * Prints @param in bin
     * @param n variable to be displayed in binary code
     */
    public static String printIntAsBinary(int n) {
        return Integer.toString(n,2);
    }

    /**
     * Calculates reverted integer
     * @param number digit
     * @return dec integer in reverted state
     */
    public static int reverse(int number) {
        int reversedNum = 0;
        while (number != 0)
        {
            reversedNum = reversedNum * 10 + number % 10;
            number /= 10;
        }
        return reversedNum;
    }

}
