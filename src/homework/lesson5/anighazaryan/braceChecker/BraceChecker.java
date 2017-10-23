package homework.lesson5.anighazaryan.braceChecker;

public class BraceChecker {

    private Stack stack;
    private char[] openingBraces = {'(','{','['};
    char type;

    public BraceChecker() {
        stack = new Stack(10);
    }

    public boolean parse(String text) {
        boolean isCorrect = false;

        char[] textToChar = text.toCharArray();
        int length = textToChar.length;

        for (int i = 0; i < length; i++) {
            if(isLeftBrace(textToChar[i])) {
                stack.push(textToChar[i]);
            } else if (textToChar[i] == type){
                stack.pop();
                int topValueOfStack = stack.peek();
                setClosingBrace((char) topValueOfStack);
            }
        }

        if(stack.isEmpty()) {
            isCorrect = true;
        }

        return isCorrect;

    }

    private boolean isLeftBrace(char ch) {

        for (int i = 0; i < openingBraces.length; i++) {
            if (openingBraces[i] == ch)
            {
                setClosingBrace(ch);
                return true;
            }
        }
        return false;
    }

    private char setClosingBrace(char ch) {

            switch(ch) {
                case '(':
                    type = ')';
                    break;
                case '{':
                    type = '}';
                    break;
                case '[':
                    type = ']';
                    break;
            }
            return type;
    }

    public static void main(String[] args) {

        String braces = "({[]}{}()[])";

        //String braces = "[{}()]";
        //String braces = "{}()}";
        //String braces = "{()}";

        BraceChecker braceChecker = new BraceChecker();
        boolean parsedBraces = braceChecker.parse(braces);
        System.out.println("Braces were successfully parsed: " + parsedBraces);
    }

}
