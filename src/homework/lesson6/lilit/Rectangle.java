package homework.lesson6.lilit;

import java.awt.*;
import java.util.*;

public class Rectangle extends Figure {
    static final Color DEFAULT_COLOR = Color.GREEN;

    public Rectangle(int x, int y, int width, int height) {
        this(x, y, width, height, DEFAULT_COLOR);
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        return x >= getX() && x <= getX() + getWidth() && y >= getY() && y <= getY() + getHeight();
    }
}
