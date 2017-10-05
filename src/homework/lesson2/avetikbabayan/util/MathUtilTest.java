package homework.lesson2.avetikbabayan.util;
//
///**
// * Created by AvetikAdmin on 9/25/17.
import java.util.Scanner;
// */
public class MathUtilTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int a = input.nextInt();
        System.out.print("Enter Number2: ");
        int b = input.nextInt();
        System.out.print("Enter Number3: ");
        int n = input.nextInt();
        MathUtil.power(a,b);
//        MathUtil.gcd();
        MathUtil.factorial(n);
        MathUtil.abs(a);
//        reverseTest();
    }
}
