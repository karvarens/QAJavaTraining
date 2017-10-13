package auditorium.braceChecker;

public class Stack {

    private int[] values;
    private int tos;

    public Stack(int size) {
        values = new int[size];
        tos = -1;
    }

    public void push(int val) {
        if(tos == values.length){
            //TODO extend the values
            int[] newValues = new int [values.length * 3 / 2];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values = newValues;
        }

        values[++tos] = val;
    }

    public int pop(){
//        TODO complete
        return 0;
    }

    public boolean isEmpty(){
        return tos == -1;
    }
}
