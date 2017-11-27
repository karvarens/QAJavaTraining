package homework.lesson5.davidgevorgyan.braceChecker;

import static homework.lesson5.davidgevorgyan.braceChecker.BraceChecker.BracketItem;

public class Stack {
    private final static int DEFAULT_SIZE = 300;
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
        values = (BracketItem []) homework.lesson2.davidgevorgyan.util.ArrayUtil.enlargeArraySize(values.length, values);
        values[++topOfStack] = value;
    }

    public BracketItem pop() {

        if(topOfStack * 2 < values.length && topOfStack > DEFAULT_SIZE ){
            values = (BracketItem[])homework.lesson2.davidgevorgyan.util.ArrayUtil.ensureToReduce(values, values.length / 3 * 2);
        }
        if (isEmpty()) {
            return null;
        }
        else {
            BracketItem temp = values[topOfStack].copy();
            values[topOfStack] = null;
            topOfStack--;
            return temp;
        }
    }

    public BracketItem peek() {
        return isEmpty() ? null: values[topOfStack];
    }


    public void clearStack() {
        this.topOfStack = -1;

        for (int i = 0; i < values.length; i++) {
            while (this.values[i] != null) {
                this.values[i] = null;
            }
        }
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }
}
