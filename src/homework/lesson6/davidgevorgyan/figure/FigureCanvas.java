package homework.lesson6.davidgevorgyan.figure;

import homework.lesson6.davidgevorgyan.figure.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ThreadLocalRandom;
import static homework.lesson2.davidgevorgyan.util.MathUtil.minAbs;

public class FigureCanvas extends JPanel {

    public DynamicArray<Figure> figures = new DynamicArrayImplementation<>();
    private boolean isSelected;

    public FigureCanvas() {
        MovingAdapter ma = new MovingAdapter();
        addMouseMotionListener(ma);
        addMouseListener(ma);
    }

    //Inner classes
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

            Figure temp = getSelected();
            if (isSelected) {
                temp.move();
                repaint();
            }
            x += dx;
            y += dy;
        }
    }

    //Canvas methods
    public void add(Figure figure) {
        figures.add(figure);
        repaint();
    }

    public boolean remove() {
        if(getSelected() != null) {
            getSelected().stop();
            figures.remove(getSelected());
            isSelected = false;
            repaint();
            return true;
        }
        repaint();
        return false;
    }

    public void select(int x, int y) {
        for (int i = figures.size() - 1; i >= 0; i--) {
            if (figures.get(i).isBelong(x, y)) {
                isSelected = true;
                figures.add(figures.remove(i));
                return;
            }
        }

        isSelected = false;
    }

    public void playPause() {
        if(isSelected) {
            getSelected().playPause();
        }
    }

    public void stop() {
        if(isSelected) {
            getSelected().stop();
        }
    }

    public Figure randomFigure(int canvasWidth, int canvasHeight) {
            Figure randomFigure;
            int width = ThreadLocalRandom.current().nextInt(1, canvasWidth);
            int height = ThreadLocalRandom.current().nextInt(1, canvasHeight);
            int x = ThreadLocalRandom.current().nextInt(0, canvasWidth - width);
            int y = ThreadLocalRandom.current().nextInt(0, canvasHeight - height);
            int speed = ThreadLocalRandom.current().nextInt(1, 5);
            Color color = new Color((int)(Math.random() * 255),(int)(Math.random() * 255), (int)(Math.random() * 255));
            if (x % 2 == 0) {
                randomFigure = new Rectangle(x, y, width, height, color,this);
            } else {
                randomFigure = new Circle(x, y, minAbs(height,width), color,this);
            }
            return randomFigure;
    }

    private Figure getSelected() {
        if (isSelected) {
            return figures.get(figures.size() - 1);
        }
        else {
            throw new NullPointerException("Figure is not selected");
        }
    }

    //Override methods
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
                Figure temp = figures.get(i);
                temp.draw(g);
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        System.out.println("Array is filled with: " + figures.size() + " elements");
        Figure figure;
        for (int i =0; i < figures.size(); i++) {
            figure = figures.get(i);
            if (figure != null) {
                output.append("X: '").append(figure.getX()).append("', Y: '").append(figure.getY()).append("', Width: '").append(figure.getWidth()).append("', Height: '").append(figure.getHeight()).append("'\n");
            }
        }
        return output.toString();
    }
}
