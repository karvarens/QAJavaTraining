package homework.lesson2.vardankhalatyan.util;


public class MathUtil {
    public static void main(String[] args) {
        System.out.println(fibunacci(3));
    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int a, int n) {
        if (n == 0){
            return 1;
        }
        int i = 1;
        int x = a;
            while (i < n) {
                x = x * a;
                i++;
        }
        return x;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {

        return 0;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
            int x = 1;
            for (int i = 1; i <= n; i++){
                x = x * i;
            }

        return x;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        if (n < 0) {
            n = n * (-1);
        }
        return n;

    }

    public static void printIntAsBinary(int n) {
        
    }

    public static int reverse(int number) {
            number = number * -1;
        return number;
    }


    public static int fibunacci(int n){
        if (n == 1){
            return 1;
        } else if (n == 2) {
            return 1;
        }
        return fibunacci(n-1) + fibunacci(n-2);
    }
}

