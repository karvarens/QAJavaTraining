package auditorium.collection.examples.IX;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AddElementsToHashSet {
    public static void main(String args[]) {
        Map map = new HashMap();
        String str1 = new String("Harry");
        String str2 = new String("Shreya");

        String str3 = new String("Selvan");
        String str4 = new String("Shreya");
        HashSet<String> set = new HashSet<>();

        set.add(str1);
        set.add(str2);
        set.add(str3);
        set.add(str4);
        for (String e : set) System.out.println(e);
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        return true;
    }

    public int hashCode() {
        return 10;
    }

//    public String toString() {
//        return name;
//    }
//
//    public boolean equals(Object o) {
//        if (o instanceof Person) {
//            return this.name.equals(((Person)o).name);
//        }
//        else
//            return false;
//    }
}

class Twist4_5 {
    public static void main(String args[]) {
        HashSet<Person> set = new HashSet<Person>();
        Person p1 = new Person("Harry");
        Person p2 = new Person("Shreya");
        Person p3 = new Person("Selvan");
        Person p4 = new Person("Shreya");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (Person e : set) System.out.println("" + e.name + " , " + e.hashCode());
//        System.out.println("----------------");
//        System.out.println("P2 " + p2.hashCode());
//        set.remove(p2);
//
//        for (Person e : set) System.out.println(e.name + " , " + e.hashCode());

    }


}