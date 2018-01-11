package homework.lesson6.vardankhalatyan;

import homework.lesson6.vardankhalatyan.util.DynamicArray;
import homework.lesson6.vardankhalatyan.util.DynamicArrayImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FigureCanvas extends JPanel {

    /**
     *  Count of elements added to the figures
     */
    int size = 0;
    private boolean isSelected;
    private DynamicArray<Figure> figures = new DynamicArrayImpl<>();

    public FigureCanvas() {
        //TODO: add MouseListeners and MouseMotionListener

        addMouseListener(new MouseAdapter() {
            private int mouseX;
            private int mouseY;

            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                select(mouseX, mouseY);
                add(new Circle(mouseX, mouseY, mouseX - mouseY, Color.RED));
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int dx = e.getX() - mouseX;
                int dy = e.getY() - mouseY;
                figures.get(figures.size() - 1).move(dx, dy);
                mouseX += dx;
                mouseY += dy;
                repaint();
            }
        });
    }

    //TODO: add handler methods


    public void add (Figure figure) {
        figures.add(figure);
        repaint();

//        Figure fg = figures.get(figures.size()-1);
//        paint(getGraphics());
//        fg.draw(getGraphics());
    }

    public boolean remove (Figure figure) {
        boolean rmed = figures.remove(figure);
        repaint();
        return rmed; // if the specified figure exists
    }

    public void select (int x, int y) {
        for (int i = figures.size()-1; i >= 0 ; i--) {

            if(figures.get(i).isBelong(x, y)){
                figures.add(figures.remove(i));
                isSelected = true;
                return;
            }
        }
        isSelected = false;
    }


    @Override
    public void paint (Graphics g) {
        for (int i = 0; i < figures.size(); i++) {
            figures.get(i).draw(g);;
        }
//        TODO: implement the method
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }

    public static void main(String[] args) {

    }

}


