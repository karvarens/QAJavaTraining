package homework.lesson5.davidgevorgyan.braceChecker;

import static homework.lesson5.davidgevorgyan.braceChecker.BraceChecker.BracketItem;

public class Stack {
    private final static int DEFAULT_SIZE = 3;
    private BracketItem[] values;
    private int topOfStack;

    Stack() {
       this(DEFAULT_SIZE);
    }

    Stack(int size) {
        values = new BraceChecker.BracketItem[size];
        topOfStack = -1;
    }

    public void push(BraceChecker.BracketItem value) {
        if(topOfStack == values.length - 1){
             enlarge();
        }

        values[++topOfStack] = value;
    }

    public void removeTopOfStack() {
        topOfStack--;
    }

    public BraceChecker.BracketItem pop(){
        if(topOfStack < 0) {
            return null;
        }
        return values[topOfStack];
    }

    private void enlarge(){
        BraceChecker.BracketItem[] newValues = new BraceChecker.BracketItem[values.length * 3 / 2];
        System.arraycopy(values, 0, newValues, 0, values.length);
        values = newValues;
    }


    public boolean isEmpty(){
        return topOfStack == -1;
    }
}
