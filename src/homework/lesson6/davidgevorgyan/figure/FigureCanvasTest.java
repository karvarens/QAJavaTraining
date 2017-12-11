package homework.lesson6.davidgevorgyan.figure;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FigureCanvasTest {

    @Test
    void remove_withoutSelect() {
        FigureCanvas main = new FigureCanvas();
        Rectangle a= new Rectangle(100,200,400,50, Color.red, 5, null);
        Circle b = new Circle(100,200,100, Color.red, 5, null);
        Circle c = new Circle(400,400,40, Color.red, 5, null);
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(b);
        assertFalse(main.remove());
    }

    @Test
    void remove_withEmptySelect() {
        FigureCanvas main = new FigureCanvas();
        Rectangle a= new Rectangle(100,200,400,50, Color.red, 5, null);
        Circle b = new Circle(100,200,10, Color.red, 5, null);
        Circle c = new Circle(400,400,40, Color.red, 5, null);
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(b);
        main.select(0,0);
        assertFalse(main.remove());
    }
    @Test
    void equalsTest(){
        Rectangle a= new Rectangle(100,200,400,400, Color.red, 5, null);
        Circle b = new Circle(100,200,200, Color.red, 5, null);
        Circle c = new Circle(100,200,200, Color.red, 5, null);
        assertFalse(a.equals(b));
        assertTrue(b.equals(c));
    }

    @Test
    void remove_withSelect() {
        FigureCanvas main = new FigureCanvas();
        Rectangle a= new Rectangle(100,100,400,500, Color.red, 5, null);
        Circle b = new Circle(100,200,100, Color.red, 5, null);
        Circle c = new Circle(400,400,100, Color.red, 5, null);
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(b);
        main.select(150,250);
        assertTrue(main.remove());
    }
}