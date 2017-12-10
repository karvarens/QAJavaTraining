package homework.lesson6.davidgevorgyan.figure;

import java.awt.*;

public class Rectangle extends Figure {

    public Rectangle(int x, int y, int width, int height, Color color, int speed) {
        super(x, y, width, height, color, speed);
    }

    @Override
    void draw (Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(),getY(),getWidth(),getHeight());
    }

    @Override
    boolean isBelong (int x, int y) {
        return x >= getX() && x <= getX() + getWidth() && y >= getY() && y <= getY() + getHeight();
    }



}
