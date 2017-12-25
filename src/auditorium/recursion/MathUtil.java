package auditorium.recursion;


public class MathUtil {
    public static void main(String[] args) {
        System.out.println(pow(2, 4));
    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static long pow(int a, int n) {
        if(n == 1){
            return a;
        }
        return a * pow(a, n - 1);
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

        return 0;
    }

}
