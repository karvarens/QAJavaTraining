package homework.lesson6.davidgevorgyan.figure.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicArrayImplementationTest {
    @Test
    void size() {
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(5,"Test");
        assertEquals(5, dynamicArrayImplementation.size());
    }

    @Test
    void isEmpty() {
        DynamicArrayImplementation dynamicArrayImplementation = new DynamicArrayImplementation();
        assertTrue(dynamicArrayImplementation.isEmpty());
        dynamicArrayImplementation.add(null);
        assertFalse(dynamicArrayImplementation.isEmpty());
    }

    @Test
    void contains() {
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(7,"Test");
        dynamicArrayImplementation.add("Best");
        assertTrue(dynamicArrayImplementation.contains("Test6"));
        assertFalse(dynamicArrayImplementation.contains("Test8"));
    }

    @Test
    void indexOf() {
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(7,"Test");
        dynamicArrayImplementation.add(2, null);
        dynamicArrayImplementation.add(5, null);
        assertEquals(2, dynamicArrayImplementation.indexOf(null));
        assertEquals(0, dynamicArrayImplementation.indexOf("Test0"));
        assertEquals(8, dynamicArrayImplementation.indexOf("Test6"));
        assertEquals(-1, dynamicArrayImplementation.indexOf("West"));
        dynamicArrayImplementation.add(0, "AAA");
    }

    @Test
    void lastIndexOf() {
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(7,"Test");
        dynamicArrayImplementation.add(2, null);
        dynamicArrayImplementation.add(5, null);
        assertEquals(5, dynamicArrayImplementation.lastIndexOf(null));
        assertEquals(0, dynamicArrayImplementation.lastIndexOf("Test0"));
        assertEquals(7, dynamicArrayImplementation.lastIndexOf("Test5"));
        assertEquals(-1, dynamicArrayImplementation.lastIndexOf("West"));
        dynamicArrayImplementation.add(null);
        assertEquals(9, dynamicArrayImplementation.lastIndexOf(null));
    }

    @Test
    void get() {
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(7,"Test");
        assertEquals("Test5", dynamicArrayImplementation.get(5));
        assertThrows(IndexOutOfBoundsException.class, ()-> dynamicArrayImplementation.get(7));
    }

    @Test
    void set() {
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(5,"Test");
        dynamicArrayImplementation.set(3, "WWWest");
        assertEquals("WWWest", dynamicArrayImplementation.get(3));
        assertThrows(IndexOutOfBoundsException.class, ()-> dynamicArrayImplementation.set(5, "AAA"));
    }

    @Test
    void add() {
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(5,"Test");
        dynamicArrayImplementation.add(1,"AAAest");
        assertEquals("AAAest", dynamicArrayImplementation.get(1));
        dynamicArrayImplementation.add(6,"BBBest");
        assertEquals("BBBest", dynamicArrayImplementation.get(6));
        assertThrows(IndexOutOfBoundsException.class, ()-> dynamicArrayImplementation.get(7));
    }

    @Test
    void remove_byIndex() {
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(2,"Test");
        assertEquals("Test1", dynamicArrayImplementation.remove(1));
        assertEquals(1, dynamicArrayImplementation.size());
        assertThrows(IndexOutOfBoundsException.class, ()-> dynamicArrayImplementation.get(2));
    }


    @Test
    void remove_byObject() {
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(5,"Test");
        dynamicArrayImplementation.add(null);
        assertEquals( 6, dynamicArrayImplementation.size());
        dynamicArrayImplementation.remove(null);
        assertEquals( 5, dynamicArrayImplementation.size());
        assertTrue( dynamicArrayImplementation.remove("Test1"));
        assertEquals("Test2", dynamicArrayImplementation.get(1));
        assertFalse(dynamicArrayImplementation.remove("Test8"));

    }

    @Test
    void enlargeArraySize() {
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(5,"Test");
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
        DynamicArrayImplementation dynamicArrayImplementation = createDynamicArray(5,"Test");

        try {
            dynamicArrayImplementation.moveToEnd(1);
        }
        catch (Exception e) {
            System.out.println("Critical error. Not possible to set the value");
        }
        assertEquals("Test1", dynamicArrayImplementation.get(4));
    }

    private DynamicArrayImplementation<String> createDynamicArray (int size, String value) {
        DynamicArrayImplementation<String> dynamicArray = new DynamicArrayImplementation<>();
        for (int i = 0; i < size; i++) {
            dynamicArray.add (value + i);
        }
        return dynamicArray;
    }



}
