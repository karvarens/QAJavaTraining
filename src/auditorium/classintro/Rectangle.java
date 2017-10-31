package auditorium.classintro;

import javax.swing.*;

public class Rectangle {
    private final static int MAX_WIDTH = 110;

    private int width;
    private int height;

    Rectangle(){
    }

    Rectangle(int width, int height) {
       this.height = height;
       this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static int getMaxWidth() {
        return MAX_WIDTH;
    }

    void setWidth(int width) {
        if(width < 0) {
            JOptionPane.showMessageDialog(null, "Error: ");
            return;
        }
        this.width = width;
    }

    int getWidth() {
        return width;
    }

    int getSquare(){
        return width * height;
    }

}