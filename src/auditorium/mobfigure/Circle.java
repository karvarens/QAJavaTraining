package auditorium.mobfigure;

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
        return false;
    }
}
