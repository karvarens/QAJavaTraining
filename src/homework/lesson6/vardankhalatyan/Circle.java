package homework.lesson6.vardankhalatyan;

import java.awt.*;

public class Circle extends Figure {
    public Circle(int x, int y, int diameter, Color color) {
        super(x, y, diameter, diameter, color);
    }


    //    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        int cx = (2 * getX() + getWidth()) / 2;
        int cy = (2 * getY() + getHeight()) / 2;
        int radius = getHeight() / 2;
        return (x - cx) * (x - cx) + (y - cy) * (y - cy) <= radius * radius;
    }
}
