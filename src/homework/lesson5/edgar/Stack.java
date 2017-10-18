package homework.lesson5.edgar;

public class Stack {
    private char[] values;
    private int tos;
    private char [] newValues;

    public Stack(int size) {
        values = new char[size];
        tos = -1;
    }

    public void push(char val) {
        if(tos == values.length - 1){
            newValues = new char [values.length * 3 / 2];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values = newValues;
        }

        values[++tos] = val;
    }

    public char pop(){
        if (tos < 0){
            System.out.println("Stack does not loaded:");
            return 0;
        }else{
            return values[tos--];
        }
    }

    public boolean isEmpty(){
        return tos == -1;
    }
}
