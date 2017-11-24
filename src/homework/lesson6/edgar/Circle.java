package homework.lesson6.edgar;

import java.awt.*;

abstract public class Circle extends Figure {
    public Circle(int x, int y, int diameter) {
        super(x, y, diameter, diameter);
    }

    //    @Override
    public void draw(Graphics g) {

    }

    @Override
    public boolean isBelong(int x, int y) {
        double radius = getWidth() / 2;
        return (x >= getX() - radius || x <= getX() + radius) && (y >= getY() - radius || y <= getY() + radius);
    }
}