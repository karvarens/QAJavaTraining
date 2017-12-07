package homework.lesson6.edgar;

public class DynamicArratTest {
    public static void main(String[] args) {
        DynamicArrayImpl array = new DynamicArrayImpl(60);
        for (int i = 0; i < 20; i++) {
            array.set(i,i);
        }

        array.set(23,5);

        array.set(11,999);
        array.set(1,9);
        array.printArray();
        System.out.println();
        System.out.println(array.size());
        System.out.println(array.isEmpty());
        System.out.println(array.contains(999));
        System.out.println(array.indexOf(999));
        System.out.println(array.lastIndexOf(5));
    }
}
