package homework.lesson5.davidgevorgyan.braceChecker;

import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;





public class BraceCheckerTest {

    @Test
    public void parse() {
        BraceChecker testOne=new BraceChecker("[A (;:valid text{ with } different types) [of] brackets]");
        assertEquals(true,testOne.parse());
        BraceChecker testTwo=new BraceChecker("A[{( text with only opening brackets");
        assertEquals(false,testTwo.parse());
        BraceChecker testThree=new BraceChecker("A } text with only closing brackets})]");
        assertEquals(false,testThree.parse());
        BraceChecker testFour=new BraceChecker("[ { A text with invalid sequence of brackets ] }");
        assertEquals(false,testFour.parse());
        BraceChecker testFive=new BraceChecker("");
        assertEquals(true,testFive.parse());
        BraceChecker testSix=new BraceChecker("A text without brackets DEF");
        assertEquals(true,testSix.parse());
    }
}

