package homework.lesson5.davidgevorgyan.braceChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SuppressWarnings("WeakerAccess")
public class StackImplTest {
    @Test
    void pushAndPop() {
        Stack stackTest = new Stack(3);
        BraceChecker.BracketItem bracketItemTest1 = new BraceChecker.BracketItem(2, '(');
        stackTest.push(bracketItemTest1);
        BraceChecker.BracketItem bracketItemTest2 = new BraceChecker.BracketItem(1, '[');
        stackTest.push(bracketItemTest2);
        assertEquals(bracketItemTest2.getSymbol(), stackTest.peek().getSymbol());
        assertEquals(1, stackTest.peek().getIndex());
    }


    @Test
    void removeTopOfStack() {
        Stack stackTest = new Stack(3);
        BraceChecker.BracketItem bracketItemTest1 = new BraceChecker.BracketItem(2, '(');
        stackTest.push(bracketItemTest1);
        BraceChecker.BracketItem bracketItemTest2 = new BraceChecker.BracketItem(1, '[');
        stackTest.push(bracketItemTest2);
        stackTest.pop();
        assertEquals(bracketItemTest1.getSymbol(),stackTest.peek().getSymbol());
        assertEquals(2,stackTest.peek().getIndex());
    }

    @Test
    void isEmpty() {
        Stack stackTest = new Stack(3);
        assertEquals(true,stackTest.isEmpty());
    }

}