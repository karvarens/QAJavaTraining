package auditorium.classintro;

public class RectangleTest {

    public static void main(String[] args) {
//        int rectWidth1 = 10;
//        int rectHeight1 = 10;
//        int rectSquare1 = rectWidth1 * rectHeight1;
//
//        int rectWidth2 = 10;
//        int rectHeight2 = 10;
//        int rectSquare2 = rectWidth2 * rectHeight2;
//
//        int rectWidth3 = 13;
//        int rectHeight3 = 13;
//        int rectSquare3 = rectWidth3 * rectHeight3;
//        int rectPerimeter3 = 2 * (rectWidth3 + rectHeight3);



        //This is too complicated without Rectangle Objects

        Rectangle r = new Rectangle();
        r.setWidth (-100) ;
        System.out.println(r.getWidth());
        System.out.println(r.getSquare());

        Rectangle r1 = new Rectangle(4, 5);
        r1.setWidth(-1);


        int square = r.getSquare();


    }
}
