package auditorium.classintro;

public class ClassInitializationDemo {

    public static void main(String[] args) {
        A obj = new A(1);
    }
}



class A {

    final static int ST_FINAL;
    final int FINAL_FIELD;

    static int stNonFinal = 1;

    int nonStatic = 10;

    {//Non static block
        this.FINAL_FIELD = 100;
        this.nonStatic = 11;
    }


    static { //Static block
        ST_FINAL = 111;
        stNonFinal = -100;
    }

    public A() {
        nonStatic = 12;
    }

    public A(int a) {
        nonStatic = a;
    }
}