package homework.lesson5.davidgevorgyan.braceChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracesTest {
    @Test
    void setNegativeValue(){
        assertThrows(IllegalArgumentException.class, ()->{new Braces(-2, '(');});
    }
    @Test
    void setInvalidSymbol(){
        assertThrows(IllegalArgumentException.class, ()->{new Braces(2, ' ');});
    }
}
