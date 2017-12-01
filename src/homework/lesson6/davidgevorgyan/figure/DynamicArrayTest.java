package homework.lesson6.davidgevorgyan.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicArrayTest {
    @Test
    void removeFromArray() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.add("Test");
        dynamicArray.add("Rest");
        assertEquals("Rest",dynamicArray.remove(1));
        assertEquals(1,dynamicArray.countNotNullValues());
    }


    @Test
    void enlargeArraySize() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.add("Test");
        dynamicArray.add("Rest");
        dynamicArray.add("Aest");
        dynamicArray.add("Best");
        dynamicArray.add("Sest");
        assertEquals(5,dynamicArray.countNotNullValues());
        assertEquals(9,dynamicArray.getLength());
    }

    @Test
    void ensureToReduce() {
        DynamicArray dynamicArray = new DynamicArray(200);
        for (int i = 0; i < 10; i++) {
            dynamicArray.add("Test");
        }
        for (int i = 0; i < 5; i++) {
            dynamicArray.remove(0);
        }
        assertEquals(5,dynamicArray.countNotNullValues());
        assertEquals(12,dynamicArray.getLength());

    }

    @Test
    void moveToEnd() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.add("Best");
        dynamicArray.add("Rest");
        dynamicArray.add("Test");
        dynamicArray.moveToEnd(1);
        assertEquals("Rest",dynamicArray.get(2));
    }

    @Test
    void countNotNullValues() {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.add("Test");
        dynamicArray.add("Rest");
        assertEquals(2,dynamicArray.countNotNullValues());
    }



}
