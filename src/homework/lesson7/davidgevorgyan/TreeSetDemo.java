package homework.lesson7.davidgevorgyan;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        StudentComparator comparator = new StudentComparator(StudentFieldName.NAME);
        Set<Student> students1 = new TreeSet<>(comparator);

        students1.add(new Student("Vardan", "Khalatyan", 80));
        students1.add(new Student("David", "Gevorgyan", 70));
        students1.add(new Student("Edgar", "Ayvazyan", 74));
        students1.add(new Student("Narek", "Vagharshakyan", 75));
        students1.add(new Student("Karen", "Vardanyan", 30));

        System.out.println(students1);
        comparator.setSortingCriteria(StudentFieldName.AVERAGE_GRADE);
        Set<Student> students2 = new TreeSet<>(comparator);
        for (Student s:students1) {
            students2.add(s);
        }
        System.out.println(students2);
        //students2.addAll(students1);
        //TODO talk why this is not working and how to implement dynamic sorting

//        StudentComparator comparator = new StudentComparator();
//        List<Student> list = new ArrayList<>();
//        list.addAll(students1);
//        Collections.sort(list, comparator);
//        //ToDO print
//        comparator.setSortingCriteria(StudentFieldName.AVERAGE_GRADE);
//        Collections.sort(list, comparator);
//        //ToDO print
    }

}





