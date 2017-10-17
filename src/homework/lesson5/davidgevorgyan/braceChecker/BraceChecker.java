package homework.lesson5.davidgevorgyan.braceChecker;

public class BraceChecker {
    private String text;
    private Braces lastOpened;

    public BraceChecker(String text){
        this.text = text;
    }

    public boolean parse() {
        Stack bracesStack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char tempChar = text.charAt(i);
            switch (tempChar) {
                case '{':
                case '(':
                case '[':
                    bracesStack.push(new Braces(i,tempChar));
                    break;
                case '}':
                    lastOpened = bracesStack.pop();
                    if (lastOpened == null || lastOpened.symbol != '{') {
                        return false;
                        //TODo: It will be better to break the loop and then analise what kind og error we have,
                    }
                    else {
                        bracesStack.removeTopOfStack();
                    }
                    break;
                case ')':
                    lastOpened = bracesStack.pop();
                    if (lastOpened == null || lastOpened.symbol != '(') {
                        return false;
                    }
                    else {
                        bracesStack.removeTopOfStack();
                    }
                    break;
                case ']':
                    lastOpened = bracesStack.pop();
                    if (lastOpened == null || lastOpened.symbol != '[') {
                        return false;
                    }
                    else {
                        bracesStack.removeTopOfStack();
                    }
                    break;
            }
        }
        return bracesStack.isEmpty();
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

}
