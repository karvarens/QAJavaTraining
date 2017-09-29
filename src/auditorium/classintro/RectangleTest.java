package auditorium.classintro;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(4, 5);
        r.maxWidth = 1000;
        r.getSquare();

        abstract class A{ abstract void m(); }

        A a = new A(){
            @Override
            void m() {
                System.out.println("IN Anonymous");
            }
        };

        a.m();
    }
}
