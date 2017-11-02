package homework.lesson5.davidgevorgyan.braceChecker;

import static homework.lesson5.davidgevorgyan.braceChecker.BraceChecker.BracketItem;

public class Stack {
    private final static int MAX_EMPTY_SIZE = 2000; // this should be discussed.
    private final static int DEFAULT_SIZE = 3;
    private BracketItem[] values;
    private int topOfStack;

    Stack() {
       this(DEFAULT_SIZE);
    }

    Stack(int size) {
        values = new BracketItem[size];
        topOfStack = -1;
    }

    public void push(BracketItem value) {
        if(topOfStack == values.length - 1){
             enlargeStackSize();
        }
        values[++topOfStack] = value;
    }

    public BracketItem pop() {
        ensureToReduce();

        return isEmpty() ? null: values[topOfStack--];
    }

    public BracketItem peek() {
        return isEmpty() ? null: values[topOfStack];
    }

    private void enlargeStackSize() {
        BracketItem[] newValues = new BracketItem[values.length * 3 / 2];
        System.arraycopy(values, 0, newValues, 0, values.length);
        values = newValues;
    }

    private void ensureToReduce() {
        if( values.length - topOfStack < MAX_EMPTY_SIZE){
            return;
        }

        BracketItem[] newValues = new BracketItem[values.length / 3 * 2];
        System.arraycopy(values, 0, newValues, 0, topOfStack+1);
        values = newValues;

    }
    public void clearStack() {
        this.topOfStack = -1;
        this.values = new BracketItem[DEFAULT_SIZE];
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }
}
