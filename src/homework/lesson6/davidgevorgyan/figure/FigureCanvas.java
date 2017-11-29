package homework.lesson6.davidgevorgyan.figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ThreadLocalRandom;
import static homework.lesson2.davidgevorgyan.util.MathUtil.minAbs;

public class FigureCanvas extends JPanel {
//TODO get rid of too many figures.countNotNullValues() calls

    DynamicArray figures = new DynamicArray(3);

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
        figures.setObject(figure);
        repaint();
    }


    public boolean remove() {
        if (isSelected) {
            figures.removeFromArray(figures.countNotNullValues() - 1);
            isSelected = false;
            repaint();
            return true;
        }
        repaint();
        return false;
    }

    public void select(int x, int y) {
        for (int i = figures.countNotNullValues() - 1; i >= 0; i--) {
            Figure temp = (Figure)figures.getObject(i);
            if (temp.isBelong(x, y)) {
                isSelected = true;
                if(i < figures.countNotNullValues() - 1) {
                    figures.moveToEnd(i);
                }
                return;
            }
        }

        isSelected = false;
    }

    @Override
    public void update(Graphics g) {

    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < figures.countNotNullValues(); i++) {
                Figure temp = (Figure)figures.getObject(i);
                temp.draw(g);
        }
    }

    @Override
    public String toString() {
        String output = "";
        System.out.println("Array is filled with: " + figures.countNotNullValues() + " elements");
        System.out.println("Array length is: " + figures.getObjects().length + " elements");
        Figure figure;
        for (int i =0; i < figures.countNotNullValues(); i++) {
            figure = (Figure)figures.getObject(i);
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
