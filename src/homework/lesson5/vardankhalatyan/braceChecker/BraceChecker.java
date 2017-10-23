package homework.lesson5.vardankhalatyan.braceChecker;

public class BraceChecker {
    //TODO add fields at your discretion
    private Stack globalStack;
    /*
    stackOne: is for '('; ')'
    stackTwo: is for '['; ']'
    stackThree: is for '{'; '}'
    stackFour: is for "
    stackFive: is for '
     */

//    private Stack stackOne = new Stack[];
//    private Stack stackTwo = new Stack[];
//    private Stack stackThree = new Stack[];
//    private Stack stackFour = new Stack[];
//    private Stack stackFive = new Stack[];


    public BraceChecker(String fileName){
        globalStack = new Stack(10);
    }


    public boolean parse(String text) {
        boolean isCorrect = true;
      //  BufferedReader file = new BufferedReader(new FileReader("text"));
      //  line = file.readLine();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            switch (ch){
                case '{':
                case '[':
                case '(':
                    globalStack.push(ch);
                    break;
                case ')':
                    if (globalStack.isEmpty()){
                        System.out.println("Syntax error: unused '" + ch + " sign");
                        return isCorrect = false;
                    }
                    char poped = (char)globalStack.pop();
                    if (poped != '('){
                        System.out.println("Syntax error: " + ch +  " couple doesn't closed");
                        return isCorrect = false;
                    }else {
                        break;
                    }
                case ']':
                    if (globalStack.isEmpty()){
                        System.out.println("Syntax error: unused " + ch + " sign");
                        return isCorrect = false;
                    }
                    poped = (char)globalStack.pop();
                    if (poped != '['){
                        System.out.println("Syntax error: " + ch +  " couple doesn't closed");
                        return isCorrect = false;
                    }else {
                        break;
                    }
                case '}':
                    if (globalStack.isEmpty()){
                        System.out.println("Syntax error: unused '" + ch + " sign");
                        return isCorrect = false;
                    }
                    poped = (char)globalStack.pop();
                    if (poped != '{'){
                        System.out.println("Syntax error: " + ch +  " couple doesn't closed");
                        return isCorrect = false;
                    }else {
                        break;
                    }
            }

        }
        if (!globalStack.isEmpty()){
            char ch = (char)globalStack.pop();
            switch (ch){
                case '{':
                case '(':
                case '[':
                    System.out.println("Syntax error: " + ch +  " couple opened, but not closed");
                    return isCorrect = false;
            }
        }


//        file.close();
        return isCorrect;

    }

}
