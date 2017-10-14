package homework.lesson5.davidgevorgyan.braceChecker;

public class Stack {

    private Braces[] values;
    private int topOfStack;

    public Stack(int size) {
        values = new Braces[size];
        topOfStack = -1;
    }

    public void push(Braces value) {
        if(topOfStack == values.length){
            values = enlarge(values);
        }

        values[++topOfStack] = new Braces(value.index, value.symbol);
    }

    public void removeTopOfStack() {
        topOfStack--;
    }

    public Braces pop(){
        return values[topOfStack];
    }

    private Braces[] enlarge(Braces[] values){
        Braces[] newValues = new Braces [values.length * 3 / 2];
        System.arraycopy(values, 0, newValues, 0, values.length);
        values = newValues;
        return values;
    }


    public boolean isEmpty(){
        return topOfStack == -1;
    }
}
