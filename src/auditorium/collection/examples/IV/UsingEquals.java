package auditorium.collection.examples.IV;

import java.util.ArrayList;

public class UsingEquals {
    public static void main(String args[]) {

        ArrayList<Emp> list = new ArrayList<Emp>();
        list.add(new Emp(121, "Shreya"));
        list.add(new Emp(55, "Harry"));
        list.add(new Emp(15, "Paul"));
        list.add(new Emp(121, "Shreya"));

        System.out.println(list.size());

        Emp emp = new Emp(121, "Shreya");
        list.remove(emp);

        System.out.println(list.size());
    }
}

class Emp {
    int id;
    String name;

    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Emp) {
            Emp emp = (Emp)obj;
            if (emp.id == this.id && emp.name.equals(this.name))
                return true;
        }
        return false;
    }
}