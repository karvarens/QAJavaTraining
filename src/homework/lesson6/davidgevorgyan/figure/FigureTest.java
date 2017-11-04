package homework.lesson6.davidgevorgyan.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FigureTest {
    @Test
    void validatorValid() {
        Rectangle a = new Rectangle(10,10,10,10);
        assertEquals(true,a.validator(a.getX(),a.getY(),a.getWidth(),a.getHeight()));
    }

    @Test
    void validatorInvalidX() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(-10,10,10,10);});
    }
    @Test
    void validatorInvalidY() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,-10,10,10);});
    }
    @Test
    void validatorInvalidWidth() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,100000,10);});
    }
    @Test
    void validatorInvalidHeight() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,10,100000);});
    }
    @Test
    void validatorNegativeWidth() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,-1,10);});
    }
    @Test
    void validatorNegativeHeight() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,10,0);});
    }

}