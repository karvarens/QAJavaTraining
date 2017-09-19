package homework.lesson2.armenmarutyan;

public class ArrayUtilTest_Armen {
    public static void main(String[] args) {
        // todo : Organize all test methods calls here

        int []a = {51,48,21,54};
        //System.out.println(ArrayUtil_Armen.getMaximum(a));
        //System.out.println(ArrayUtil_Armen.getMinimum(a));

       /* int [] ddd=ArrayUtil_Armen.reverse(a);
        for (int i = 0; i < ddd.length ; i++) {
            System.out.println(ddd[i]);

        }
        */
        ArrayUtil_Armen.swap(a,2,3);
        for (int i = 0; i <a.length ; i++) {
            System.out.println("array " + a[i]);
        }
        ArrayUtil_Armen.print(a,"+");
    }
    //ArrayUtil_Armen.


    // todo add test methods
}
