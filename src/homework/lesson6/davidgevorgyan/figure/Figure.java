package homework.lesson6.davidgevorgyan.figure;

import java.awt.*;
import java.util.Objects;

abstract public class Figure {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    Figure(int x, int y, int width, int height, Color color) {
        validate(x, y, width, height);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;

    }

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

    public Color getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    abstract void draw(Graphics g);

    abstract boolean isBelong (int x, int y);

    public void move(int dx, int dy, int canvasWidth, int canvasHeight ) {
           if (getY() + dy > 0 && getY() + dy + getHeight() < canvasHeight)
                setY(getY() + dy);
           if (getX() + dx > 0 && getX() + dx + getWidth() < canvasWidth)
                setX(getX() + dx);
    }

    private boolean validate(int x, int y, int width, int height){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenSizeWidth = screenSize.getWidth();
        double screenSizeHeight = screenSize.getHeight();

        if (x >= 0 && !(x > screenSizeWidth - width) && y >= 0 && !(y > screenSizeHeight - height) && width >= 1 && height >= 1) {
            return true;
        }
        else {
            throw new IllegalArgumentException();
        }

    }

    //Overridden methods of the Object class

    @Override
    public String toString() {
        String className = getClass().toString();
        className = className.substring(45);
        return className +  ". X: '" + this.x + "', Y: '" + this.y + "', Width: '" + this.width + "', Height: '" + this.height + "'";
    }

    @Override
    public boolean equals(Object o) { //TODO:  analise  this method during the lesson
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        if (x != figure.x) return false;
        if (y != figure.y) return false;
        if ( ! color.equals(figure.color)) return false;
        return width == figure.width && height == figure.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, width, height, color);
    }


}
