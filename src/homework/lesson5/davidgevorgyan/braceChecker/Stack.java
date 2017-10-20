package homework.lesson5.davidgevorgyan.braceChecker;

public class Stack {

    private BraceChecker.Braces[] values;
    private int topOfStack;

    Stack() {
        values = new BraceChecker.Braces[3];
        topOfStack = -1;
    }

    Stack(int size) {
        values = new BraceChecker.Braces[size];
        topOfStack = -1;
    }

    public void push(BraceChecker.Braces value) {
        if(topOfStack == values.length - 1){
             enlarge();
        }

        values[++topOfStack] = value;
    }

    public void removeTopOfStack() {
        topOfStack--;
    }

    public BraceChecker.Braces pop(){
        if(topOfStack < 0) {
            return null;
        }
        return values[topOfStack];
    }

    private void enlarge(){
        BraceChecker.Braces[] newValues = new BraceChecker.Braces[values.length * 3 / 2];
        System.arraycopy(values, 0, newValues, 0, values.length);
        values = newValues;
    }


    public boolean isEmpty(){
        return topOfStack == -1;
    }
}
