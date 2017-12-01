package auditorium.interfacedemo;

import static auditorium.interfacedemo.Constants.*;


public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println(COLOR);

        A.print();
        B.print();

        new I(){
            public void a(){
                System.out.println("kuku");
            }
        };
       I iObj = new SpecificI();
       int x = iObj.n;


    }

}

interface I {

    int n = 1;
    void a();

}

interface ChildI extends I {
    void b();
}

class specificChildI implements ChildI{
    @Override
    public void  b(){}
    public void  a(){}
}



class SpecificI implements I {


    public void a(){
        System.out.println("kuku");
    }
}


class A {
     static void print(){
        System.out.println("In print of A class ");
    }
}

class B extends A {
    static void print(){
        System.out.println("In print of B class ");
    }
}