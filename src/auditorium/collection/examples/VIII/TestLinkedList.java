package auditorium.collection.examples.VIII;

import java.util.*;

class TestLinkedList {
    public static void main(String... args) {
        List<String> list = new LinkedList<>();
//        ((Deque<String>)list).offer("Java");
//        ((Deque<String>)list).push("e");
        list.add("e");
        list.add(1, "Guru");
        list.add(1, "Muru");
        list.add("Muru");
        list.remove("e");
        System.out.println(list);

        ListIterator<String> iterator = list.listIterator();
        for (; iterator.hasNext();){
            String current = iterator.next();
            System.out.println(current);
            iterator.remove();

        }


    }
}