package homework.lesson5.vardankhalatyan.braceChecker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class BraceChecker {
    //TODO add fields at your discretion

    /*
    stackOne: is for '('; ')'
    stackTwo: is for '['; ']'
    stackThree: is for '{'; '}'
    stackFour: is for "
    stackFive: is for '
     */

    private Stack stackOne = new Stack[];
    private Stack stackTwo = new Stack[];
    private Stack stackThree = new Stack[];
    private Stack stackFour = new Stack[];
    private Stack stackFive = new Stack[];


    public BraceChecker(String fileName){

    }


    public boolean parse(String text) {
        boolean isCorrect = true;
        //TODO add implementation

        String line;
        BufferedReader file = new BufferedReader(new FileReader("text"));
        line = file.readLine();
        for (int i = 0; i < line.length(); i++) {
            switch (line.charAt(i)){
                case '{':
                    stackThree.push(3);
                case '[':
                    stackTwo.push(2);
                case '(':
                    stackOne.push(1);
                case '"':
                    stackFour.push(4);
//                case: '\'':
//                    stackFive.push(5);
                case '}':
                    stackThree.pop();
                case ']':
                    stackTwo.pop();
                case ')':
                    stackThree.pop();
            }
        }

        file.close();
        return isCorrect;

    }

}
