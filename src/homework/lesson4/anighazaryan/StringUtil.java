package homework.lesson4.anighazaryan;


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

        // todo
        int length = inputText.length();

        char[] text = inputText.toCharArray();
        char[] newText = new char[length];

        int index = 0;
        int count = 0;

        /*for (int i = 0; i < length; i++) {
            if (inputText.charAt(i) == delimiter) {
                //newText[index] = inputText.substring(count,i);
                System.out.println( "new string " + newString[index]);
                count = i + 1;
                index++;
            }
            newString[index] = inputText.substring(count,length);
        }

        return newString; */
        return null;
    }

    /**
    * Returns a new string that is a substring of the specified inputText. The
    * substring begins at the specified <code>beginIndex and
    * extends to the character at index <code>endIndex - 1.
    * Thus the length of the substring is <code>endIndex-beginIndex.
    * Examples:
    * "hamburger".substring(4, 8) returns "urge"
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

        if (inputText == null || startIndex >= endIndex) {
            return null;
        }

        char[] text = inputText.toCharArray();
        int l = inputText.length();
        char[] newText = new char[l];

        int j = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            newText[j] = inputText.charAt(i);
            j++;
        }

        return newText.toString();
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

        int length = str.length();
        char[] text = str.toCharArray();

        int i = 0;
        int j = length - 1;

        while (text[i] == ' ') {
            i++;
        }

        while (text[j] == ' ') {
            j--;
        }

        char[] trimmedText = new char[j-i+1];
        int index = 0;
        for (int k = i; k <= j; k++ ) {
            trimmedText[index] = text[k];
            index++;
        }

        String aaa = new String(trimmedText);

        return aaa;
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
        // TODO implement the method
        char[] charText = s.toCharArray();
        int length = charText.length;

        for (int i = 0; i < length; i++) {
         //   ((parseInt(charText[i]));
        }

        return 0;
    }

    public static String toLowerCase(String text) {
        char[] charText = text.toCharArray();
        int i = 0;
        for (char current: charText) {
            if(isUpperCase(current)) {
                charText[i] = (char)(current ^ 32);
            }
            i++;
        }
        return new String(charText);
    }

    /**
     *
     * @param text
     * @return
     */
    public static String toUpperCase(String text) {
        char[] charText = text.toCharArray();
        int i = 0;
        for (char current: charText) {
            if(isLowerCase(current)) {
                charText[i] = (char)(current ^ 32);
            }
            i++;
        }
        return new String(charText);
    }

    private static char changeCase(char ch) {
        return isAlphabetic(ch) ? (char)(ch ^ 32) : ch;
    }

    private static boolean isUpperCase(char ch) {
        return ch >= 65 && ch <= 90;
    }

    private static boolean isLowerCase(char ch) {
        return ch >= 97 && ch <= 122;
    }

    private static boolean isAlphabetic(char ch) {
        return  ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
    }

    private static String changeCase(String text, int startIndex, int endIndex) {
        //TODO: validation of parameters later:

        int length = endIndex - startIndex;
        char[] resultChars = new char[length];

        String result = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(startIndex + i);
            if(isAlphabetic(ch)) {
                ch ^= 32;
                result = result + (char)(ch ^ 32);
            }
            resultChars[i] = ch;
        }

        return new String(resultChars);
    }

    public static void main(String[] args) {
        String text = "test-this-out";

        //String[] splitedString = split(text, '-');

        /*
        for (int i = 0; i < splitedString.length; i++) {
            if (splitedString[i] != null) {
                System.out.println(splitedString[i]);
            }
        }
        */

       // System.out.println(subString(text, 2, 5));

//        System.out.println(trim("  trimmed text    "));
//        System.out.println(toLowerCase("tEsTiNg lOwEr CaSe"));
//        System.out.println(toUpperCase("tEsTiNg UpPeR CaSe"));
        System.out.println(changeCase("tEsTiNg cHanGe CaSe", 5, 9));
    }
}