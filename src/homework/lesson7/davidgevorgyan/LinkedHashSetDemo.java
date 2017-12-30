package homework.lesson7.davidgevorgyan;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Vardan", "Khalatyan", 80));
        students.add(new Student("David", "Gevorgyan", 70));
        students.add(new Student("Edgar", "Ayvazyan", 74));
        students.add(new Student("Narek", "Vagharshakyan", 75));
        students.add(new Student("Karen", "Vardanyan", 30));
        System.out.println(students);



        System.out.println();
        Iterator<Student> iterator = students.iterator();
        for (; iterator.hasNext(); ) {
            Student student = iterator.next();

            if(student.equals(new Student("David", "Gevorgyan", 70))){
                System.out.println(student + " is Found");
            } else {
                System.out.println(student);
            }
        }
    }
}