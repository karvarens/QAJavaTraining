package homework.lesson5.davidgevorgyan.braceChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StackTest {
    @Test
    void pushAndPop() {
        Stack stackTest = new Stack(3);
        Braces bracesTest1 = new Braces(2, '(');
        stackTest.push(bracesTest1);
        Braces bracesTest2 = new Braces(1, '[');
        stackTest.push(bracesTest2);
        assertEquals(bracesTest2.symbol,stackTest.pop().symbol);
        assertEquals(1,stackTest.pop().index);
    }


    @Test
    void removeTopOfStack() {
        Stack stackTest = new Stack(3);
        Braces bracesTest1 = new Braces(2, '(');
        stackTest.push(bracesTest1);
        Braces bracesTest2 = new Braces(1, '[');
        stackTest.push(bracesTest2);
        stackTest.removeTopOfStack();
        assertEquals(bracesTest1.symbol,stackTest.pop().symbol);
        assertEquals(2,stackTest.pop().index);
    }

    @Test
    void isEmpty() {
        Stack stackTest = new Stack(3);
        assertEquals(true,stackTest.isEmpty());
    }

}