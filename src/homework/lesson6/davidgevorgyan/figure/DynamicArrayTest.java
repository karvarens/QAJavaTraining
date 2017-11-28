package homework.lesson6.davidgevorgyan.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicArrayTest {

    @Test
    void countNotNullValues() {
        String [] prototype1 ={"ABC","BCD", null, null};
        assertEquals(2,DynamicArray.countNotNullValues(prototype1));
    }

    @Test
    void enlargeArraySize() {
        String [] prototype ={"BCD","CDE","ABC","AAA"};
        prototype = (String[])DynamicArray.enlargeArraySize(prototype.length, prototype);
        assertEquals(6,prototype.length);

    }

    @Test
    void moveToEnd() {
        String [] prototype1 ={"ABC","BCD","CDE","DEF"};
        String [] prototype2 ={"BCD","CDE","DEF","ABC"};

        prototype1 = (String [])DynamicArray.moveToEnd(prototype1, 0);
        assertEquals(prototype1[3],prototype2[3]);
    }

    @Test
    void removeFromArray() {
        String [] prototype1 ={"ABC","BCD","CDE","DEF"};
        String [] prototype2 ={"BCD"};

        assertEquals(prototype2[0],DynamicArray.removeFromArray(prototype1, 1));
    }

    @Test
    void appendToArray() {
        String [] prototype1 ={"ABC","BCD","CDE","DEF"};
        String [] prototype2 ={"ABC","BCD","CDE"};
        prototype2 = (String [])DynamicArray.appendToArray(prototype2, "DEF");
        assertEquals(prototype1[3],prototype2[3]);
    }

}
