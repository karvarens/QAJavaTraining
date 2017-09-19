package homework.lesson2.armenmarutyan;

public class MathUtil_Armen {
    public static void main(String[] args) {
        printIntAsBinary(5);
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
        for (int i = 0; i < n ; i++) {
            a *=a ;

        }
        return a;
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
        if (n == 0) {
            return 0;
        }
        int param = 1;
        for (int i = 2; i <= n; i++) {
            param *= i;
        }
        return param;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        if (n < 0 ) {
            n = -1 * n;
            return n;
        }
        return n;
    }

    public static void printIntAsBinary(int n) {
        int[] array ={};
        //int i = 0;
        while (n != 1) {
            n = n / 2;
            int mod = n % 2;
            if (mod == 0){
          //      array[i] = 0;
                System.out.print(0);
            }
            else {
           //     array[i] = 1;
                System.out.print(1);
            }
           // ++i;
        }
        System.out.println();
    }

    public static int reverse(int number) {

        return 0;
    }

}
