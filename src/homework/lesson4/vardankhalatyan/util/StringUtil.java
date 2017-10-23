package homework.lesson4.vardankhalatyan.util;

import javax.swing.*;

import static java.lang.Character.isAlphabetic;

public class StringUtil {


    public static void main(String[] args) {
        String a = "    Hello, World, How, are, you     ";
        String b = "-987654";
        System.out.println("!" + parseInt(b) + "!");
//        System.out.println(a.length());
//        System.out.println(subString(a, 22, 27) + "bla");
//        String[] b = split(a, ',');
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
//        System.out.println("!" + trim(a) + "!");
    }


    /**
     * Parses the specified inputText and divides it into tokens by the specified delimiter.
     *
     * @param inputText  the string to be splitted by the specified delimiter
     * @param delimiter  the delimiter by which the specified inputText  will splitted.
     * @return the array of strings computed by splitting this string
     *          around matches of the given regular expression.
     */
    public static String[] split(String inputText, char delimiter) {
        int s = 0;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter) {
                s++;
            }
        }
        String[] res = new String[s + 1];
//        for (int i = 0; i < s; i++) {
//            res[i] = "";
//        }
        int indexA = 0;
        for (int i = 0; i <= s; i++) {
            int a = inputText.indexOf(delimiter, indexA + 2);
            if (a < 0) {
                a = inputText.length();
            }
            res[i] = trim(subString(inputText, indexA, a));
            indexA = a + 1;
        }
        return res;

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
        for (int i = 0; i < inputText.length(); i++) {
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
        String res = str;
        while (res.charAt(0) == ' ') {
            res = subString(res, 1, res.length());
        }
        while (res.charAt(res.length() - 1) == ' ') {
            res = subString(res, 0, res.length() - 1);
        }

        return res;
    }

    /**
     * Parses the string argument as a signed decimal integer. The
     * characters in the string must all be decimal digits, except
     * that the first character may be an ASCII minus sign.
     *
     * @param s a String containing the int representation to be parsed
     * @return     the integer value represented by the argument in decimal.
     * @exception NumberFormatException  if the string does not contain a
     */
    public static int parseInt(String s) {
        int res = 0;
        int sign = s.charAt(0) == '-' ? -1 : 1;

        int i = (sign == -1) ? 1 : 0;
        for (; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                System.out.println("Something went wrong");
                JOptionPane.showMessageDialog(null, "Number format violation in input string." , "Error", JOptionPane.INFORMATION_MESSAGE );
                return Integer.MIN_VALUE;
//                TODO: replace return statement by 'throw' later.
            }
            res = (res * 10) + (ch - '0') ;

        }
        return res * sign;
    }

    public static String toLowerCase(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                changeCase(ch);
            }
        }
        return text;
    }

    public static String toUpperCase(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                changeCase(ch);
            }
        }
        return text;
    }

    private static char changeCase(char ch) {
        return isAlphabetic(ch) ? (char) (ch ^ 32) : ch;
    }

    private static String changeCase(String text, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            changeCase(text.charAt(i));
        }
        return null;
    }
}
