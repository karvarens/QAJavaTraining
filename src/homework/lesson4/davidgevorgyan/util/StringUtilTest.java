package homework.lesson4.davidgevorgyan.util;

import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;





public class StringUtilTest {

    @Test
    public void split() {
        String text = "Hello.Java.World";
        String result[] = StringUtil.split(text, '.');
        assertEquals("Hello", result[0]);
        assertEquals("Java", result[1]);
        assertEquals("World", result[2]);
    }

    @Test
    public void subString(){
        String text="Hello Java";
        String result=StringUtil.subString(text, 6, 10);
        assertEquals("Java", result);
    }

    @Test
    public void exceptionSubString(){
        String text="Hello Java";
        StringUtil result= new StringUtil();
        assertThrows(IndexOutOfBoundsException.class, ()->{result.subString(text,3,2);});
        assertThrows(IndexOutOfBoundsException.class, ()->{result.subString(text,22,2);});
        assertThrows(IndexOutOfBoundsException.class, ()->{result.subString(text,2,22);});
        assertThrows(IndexOutOfBoundsException.class, ()->{result.subString(text,-2,2);});
    }

    @Test
    public void trim() {
        String text="    Hello Java    ";
        String result=StringUtil.trim(text);
        assertEquals("Hello Java", result);
    }

    @Test
    public void parseInt() {
        assertEquals(232, StringUtil.parseInt("232"));
        assertEquals(-232, StringUtil.parseInt("-232"));
    }

    @Test
    public void exceptionParseInt(){
        StringUtil result= new StringUtil();
        assertThrows(NumberFormatException.class, ()->{result.parseInt("Java");});
        assertThrows(NumberFormatException.class, ()->{result.parseInt("23j2");});
        assertThrows(NumberFormatException.class, ()->{result.parseInt("-J232");});
        assertThrows(NumberFormatException.class, ()->{result.parseInt("-232j");});
    }

    @Test
    public void toLowerCase(){
        assertEquals("hello world", StringUtil.toLowerCase("HEllO WoRld"));
    }

    @Test
    public void toUpperCase(){
        assertEquals("HELLO WORLD", StringUtil.toUpperCase("HEllO WoRld"));
    }

    @Test
    public void changeCaseInString(){
        assertEquals("DavID gEVorgyan", StringUtil.changeCaseInString("David Gevorgyan",3,9));
    }

}
