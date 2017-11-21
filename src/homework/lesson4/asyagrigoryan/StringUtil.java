package homework.lesson4.asyagrigoryan;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class StringUtil {

    /**
     * Parses the specified inputText and divides it into tokens by the specified delimiter.
     *
     * @param inputText the string to be splitted by the specified delimiter
     * @param delimiter the delimiter by which the specified inputText  will splitted.
     * @return the array of strings computed by splitting this string
     * around matches of the given regular expression.
     */
    public static String[] split(String inputText, char delimiter) {


        int k = 0;
        for (int i = 0; i <= inputText.length() - 1; i++) {
            if (inputText.charAt(i) == delimiter)
                k++;
        }

        String [] newArray = new String [k + 1];

        int index1 = 0;
        int j = 0;

        for (int i = 0; i <= inputText.length() - 1; i++){
            if (inputText.charAt(i) == delimiter){
                newArray[j] = subString(inputText, index1, i);
                j++;
                index1 = i + 1;
            }
        }

        newArray[j] = subString(inputText,index1,inputText.length());

            return newArray;
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

        int length = endIndex - startIndex;

        char[] array = new char[length];
        int j = 0;
        for (int i = startIndex; i < endIndex; i++) {

            array[j] = inputText.charAt(i);
            j++;

        }

        return new String(array);
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

        int index1 = 0;
        int index2 = str.length() - 1;

        while(str.charAt(index1) == ' ') {
                index1++;
            }

        while(str.charAt(index2) == ' '){
                index2--;
            }

        return subString(str, index1, index2 + 1);
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
    public static int parseInt(String s) {

        return 0; // TODO implement the method
    }

    public static String toLowerCase(String text) {

        char [] lower = text.toCharArray();
        for (int i = 0; i <= lower.length - 1; i++){
            if(lower[i] <= 90 && lower[i]>=65){
                lower[i] += 32;
            }
        }

        return new String(lower);
    }

    public static String toUpperCase(String text) {

        char [] upper = text.toCharArray();
        for (int i = 0; i <= upper.length - 1; i++){
            if(upper[i] >= 97 && upper[i]<=122){
                upper[i] -= 32;
            }
        }

        return new String(upper);
    }

    private static char changeCase(char ch) {



        return 0;
    }

    private static String changeCase(String text, int startIndex, int endIndex) {
        // TODO implement
        return null;
    }

    public static void main(String[] args) {

        System.out.println("subString " + subString("asya", 1, 3));
        String[] splittedText = split("asd8dfg8ghj", '8'  );

        for (int i = 0; i < splittedText.length ; i++) {
            System.out.println("split " + splittedText[i]);
        }

        System.out.println("trim " + trim("   Asya  "));
        System.out.println("toLowerCase " + toLowerCase("AsyaAni"));
        System.out.println("toUpperCase " + toUpperCase("AsyaAni"));
    }
}
