package homework.lesson5.edgar;

public class BraceCheker {
    private BraketItem currentBracketItem;
    private ParseResult parseResult = new ParseResult(Error_Types.NO_ERROR);
    private Stack<BraketItem> bracketStack = new Stack<>();

    public ParseResult parse(String text) {
        reset();

        BraketItem closeBracketItem = null;
        int i = 0;
        int indexInRow = 0;
        int rowNumber = 0;
        lab:
        for (; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (text.charAt(i) != ' '){
                indexInRow++;
            }
            switch (currentChar) {
                case '\n': {
                    rowNumber++;
                    indexInRow = 0;
                    break;
                }
                case '(':
                case '{':
                case '[':
                {
                    currentBracketItem = new BraketItem(i, currentChar, rowNumber, indexInRow);
                    bracketStack.push(currentBracketItem);
                    break;
                }
                case ')': {
                    currentBracketItem = bracketStack.pop();
                    if (currentBracketItem == null || currentBracketItem.symbol != '(') {
                        closeBracketItem = new BraketItem(i, currentChar, rowNumber, indexInRow);
                        break lab;
                    }
                    break;
                }
                case '}': {
                    currentBracketItem = bracketStack.pop();
                    if (currentBracketItem == null || currentBracketItem.symbol != '{') {
                        closeBracketItem = new BraketItem(i, currentChar, rowNumber, indexInRow);
                        break lab;
                    }
                    break;
                }
                case ']': {
                    currentBracketItem = bracketStack.pop();
                    if (currentBracketItem == null || currentBracketItem.symbol != '[') {
                        closeBracketItem = new BraketItem(i, currentChar, rowNumber, indexInRow);
                        break lab;
                    }
                    break;
                }
            }
        }

        if (i < text.length()){
            if (currentBracketItem == null){
                parseResult.setParseResult(Error_Types.CLOSED_BUT_NOT_OPEN,null,closeBracketItem);
            }else {
                parseResult.setParseResult(Error_Types.CLOSD_BY_WRONG_BRACKET,currentBracketItem,closeBracketItem);
            }
        }else if (!bracketStack.isEmpty()){
            parseResult.setParseResult(Error_Types.OPEN_BUT_NOT_CLOSED,currentBracketItem,null);
            return parseResult;
        }
        return parseResult;
    }

    public static class BraketItem {
        private int index;
        private char symbol;
        private int rowNumber;
        private int indexInRow;


        public BraketItem(int index, char symbol, int rowNumber, int indexInRow) {
            this.index = validateIndex(index);
            this.symbol = validateSymbol(symbol);
            this.rowNumber = validateIndex(rowNumber);
            this.indexInRow = validateIndex(indexInRow);
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public char getSymbol() {
            return symbol;
        }

        public void setSymbol(char symbol) {
            this.symbol = symbol;
        }

        public int getRowNumber() {
            return rowNumber;
        }

        public void setRowNumber(int rowNumber) {
            this.rowNumber = rowNumber;
        }

        public int getIndexInRow() {
            return indexInRow;
        }

        public void setIndexInRow(int indexInRow) {
            this.indexInRow = indexInRow;
        }


        private int validateIndex(int index){
            if(index < 0){
                throw new IllegalArgumentException();
            }else{
                return index;
            }
        }
        private char validateSymbol(char symbol){
            if (symbol != '(' && symbol != '{' && symbol != '[' && symbol != ')' && symbol != '}' && symbol != ']'){
                throw new IllegalArgumentException();
            }else{
                return symbol;
            }
        }
    }

    public static class ParseResult {
        private Error_Types error_Types;
        private BraketItem opened;
        private BraketItem closed;

        public ParseResult(Error_Types error_types) {
            this(error_types, null, null);
        }


        public void setParseResult(Error_Types error_types, BraketItem opened, BraketItem closed){
            this.error_Types = error_types;
            this.opened = opened;
            this.closed = closed;
        }

        public ParseResult(Error_Types error_types, BraketItem opened, BraketItem closed) {
            init(error_types, opened, closed);
        }

        private void init(Error_Types error_types, BraketItem opened, BraketItem closed){
            this.error_Types = error_types;
            this.opened = opened;
            this.closed = closed;
        }


        public String parseResultToString() {
            switch (error_Types) {
                case NO_ERROR:
                    return "No Errors Found";
                case CLOSED_BUT_NOT_OPEN:
                    return "An opening bracket is missed in " + (closed.rowNumber + 1) + " row " + closed.indexInRow + " character";
                case CLOSD_BY_WRONG_BRACKET:
                    return "Invalid sequence of brackets started from " + (closed.rowNumber + 1) + " row " + closed.indexInRow + " character";
                case OPEN_BUT_NOT_CLOSED:
                    return "A closing bracket is missed for " + (opened.rowNumber + 1) + " row " + opened.indexInRow  + " character";
            }
            return "Error";
        }
    }

    private void reset(){
        bracketStack.clear();
        parseResult.setParseResult(Error_Types.NO_ERROR,null,null);
    }


}

