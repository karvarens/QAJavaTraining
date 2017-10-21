package homework.lesson5.davidgevorgyan.braceChecker;

public class BraceChecker {
    private String text;
    private BracketItem lastOpened;
    private ParseResults parseResult = new ParseResults(ParseResultType.NO_ERROR);

    public BraceChecker(String text) {
        this.text = text;
    }

    public ParseResults parse() {
        Stack bracesStack = new Stack(); //
        BracketItem closedBracketItem = null;
        int i = 0;
        lab:
        for (; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            switch (currentChar) {
                case '{':
                case '(':
                case '[':
                    lastOpened = new BracketItem(i, currentChar);
                    bracesStack.push(lastOpened);
                    break;
                case '}':
                    lastOpened = bracesStack.pop(); //normally the pop method should remove topof stack
                    if (lastOpened == null || lastOpened.symbol != '{') {
                        closedBracketItem = new BracketItem(i, currentChar);
                        break lab;
                    }
                    break;
                case ')':
                    lastOpened = bracesStack.pop();
                    if (lastOpened == null || lastOpened.symbol != '(') {
                        closedBracketItem = new BracketItem(i, currentChar);
                        break lab;
                    }
                    break;
                case ']':
                    lastOpened = bracesStack.pop();
                    if (lastOpened == null || lastOpened.symbol != '(') {
                        closedBracketItem = new BracketItem(i, currentChar);
                        break lab;
                    }
                    break;
            }
        }

        if (i < text.length()) {
            if (lastOpened == null) {
                parseResult = new ParseResults(ParseResultType.CLOSED_NOT_OPENED, null, closedBracketItem);
            } else {
                parseResult = new ParseResults(ParseResultType.CLOSED_NOT_OPENED, lastOpened, closedBracketItem);
//          TODO: we should have one mor parameter for closed bracket.
            }
        } else if (!bracesStack.isEmpty()) {
            parseResult = new ParseResults(ParseResultType.OPENED_NOT_CLOSED , lastOpened, null);
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
            if (symbol != '(' && symbol != '{' && symbol != '[') {
                throw new IllegalArgumentException();
            } else {
                return symbol;
            }
        }
    }

    private static class ParseResultType {
        public static final ParseResultType  NO_ERROR = new ParseResultType (0);
        public static final ParseResultType CLOSED_NOT_OPENED = new ParseResultType (1);
        public static final ParseResultType  CLOSED_WRONG_BRACKET = new ParseResultType (2);
        public static final ParseResultType  OPENED_NOT_CLOSED = new ParseResultType (3);

        private ParseResultType(int typeNember) {
            this.typeNember = typeNember;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParseResultType that = (ParseResultType) o;

            return typeNember == that.typeNember;
        }

        @Override
        public int hashCode() {
            return typeNember;
        }

        private int typeNember;
    }

    public static class ParseResults {
        ParseResultType parseResultType;
        BracketItem opened;
        BracketItem closed;

        public ParseResults(ParseResultType parseResultType) {
            this(parseResultType, null, null);
        }

        public ParseResults(ParseResultType parseResultType, BracketItem bracketItem) {
            //TODO add validation
            if(parseResultType.equals(ParseResultType.OPENED_NOT_CLOSED)){
                init(parseResultType, bracketItem, null);
            } else {
                init(parseResultType, null, bracketItem);
            }
        }

        public ParseResults(ParseResultType parseResultType, BracketItem opened, BracketItem closed) {
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

            ParseResults that = (ParseResults) o;

            if (parseResultType != null ? !parseResultType.equals(that.parseResultType) : that.parseResultType != null)
                return false;
            if (opened != null ? !opened.equals(that.opened) : that.opened != null) return false;
            return closed != null ? closed.equals(that.closed) : that.closed == null;
        }
    }
}
