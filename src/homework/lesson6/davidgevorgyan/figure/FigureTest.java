package homework.lesson6.davidgevorgyan.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FigureTest {
    @Test
    void isBelong() {
        Rectangle a= new Rectangle(1000,200,400,500,0);
        Circle b = new Circle(100,200,100,0);
        Circle c = new Circle(400,400,400,0);
        assertEquals(false, a.isBelong(200,200));
        assertEquals( true, a.isBelong(1399,699));
        assertEquals(true,  b.isBelong(100,250));
        assertEquals(false, c.isBelong(99,250));
    }

    @Test
    void validatorValid() {
        Rectangle a = new Rectangle(10,10,10,10,0);
        assertEquals(true,a.validator(a.getX(),a.getY(),a.getWidth(),a.getHeight()));
    }

    @Test
    void validatorInvalidX() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(-10,10,10,10,0);});
    }
    @Test
    void validatorInvalidY() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,-10,10,10,0);});
    }
    @Test
    void validatorInvalidWidth() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,100000,10,0);});
    }
    @Test
    void validatorInvalidHeight() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,10,100000,0);});
    }
    @Test
    void validatorNegativeWidth() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,-1,10,0);});
    }
    @Test
    void validatorNegativeHeight() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,10,0,0);});
    }

}