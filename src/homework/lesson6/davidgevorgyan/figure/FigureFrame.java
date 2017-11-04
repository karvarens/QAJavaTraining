package homework.lesson6.davidgevorgyan.figure;

import javax.swing.*;

public class FigureFrame extends JFrame {


    public static void main(String[] args) {
        FigureCanvas main = new FigureCanvas();


        Rectangle a= new Rectangle(1000,200,400,500);
        Circle b = new Circle(1000,200,100);
        main.add(a);
        main.add(b);
        main.add(a);
        main.add(b);
        main.add(a);
        main.add(a);

        System.out.println(main);
        System.out.println("Figure removal status: " + main.remove(b));
        System.out.println(main);

        System.out.println("Status for a dot in a Rectangle: " + a.isBelong(1002,202));
        System.out.println("Status for a dot in a Circle: " + b.isBelong(1100,250));

        main.add(a);
        main.add(b);
        main.select(1050,250);

    }

    public FigureFrame() {

    }
}
