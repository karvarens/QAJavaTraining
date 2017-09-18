package homework.lesson2.bagrat.util;


public class MathUtil {
    public static void main(String[] args) {
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
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        int tmp;
        for (; y != 0 ;) {
            tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
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
            return -n;
        }
        else {
            return n;
        }
    }

    private static int log2(int b) {
        int n;
        for (n = 0; pow(2, n+1) <= b; n++) {
            ;
        }
        return n;
    }

    public static void printIntAsBinary(int n) {
        for (int i = log2(n); i >= 0; i--) {
            System.out.print(n / pow(2, i));
            n %= pow(2, i);
        }
        System.out.println();
    }

    public static int reverse(int number) {
        int reversed = 0;
        for (; number != 0; number /= 10) {
            reversed = 10 * reversed + number % 10;
        }
        return reversed;
    }
}
