package homework.lesson5.davidgevorgyan.braceChecker;

public class BraceChecker {
    private String text;
    private BracketItem currentBracketItem;
    private ParseResult parseResult = new ParseResult(ParseResultType.NO_ERROR);

    public BraceChecker(String text) {
        this.text = text;
    }

    public ParseResult parse() {
        Stack bracesStack = new Stack(); //
        BracketItem closedBracketItem = null;
        int i = 0;
        int rowNumber = 0;
        int indexInRaw = 0;
        lab:
        for (; i < text.length(); i++, indexInRaw++) {
            char currentChar = text.charAt(i);

            switch (currentChar) {
                case '\n':
                    rowNumber++;
                    indexInRaw = 0;
                    break;
                case '{':
                case '(':
                case '[':
                    currentBracketItem = new BracketItem(i, currentChar, rowNumber, indexInRaw);
                    bracesStack.push(currentBracketItem);
                    break;
                case '}':
                    currentBracketItem = bracesStack.pop(); //normally the pop method should remove topof stack
                    if (currentBracketItem == null || currentBracketItem.symbol != '{') {
                        closedBracketItem = new BracketItem(i, currentChar, rowNumber, indexInRaw);
                        break lab;
                    }
                    bracesStack.removeTopOfStack();
                    break;
                case ')':
                    currentBracketItem = bracesStack.pop();
                    if (currentBracketItem == null || currentBracketItem.symbol != '(') {
                        closedBracketItem = new BracketItem(i, currentChar, rowNumber, indexInRaw);
                        break lab;
                    }
                    bracesStack.removeTopOfStack();
                    break;
                case ']':
                    currentBracketItem = bracesStack.pop();
                    if (currentBracketItem == null || currentBracketItem.symbol != '[') {
                        closedBracketItem = new BracketItem(i, currentChar, rowNumber, indexInRaw);
                        break lab;
                    }
                    bracesStack.removeTopOfStack();
                    break;
            }
        }

        if (i < text.length()) {
            if (currentBracketItem == null) {
                parseResult = new ParseResult(ParseResultType.CLOSED_NOT_OPENED, null, closedBracketItem);
            } else {
                parseResult = new ParseResult(ParseResultType.OPENED_BUT_CLOSED_WRONG_BRACKET, currentBracketItem, closedBracketItem);
            }
        } else if (!bracesStack.isEmpty()) {
            parseResult = new ParseResult(ParseResultType.OPENED_NOT_CLOSED , currentBracketItem, null);
            return parseResult;
        }

        return parseResult;
    }

    public static class BracketItem {
        int index;
        char symbol;
        int rowNumber = 0;
        int indexInRow = 0;

        BracketItem(int index, char symbol) {
            this.index = validateIndex(index);
            this.symbol = validateSymbol(symbol);
        }

        BracketItem(int index, char symbol, int rowNumber, int indexInRow) {
            this.index = validateIndex(index);
            this.symbol = validateSymbol(symbol);
            this.rowNumber = validateIndex(rowNumber);
            this.indexInRow = validateIndex(indexInRow);
        }
        public void print(BracketItem value) {
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
            if (symbol != '(' && symbol != '{' && symbol != '[' && symbol != ')' && symbol != '}' && symbol != ']' ) {
                throw new IllegalArgumentException();
            } else {
                return symbol;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BracketItem that = (BracketItem) o;

            if (index != that.index) return false;
            if (symbol != that.symbol) return false;
            return rowNumber == that.rowNumber && indexInRow == that.indexInRow;
        }
    }

    public static class ParseResultType {
        //TODO read and understand this part
        public static final ParseResultType  NO_ERROR = new ParseResultType (0);
        public static final ParseResultType CLOSED_NOT_OPENED = new ParseResultType (1);
        public static final ParseResultType  OPENED_BUT_CLOSED_WRONG_BRACKET = new ParseResultType (2);
        public static final ParseResultType  OPENED_NOT_CLOSED = new ParseResultType (3);

        private ParseResultType(int typeNumber) {
            this.typeNumber = typeNumber;
        }
        public int typeNumber;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParseResultType that = (ParseResultType) o;

            return typeNumber == that.typeNumber;
        }
    }

    public static class ParseResult {
        ParseResultType parseResultType;
        BracketItem opened;
        BracketItem closed;

        public ParseResult(ParseResultType parseResultType) {
            this(parseResultType, null, null);
        }

        public ParseResult(ParseResultType parseResultType, BracketItem bracketItem) {
            if(parseResultType.equals(ParseResultType.OPENED_NOT_CLOSED)){
                init(parseResultType, bracketItem, null);
            } else if (parseResultType.equals(ParseResultType.CLOSED_NOT_OPENED)){
                init(parseResultType, null, bracketItem);
            }
            else{
                throw new IllegalArgumentException();
            }
        }

        public ParseResult(ParseResultType parseResultType, BracketItem opened, BracketItem closed) {
            init(parseResultType, opened, closed);
        }

        private void init(ParseResultType parseResultType, BracketItem opened, BracketItem closed){
            this.parseResultType = parseResultType;
            this.opened = opened;
            this.closed = closed;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParseResult that = (ParseResult) o;

            if (parseResultType != null ? !parseResultType.equals(that.parseResultType) : that.parseResultType != null)
                return false;
            return (opened != null ? opened.equals(that.opened) : that.opened == null) && (closed != null ? closed.equals(that.closed) : that.closed == null);
        }
    }

    public static String ParseResultToString(ParseResult parseResult) {
        switch (parseResult.parseResultType.typeNumber) {
            case 0:
                return "No Errors Found";
            case 1:
                return "An opening bracket is missed in " + (parseResult.closed.rowNumber + 1) + " row " + parseResult.closed.indexInRow + " character";
            case 2:
                return "Invalid sequence of brackets started from " + (parseResult.closed.rowNumber + 1) + " row " + (parseResult.closed.indexInRow + 1) + " character";
            case 3:
                return "A closing bracket is missed in " + (parseResult.opened.rowNumber + 1) + " row " + (parseResult.opened.indexInRow + 1) + " character";
        }
        return "Error";
    }
}
