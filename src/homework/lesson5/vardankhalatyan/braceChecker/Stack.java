package homework.lesson5.vardankhalatyan.braceChecker;

public class Stack {
    public static final int DEFAULT_SIZE = 16;

    private Object[] values;
    private int tos;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        values = new Object[size];
        tos = -1;
    }

    public void push(Object val) {
        this.increase();
        values[++tos] = val;
    }

    public Object pop() {
        this.reduce();
        if(isEmpty()) {
            return null;
        }
        return values[tos--];
    }

    public boolean isEmpty(){
        return tos < 0;
    }

    private void clear(){
        tos = -1;
    }

    private void reduce(){
        if (tos == values.length / 3){
            Object[] newValues = new Object[values.length * 2/3];
            System.arraycopy(values, 0, newValues, 0, newValues.length);
            values = newValues;
        }
    }

    private void increase(){
        if(tos+1 == values.length){
            Object[] newValues = new Object [(values.length * 3 / 2)+1];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values = newValues;
        }
    }

    public int length(){
        return values.length;
    }
}
