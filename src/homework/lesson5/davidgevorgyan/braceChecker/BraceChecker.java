package homework.lesson5.davidgevorgyan.braceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text){
        this.text = text;
    }

    public static class Braces {
        int index;
        char symbol;
        int rowNumber;
        int indexInRow;

        Braces(int index, char symbol) {
            this.index = validateIndex(index);
            this.symbol = validateSymbol(symbol);
        }

        public void print(Braces value) {
            System.out.println(value);
        }

        private int validateIndex(int index) {
            if (index < 0) {
                throw new IllegalArgumentException();
            } else {
                return index;
            }
        }

        private char validateSymbol(char symbol) {
            if (symbol != '(' && symbol != '{' && symbol != '[') {
                throw new IllegalArgumentException();
            } else {
                return symbol;
            }
        }
    }

    public boolean parse() {
        Stack bracesStack = new Stack();
        char [] bracesOpeningTemplate = {'(' , '[', '{'};
        char [] bracesClosingTemplate = {')' , ']', '}'};

        for (int i = 0; i < text.length(); i++) {
            //TODO implement with switch operator
            char tempChar = text.charAt(i);
            //Filling Stack
            for (char templateBrace : bracesOpeningTemplate) {
                if (tempChar == templateBrace) {
                    bracesStack.push(new Braces(i,text.charAt(i)));//TODO ask for better solution
                }
            }
            //Checking Stack
            int braceIndexCounter = 0; //used for counting polar brace
            for (char templateBrace : bracesClosingTemplate) {
                 if (tempChar == templateBrace) {
                    if (bracesStack.pop() == null) {
                        return false;
                    }
                    if (bracesStack.pop().symbol == bracesOpeningTemplate[braceIndexCounter]) {
                            bracesStack.removeTopOfStack();
                    }
                }
                braceIndexCounter++;
            }
        }
        return bracesStack.isEmpty();
    }
}
