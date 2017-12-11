package homework.lesson5.armenmarutyan;

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
           if(tos == -1){
               System.out.println("Heeey, Stack is empty!!");
               return 0;
           }
        return values[tos--];
    }
    public boolean isEmpty(){
        return tos == -1;
    }
}
