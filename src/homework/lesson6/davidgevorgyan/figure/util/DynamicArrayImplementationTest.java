package homework.lesson6.davidgevorgyan.figure.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicArrayImplementationTest {
    @Test
    void size() {
        DynamicArrayImplementation dynamicArrayImplementation = new DynamicArrayImplementation();
        dynamicArrayImplementation.add("Test");
        dynamicArrayImplementation.add("Rest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Best");
        dynamicArrayImplementation.add("Sest");
        assertEquals(5, dynamicArrayImplementation.size());
    }

    @Test
    void isEmpty() {
        DynamicArrayImplementation dynamicArrayImplementation = new DynamicArrayImplementation();
        assertTrue(dynamicArrayImplementation.isEmpty());
        dynamicArrayImplementation.add("Sest");
        assertFalse(dynamicArrayImplementation.isEmpty());
    }

    @Test
    void contains() {
        DynamicArrayImplementation<String> dynamicArrayImplementation = new DynamicArrayImplementation<>();
        dynamicArrayImplementation.add("Test");
        dynamicArrayImplementation.add("Rest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Best");
        dynamicArrayImplementation.add("Sest");
        assertTrue(dynamicArrayImplementation.contains("Best"));
        assertFalse(dynamicArrayImplementation.contains("West"));
    }

    @Test
    void indexOf() {
        DynamicArrayImplementation<String> dynamicArrayImplementation = new DynamicArrayImplementation<>();
        dynamicArrayImplementation.add("Test");
        dynamicArrayImplementation.add("Rest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Best");
        dynamicArrayImplementation.add("Sest");
        assertEquals(2, dynamicArrayImplementation.indexOf("Aest"));
        assertEquals(-1, dynamicArrayImplementation.indexOf("West"));
    }

    @Test
    void lastIndexOf() {
        DynamicArrayImplementation<String> dynamicArrayImplementation = new DynamicArrayImplementation<>();
        dynamicArrayImplementation.add("Test");
        dynamicArrayImplementation.add("Rest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Best");
        dynamicArrayImplementation.add("Sest");
        assertEquals(5, dynamicArrayImplementation.lastIndexOf("Aest"));
        assertEquals(-1, dynamicArrayImplementation.indexOf("West"));
    }

    @Test
    void get() {
        DynamicArrayImplementation dynamicArrayImplementation = new DynamicArrayImplementation();
        dynamicArrayImplementation.add("Test");
        dynamicArrayImplementation.add("Rest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("West");
        dynamicArrayImplementation.add("Zest");
        dynamicArrayImplementation.add("Best");
        dynamicArrayImplementation.add("Sest");
        assertEquals("Best", dynamicArrayImplementation.get(5));
        assertThrows(IndexOutOfBoundsException.class, ()-> dynamicArrayImplementation.get(7));
    }

    @Test
    void set() {
        DynamicArrayImplementation<String> dynamicArrayImplementation = new DynamicArrayImplementation<>();
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("West");
        dynamicArrayImplementation.add("Zest");
        dynamicArrayImplementation.add("Best");
        dynamicArrayImplementation.add("Sest");
        dynamicArrayImplementation.set(3, "WWWest");
        assertEquals("WWWest", dynamicArrayImplementation.get(3));
        assertThrows(IndexOutOfBoundsException.class, ()-> dynamicArrayImplementation.set(5, "AAA"));
    }

    @Test
    void add() {
        DynamicArrayImplementation<String> dynamicArrayImplementation = new DynamicArrayImplementation<>();
        dynamicArrayImplementation.add("Test");
        dynamicArrayImplementation.add("Rest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Best");
        dynamicArrayImplementation.add("Sest");
        dynamicArrayImplementation.add(1,"AAAest");
        assertEquals("AAAest", dynamicArrayImplementation.get(1));
        dynamicArrayImplementation.add(6,"BBBest");
        assertEquals("BBBest", dynamicArrayImplementation.get(6));
        assertThrows(IndexOutOfBoundsException.class, ()-> dynamicArrayImplementation.get(7));
    }

    @Test
    void remove() {
        DynamicArrayImplementation dynamicArrayImplementation = new DynamicArrayImplementation(3);
        dynamicArrayImplementation.add("Test");
        dynamicArrayImplementation.add("Rest");
        assertEquals("Rest", dynamicArrayImplementation.remove(1));
        assertEquals(1, dynamicArrayImplementation.size());
        assertThrows(IndexOutOfBoundsException.class, ()-> dynamicArrayImplementation.get(2));
    }


    @Test
    void remove1() {
        DynamicArrayImplementation<String> dynamicArrayImplementation = new DynamicArrayImplementation<>();
        dynamicArrayImplementation.add("Test");
        dynamicArrayImplementation.add("Rest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Best");
        dynamicArrayImplementation.add("Sest");
        assertTrue( dynamicArrayImplementation.remove("Rest"));
        assertEquals("Aest", dynamicArrayImplementation.get(1));
        assertFalse(dynamicArrayImplementation.remove("Gest"));

    }

    @Test
    void enlargeArraySize() {
        DynamicArrayImplementation dynamicArrayImplementation = new DynamicArrayImplementation(3);
        dynamicArrayImplementation.add("Test");
        dynamicArrayImplementation.add("Rest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Best");
        dynamicArrayImplementation.add("Sest");
        assertEquals(5, dynamicArrayImplementation.size());
    }

    @Test
    void ensureToReduce() {
        DynamicArrayImplementation dynamicArrayImplementation = new DynamicArrayImplementation(200);
        for (int i = 0; i < 10; i++) {
            dynamicArrayImplementation.add("Test");
        }
        for (int i = 0; i < 5; i++) {
            dynamicArrayImplementation.remove(0);
        }
        assertEquals(5, dynamicArrayImplementation.size());

    }

    @Test
    void moveToEnd() {
        DynamicArrayImplementation dynamicArrayImplementation = new DynamicArrayImplementation();
        dynamicArrayImplementation.add("Test");
        dynamicArrayImplementation.add("Rest");
        dynamicArrayImplementation.add("Aest");
        dynamicArrayImplementation.add("Best");
        dynamicArrayImplementation.add("Sest");
        try {
            dynamicArrayImplementation.moveToEnd(1);
        }
        catch (Exception e) {
            System.out.println("Critical error. Not possible to set the value");
        }
        assertEquals("Rest", dynamicArrayImplementation.get(4));
    }



}
