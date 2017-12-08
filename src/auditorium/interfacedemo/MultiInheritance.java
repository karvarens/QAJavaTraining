package auditorium.interfacedemo;

public class MultiInheritance {

    public static void main(String[] args) {
        I1I2Impl o = new I1I2Impl();
        o.m();
    }
}



interface I1 {
    default void m() {
        System.out.println("I1 m");
    }
}

interface I2 {
    default void m() {
        System.out.println("I2 m");
    }
}

class I1I2Impl implements I1, I2 {
    public void m() {
        System.out.println("In I1I2Impl class ");
        I2.super.m();
        I1.super.m();

    }
}
