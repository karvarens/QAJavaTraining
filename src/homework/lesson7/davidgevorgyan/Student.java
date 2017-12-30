package homework.lesson7.davidgevorgyan;



class Student {
    private String name;
    private String lastName;
    private double averageGrade;

    public Student(String name, String lastName, double averageGrade) {
        this.name = name;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", averageGrade=" + averageGrade +
                "}";
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
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + lastName.hashCode();
        temp = Double.doubleToLongBits(averageGrade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}