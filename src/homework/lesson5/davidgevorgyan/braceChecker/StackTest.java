package homework.lesson5.davidgevorgyan.braceChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StackTest {
    @Test
    void pushAndPop() {
        Stack stackTest = new Stack(3);
        BraceChecker.BracketItem bracketItemTest1 = new BraceChecker.BracketItem(2, '(');
        stackTest.push(bracketItemTest1);
        BraceChecker.BracketItem bracketItemTest2 = new BraceChecker.BracketItem(1, '[');
        stackTest.push(bracketItemTest2);
        assertEquals(bracketItemTest2.getSymbol(), stackTest.pop().getSymbol());
        assertEquals(1, stackTest.pop().getIndex());
    }


    @Test
    void removeTopOfStack() {
        Stack stackTest = new Stack(3);
        BraceChecker.BracketItem bracketItemTest1 = new BraceChecker.BracketItem(2, '(');
        stackTest.push(bracketItemTest1);
        BraceChecker.BracketItem bracketItemTest2 = new BraceChecker.BracketItem(1, '[');
        stackTest.push(bracketItemTest2);
        stackTest.removeTopOfStack();
        assertEquals(bracketItemTest1.getSymbol(),stackTest.pop().getSymbol());
        assertEquals(2,stackTest.pop().getIndex());
    }

    @Test
    void isEmpty() {
        Stack stackTest = new Stack(3);
        assertEquals(true,stackTest.isEmpty());
    }

}