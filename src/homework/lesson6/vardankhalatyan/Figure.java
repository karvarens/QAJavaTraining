package homework.lesson6.vardankhalatyan;

import java.awt.*;

abstract public class Figure {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Color color;

    public Figure(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    abstract public void draw(Graphics g);

    abstract public boolean isBelong (int x, int y);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public void move (int dx, int dy) {
       x += dx;
       y += dy;
    }

    //    public static void main(String[] args) {
//        Figure[] figures = new Figure[5];
//
//        figures[0] = new Rectangle(10, 10, 100, 50);
//        figures[1] = new Circle(10, 10, 100){};
//
//        figures[0].draw(null);
//        System.out.println(figures[0]);
//        System.out.println(figures[1]);
//
//
//        B b = new B() {};
//    }
}


//abstract class B {}