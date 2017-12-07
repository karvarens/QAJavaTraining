package homework.lesson6.lilit;

import java.awt.*;

public class Circle extends Figure {
    static final Color DEFAULT_COLOR = Color.RED;
    private int radius;

    public Circle(int x, int y, int diameter) {
        this(x, y, diameter, DEFAULT_COLOR);
//        this(x, y, diameter, diameter, DEFAULT_COLOR); - why didn't work ?
        radius = diameter / 2;
    }

    public Circle(int x, int y, int diameter, Color color) {
        super(x, y, diameter, diameter, color);
        radius = diameter / 2;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor()); // TODO debug to see getColor() value
        g.drawOval(getX(), getY(), radius, radius);
    }

    @Override
    public boolean isBelong(int x, int y) {
        return Math.pow(radius, 2) >= Math.pow((x - getX()), 2) + Math.pow((y - getY()), 2);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
