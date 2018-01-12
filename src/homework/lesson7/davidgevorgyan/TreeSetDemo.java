package homework.lesson7.davidgevorgyan;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Student> students1 = new TreeSet<>(SortBy.NAME.reversed());

        students1.add(new Student("Vardan", "Khalatyan", 80));
        students1.add(new Student("David", "Gevorgyan", 70));
        students1.add(new Student("Edgar", "Ayvazyan", 74));
        students1.add(new Student("Narek", "Vagharshakyan", 75));
        students1.add(new Student("Karen", "Vardanyan", 30));

        System.out.println(students1);
        Set<Student> students2 = new TreeSet<>(SortBy.AVERAGE_GRADE);
        students2.addAll(students1);
        System.out.println(students2);

        StudentComparator comparator = new StudentComparator();
        List<Student> list = new ArrayList<>();
        list.addAll(students1);
        Collections.sort(list, comparator);
        //ToDO print
        comparator.setSortingCriteria(StudentFieldName.AVERAGE_GRADE);
        Collections.sort(list, comparator);
        //ToDO print
    }

}

enum StudentFieldName { NAME, LAST_NAME, AVERAGE_GRADE }



class StudentComparator implements Comparator<Student> {

    StudentFieldName sortingCriteria = StudentFieldName.NAME;

    public void setSortingCriteria(StudentFieldName sortingCriteria) {
        this.sortingCriteria = sortingCriteria;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}