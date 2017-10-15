package auditorium.classintro;

public class RectangleTest {

    public static void main(String[] args) {
        int rectWidth1 = 10;
        int rectHeight1 = 10;
        int rectSquare1 = rectWidth1 * rectHeight1;

        int rectWidth2 = 10;
        int rectHeight2 = 10;
        int rectSquare2 = rectWidth2 * rectHeight2;
        //This is too complicated without Rectangle Objects

        Rectangle r = new Rectangle();
        r.setWidth (-100) ;
        System.out.println(r.getWidth());

        Rectangle r1 = new Rectangle(4, 5);
        r1.setWidth(-1);
        Rectangle.maxWidth = 1000;
        int square = r.getSquare();

//        abstract class A{ abstract void m(); }
//
//        A a = new A(){
//            @Override
//            void m() {
//                System.out.println("IN Anonymous");
//            }
//        };
//
//        a.m();
    }
}
