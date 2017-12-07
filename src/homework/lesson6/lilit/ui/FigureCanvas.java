package homework.lesson6.lilit.ui;

import homework.lesson6.lilit.*;

import javax.swing.*;
import java.awt.*;

public class FigureCanvas extends JPanel {

    /**
     * Count of elements added to the figures
     */
    int size = 0;

    private int width;
    private int height;

    private Figure[] figures;

    private boolean isSelected;
    //MouseListener mouseListener = new MouseListener();


    public FigureCanvas() {
        this.figures = new Figure[10];  //TODO: Write an DynamicArray class  and replace it LATER.
        //TODO: add MouseListeners and MouseMotionListener
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < size; i++) {
            figures[i].draw(g);
        }
    }

    public void add(Figure figure) {
        figures[size++] = figure;
        repaint();
    }

    public boolean remove(Figure figure) {
        figures[size--] = figure;
        //TODO
        return true; // if the specified figure exists
    }

    public void select(int x, int y) {
        //TODO : try to select the first figure containing the point (x, y)  and set isSelected = true otherwise false
    }


    public static void main(String[] args) {
        FigureFrame frame = new FigureFrame();
        Figure[] f = new Figure[2];

        f[0] = new homework.lesson6.lilit.Rectangle(100, 100, 200, 200);
        FigureCanvas canvas = frame.getCanvas();
        canvas.add(f[0]);
        f[0].draw(canvas.getGraphics());
        frame.repaint();
    }

}
