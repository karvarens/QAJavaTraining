package homework.lesson7.davidgevorgyan;

import java.util.Comparator;

class StudentComparator implements Comparator<Student> {

    StudentFieldName sortingCriteria;

    public StudentComparator() {
        setSortingCriteria(StudentFieldName.NAME);
    }

    public StudentComparator(StudentFieldName a) {
        setSortingCriteria(a);
    }



    public void setSortingCriteria(StudentFieldName sortingCriteria) {
        this.sortingCriteria = sortingCriteria;
    }

    @Override
    public int compare(Student o1, Student o2) {
        switch (sortingCriteria) {
            case NAME:
                return o1.getName().compareTo(o2.getName());
            case LAST_NAME:
                return o1.getLastName().compareTo(o2.getLastName());
            case AVERAGE_GRADE:
                return Double.compare(o1.getAverageGrade(), o2.getAverageGrade());
            default:
                throw new EnumConstantNotPresentException(StudentFieldName.class, "Enum value doesn't exist");
        }

    }
}