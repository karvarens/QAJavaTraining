package homework.lesson6.lilit;

import java.awt.*;

abstract public class Figure {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

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

    abstract public void draw(Graphics g);

    abstract public boolean isBelong (int x, int y);

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Rectangle(10, 10, 100, 50);
        figures[1] = new Circle(10, 10, 100){};

        figures[0].draw(null);

        boolean isBelong = figures[0].isBelong(10, 10);
        System.out.println("Point is in rectangle > " + isBelong);

        isBelong = figures[1].isBelong(10, 60);
        System.out.println("Point is in circle > " + isBelong);

    }
}


