package homework.lesson5.davidgevorgyan.braceChecker;

@SuppressWarnings("WeakerAccess")
public class BraceChecker {
    private BracketItem currentBracketItem;
    private ParseResult parseResult = new ParseResult(ParseResultType.NO_ERROR);
    private Stack bracesStack = new Stack();


    public ParseResult parse(String text) {
        reset();

        BracketItem closedBracketItem = null;
        int i = 0;
        int rowNumber = 0;
        int indexInRow = 0;
        lab:
        for (; i < text.length(); i++, indexInRow++) {
            char currentChar = text.charAt(i);

            switch (currentChar) {
                case '\n':
                    rowNumber++;
                    indexInRow = 0;
                    break;
                case '{':
                case '(':
                case '[':
                    currentBracketItem = new BracketItem(i, currentChar, rowNumber, indexInRow);
                    bracesStack.push(currentBracketItem);
                    break;
                case '}':
                    currentBracketItem = bracesStack.pop();
                    if (currentBracketItem == null || currentBracketItem.symbol != '{') {
                        closedBracketItem = new BracketItem(i, currentChar, rowNumber, indexInRow);
                        break lab;
                    }
                    break;
                case ')':
                    currentBracketItem = bracesStack.pop();
                    if (currentBracketItem == null || currentBracketItem.symbol != '(') {
                        closedBracketItem = new BracketItem(i, currentChar, rowNumber, indexInRow);
                        break lab;
                    }
                    break;
                case ']':
                    currentBracketItem = bracesStack.pop();
                    if (currentBracketItem == null || currentBracketItem.symbol != '[') {
                        closedBracketItem = new BracketItem(i, currentChar, rowNumber, indexInRow);
                        break lab;
                    }
                    break;
            }
        }

        if (i < text.length()) {
            if (currentBracketItem == null) {
                parseResult.setParseResult(ParseResultType.CLOSED_NOT_OPENED, null, closedBracketItem);
            } else {
                parseResult.setParseResult(ParseResultType.OPENED_BUT_CLOSED_WRONG_BRACKET, currentBracketItem, closedBracketItem);
            }
        } else if (!bracesStack.isEmpty()) {
            parseResult.setParseResult(ParseResultType.OPENED_NOT_CLOSED , currentBracketItem, null);
            return parseResult;
        }

        return parseResult;
    }

    private void reset() {
        bracesStack.clearStack();
        parseResult.setParseResult(ParseResultType.NO_ERROR,null,null);
    }

    public static class BracketItem {
        private int index;
        private char symbol;
        private int rowNumber;
        private int indexInRow;

        BracketItem(int index, char symbol) {
            this(index, symbol, 0, 0);
        }

        BracketItem(int index, char symbol, int rowNumber, int indexInRow) {
            this.index = validateIndex(index);
            this.symbol = validateSymbol(symbol);
            this.rowNumber = validateIndex(rowNumber);
            this.indexInRow = validateIndex(indexInRow);
        }
        public BracketItem copy() {
            BracketItem clone = new BracketItem(this.index,this.symbol,this.rowNumber,this.indexInRow);
            return clone;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = validateIndex(index);
        }

        public char getSymbol() {
            return symbol;
        }

        public void setSymbol(char symbol) {
            this.symbol = validateSymbol(symbol);
        }

        public int getRowNumber() {
            return rowNumber;
        }

        public void setRowNumber(int rowNumber) {
            this.rowNumber = validateIndex(rowNumber);
        }

        public int getIndexInRow() {
            return indexInRow;
        }

        public void setIndexInRow(int indexInRow) {
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
        public static final ParseResultType  NO_ERROR = new ParseResultType (0);
        public static final ParseResultType CLOSED_NOT_OPENED = new ParseResultType (1);
        public static final ParseResultType  OPENED_BUT_CLOSED_WRONG_BRACKET = new ParseResultType (2);
        public static final ParseResultType  OPENED_NOT_CLOSED = new ParseResultType (3);

        private ParseResultType(int typeNumber) {
            this.typeNumber = typeNumber;
        }

        private int typeNumber;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParseResultType that = (ParseResultType) o;

            return typeNumber == that.typeNumber;
        }
    }

    public static class ParseResult {
        private ParseResultType parseResultType; // The fields must be private
        private BracketItem opened;
        private BracketItem closed;

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
        public void setParseResult(ParseResultType parseResultType, BracketItem opened, BracketItem closed){
            this.parseResultType = parseResultType;
            this.opened = opened;
            this.closed = closed;
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

        public String parseResultToString() {
            switch (parseResultType.typeNumber) {
                case 0:
                    return "No Errors Found";
                case 1:
                    return "An opening bracket is missed in " + (closed.rowNumber + 1) + " row " + closed.indexInRow + " character";
                case 2:
                    return "Invalid sequence of brackets started from " + (closed.rowNumber + 1) + " row " + closed.indexInRow + " character";
                case 3:
                    return "A closing bracket is missed for " + (opened.rowNumber + 1) + " row " + opened.indexInRow  + " character";
            }
            return "Error";
        }
    }
}
