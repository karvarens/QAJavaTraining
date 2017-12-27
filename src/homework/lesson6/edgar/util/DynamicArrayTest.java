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
        System.out.println(array.size());
        System.out.println(array.isEmpty());
        System.out.println(array.contains("Edgar"));
        System.out.println("index of Edgar " + array.indexOf("Edgar"));
        System.out.println(array.lastIndexOf("Ten"));
        System.out.println("12 element is " + array.get(12));
        array.set(13,"JAVA");
        array.add(10,"Sixteen");
        array.remove(10);
        System.out.println(array.indexOf("Edgar"));
        array.remove("Edgar"); // in removing element returned array are smaller than it was??
        array.printArray();
        System.out.println();
        System.out.println(array.size());
    }
}
