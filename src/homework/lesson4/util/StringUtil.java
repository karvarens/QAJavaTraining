package lesson4;

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
        int size = sizeOfText(inputText,delimiter);
        String [] newStr = new String[size + 1];
        for (int i = 0; i <= size; i++) {
            newStr[i] = "";
        }

        for (int i = 0; i < newStr.length; i++) {
            for (int j = 0; j < inputText.length(); j++) {
                if (inputText.charAt(j) != delimiter){
                    newStr[i] += inputText.charAt(j);
                }else{
                    i++;
                }
            }
        }
        for (String w : newStr) {
            System.out.println(w);
        }

        //TODO implement
        return newStr;
    }

    private static int sizeOfText(String inputText,char delimiter){
        int size = 0;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == delimiter){
                size++;
            }
        }
        return size;
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
        StringBuilder str = new StringBuilder();
        for (int i = startIndex; i < inputText.length(); i++) {
            if (startIndex < 0 || endIndex > inputText.length()){
                throw new IndexOutOfBoundsException();
            }

            if (i < endIndex){
                str.append(inputText.charAt(i));
            }
        }

        //TODO implement
        return str.toString();
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
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                newString += str.charAt(i);
            }
        }
        //TODO: implement
        return newString;
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
        int c = 0;
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-'){
                c *= -1;
                i++;
                b = true;
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                c *= 10;
                if (b){
                    c += ((int)s.charAt(i) - '0')*-1;
                }else{
                    c += (int)s.charAt(i) - '0';
                }

            }else{
                throw new NumberFormatException();
            }
        }
        return c; // TODO implement the method
    }

    public static String toLowerCase(String text){
        StringBuilder resualt = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){
                resualt.append((char) (text.charAt(i) - 'A' + 'a'));
            }else{
                resualt.append(text.charAt(i));
            }
        }
        // TODO implement
        return resualt.toString();
    }

    public static String toUpperCase(String text){
        StringBuilder resualt = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
                resualt.append((char) (text.charAt(i) + 'A' - 'a'));
            }else{
                resualt.append(text.charAt(i));
            }
        }
        // TODO implement
        return resualt.toString();
    }

    private static String changeCase(String text, char startIndex, char endIndex) {
        // TODO implement
        return null;
    }
}
