package homework.lesson6.davidgevorgyan.figure;



import com.sun.tools.javac.util.ArrayUtils;


import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class FigureCanvas extends JPanel {

    /**
     *  Count of elements added to the figures
     */
    private final static int DEFAULT_SIZE = 300;
    private int size = 0;
    private Figure figures[] = new Figure[DEFAULT_SIZE];

    private boolean isSelected;

    public FigureCanvas() {

        //TODO: add MouseListeners and MouseMotionListener


    }

    public void add (Figure figure) {
        if(size == figures.length - 1){
            figures = (Figure [])homework.lesson2.davidgevorgyan.util.ArrayUtil.enlargeArraySize(figures);
        }
        figures[size]=figure;
        size++;
    }

    public boolean remove () {
        if (isSelected) {
            figures[size - 1] = null;
            size--;
            isSelected = false;
            return true;
        }
    return false;
    }

    public void select (int x, int y) {
        for (int i = size - 1; i >= 0 ; i--) {
            if (figures[i].isBelong(x,y)){
                isSelected = true;
                homework.lesson2.davidgevorgyan.util.ArrayUtil.moveToEnd(figures, i);
                break;
            }
            else {
                isSelected = false;
            }
        }
    }
    public int count () {
      return homework.lesson2.davidgevorgyan.util.ArrayUtil.countNotNullValues(figures);
    }




    @Override
    public void paint (Graphics g) {
        for (Figure figure:figures) {
            if (figure != null)
                figure.draw(getGraphics());
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
    public Figure randomFigure(int canvasWidth, int canvasHeight){

        int maxWidth = canvasWidth;
        int maxHeight = canvasHeight;
        Figure randomFigure;
        int width = ThreadLocalRandom.current().nextInt(0, maxWidth);
        int height = ThreadLocalRandom.current().nextInt(0, maxHeight);
        int y = ThreadLocalRandom.current().nextInt(0, maxHeight - height);
        int x = ThreadLocalRandom.current().nextInt(0, maxWidth - width);


        if(x % 2 == 0)
        {
            randomFigure= new Rectangle(x,y,width,height);
        }
        else {
            randomFigure= new Circle(x,y,height);
        }


        return randomFigure;
    }

}
