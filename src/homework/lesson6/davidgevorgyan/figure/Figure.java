//TODO ask about removal method in canvas

package homework.lesson6.davidgevorgyan.figure;

import java.awt.*;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

abstract public class Figure implements Runnable {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private int dx;
    private int dy;
    private boolean isRunning;
    private boolean isPaused;
    private FigureCanvas location;
    private Thread t;

    Figure(int x, int y, int width, int height, Color color, FigureCanvas location) {
        validate(x, y, width, height);

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.location = location;
    }

    //Getters

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
        if (this.getX() + this.getWidth() >= location.getWidth() - 1) {
            dx = dx > 0 ? -dx : dx;
        }
        return dx;
    }

    private int setDirectionY (int dy) {
        if (this.getY() <= 0) {
            dy = dy < 0 ? -dy : dy;
        }
        if (this.getY() + this.getHeight() >= location.getHeight() - 1) {
            dy = dy > 0? -dy: dy;
        }
        return dy;
    }

    //Abstract methods
    abstract void draw(Graphics g);

    abstract boolean isBelong (int x, int y);

    //Threads methods
    private synchronized void play() {
        if(isPaused) {
            isPaused = false;
            notify();
        }
    }

    private void pause() {
        if(isRunning) {
            isPaused = true;
        }
    }

    public void playPause(){
        if(isRunning) {
            if (isPaused) {
                play();
            } else {
                pause();
            }
        }
        else {
            start();
        }
    }

    private void start() {
        if (t != null) {
            stop();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        t = new Thread(this, "Figure");
        isRunning = true;
        setSpeed();
        try {
            t.start();
        } catch (IllegalThreadStateException e) {
            e.printStackTrace();
            isRunning = false;
        }
    }

    public void stop() {
        play();
        isRunning = false;
        setSpeed();
    }

    //Other methods
    private void validate(int x, int y, int width, int height){
        if (!(x >= 0 && !(x > location.getWidth() - width) && y >= 0 && !(y > location.getHeight() - height) && width >= 1 && height >= 1)) {
            throw new IllegalArgumentException();
        }
    }

    public void move(int dx, int dy) {
            setY(getY() + dy);
            setX(getX() + dx);
    }

    private void setSpeed() {
        if (isRunning && !isPaused) {
            dx = ThreadLocalRandom.current().nextInt(-5, 5); //TODO: eliminate hardcoded value and use some defaults
            dy = ThreadLocalRandom.current().nextInt(-5, 5);
        }
        else {
            dx = 0;
            dy = 0;
        }
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
            while (isRunning) {
                synchronized(this) {
                    while(isPaused) {
                        wait();
                    }
                }
                dx = setDirectionX(dx); //It can be one method responsible for direction setDirectionX(dx) dx is redundant
                dy = setDirectionY(dy);
                move(dx, dy);
                if(location != null) {
                    //It should be thrown an Exception , this situation is impossible
                    location.repaint();
                }
                Thread.sleep( 10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(x + " exiting.");
    }

}
