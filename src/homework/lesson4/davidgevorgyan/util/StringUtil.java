package homework.lesson4.davidgevorgyan.util;


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
        int size = countChar(inputText, delimiter);
        String[] newStr = new String[size + 1];
        for (int i = 0; i <= size; i++) {
            newStr[i] = "";
        }
        char[] ch = inputText.toCharArray();
        int startIndex = 0;
        int j = 0;
        for(int i = 0; i < inputText.length(); i++){
            //case for all words except last one
            if (ch[i] == delimiter){
                newStr[j] = subString(inputText, startIndex, i);
                j++;
                startIndex = i + 1;
            }
            //case for latest word
            if (i + 1 == inputText.length()) {
                newStr[j] = subString(inputText, startIndex, i + 1);
            }
        }
        return newStr;
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
        if((startIndex > endIndex) || (startIndex > inputText.length()) || (endIndex > inputText.length())) {
            throw new IndexOutOfBoundsException("startIndex/endIndex conflict is detected");
        }
        String newStr = "";
            char[] ch = inputText.toCharArray();
            for(int i = startIndex; i < inputText.length() && i < endIndex; i++){
                newStr = newStr + ch[i];
            }
        return newStr;
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
        int startIndex = 0;
        int endIndex = 0;
        char[] ch = str.toCharArray();
        for(int i = 0; i < length; i++) {
            if(ch[i]!=' ') {
                startIndex = i;
                break;
            }
        }
        for(int i = length-1; i >= 0; i--) {
            if(ch[i]!=' ') {
                endIndex = i + 1;
                break;
            }
        }
        return subString (str, startIndex, endIndex);
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
    public static int parseInt(String s) throws NumberFormatException {
            int num = 0;
            int mod = 1;

            for(int i = 0; i < s.length(); i++)
            {
                //checking for positive or negative number
                if (s.charAt(0) == '-' && i == 0){
                    mod = -1;
                    i++;
                }
                //checking for digits
                if(((int)s.charAt(i) >= 48) && ((int)s.charAt(i) <= 57)) {
                    num = num * 10 + ((int)s.charAt(i) - 48);
                } else {
                    throw new NumberFormatException();
                }
            }
            return num * mod;
    }

    public static String toUpperCase(String text){
        char[] ch = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (isUpperCase(ch[i])){
                ch[i] = changeCase(ch[i]);
            }
        }
        return String.valueOf(ch);
    }

    public static String toLowerCase(String text) {
        char[] ch = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (isLowerCase(ch[i])){
                ch[i] = changeCase(ch[i]);
            }
        }
        return String.valueOf(ch);
    }



    public static String changeCaseInString(String text, int startIndex, int endIndex) {
        String temp = subString(text,startIndex,endIndex);
        char[] ch = temp.toCharArray();

        for (int i = 0; i < temp.length(); i++) {
                ch[i] = changeCase(ch[i]);
        }
        return subString(text, 0,startIndex) + String.valueOf(ch) + subString(text,endIndex, text.length()) ;
    }

    public static char changeCase(char ch) {
        return isAlphabetic(ch) ? (char)(ch ^ 32) : ch;
    }

    public static boolean isUpperCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static boolean isLowerCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public static boolean isAlphabetic(char ch) {
        return isUpperCase(ch) || isLowerCase(ch);
    }

    private static int countChar(String inputText, char delimiter) {
        int size=0;
        char[] ch = inputText.toCharArray();
        for(int i = 0; i < inputText.length(); i++) {
            if (ch[i] == delimiter) {
                size++;
            }
        }
        return size;
    }
}
