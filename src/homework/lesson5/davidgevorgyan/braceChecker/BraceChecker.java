package homework.lesson5.davidgevorgyan.braceChecker;

public class BraceChecker {
    private String text;
    private Braces lastOpened;

    public BraceChecker(String text) {
        this.text = text;
    }

    public ParseResults parse() {
        Stack bracesStack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char tempChar = text.charAt(i);
            switch (tempChar) {
                case '{':
                case '(':
                case '[':
                    lastOpened=new Braces(i, tempChar);
                    bracesStack.push(lastOpened);
                    break;
                case '}':
                    lastOpened = bracesStack.pop();
                    if (lastOpened == null || lastOpened.symbol != '{') {
                        return new ParseResults(false, i);
                    } else {
                        bracesStack.removeTopOfStack();
                    }
                    break;
                case ')':
                    lastOpened = bracesStack.pop();
                    if (lastOpened == null || lastOpened.symbol != '(') {
                        return new ParseResults(false, i);
                    } else {
                        bracesStack.removeTopOfStack();
                    }
                    break;
                case ']':
                    lastOpened = bracesStack.pop();
                    if (lastOpened == null || lastOpened.symbol != '[') {
                        return new ParseResults(false, i);
                    } else {
                        bracesStack.removeTopOfStack();
                    }
                    break;
            }
        }
        if (bracesStack.isEmpty()) {
            return new ParseResults(true);
        }
        else {
            return new ParseResults(false, lastOpened.index);
        }


    }

    public static class Braces {
        int index;
        char symbol;
        int rowNumber = 0;
        int indexInRow = 0;

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

    public static class ParseResults {
        boolean result;
        int position;

        ParseResults(boolean result) {
            this.result = result;
        }

        ParseResults(boolean result, int position) {
            this.result = result;
            this.position = position;
        }

        public void setResult(boolean result) {
            this.result = result;
        }

        public void setResult(boolean result, int position) {
            this.result = result;
            this.position = position;

        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParseResults that = (ParseResults) o;

            if (result != that.result) return false;
            return position == that.position;
        }
    }
}
