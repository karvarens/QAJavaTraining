package auditorium.classintro;

import javax.swing.*;

public class Rectangle {
    static int maxWidth = 110;

    private int width;
    int height;

    Rectangle(){
    }

    Rectangle(int width, int height) {
       this.height = height;
       this.width = width;
    }

    void setWidth(int width) {
        if(width < 0) {
//            JOptionPane.showMessageDialog(null, "Error: ");
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