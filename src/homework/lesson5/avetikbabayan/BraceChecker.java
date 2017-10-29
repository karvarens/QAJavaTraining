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
        //Variables and methods names must be start with small letters
        char[] s = text.toCharArray();
        //char[] s is redundant. we can use  text.charAt(i)
        for (int i=0; i < text.length(); i++) {
            char opening = getOpeningBrace(text.charAt(i));
            char high = (char) stuck.peak ();
            if (opening == high) {
                stuck.pop();
            } else {
                stuck.push(s[i]);
            }
        }
        return stuck.Empty();
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

String braces = "()[]){[]}{}(";

        BraceChecker braceChecker = new BraceChecker();
        boolean parsBrace = braceChecker.parse(braces);
        System.out.println("Braces parsed? " + parsBrace);
    }
}

