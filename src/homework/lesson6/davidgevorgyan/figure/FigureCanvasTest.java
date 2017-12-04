package homework.lesson6.davidgevorgyan.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureCanvasTest {

    @Test
    void remove_withoutSelect() {
        FigureCanvas main = new FigureCanvas();
        Rectangle a= new Rectangle(1000,200,400,500,0);
        Circle b = new Circle(100,200,100,0);
        Circle c = new Circle(400,400,400,0);
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(b);
        assertEquals(false, main.remove());
    }

    @Test
    void remove_withEmptySelect() {
        FigureCanvas main = new FigureCanvas();
        Rectangle a= new Rectangle(1000,200,400,500,0);
        Circle b = new Circle(100,200,100,0);
        Circle c = new Circle(400,400,400,0);
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(b);
        main.select(0,0);
        assertEquals(false, main.remove());
    }
    @Test
    void equalsTest(){
        Rectangle a= new Rectangle(1000,200,400,400,0);
        Circle b = new Circle(1000,200,400,0);
        Circle c = new Circle(1000,200,400,0);
        assertEquals(false,a.equals(b));
        assertEquals(true,b.equals(c));
    }

    @Test
    void remove_withSelect() {
        FigureCanvas main = new FigureCanvas();
        Rectangle a= new Rectangle(1000,200,400,500,0);
        Circle b = new Circle(100,200,100,0);
        Circle c = new Circle(400,400,400,0);
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(b);
        main.select(150,250);
        assertEquals(true, main.remove());
    }
}