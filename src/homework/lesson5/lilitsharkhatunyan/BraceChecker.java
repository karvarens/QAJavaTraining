package homework.lesson5.lilitsharkhatunyan;

import sun.text.resources.BreakIteratorInfo;

public class BraceChecker {
    private static Stack stack;
    private static String resultMessage = "No Message";

    public BraceChecker(String text){
        stack = new Stack(text.length());
    }

    private void resetStack(){
        //TODO stack, resultMessage
    }

    public boolean parse(String text) {

        BracketItemInfo lastStackBracket = null;
        int numberInRow = 0;
        int rowNumber = 1;

        boolean isCorrect = true;

        char ch = 0;
        int i = 0;
        lab: for (; i < text.length(); i++) {
            numberInRow++;

            ch = text.charAt(i);
            switch(ch){
                case '{':
                case '[':
                case '(':
                    stack.push(new BracketItemInfo(ch, rowNumber, i, numberInRow));
                    break;
                case '}':
                    lastStackBracket = stack.pop();
                    if(lastStackBracket.getBracketSymbol() != '{') {
                        break lab;
                    }
                    break;
                case ']':
                    lastStackBracket = stack.pop();
                    if(lastStackBracket.getBracketSymbol() != '[') {
                        break lab;
                    }
                    break;

                case ')':
                    lastStackBracket = stack.pop();
                    if (lastStackBracket.getBracketSymbol() != '(') {
                        break lab;
                    }
                    break;
                case '\n':
                    rowNumber ++;
                    numberInRow = 0; //set 0 ??
            }
        }

        if(i < text.length() || !stack.isEmpty() && i == text.length()){ //<= for last item??
            isCorrect = false;
            BracketItemInfo currentBracket = i < text.length()? new BracketItemInfo(ch, rowNumber, i, numberInRow) : null;

            if(!stack.isEmpty() && i == text.length()) {
                lastStackBracket = stack.pop();
            }

            displayParsingMessage(isCorrect, lastStackBracket, currentBracket);
            System.out.println(resultMessage);
        }
        else {
            displayParsingMessage(isCorrect, null, null);
            System.out.println(resultMessage);
        }

//        else if(!stack.isEmpty())
//             isCorrect = false;

        return isCorrect;
    }

    public static void displayParsingMessage(boolean isParsed, BracketItemInfo openedBracket,  BracketItemInfo closedBracket){

        if(isParsed){
            resultMessage = "String is parsed without any errors!";
        }
        else if(openedBracket == null && closedBracket!=null){
            resultMessage = "'" + closedBracket.getBracketSymbol() + "'" + " symbol Closed at " + closedBracket.getRowNumber()
                     + ":" + closedBracket.getNumberInRow() + "(row:col)" + " but not Opened";
        }
        else if(closedBracket ==null && openedBracket!=null){
            resultMessage = "'" + openedBracket.getBracketSymbol() + "'" + " symbol Opened at " + openedBracket.getRowNumber()
                    + ":" + openedBracket.getNumberInRow() + "(row:col)" + " but not Closed";
        }
        else if(closedBracket.getBracketSymbol() != openedBracket.getBracketSymbol()){
            resultMessage = "'" + openedBracket.bracketSymbol  + "'" + " symbol Opened at " + openedBracket.getRowNumber()
                    + ":" + openedBracket.getNumberInRow() + "(row:col)" + " but doesn't match the Closed bracket "
                    + "'" + closedBracket.bracketSymbol + "' at " + + closedBracket.getRowNumber()+ ":" + closedBracket.getNumberInRow()
                    + "(row:col)";
        }

    }

    public static class BracketItemInfo{
        private char bracketSymbol;
        private int rowNumber;
        private int index;
        private int numberInRow;

        public BracketItemInfo(char bracketSymbol, int rowNumber, int index, int numberInRow) {
            this.bracketSymbol = bracketSymbol;
            this.rowNumber = rowNumber;
            this.index = index;
            this.numberInRow = numberInRow;
        }

        public int getRowNumber() {
            return rowNumber;
        }

        public void setRowNumber(int rowNumber) {
            this.rowNumber = rowNumber;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getNumberInRow() {
            return numberInRow;
        }

        public void setNumberInRow(int numberInRow) {
            this.numberInRow = numberInRow;
        }

        public char getBracketSymbol() {
            return bracketSymbol;
        }

        public void setBracketSymbol(char bracketSymbol) {
            this.bracketSymbol = bracketSymbol;
        }
    }

    public static void main(String[] args) {

        String testBrackets = new String();

//        System.out.println("Please enter a text to parse brackets: ");
//        Scanner scanner = new Scanner(System.in);
//        testBrackets = scanner.nextLine();

        // testBrackets = "{}\n[]{}\n]"; //exc

        testBrackets = "{{{}}}";

        BraceChecker braceChecker = new BraceChecker(testBrackets);

        braceChecker.parse(testBrackets);
    }
}

