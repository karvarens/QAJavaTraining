package homework.lesson6.davidgevorgyan.figure;

import homework.lesson6.davidgevorgyan.figure.util.DynamicArrayImplementation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ThreadLocalRandom;
import static homework.lesson2.davidgevorgyan.util.MathUtil.minAbs;

public class FigureCanvas extends JPanel {
    public DynamicArrayImplementation figures = new DynamicArrayImplementation();

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
        figures.add(figure);
        repaint();
    }


    public boolean remove() {
        if (isSelected) {
            figures.remove(figures.size() - 1);
            isSelected = false;
            repaint();
            return true;
        }
        repaint();
        return false;
    }

    public void select(int x, int y) {
        for (int i = figures.size() - 1; i >= 0; i--) {
            Figure temp = (Figure)figures.get(i);
            if (temp.isBelong(x, y)) {
                isSelected = true;
                if(i < figures.size() - 1) {
                    try {
                        figures.moveToEnd(i);
                    } catch (Exception e) {
                        System.out.println("It's not possible to select the Figure");
                    }
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
        for (int i = 0; i < figures.size(); i++) {
                Figure temp = (Figure)figures.get(i);
                temp.draw(g);
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        System.out.println("Array is filled with: " + figures.size() + " elements");
        Figure figure;
        for (int i =0; i < figures.size(); i++) {
            figure = (Figure)figures.get(i);
            if (figure != null) {
                output.append("X: '").append(figure.getX()).append("', Y: '").append(figure.getY()).append("', Width: '").append(figure.getWidth()).append("', Height: '").append(figure.getHeight()).append("'\n");
            }
        }
        return output.toString();
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
