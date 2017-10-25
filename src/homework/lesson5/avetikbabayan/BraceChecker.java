package homework.lesson5.avetikbabayan;

import java.io.IOException;

public class BraceChecker {

    private Stack stuck;
    private char[] braceOpen  = {'(', '{', '['};
    private char[] braceClose  = {')', '}', ']'};

    public BraceChecker(){
        stuck = new Stack(10);
    }

    public boolean parse(String text) {
        char[] S = text.toCharArray();
        for (int i=0; i < text.length(); i++) {
            char opening = getOpeningBrace(S[i]);
            char high = (char) stuck.peak ();
            if (opening == high) {
                stuck.pop();
            } else {
                stuck.push(S[i]);
            }
        }
        return stuck.isEmpty();
    }
    private char getOpeningBrace(char ch) {

        for (int i = 0; i < braceClose.length; i++) {
            if (braceClose[i] == ch) {
                return braceOpen[i];
            }
        }
        return ' ';
    }
    public static void main(String[] args) throws IOException {

String braces = "({[]}{}()[])"; // happy case
//String braces = "[{}]"; // happy case
//String braces = "{{[("; // negative case
//String braces = ")}"; // negative case

        BraceChecker braceChecker = new BraceChecker();
        boolean parsedBraces = braceChecker.parse(braces);
        System.out.println("Braces were successfully parsed? " + parsedBraces);
    }
}

