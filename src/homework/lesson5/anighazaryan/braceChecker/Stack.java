package homework.lesson5.anighazaryan.braceChecker;

public class Stack {

    private int[] values;
    private int tos;

    public Stack(int size) {
        values = new int[size];
        tos = -1;
    }

    public void push(int val) {
        if (tos == values.length - 1) {
            ensureCapacity();
        }

        values[++tos] = val;
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return 0;
        }
        return values[tos--];
    }

    public int peek() {
        if (tos == -1) {
            return 0;
        }
        return values[tos];
    }

    public void reset() {
        while (tos != -1) {
            values[tos--] = 0;
        }
   }

    public boolean isEmpty(){
        return tos == -1;
    }

    private void ensureCapacity() {
        int[] newValues = new int[values.length * 3 / 2];
        System.arraycopy(values, 0, newValues, 0, values.length);
        values = newValues;
    }

}
