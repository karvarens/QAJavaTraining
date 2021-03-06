package homework.lesson6.vardankhalatyan;

import java.awt.*;

public class Circle extends Figure {

    public Circle(int x, int y, int diameter, Color color) {
        super(x, y, diameter, diameter, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawOval(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        int cx = getX() + getWidth() / 2;
        int cy = getY() + getHeight() / 2;
        int radius = getHeight() / 2;
        return (x - cx) * (x - cx) + (y - cy) * (y - cy) <= radius * radius;
    }
}
