package homework.lesson4.avetikbabayan.util;
import javax.swing.*;
import static java.lang.Character.isAlphabetic;
public class StringUtil {

    /**
     * Parses the specified inputText and divides it into tokens by the specified delimiter.
     *
     * @param inputText  the string to be splitted by the specified delimiter
     * @param delimiter  the delimiter by which the specified inputText  will splitted.
     * @return the array of strings computed by splitting this string
     *          around matches of the given regular expression.
     */
    public static String[] split(String inputText, char delimiter) {
    int first = 0;
    int last = 0;
    int count = 0;
    int tmp = 1;
        for (int i = 1; i < inputText.length(); i++) {
        if(inputText.charAt(i) == delimiter) {
            tmp++;
        }
    }
    String newString [] = new String[tmp];
        for (int i = 1; i < inputText.length(); i++) {
        if(inputText.charAt(i) == delimiter){
            last = i;
            newString[count] = subString(inputText, first, last);
            count++;
            first = last + 1;
        }
    }
    newString[last] = subString(inputText, first, inputText.length() - 1);
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
     * @param      inputText    the string substring of which must be returned
     * @param      startIndex   the beginning index, inclusive.
     * @param      endIndex     the ending index, exclusive.
     * @return     the specified substring.
     * @exception IndexOutOfBoundsException  if the
     *             beginIndex is negative, or
     *             endIndex is larger than the length of
     *             this String object, or
     *             beginIndex is larger than
     *             endIndex.
     */

    static public String subString(String inputText, int startIndex, int endIndex) {
    char[] chAr = new char[inputText.length()];
        for (int i = 0; i <= inputText.length()-1; i++) {
        chAr[i] = inputText.charAt(i);
    }
    int size = endIndex - startIndex;
    char[] res = new char[size];
    int j = startIndex;
        for (int i = 0; i < size; i++) {
        res[i] = chAr[j];
        j++;
    }
        return new String(res);
    }

    /**
     * Returns a copy of the specified str, with leading and trailing whitespace
     * omitted.
     * @param str the String will be trimmed.
     * @return  A copy of the string with leading and trailing white
     *          space removed, or this string if it has no leading or
     *          trailing white space.
     */

    public static String trim(String str) {
        String result = str;
        while (result.charAt(0) == ' ') {
            result = subString(result, 1, result.length());
        }
        while (result.charAt(result.length() - 1) == ' ') {
            result = subString(result, 0, result.length() - 1);
        }
        return result;
    }

    /**
     * Parses the string argument as a signed decimal integer. The
     * characters in the string must all be decimal digits, except
     * that the first character may be an ASCII minus sign.
     *
     * @param s a String containing the int representation to be parsed
     * @return     the integer value represented by the argument in decimal.
     * @exception NumberFormatException  if the string does not contain a
     *               parsable integer.
     */

    public static int parseInt(String s) {
        int result = 0;
        int sign = s.charAt(0) == '-' ? -1 : 1;
        int i = sign == -1 ? 1 : 0;
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            int digit = 0;
            if (ch <= '0' || ch >= '9') {
                System.out.println("Bo");
                JOptionPane.showMessageDialog(null, "Test");
                return Integer.MIN_VALUE;
            }
            result = result * 10 + (ch - '0');
        }
        return result * sign;
    }
    public static String toLowerCase(String text){
        for (int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                changeCase(ch);
            }
        }
        return text;
        }
    public static String toUpperCase(String text){
        for (int i = 0; i < text.length(); i++){
        char ch = text.charAt(i);
        if(ch >= 'a' && ch <= 'z'){
            changeCase(ch);
        }
    }
        return text;
}
    private static char changeCase(char ch) {
    return isAlphabetic(ch) ? (char) (ch ^ 32) : ch
     }
    private static String changeCase(String text, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++){
            changeCase(text.charAt(i));
        }
        return null;
    }
}