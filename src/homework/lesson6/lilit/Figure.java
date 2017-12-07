package homework.lesson6.lilit;

import java.awt.*;

abstract public class Figure {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Figure(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract public void draw(Graphics g);

    abstract public boolean isBelong (int x, int y);

    final void validator (){
        //TODO
        //use in setter and constructer
    }

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Rectangle(10, 10, 100, 50);
        figures[1] = new Circle(10, 10, 100);
        homework.lesson6.lilit.Circle circle = new Circle(10, 10, 100);
        circle.getWidth();

        figures[0].draw(null);

        boolean isBelong = figures[0].isBelong(10, 10);
        System.out.println("Point is in rectangle > " + isBelong);

        isBelong = figures[1].isBelong(10, 60);
        System.out.println("Point is in circle > " + isBelong);
    }
}


