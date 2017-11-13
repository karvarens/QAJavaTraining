package auditorium.figure;

import com.sun.org.apache.regexp.internal.RE;

import java.awt.*;

abstract public class Figure {
    protected int x;
    protected int y;
    protected int width;
    protected int height;

    public Figure(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

     public void draw(Graphics g){}

    abstract public boolean isBelong (int x, int y);

    public static void main(String[] args) {
        Figure[] figures = new Figure[7];

        figures[0] = new Rectangle(10, 10, 100, 50);
        figures[1] = new Circle(10, 10, 100){};

        Figure figure = figures[0];

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw(null);

        }

        figures[0].draw(null);
        System.out.println(figures[0]);
        System.out.println(figures[1]);

        B b = new B() {};
    }
}


abstract class B {}