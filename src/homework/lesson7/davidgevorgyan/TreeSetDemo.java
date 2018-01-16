package homework.lesson7.davidgevorgyan;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<Student> students1 = new TreeSet<>(new StudentComparator(StudentFieldName.NAME));

        students1.add(new Student("Vardan", "Khalatyan", 80));
        students1.add(new Student("David", "Gevorgyan", 70));
        students1.add(new Student("Edgar", "Ayvazyan", 74));
        students1.add(new Student("Narek", "Vagharshakyan", 75));
        students1.add(new Student("Karen", "Vardanyan", 30));

        System.out.println(students1);

        Set<Student> students2 = new TreeSet<>(new StudentComparator(StudentFieldName.AVERAGE_GRADE).reversed());
        students2.addAll(students1);

        System.out.println(students2);
    }

}





