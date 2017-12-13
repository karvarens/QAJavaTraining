package homework.lesson6.edgar.util;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArrayImpl array = new DynamicArrayImpl();
        array.add("One");
        array.add("Two");
        array.add("Three");
        array.add("Four");
        array.add("Five");
        array.add("Six");
        array.add("Seven");
        array.add("Eight");
        array.add("Nine");
        array.add("Ten");
        array.add("Eleven");
        array.add("Edgar");
        array.add("Ayvazyan");
        array.add("JaVa");
        array.add("Toshiba");
        array.add("Google");
        array.remove("Ten");
        array.printArray();
    }
}
