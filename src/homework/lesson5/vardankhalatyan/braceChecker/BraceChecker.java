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
        //TODO add implementation

        String line;
      //  BufferedReader file = new BufferedReader(new FileReader("text"));
      //  line = file.readLine();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            switch (ch){
                case '{':
                case '[':
                case '(':
                    globalStack.push(1);
                case ')':
                case ']':
                case '}':
                    if (globalStack.isEmpty()){
                        System.out.println("Syntax error: unused '" + text.charAt(i) + " sign");
                        isCorrect = false;
                        break;
                    }
                    char poped = (char)globalStack.pop();
                    if (poped != '{'){
                        System.out.println("Syntax error: " + text.charAt(i) +  " couple doesn't closed");
                        isCorrect = false;
                        break;
                    }
            }
//            switch (text.charAt(i)){
//                case '{':
//                    stackThree.push(3);
//                case '[':
//                    stackTwo.push(2);
//                case '(':
//                    stackOne.push(1);
//                case '"':
//                    stackFour.push(4);
////                case: '\'':
////                    stackFive.push(5);
//                case '}':
//                    stackThree.pop();
//                case ']':
//                    stackTwo.pop();
//                case ')':
//                    stackThree.pop();
//            }
        }


//        file.close();
        return isCorrect;

    }

}
