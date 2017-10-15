package homework.lesson5.davidgevorgyan.braceChecker;

public class BraceChecker {
    String text;

    public BraceChecker(String text){
        this.text = text;
    }

    public boolean parse() {
        Stack bracesStack = new Stack(text.length());
        Braces temp;
        char [] bracesOpeningTemplate = {'<', '(' , '[', '{'};
        char [] bracesClosingTemplate = {'>', ')' , ']', '}'};

        for (int i = 0; i < text.length(); i++) {
            char tempChar = text.charAt(i);
            //Filling Stack
            for (char templateBrace : bracesOpeningTemplate) {
                if (tempChar == templateBrace) {
                    temp = new Braces(i, text.charAt(i));
                    bracesStack.push(temp);
                }
            }
            //Checking Stack
            int braceIndexCounter=0; //used for counting polar brace
            for (char templateBrace : bracesClosingTemplate) {
                //try-catch to avoid -1 element calling
                try {
                    if (tempChar == templateBrace && bracesStack.pop().symbol == bracesOpeningTemplate[braceIndexCounter]) {
                        bracesStack.removeTopOfStack();
                    }
                }
                catch (ArrayIndexOutOfBoundsException exception){
                    return false;
                }
                braceIndexCounter++;
            }
        }


        if (bracesStack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }

    }

}
