package homework.lesson6.vardankhalatyan;

import java.awt.*;

public class Rectangle extends Figure {

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void draw (Graphics g) {

    }

    @Override
    public boolean isBelong (int x, int y) {
        return false;
    }
}
