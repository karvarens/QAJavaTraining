package homework.lesson5.edgar;

public class Stack <T>{

    public static final int DEFAULT_SIZE = 16;
    public static final int MAX_EMPTY_SIZE = 2000;

    private Object[] values;
    private int tos;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        values = new Object[size];
        tos = -1;
    }

    public Stack(int[] stack) {
        values = new Object[stack.length];
        System.arraycopy(stack, 0, values, 0, stack.length);
        tos = -1;
    }

    public void push(T val) {
        ensureCapacity();
        values[++tos] = val;
    }

    public T pop() {
        if (tos == -1) {
            return null;
        }
        return (T)values[tos--];

    }

    public boolean isEmpty() {
        return tos == -1;
    }

    private void reduceCapacity() {
        if (values.length - tos < MAX_EMPTY_SIZE) {
            return;
        }
        Object [] newValues = new Object[(tos + 1) * 3/2];
        System.arraycopy(values, 0, newValues, 0, tos + 1);
        values = newValues;
    }

    public void clear() {
        reduceCapacity ();
        for (int i = 0; i <= tos; i++) {
            values[i] = null;
        }
        tos = -1;
    }

    private void ensureCapacity() {
        if (tos < values.length - 1) {
            return;
        }
        Object[] newValues = new Object[values.length * 3 / 2];
        System.arraycopy(values, 0, newValues, 0, values.length);
        values = newValues;
    }
}