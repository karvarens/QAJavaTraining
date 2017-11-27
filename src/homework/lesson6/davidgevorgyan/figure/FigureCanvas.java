package homework.lesson6.davidgevorgyan.figure;


import com.sun.tools.javac.util.ArrayUtils;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import static homework.lesson2.davidgevorgyan.util.MathUtil.minAbs;

public class FigureCanvas extends JPanel {
    /**
     * Default capacity of figures can be added to figures
     */
    private final static int DEFAULT_SIZE = 300;

    /**
     * Count of elements added to the figures
     */
    private int size = 0;


    public int figuresSize() {
        return size;
    }

    private Figure figures[] = new Figure[DEFAULT_SIZE];

    private boolean isSelected;

    public FigureCanvas() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                mousePressedPerformed(me);
            }
        });
    }

    private void mousePressedPerformed (MouseEvent me) {
        select(me.getX(), me.getY());
        repaint();

    }

    public void add(Figure figure) {
        figures = (Figure[]) homework.lesson2.davidgevorgyan.util.ArrayUtil.enlargeArraySize(size, figures);
        figures[size] = figure;
        size++;
        repaint();
    }


    public boolean remove() {
        if (isSelected) {
            figures[size - 1] = null;
            size--;
            isSelected = false;
            repaint();
            return true;
        }
        repaint();
        return false;
    }

    public void select(int x, int y) {
        for (int i = size - 1; i >= 0; i--) {
            if (figures[i].isBelong(x, y)) {
                isSelected = true;
                if(i < size - 1) {
                    homework.lesson2.davidgevorgyan.util.ArrayUtil.moveToEnd(figures, i); //TODO: I think it may be preferable to have a remove by index method for figures array which returns removed figure
                    //TODO(continuation): and add method which adds to the end of figures array
                }
                return;
            }
        }

        isSelected = false;
    }

    @Override
    public void update(Graphics g){

    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < size; i++) {
                figures[i].draw(g);
        }
    }

    @Override
    public String toString() {
        String output = "";
        System.out.println("Array is filled with: " + size + " elements");
        System.out.println("Array length is: " + figures.length + " elements");
        for (Figure figure : figures) {
            if (figure != null) {
                output = output + "X: '" + figure.getX() + "', Y: '" + figure.getY() + "', Width: '" + figure.getWidth() + "', Height: '" + figure.getHeight() + "'\n";
            }
        }
        return output;
    }

    public static Figure randomFigure(int canvasWidth, int canvasHeight) {
        Figure randomFigure;
        int width = ThreadLocalRandom.current().nextInt(1, canvasWidth);
        int height = ThreadLocalRandom.current().nextInt(1, canvasHeight);
        int x = ThreadLocalRandom.current().nextInt(0, canvasWidth - width);
        int y = ThreadLocalRandom.current().nextInt(0, canvasHeight - height);

        if (x % 2 == 0) {
            randomFigure = new Rectangle(x, y, width, height, (int) (Math.random() * 0x1000000));
        } else {
            randomFigure = new Circle(x, y, minAbs(height,width), (int) (Math.random() * 0x1000000));
        }


        return randomFigure;
    }

}
