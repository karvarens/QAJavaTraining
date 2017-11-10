package homework.lesson4.lilitsharkhatunyan;

public class StringUtil {

    public static void main(String[] args) {
        toLowerCase("abc");
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
        //TODO implement
        return null;
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
        //TODO implement
        return null;
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
        //TODO: implement
        return null;
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

        return 0; // TODO implement the method
    }

    public static String toLowerCase(String text) {
        //TODO : Later we should add validation for text == null case and then check if text length == 0 then return text;
        char[] resultChars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(isLowerCase(ch)){
                resultChars[i] = (char)(ch ^ 32);
            }
        }
        return new String(resultChars);
    }

    private static boolean isLowerCase(char ch){
       // return ch >= 97 && ch <= 122;
        return (ch >= 'a' && ch <= 'z');
    }

    private static boolean isUpperCase(char ch){
        return (ch >= 'A' && ch <= 'Z');
    }


    public static String toUpperCase(String text){
        // TODO implement
        return null;
    }

    private static char changeCase(char ch) {
        return 0;
    }

    private static String changeCase(String text, int startIndex, int endIndex) {
        // TODO implement
        return null;
    }
}
