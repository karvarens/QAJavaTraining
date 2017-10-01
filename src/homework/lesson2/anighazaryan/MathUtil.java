package homework.lesson2.anighazaryan;

public class MathUtil {

    public static void main(String[] args) {

        int[] a1 = {}; // don't use this
        int[] a2 = null;
        int[] a3 = {1,3,5};
        int[] a4 = new int[3];

        int power = pow(3, 3);
        System.out.println("power " + power);

        int factorial = factorial(-3);
        System.out.println(" factorial " + factorial);

        //System.out.println("factorial " + factorial(-6));
        System.out.println("abs " + abs(-6));

        int reverse = reverse(0);
        System.out.println("reverse " + reverse);

        printIntAsBinary(156);
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

        if (a == 0 || n == 0) {
            return 0;
        }

        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= a;
        }

        return power;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {

        int[] array1 = {};
        int i = 0;
        int[] array2 = {};
        int j = 0;

        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
                array1[i] = 2;
                i++;
            } else if (x % 3 == 0) {
                x = x / 3;
                array1[i] = 3;
                i++;
            } else if (x % 5 == 0) {
                x = x / 3;
                array1[i] = 3;
                i++;
            }

        }
        int a, b, c;


        return 0;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {

        if (n < 1) {
            return 0;
        }

        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {

        if (n == 0) {
            return 0;
        } else if (n < 0) {
            n = (-1) * n;
            return n;
        } else {
            return n;
        }

        // return n<0 ? -n: n;
    }

    public static void printIntAsBinary(int n) {

        /*
        int i = 0;
        int[] array = new int[20];

        while (n != 1) {
            array[i] = n % 2;
            n = n / 2;
            i++;
        }

        array[i] = 1;
        System.out.print("binary of " + n + " is ");
        for (int a = i; a >= 0; --a) {
            System.out.print(array[a]);
        }

        System.out.println(); */

        for (int i = 31; i >= 0 ; i--) {
            System.out.print(n >> i & 1);
        }


    }

    public static int reverse(int number) {

        int i = 0;
        int temp1 = 1, temp2 = 1;

        int index = 0;
        do {
            temp1 = number % 10;
            if (index == 0) {
                temp2 = temp1;
                System.out.println("temp2 " + temp2);
            } else {
                temp2 = temp2 * 10 + temp1;
                System.out.println("temp2 " + temp2);
            }
            number = number / 10;
            ++index;
        } while (abs(number) > 0);

        return temp2;
    }


}
