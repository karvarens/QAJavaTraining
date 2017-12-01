package homework.lesson5.narekvagharshakyan.braceChecker;

public class BraceChecker {

    Stack stack = new Stack(4);

    public boolean parse(String text) {
        boolean isCorrect = true;
        lab: for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            switch (current) {
                case '(':
                case '[':
                case '{':
                    stack.push(text.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    char stackLastElement = stack.pop();
                    if(compare(current, stackLastElement)) {
                        break lab;
                    }
                    break;

                    //TODO: add check for the '\n' symbol
            }
        }
        //TODO: add
        if (stack.isEmpty()) {
            System.out.println("TEST PASSED");
        }
        return isCorrect;
    }

    public boolean compare(char symbol, int number) throws NumberFormatException {
        char getSymbol = stack.reverseSymbol(stack.pop());
        if (symbol == getSymbol) {
            System.out.println("Check OK");
            return true;
        } else {
            throw new NumberFormatException(number + "-th symbol of text is '" + symbol + "', but expected '" + getSymbol + "'");
        }
    }
}
