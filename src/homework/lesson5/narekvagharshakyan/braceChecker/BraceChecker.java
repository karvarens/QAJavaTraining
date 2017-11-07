package homework.lesson5.narekvagharshakyan.braceChecker;

public class BraceChecker {

    Stack myStack = new Stack (4);

    public boolean parse(String text) {
        boolean isCorrect = true;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)){
                case '(':
                case '[':
                case '{':
                    myStack.push(text.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    compare(text.charAt(i), i + 1);
                    break;
                }
            }
        if(myStack.isEmpty()){
            System.out.println("TEST PASSED");
        }
        return isCorrect;
    }

    public boolean compare(char symbol, int number) throws NumberFormatException {
        char getSymbol = myStack.reverseSymbol(myStack.pop(number));
        if(symbol == getSymbol) {
            System.out.println("Check OK");
            return true;
        }
        else {
            throw new NumberFormatException(number + "-th symbol of text is '" + symbol + "', but expected '" +  getSymbol + "'");
        }
    }
}
