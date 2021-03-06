package homework.lesson6.davidgevorgyan.figure;

import java.awt.*;

public class Circle extends Figure {

    public Circle(int x, int y, int diameter, Color color, FigureCanvas location) {
        super(x, y, diameter, diameter, color, location);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        int centerX = (2 * getX() + getWidth()) / 2;
        int centerY = (2 * getY() + getHeight()) / 2;
        int radius = getHeight() / 2;
        return (x - centerX) * (x - centerX) + (y - centerY) * (y - centerY) <= radius * radius;
    }
}
