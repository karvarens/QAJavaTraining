package homework.lesson2.armenmarutyan.util;

public class DataTypesDemo {
    public static void main(String[] args) {
        byte a = 1;
        byte b = (byte) (127 + 2);
        int x = a;
        a = (byte)x;
        long lng = 11111111111L;
        float fl = lng;

        char ch = '\u0000';
        ch = '0';


        System.out.println(b);
        System.out.println(a + a);
        System.out.println(fl);

        printAsciiTable('A', 'z');




    }

    /**
     *
     * @param start inclusive
     * @param end inclusive
     */

    static void printAsciiTable(char start, char end) {

        for (int i = start; i <= end; i++) {

            System.out.println(i + " : " + (char)i);

        }

    }
}
