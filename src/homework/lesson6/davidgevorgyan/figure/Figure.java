package homework.lesson6.davidgevorgyan.figure;

import java.awt.*;
import java.util.Objects;

abstract public class Figure {
    private int x;
    private int y;
    private int width;
    private int height;
    private int colour;

    Figure(int x, int y, int width, int height, int colour) {
        if (!validate(x, y, width, height)) { // it would be better to throw IllegalArgumentException in validate method
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colour = colour;

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

    public int getColour() {
        return colour;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    abstract void draw(Graphics g);

    abstract boolean isBelong (int x, int y);

    public void move(int dX, int dY){

    }

    private boolean validate(int x, int y, int width, int height){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenSizeWidth = screenSize.getWidth();
        double screenSizeHeight = screenSize.getHeight();

        return x >= 0 && !(x > screenSizeWidth - width) && y >= 0 && !(y > screenSizeHeight - height) && width >= 1 && height >= 1;
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
        if (colour != figure.colour) return false;
        return width == figure.width && height == figure.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, width, height, colour);
    }


}
