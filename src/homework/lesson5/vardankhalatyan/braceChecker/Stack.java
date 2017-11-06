package homework.lesson5.vardankhalatyan.braceChecker;

public class Stack {
    public static final int DEFAULT_SIZE = 16;

    private int[] values;
    private int tos;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        values = new int[size];
        tos = -1;
    }

    public void push(int val) {
        this.increase();
        values[++tos] = val;
    }

    public Integer pop() {
        this.clear();
        if(isEmpty()) {
            return null;
        }
        return values[tos--];
    }

    public boolean isEmpty(){
        if (tos < 0){
            return tos == -1;
        }
        return false;
    }

    private void clear(){
        if (tos == values.length * (1/3)){
            int[] newValues = new int[values.length * 2/3];
            System.arraycopy(values, 0, newValues, 0, newValues.length);
            values = newValues;
        }
    }

    private void increase(){
        if(tos+1 == values.length){
            int[] newValues = new int [values.length * 3 / 2];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values = newValues;
        }
    }

    public int length(){
        return values.length;
    }
}
