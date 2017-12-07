package homework.lesson6.edgar;

import java.awt.*;

abstract public class Circle extends Figure {
    private int radius;
    public Circle(int x, int y, int diameter) {
        super(x, y, diameter, diameter);
        radius = diameter / 2;
    }

    //    @Override
    public void draw(Graphics g) {

    }

    @Override
    public boolean isBelong(int x, int y) {
        return (x >= getX() - radius && x <= getX() + radius) && (y >= getY() - radius && y <= getY() + radius);
    }
}