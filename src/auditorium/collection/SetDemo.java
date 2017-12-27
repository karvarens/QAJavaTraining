package auditorium.collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        //TODO: try this code with HashSet, LinkedHashSet
        Set<Student> employees = new TreeSet<>(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        employees.add(new Student("V", "", 100));
        employees.add(new Student("G", "", 100));
        employees.add(new Student("E", "", 100));
        employees.add(new Student("N", "", 100));
        employees.add(new Student("K", "", 100));
        System.out.println(employees);

//        for (Student s : employees) {
//            System.out.println(s);
//        }

        System.out.println();
        Iterator<Student> iterator = employees.iterator();
        for (; iterator.hasNext(); ) {
            Student student = iterator.next();
            if(student.equals(new Student("G", "", 100))){
                System.out.println(student + "is Found");
            } else {
                System.out.println(student);
            }
        }
        System.out.println(employees.contains(new Student("G", "", 100))) ;
    }
}

//TODO: Write an implementation of Comparator<Student> interface such that it is possible to compare the objects by the specified field of Student class

class Student /*implements Comparable<Student>*/{
    private String name;
    private String lastName;
    private double averageGrade;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public Student(String name, String lastName, double averageGrade) {
        this.name = name;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Student)) {
            return false;
        }

        Student student = (Student) o;

        if (Double.compare(student.averageGrade, averageGrade) != 0) return false;
        if (!name.equals(student.name)) return false;
        return lastName.equals(student.lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }

        @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + lastName.hashCode();
        temp = Double.doubleToLongBits(averageGrade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    //TODO: define natural order
//    @Override
//    public int compareTo(Student o) {
//        return 0;
//    }
}