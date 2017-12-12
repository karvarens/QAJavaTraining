package homework.lesson6.davidgevorgyan.figure;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FigureCanvasTest {
    @Before
    public static FigureCanvas data() {
    FigureCanvas location = new FigureCanvas();
    location.setSize(1000,1000);
    return location;
    }


    @Test
    void remove_withoutSelect() {


        FigureCanvas main = new FigureCanvas();
        Rectangle a= new Rectangle(100,200,400,50, Color.red, data());
        Circle b = new Circle(100,200,100, Color.red, data());
        Circle c = new Circle(400,400,40, Color.red, data());
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(b);
        assertFalse(main.remove());
    }

    @Test
    void remove_withEmptySelect() {
        FigureCanvas main = new FigureCanvas();
        Rectangle a= new Rectangle(100,200,400,50, Color.red, data());
        Circle b = new Circle(100,200,10, Color.red, data());
        Circle c = new Circle(400,400,40, Color.red, data());
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(b);
        main.select(0,0);
        assertFalse(main.remove());
    }
    @Test
    void equalsTest(){
        Rectangle a= new Rectangle(100,200,400,400, Color.red, data());
        Circle b = new Circle(100,200,200, Color.red, data());
        Circle c = new Circle(100,200,200, Color.red, data());
        assertFalse(a.equals(b));
        assertTrue(b.equals(c));
    }

    @Test
    void remove_withSelect() {
        FigureCanvas main = new FigureCanvas();
        Rectangle a= new Rectangle(100,100,400,500, Color.red, data());
        Circle b = new Circle(100,200,100, Color.red, data());
        Circle c = new Circle(400,400,100, Color.red, data());
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(b);
        main.select(150,250);
        assertTrue(main.remove());
    }
}