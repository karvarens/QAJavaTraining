package homework.lesson6.davidgevorgyan.figure;


import com.sun.tools.javac.util.ArrayUtils;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class FigureCanvas extends JPanel {
    //TODO: Move the code related to size handleing to the DynamicArray class
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
//        for (Figure figure : figures) {
        select(me.getX(), me.getY());
//            if (figure != null && figure.isBelong(me.getX(), me.getY())) {
//                paint(getGraphics());
//            }
//        }
        repaint();

    }

    public void add(Figure figure) {
        if (size == figures.length - 1) {
            figures = Arrays.copyOf(figures, figures.length * 3 / 2);
            ;
//            figures = (Figure [])homework.lesson2.davidgevorgyan.util.ArrayUtil.enlargeArraySize(figures);
        }
        figures[size] = figure;
        size++;
        repaint();
    }

    public boolean remove() {
        if (isSelected) {
            figures[size - 1] = null;
            size--;
            isSelected = false;
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

//    public int count() {
//        return homework.lesson2.davidgevorgyan.util.ArrayUtil.countNotNullValues(figures);
//    }


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
        int width = ThreadLocalRandom.current().nextInt(0, canvasWidth);
        int height = ThreadLocalRandom.current().nextInt(0, canvasHeight);
        int x = ThreadLocalRandom.current().nextInt(0, canvasWidth - width);
        int y = ThreadLocalRandom.current().nextInt(0, canvasHeight - height);

        if (x % 2 == 0) {
            randomFigure = new Rectangle(x, y, width, height, (int) (Math.random() * 0x1000000));
        } else {
            randomFigure = new Circle(x, y, height, (int) (Math.random() * 0x1000000));
        }


        return randomFigure;
    }

}
