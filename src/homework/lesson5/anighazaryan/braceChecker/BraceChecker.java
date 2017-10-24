package homework.lesson5.anighazaryan.braceChecker;

import java.io.IOException;

public class BraceChecker {

    private Stack stack;
    private char[] openingBraces = {'(', '{', '['};
    private char[] closingBraces = {')', '}', ']'};
    // private char matchingClosingBrace = ' ';

    public BraceChecker() {
        stack = new Stack(10);
    }

    public boolean parse(String text) {

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char top = (char) stack.peek();
            char opening = getOpeningBrace(chars[i]);
            if (top == opening) {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }
        }

        return stack.isEmpty();
    }

    /**
     *  Get the matching opening brace for the closing one, or ' ' if there is no any
     */
    private char getOpeningBrace(char ch) {

        for (int i = 0; i < closingBraces.length; i++) {
            if (closingBraces[i] == ch) {
                return openingBraces[i];
            }
        }
        return ' ';
    }

    public static void main(String[] args) throws IOException {

        //String braces = "({[]}{}()[])"; // happy case

//        String braces = "[{}]"; // happy case
//        String braces = "{{[("; // negative case
         String braces = ")}"; // negative case

        BraceChecker braceChecker = new BraceChecker();
        boolean parsedBraces = braceChecker.parse(braces);
        System.out.println("Braces were successfully parsed? " + parsedBraces);
    }

}
