package homework.lesson4.armenmarutyan;

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

        char[] text=inputText.toCharArray();
        int lengthOfText = inputText.length();
        char[] subText = new char[lengthOfText];

        int j = 0;
        for (int i = startIndex; i <endIndex ; i++) {
            subText[j] = inputText.charAt(i);
            j++;
        }

        return new String(subText);
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
        int startIndex = 0;
        int endIndex = str.length() - 1;
        while (str.charAt(startIndex) <= ' ' ) {
            if(++startIndex >= str.length()){
                return "";
            }
        }

        while (str.charAt(endIndex) <= ' ' ) {
            --endIndex;
        }

        char[] resultChars = new char[endIndex + 1 - startIndex];

        for(int i = 0; i < resultChars.length; ++i){
            resultChars[i] = str.charAt(startIndex + i);

        }

        return new String(resultChars);
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

    public static String toLowerCase(String text){
        char line[] =  text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if ( line[i] >= 65 && line[i] <= 90 ) {
                line[i]+=32;
            }

        }
        return new String(line);
    }

    public static String toUpperCase(String text){
        char line[] =  text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if ( line[i] >= 97 && line[i] <= 122 ) {
                line[i]-=32;
            }

        }
        return new String(line);

    }

    private static char changeCase(char ch) {
        return 0;
    }

    private static String changeCase(String text, int startIndex, int endIndex) {
        // TODO implement
        return null;
    }

    public static void main(String[] args) {
        System.out.println(trim("  s t   b   "));


        System.out.println(toLowerCase("ffHHHDSSSAAA"));
        System.out.println(toUpperCase("ffHHHDSSSAAA"));
        System.out.println(subString("This is a normal fix", 4, 9));
    }
}
