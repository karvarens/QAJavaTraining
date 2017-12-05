package homework.lesson6.davidgevorgyan.figure;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
    void validatorValid() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Rectangle a = new Rectangle(10,10,10,10,0);
        Method method = Figure.class.getDeclaredMethod("validate", int.class, int.class, int.class, int.class);
        method.setAccessible(true);
        assertEquals(true,  method.invoke(a, a.getX(),a.getY(),a.getWidth(),a.getHeight()));
//        assertEquals(true, a.validate(a.getX(),a.getY(),a.getWidth(),a.getHeight()));
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