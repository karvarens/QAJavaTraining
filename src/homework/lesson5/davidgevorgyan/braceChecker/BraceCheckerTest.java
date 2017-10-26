package homework.lesson5.davidgevorgyan.braceChecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static homework.lesson5.davidgevorgyan.braceChecker.BraceChecker.*;

public class BraceCheckerTest {
    BraceChecker test = new BraceChecker();

    @Test
    public void parse1() {
        ParseResult prototype = new ParseResult(ParseResultType.NO_ERROR);

        assertEquals(prototype, test.parse("[A (;:valid text{ with } different types) [of] brackets]"));
    }

    @Test
    public void parse2() {
        ParseResult prototype = new ParseResult(ParseResultType.NO_ERROR);

        assertEquals(prototype, test.parse("()[][[]]"));
    }

    @Test
    public void parse3() {
        ParseResult prototype = new ParseResult(ParseResultType.NO_ERROR);

        assertEquals(prototype, test.parse("A text without brackets DEF"));
    }

    @Test
    public void parse4() {
        ParseResult prototype = new ParseResult(ParseResultType.OPENED_NOT_CLOSED, new BracketItem(3,'(',0,3));

        assertEquals(prototype, test.parse("A[{( text with only opening brackets"));
    }

    @Test
    public void parse5() {
        ParseResult prototype = new ParseResult(ParseResultType.CLOSED_NOT_OPENED, new BracketItem(2,'}',0,2));
        BraceChecker test = new BraceChecker();
        assertEquals(prototype, test.parse("A } text with only closing brackets})]"));
    }
    @Test
    public void parse6() {
        ParseResult prototype = new ParseResult(ParseResultType.OPENED_BUT_CLOSED_WRONG_BRACKET, new BracketItem(1,'(',0,1), new BracketItem(2,'}',0,2));
        BraceChecker test = new BraceChecker();
        assertEquals(prototype, test.parse("((}"));
    }

    @Test
    public void parse7() {
        ParseResult prototype = new ParseResult(ParseResultType.OPENED_BUT_CLOSED_WRONG_BRACKET, new BracketItem(2,'{',0,2), new BracketItem(45,']',0,45));

        assertEquals(prototype, test.parse("[ { A text with invalid sequence of brackets ] }"));
    }
}

