package homework.lesson7.davidgevorgyan;

import java.util.Comparator;

public enum SortBy implements Comparator<Student>{
        NAME {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }, LASTNAME {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getLastName().compareTo(o2.getLastName());
             }
         }, AVERAGE_GRADE {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.getAverageGrade(), o2.getAverageGrade());
        }
    }
}
