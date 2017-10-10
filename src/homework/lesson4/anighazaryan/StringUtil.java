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

    public static String toLowerCase(String text){

        char[] charText = text.toCharArray();
        int length = charText.length;

        int ascii;
        for (int i = 0; i < length; i++) {
            ascii = (int)charText[i];
            if(ascii <= 90 && ascii >= 65 ) {
                ascii += 32;
                charText[i] = (char) ascii;
            }
        }

        String newText = new String(charText);

        return newText;
    }

    public static String toUpperCase(String text){

        char[] charText = text.toCharArray();
        int length = charText.length;

        int ascii;
        for (int i = 0; i < length; i++) {
            ascii = (int)charText[i];
            if(ascii <= 122 && ascii >= 97 ) {
                ascii -= 32;  // TODO  use ^ operator without
                charText[i] = (char) ascii;
            }
        }

        return new String(charText);
    }

    private static char changeCase(char ch) {
        return isAlphabetic(ch) ? (char)(ch ^ 32) : ch;
    }

    static boolean isAlphabetic(char ch) {
        return ch <= 122 && ch >= 97 || ch <= 90 && ch >= 65;
    }

    private static String changeCase(String text, int startIndex, int endIndex) {

        char[] charText = text.toCharArray();
        int length = charText.length;

        int i = 0;
        int j = length - 1;

        while (charText[i] != startIndex) {
            i++;
        }

        while (charText[j] != endIndex) {
            j--;
        }

        if ( i > j) {
            return null;
        }

        int ascii;

        char[] resultChars = new char[j-i+1];
        int index = 0;

        for (int k = i; k <= j; k++) {
            ascii = (int)charText[k];
            if(ascii <= 122 && ascii >= 97 || ascii <= 90 && ascii >= 65) {
                ascii ^= 32;
            }

//            if(ascii <= 122 && ascii >= 97 ) {
//                ascii -= 32;
//                charText[k] = (char) ascii;
//            } else if (ascii <= 90 && ascii >= 65) {
//                ascii += 32;
//                charText[k] = (char) ascii;
//            }
            resultChars[index] = charText[k];
            index ++;
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

        System.out.println(trim("  trimmed text    "));
        System.out.println(toLowerCase("tEsTiNg lOwEr CaSe"));
        System.out.println(toUpperCase("tEsTiNg UpPeR CaSe"));
        System.out.println(changeCase("tEsTiNg cHanGe CaSe", 's', 'n'));
    }
}