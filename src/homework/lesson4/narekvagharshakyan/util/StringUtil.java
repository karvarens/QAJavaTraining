package homework.lesson4.narekvagharshakyan.util;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringUtil {
    public static void main(String[] args) {

        System.out.println("================");
        System.out.println("Split: ");
        printArray(split("first second  conversation", ' '));

        System.out.println("================");
        System.out.println("subString: ");
        System.out.println(subString("conversation", 3, 10));

        System.out.println("================");
        System.out.println("parseInt: ");
        System.out.println(parseInt("-00545"));

        System.out.println("================");
        System.out.println("Trim: ");
        System.out.println(trim("       7 PP k    "));
        System.out.println("parseInt: ");

        System.out.println("================");
        System.out.println("toLowerCase: ");
        System.out.println(toLowerCase("AaaaABZ45DFz"));

        System.out.println("================");
        System.out.println("toUpperCase: ");
        System.out.println(toUpperCase("AaaaABZ45DFz"));

        System.out.println("================");
        System.out.println("changeCase: ");
        System.out.println(changeCase('f'));

        System.out.println("================");
        System.out.println("changeCase with index: ");
        System.out.println(changeCase("a2adDc7D4bjHHDd", 1, 4));
    }

    /**
     * Parses the specified inputText and divides it into tokens by the specified delimiter.
     *
     * @param inputText the string to be splitted by the specified delimiter
     * @param delimiter the delimiter by which the specified inputText  will splitted.
     * @return the array of strings computed by splitting this string
     * around matches of the given regular expression.
     */
    public static String[] split(String inputText, char delimiter) {
        int start = 0;
        int end = 0;
        int textCount = 0;
        int wordCount = 1;

        //================Create array with dynamic size=========
        lab: for (int i = 0; i < inputText.length() - 1; i++) {
            while (inputText.charAt(i++) == delimiter) {
                if(i == inputText.length()) {
                    break lab;
                }

            }
            if(inputText.charAt(i -1) == delimiter) {
                wordCount++;
            }
        }
        String newString[] = new String[wordCount];
        //========================================================

        for (int i = 0; i < inputText.length() - 1; i++) {
            if (inputText.charAt(i) == delimiter) {
                end = i;
                newString[textCount] = subString(inputText, start, end);
                textCount++;
                start = end + 1;
            }
        }

        newString[textCount] = subString(inputText, start, inputText.length() - 1);

        return newString;
    }

    /**
     * Returns a new string that is a substring of the specified inputText. The
     * substring begins at the specified <code>beginIndex and
     * extends to the character at index <code>endIndex - 1.
     * Thus the length of the substring is <code>endIndex-beginIndex.
     * Examples:
     * "hamburge r".substring(4, 8) returns "urge"
     * "smiles".substring(1, 5) returns "mile"
     *
     * @param inputText  the string substring of which must be returned
     * @param startIndex the beginning index, inclusive.
     * @param endIndex   the ending index, exclusive.
     * @return the specified substring.
     * @throws IndexOutOfBoundsException if the
     *                                   beginIndex is negative, or
     *                                   endIndex is larger than the length of
     *                                   this String object, or
     *                                   beginIndex is larger than
     *                                   endIndex.
     */
    static public String subString(String inputText, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > inputText.length() - 1 || startIndex > endIndex) {
            throw new IndexOutOfBoundsException("Error: The value of startIndex/endIndex is not correct");
        }
        char[] temp = inputText.toCharArray();
        char[] Array1 = new char[endIndex - startIndex + 1];
        System.arraycopy(temp, startIndex, Array1, 0, endIndex - startIndex + 1);
        String str = String.valueOf(Array1);
        return str;
    }

    /**
     * Returns a copy of the specified str, with leading and trailing whitespace
     * omitted.
     *
     * @param str the String will be trimmed.
     * @return A copy of the string with leading and trailing white
     * space removed, or this string if it has no leading or
     * trailing white space.
     */
    public static String trim(String str) {
        int startIndex = 0;
        int endIndex = str.length() - 1;
        while (str.charAt(startIndex) == ' ') {
            startIndex++;
            if (startIndex == str.length() - 1) {
                throw new IndexOutOfBoundsException("String contains only whitespaces");
            }
        }
        while (str.charAt(endIndex) == ' ') {
            endIndex--;
        }

        str = subString(str, startIndex, endIndex);

        return str;
    }

    /**
     * Parses the string argument as a signed decimal integer. The
     * characters in the string must all be decimal digits, except
     * that the first character may be an ASCII minus sign.
     *
     * @param s a String containing the int representation to be parsed
     * @return the integer value represented by the argument in decimal.
     * @throws NumberFormatException if the string does not contain a
     *                               parsable integer.
     */
    public static Integer parseInt(String s) throws NumberFormatException {
        int parsedInt = 0;
        int i;
        int minusSign = 1;

        for (i = 0; i < s.length(); i++) {
            if (s.charAt(0) == '-' && i == 0) {
                minusSign = -1;
                i = 1;
            }
            if (Character.isDigit(s.charAt(i))) {
                parsedInt = parsedInt * 10 + Character.getNumericValue(s.charAt(i));
            } else {
                throw new NumberFormatException("The string contains letters or symbols");
            }

        }
        parsedInt *= minusSign;
        return parsedInt;
    }


    public static String toLowerCase(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)) && Character.isUpperCase(text.charAt(i))) {
                StringBuilder newtext = new StringBuilder(text);
                newtext.setCharAt(i, Character.toLowerCase(text.charAt(i)));
                text = newtext.toString();
            }
        }
        return text;
    }

    public static String toUpperCase(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)) && Character.isLowerCase(text.charAt(i))) {
                StringBuilder newtext = new StringBuilder(text);
                newtext.setCharAt(i, Character.toUpperCase(text.charAt(i)));
                text = newtext.toString();
            }
        }
        return text;
    }

    private static char changeCase(char ch) {
        if (Character.isLetter(ch)) {
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            } else {
                ch = Character.toLowerCase(ch);
            }
        }
        return ch;
    }

    private static String changeCase(String text, int startIndex, int endIndex) {
        StringBuilder newtext = new StringBuilder(text);
        if (endIndex >= startIndex) {
            for (int i = startIndex; i <= endIndex; i++) {
                if (Character.isLetter(text.charAt(i))) {
                    if (Character.isLowerCase(text.charAt(i))) {
                        newtext.setCharAt(i, Character.toUpperCase(text.charAt(i)));
                    } else {
                        newtext.setCharAt(i, Character.toLowerCase(text.charAt(i)));
                    }
                }
            }
            text = newtext.toString();
        } else {
            throw new IndexOutOfBoundsException("startIndex can't be bigger than endIndex");
        }
        return text;
    }


    public static void printArray(String array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }


}