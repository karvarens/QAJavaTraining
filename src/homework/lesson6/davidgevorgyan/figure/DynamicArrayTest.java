package homework.lesson6.davidgevorgyan.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicArrayTest {

    @Test
    void getObject() {
    }

    @Test
    void setObjects() {
    }


    @Test
    void removeFromArray() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.setObject("Test", 0);
        dynamicArray.setObject("Rest", 0);
        assertEquals("Rest",dynamicArray.remove(1));
        assertEquals(1,dynamicArray.countNotNullValues());
    }


    @Test
    void enlargeArraySize() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.setObject("Test", 0);
        dynamicArray.setObject("Rest", 0);
        dynamicArray.setObject("Aest", 0);
        dynamicArray.setObject("Best", 0);
        dynamicArray.setObject("Sest", 0);
        assertEquals(5,dynamicArray.countNotNullValues());
        assertEquals(9,dynamicArray.getObjects().length);
    }

    @Test
    void ensureToReduce() {
        DynamicArray dynamicArray = new DynamicArray(200);
        for (int i = 0; i < 10; i++) {
            dynamicArray.setObject("Test", 0);
        }
        for (int i = 0; i < 5; i++) {
            dynamicArray.remove(0);
        }
        assertEquals(5,dynamicArray.countNotNullValues());
        assertEquals(12,dynamicArray.getObjects().length);

    }

    @Test
    void moveToEnd() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.setObject("Best", 0);
        dynamicArray.setObject("Rest", 0);
        dynamicArray.setObject("Test", 0);
        dynamicArray.moveToEnd(1);
        assertEquals("Rest",dynamicArray.get(2));
    }

    @Test
    void countNotNullValues() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.setObject("Test", 0);
        dynamicArray.setObject("Rest", 0);
        assertEquals(2,dynamicArray.countNotNullValues());
    }



}
