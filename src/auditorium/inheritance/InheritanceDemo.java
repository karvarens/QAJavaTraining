package auditorium.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        new B();
    }

}

abstract class A {
    int a = 10;

    A(){
        System.out.println("in Base: a = " + a);
        print();
    }

    abstract void print();

}

class B extends A {
    int a = 100;

    B(){
        System.out.println( "In B a = " + a);
    }

    void print(){
        System.out.println(a);
    }

}