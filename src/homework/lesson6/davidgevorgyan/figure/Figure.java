package homework.lesson6.davidgevorgyan.figure;

import java.awt.*;
import java.util.Objects;

abstract public class Figure implements Runnable {
    private static int canvasWidth = 900;
    private static int canvasHeight = 600;
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private int dx;
    private int dy;
    private boolean suspendFlag;
    private FigureCanvas location;

    Figure(int x, int y, int width, int height, Color color, int dx, int dy, FigureCanvas location) {
        validate(x, y, width, height);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.dx = dx;
        this.dy = dy;
        Thread t = new Thread(this, "Figure");
        t.start();
        suspendFlag = false;
        this.location = location;
    }

    //Getters
    public boolean isSuspendFlag() {
        return suspendFlag;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    //Setters
    public static void setCanvasWidth(int canvasWidth) {
        Figure.canvasWidth = canvasWidth;
    }

    public static void setCanvasHeight(int canvasHeight) {
        Figure.canvasHeight = canvasHeight;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int setDirectionX (int dx) {
        if (this.getX() < 0 ) {
            dx = dx < 0 ? -dx : dx;
        }
        if (this.getX() + this.getWidth() >= canvasWidth - 1) {
            dx = dx > 0 ? -dx : dx;
        }
        return dx;
    }

    private int setDirectionY (int dy) {
        if (this.getY() <= 0) {
            dy = dy < 0 ? -dy : dy;
        }
        if (this.getY() + this.getHeight() >= canvasHeight - 1) {
            dy = dy > 0? -dy: dy;
        }
        return dy;
    }

    //Abstract methods
    abstract void draw(Graphics g);

    abstract boolean isBelong (int x, int y);

    //Threads methods
    synchronized void suspend() {
        suspendFlag = true;
    }

    synchronized void resume() {
        suspendFlag = false;
        notify();
    }

    //Other methods
    private void validate(int x, int y, int width, int height){
        if (!(x >= 0 && !(x > canvasWidth - width) && y >= 0 && !(y > canvasHeight - height) && width >= 1 && height >= 1)) {
            throw new IllegalArgumentException();
        }
    }

    public void move(int dx, int dy) {
            setY(getY() + dy);
            setX(getX() + dx);
    }


    //Overridden methods of the Object class
    @Override
    public String toString() {
        String className = getClass().toString();
        className = className.substring(45);
        return className +  ". X: '" + this.x + "', Y: '" + this.y + "', Width: '" + this.width + "', Height: '" + this.height + "'";
    }

    @Override
    public boolean equals(Object o) { //TODO:  analise  this method during the lesson
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        if (x != figure.x) {
            return false;
        }
        else if (y != figure.y) {
            return false;
        }
        else if ( ! color.equals(figure.color)) {
            return false;
        }
        return width == figure.width && height == figure.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, width, height, color);
    }

    @Override
    public void run() {
        try {
            while (getX() < canvasWidth || getY() < canvasHeight) {
                dx = setDirectionX(dx);
                dy = setDirectionY(dy);
                Thread.sleep( 10);
                synchronized(this) {
                    while(suspendFlag) {
                        wait();
                    }
                }
                move(dx, dy);
                if(location != null)
                    location.repaint();
            }
        } catch (InterruptedException e) {
            System.out.println(x + "Interrupted:");
        }
        System.out.println(x + " exiting.");
    }

}
