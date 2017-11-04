package homework.lesson6.davidgevorgyan.figure;

import java.awt.*;

abstract public class Figure {
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private int x;
    private int y;
    private int width;
    private int height;


    Figure(int x, int y, int width, int height) {
        if (!validator(x, y, width, height)) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }


    abstract void draw(Graphics g);

    abstract boolean isBelong (int x, int y);

    boolean validator(int x, int y, int width, int height){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenSizeWidth = screenSize.getWidth();
        double screenSizeHeight = screenSize.getHeight();

        return x >= 0 && !(x > screenSizeWidth - width) && y >= 0 && !(y > screenSizeHeight - height) && width >= 1 && height >= 1;
    }

    @Override
    public String toString() {
        String className = getClass().toString();
        className = className.substring(45);
        return className +  ". X: '" + this.x + "', Y: '" + this.y + "', Width: '" + this.width + "', Height: '" + this.height + "'";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        if (x != figure.x) return false;
        if (y != figure.y) return false;
        return width == figure.width && height == figure.height;
    }
}
