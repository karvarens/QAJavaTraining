package homework.lesson5.davidgevorgyan.braceChecker;

import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;





public class BraceCheckerTest {

    @Test
    public void parse1() {
        BraceChecker.ParseResult prototype = new BraceChecker.ParseResult(BraceChecker.ParseResultType.NO_ERROR);
        BraceChecker test = new BraceChecker("[A (;:valid text{ with } different types) [of] brackets]");
        assertEquals(prototype, test.parse());
    }

    @Test
    public void parse2() {
        BraceChecker.ParseResult prototype = new BraceChecker.ParseResult(BraceChecker.ParseResultType.NO_ERROR);
        BraceChecker test = new BraceChecker("()[][[]]");
        assertEquals(prototype, test.parse());
    }

    @Test
    public void parse3() {
        BraceChecker.ParseResult prototype = new BraceChecker.ParseResult(BraceChecker.ParseResultType.NO_ERROR);
        BraceChecker test = new BraceChecker("A text without brackets DEF");
        assertEquals(prototype, test.parse());
    }

    @Test
    public void parse4() {
        BraceChecker.ParseResult prototype = new BraceChecker.ParseResult(BraceChecker.ParseResultType.OPENED_NOT_CLOSED, new BraceChecker.BracketItem(3,'(',0,3));
        BraceChecker test = new BraceChecker("A[{( text with only opening brackets");
        assertEquals(prototype, test.parse());
    }

    @Test
    public void parse5() {
        BraceChecker.ParseResult prototype = new BraceChecker.ParseResult(BraceChecker.ParseResultType.CLOSED_NOT_OPENED, new BraceChecker.BracketItem(2,'}',0,2));
        BraceChecker test = new BraceChecker("A } text with only closing brackets})]");
        assertEquals(prototype, test.parse());
    }
    @Test
    public void parse6() {
        BraceChecker.ParseResult prototype = new BraceChecker.ParseResult(BraceChecker.ParseResultType.OPENED_BUT_CLOSED_WRONG_BRACKET, new BraceChecker.BracketItem(1,'(',0,1), new BraceChecker.BracketItem(2,'}',0,2));
        BraceChecker test = new BraceChecker("((}");
        assertEquals(prototype, test.parse());
    }

    @Test
    public void parse7() {
        BraceChecker.ParseResult prototype = new BraceChecker.ParseResult(BraceChecker.ParseResultType.OPENED_BUT_CLOSED_WRONG_BRACKET, new BraceChecker.BracketItem(2,'{',0,2), new BraceChecker.BracketItem(45,']',0,45));
        BraceChecker test = new BraceChecker("[ { A text with invalid sequence of brackets ] }");
        assertEquals(prototype, test.parse());
    }
}

