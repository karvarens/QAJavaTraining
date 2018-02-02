package auditorium.collection.examples.IX;

import java.util.*;

public class ManipulateHashSet {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("Shreya");
        list.add("Selvan");

        HashSet<String> set = new LinkedHashSet<>(); //  HashSet<String>();
        set.add("Harry");
        set.add("Shreya");
        set.add("Selvan");
        System.out.println(set);


//        System.out.println(set.contains("Shreya"));
//        System.out.println(set.remove("Selvan"));
//
//        for (String e : set) System.out.println(e);

//        LinkedList<String> list = new LinkedList<String>();
//        list.offer("Java");
//        list.push("e");
//        list.add(1, "Guru");
//        list.remove("e");
//        System.out.println(list);
    }
}