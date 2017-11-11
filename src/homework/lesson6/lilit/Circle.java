package homework.lesson6.lilit;

import java.awt.*;

abstract public class Circle extends Figure {
    private int radius;
    public Circle(int x, int y, int diameter) {
        super(x, y, diameter, diameter);
        radius = diameter /2;
    }

//    @Override
    public void draw(Graphics g) {

    }

    @Override
    public boolean isBelong(int x, int y) {
        return Math.pow(radius, 2) >= Math.pow((x - getX()),2) + Math.pow((y - getY()),2);
}
}
