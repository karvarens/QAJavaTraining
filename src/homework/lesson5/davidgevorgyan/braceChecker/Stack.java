package homework.lesson5.davidgevorgyan.braceChecker;

public class Stack {

    private BraceChecker.BracketItem[] values;
    private int topOfStack;

    Stack() {
        values = new BraceChecker.BracketItem[3];   //TODO: see auditorium.braceChecker.Stack
        topOfStack = -1;
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
