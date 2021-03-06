package homework.lesson2.asyagrigoryan.util;


public class MathUtil {
    public static void main(String[] args) {
        printIntAsBinary(-1);
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
        int pow = 1;

        for (int i = 1 ; i <= n; i++) {
            pow *= a;
        }
        return pow;
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

        int factorial = 1;
        for (int i = 1; i <= n; i++)

            factorial *= n;

        return factorial;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {

        if (n < 0)

        {
            n*= -1;
        }

        return n;
    }

    public static void printIntAsBinary(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(n >> i & 1);
        }
        System.out.println();
    }

    public static int reverse(int number) {

        int reverse = 0;
        if (number != 0){

          reverse = reverse * 10 + number % 10;
          number = number / 10;
        }

        return reverse;
    }

}
