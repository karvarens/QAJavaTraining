package homework.lesson6.figure;

import javax.swing.*;
import java.awt.*;

public class FigureCanvas extends JPanel {

    /**
     *  Count of elements added to the figures
     */
    int size = 0;
    private Figure[] figures;

    private boolean isSelected;

    public FigureCanvas() {
        this.figures = new Figure[10];  //TODO: Write an DynamicArray class  and replace it LATER.

        //TODO: add MouseListeners and MouseMotionListener


    }

    public void add (Figure figure) {
        //TODO
    }

    public boolean remove (Figure figure) {
        //TODO
        return true; // if the specified figure exists
    }

    public void select (int x, int y) {
        //TODO : try to select the first figure containing the point (x, y)  and set isSelected = true otherwise false
    }




    @Override
    public void paint (Graphics g) {
//        TODO: implement the method
    }


}
