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
        dynamicArray.setObject("Test");
        dynamicArray.setObject("Rest");
        assertEquals("Rest",dynamicArray.removeFromArray(1));
        assertEquals(1,dynamicArray.countNotNullValues());
    }


    @Test
    void enlargeArraySize() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.setObject("Test");
        dynamicArray.setObject("Rest");
        dynamicArray.setObject("Aest");
        dynamicArray.setObject("Best");
        dynamicArray.setObject("Sest");
        assertEquals(5,dynamicArray.countNotNullValues());
        assertEquals(9,dynamicArray.getObjects().length);
    }

    @Test
    void ensureToReduce() {
        DynamicArray dynamicArray = new DynamicArray(200);
        for (int i = 0; i < 10; i++) {
            dynamicArray.setObject("Test");
        }
        for (int i = 0; i < 5; i++) {
            dynamicArray.removeFromArray(0);
        }
        assertEquals(5,dynamicArray.countNotNullValues());
        assertEquals(12,dynamicArray.getObjects().length);

    }

    @Test
    void moveToEnd() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.setObject("Best");
        dynamicArray.setObject("Rest");
        dynamicArray.setObject("Test");
        dynamicArray.moveToEnd(1);
        assertEquals("Rest",dynamicArray.getObject(2));
    }

    @Test
    void countNotNullValues() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.setObject("Test");
        dynamicArray.setObject("Rest");
        assertEquals(2,dynamicArray.countNotNullValues());
    }



}
