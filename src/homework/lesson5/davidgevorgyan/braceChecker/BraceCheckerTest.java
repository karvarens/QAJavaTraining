package homework.lesson5.davidgevorgyan.braceChecker;

import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;





public class BraceCheckerTest {

    @Test
    public void parse() {
        BraceChecker.ParseResults prototype = new BraceChecker.ParseResults(false);

        BraceChecker testOne=new BraceChecker("[A (;:valid text{ with } different types) [of] brackets]");
        prototype.setResult(true,0);
        assertEquals(prototype,testOne.parse());

        prototype.setResult(false,3);
        BraceChecker testTwo=new BraceChecker("A[{( text with only opening brackets");
        assertEquals(prototype,testTwo.parse());

        prototype.setResult(false,2);
        BraceChecker testThree=new BraceChecker("A } text with only closing brackets})]");
        assertEquals(prototype,testThree.parse());

        prototype.setResult(false,45);
        BraceChecker testFour=new BraceChecker("[ { A text with invalid sequence of brackets ] }");
        assertEquals(prototype,testFour.parse());

        BraceChecker testFive=new BraceChecker("()[][[]]");
        prototype.setResult(true,0);
        assertEquals(prototype,testFive.parse());

        BraceChecker testSix=new BraceChecker("A text without brackets DEF");
        prototype.setResult(true,0);
        assertEquals(prototype,testSix.parse());

    }
}

