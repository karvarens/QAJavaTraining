package homework.lesson6.vardankhalatyan;

import homework.lesson6.vardankhalatyan.util.DynamicArray;
import homework.lesson6.vardankhalatyan.util.DynamicArrayImpl;

import javax.swing.*;
import java.awt.*;

public class FigureCanvas extends JPanel {

    /**
     *  Count of elements added to the figures
     */
    int size = 0;
    private boolean isSelected;
    private DynamicArray<Figure> figures = new DynamicArrayImpl<Figure>();

    public FigureCanvas() {
        //TODO: add MouseListeners and MouseMotionListener
        JPanel canvas = new JPanel();
        canvas.setBounds(0,0,300,300);
        JButton addFigure = new JButton("Add Figure");
        JButton removeFigure = new JButton("Remove Figure");
        canvas.add(addFigure);
        canvas.add(removeFigure);
    }

    public void add (Figure figure) {
        figures.add(figure);
        Figure fg = figures.get(size-1);
        paint(getGraphics());
        fg.draw(getGraphics());
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

    public static void main(String[] args) {
        Circle crcl = new Circle(100, 100, 10, Color.RED);
        FigureCanvas fgc = new FigureCanvas();
        fgc.add(crcl);
    }

}


