package auditorium.mobfigure;

import java.awt.*;

public class Rectangle extends Figure {

    public Rectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw (Graphics g) {

    }

    @Override
    public boolean isBelong (int x, int y) {
        return false;
    }
}
