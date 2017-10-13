package homework.lesson2.armenmarutyan.util;

public class ArrayUtilTest {
    public static void main(String[] args) {
        // todo : Organize all test methods calls here

        int []a = {51,48,21,54};
        System.out.println(ArrayUtil.getMaximum(a));
        //System.out.println(ArrayUtil.getMinimum(a));

       /* int [] ddd=ArrayUtil.reverse(a);
        for (int i = 0; i < ddd.length ; i++) {
            System.out.println(ddd[i]);

        }
        */
        ArrayUtil.swap(a,2,3);
        for (int i = 0; i <a.length ; i++) {
            System.out.println("array " + a[i]);
        }
        ArrayUtil.print(a,"+");
    }
    //ArrayUtil.


    // todo add test methods
}
