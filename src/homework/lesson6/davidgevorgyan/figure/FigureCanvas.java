package homework.lesson6.davidgevorgyan.figure;

import homework.lesson6.davidgevorgyan.figure.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ThreadLocalRandom;
import static homework.lesson2.davidgevorgyan.util.MathUtil.minAbs;

public class FigureCanvas extends JPanel {
    public DynamicArray<Figure> figures = new DynamicArrayImplementation<>();  // TODO: It is the better practise to interface references instead of class ref.

    private MovingAdapter ma = new MovingAdapter();
    private boolean isSelected;

    public FigureCanvas() {
        addMouseMotionListener(ma);
        addMouseListener(ma);
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

    void select(int x, int y) {
        for (int i = figures.size() - 1; i >= 0; i--) {
            Figure temp = figures.get(i);
            if (temp.isBelong(x, y)) {
                isSelected = true;
                figures.add(figures.remove(i));
//                if(i < figures.size() - 1) {
//                    try {
////                        figures.moveToEnd(i);
//                    } catch (Exception e) {
//                        System.out.println("It's not possible to select the Figure");
//                    }
//                }
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
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

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
    class MovingAdapter extends MouseAdapter {

        private int x;
        private int y;

        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            select(e.getX(), e.getY());
            repaint();
        }

        public void mouseDragged(MouseEvent e) {
            int dx = e.getX() - x;
            int dy = e.getY() - y;


            Figure temp = figures.get(figures.size()-1);
            if (temp.isBelong(x, y)) {
                if (temp.getY() + dy > 0 && temp.getY() + dy + temp.getHeight() < getHeight())
                    temp.setY(temp.getY() + dy);
                if (temp.getX() + dx > 0 && temp.getX() + dx + temp.getWidth() < getWidth())
                    temp.setX(temp.getX() + dx);
                repaint();
            }
            x += dx;  // TODO: implement and use move method of Figure class
            y += dy;
        }
    }
}
