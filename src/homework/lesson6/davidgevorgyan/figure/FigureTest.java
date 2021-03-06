package homework.lesson6.davidgevorgyan.figure;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class FigureTest {
    @Before
    public static FigureCanvas data() {
        FigureCanvas location = new FigureCanvas();
        location.setSize(1000,1000);
        return location;
    }

    @Test
    void isBelong() {
        Rectangle a= new Rectangle(100,200,10,10, Color.red, data());
        Circle b = new Circle(100,200,100, Color.red, data());
        Circle c = new Circle(400,400,200, Color.red, data());
        assertEquals(false, a.isBelong(200,200));
        assertEquals( true, a.isBelong(101,202));
        assertEquals(true,  b.isBelong(100,250));
        assertEquals(false, c.isBelong(99,250));
    }

    @Test
    void validatorValid() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Rectangle a = new Rectangle(10,10,10,10,Color.red, data());
        Method method = Figure.class.getDeclaredMethod("isValid", int.class, int.class, int.class, int.class);
        method.setAccessible(true);
        assertEquals(null,  method.invoke(a, a.getX(),a.getY(),a.getWidth(),a.getHeight()));
  }

    @Test
    void validatorInvalidX() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(-10,10,10,10,Color.red, data());});
    }
    @Test
    void validatorInvalidY() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,-10,10,10,Color.red, data());});
    }
    @Test
    void validatorInvalidWidth() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,100000,10,Color.red, data());});
    }
    @Test
    void validatorInvalidHeight() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,10,100000,Color.red, data());});
    }
    @Test
    void validatorNegativeWidth() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,-1,10,Color.red, data());});
    }
    @Test
    void validatorNegativeHeight() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10,10,10,0,Color.red, data());});
    }

}