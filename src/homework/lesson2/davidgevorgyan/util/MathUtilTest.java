package homework.lesson2.davidgevorgyan.util;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilTest {
    @Test
    void pow() {
        int result = MathUtil.pow(4, 3);
        assertEquals(64, result);
    }

    @Test
    void gcd() {
        int result = MathUtil.gcd(125, 25);
        assertEquals(25, result);
    }

    @Test
    void factorial() {
        int result = MathUtil.factorial(5);
        assertEquals(120, result);
    }

    @Test
    void abs() {
        int result = MathUtil.abs(-10);
        assertEquals(10, result);
        result = MathUtil.abs(15);
        assertEquals(15, result);
    }

    @Test
    void minAbs() {
        int result = MathUtil.minAbs(12,24);
        assertEquals(12, result);
        result = MathUtil.minAbs(-100,20);
        assertEquals(20, result);
        result = MathUtil.minAbs(14,-16);
        assertEquals(14, result);
        result = MathUtil.minAbs(-120,-119);
        assertEquals(119, result);
    }

    @Test
    void printIntAsBinary() {
        String result = MathUtil.printIntAsBinary(244);
        assertEquals("11110100", result);
    }

    @Test
    void reverse() {
        int result = MathUtil.reverse(256);
        assertEquals(652, result);
    }

}