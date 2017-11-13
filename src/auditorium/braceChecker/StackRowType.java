package auditorium.braceChecker;

//THIS IS NON GENERIC STACK EXAMPLE

public class StackRowType {
    public final static int DEFAULT_SIZE = 16;
    public static final int MAX_EMPTY_SIZE = 2000;

    private Object[] values;
    private int tos;

    public StackRowType() {
        this(DEFAULT_SIZE);
    }

    public StackRowType(int size) {
        values = new Object[size];
        tos = -1;
    }

    public StackRowType(int[] stack) {
        values = new Object[stack.length];
        System.arraycopy(stack, 0, values, 0, stack.length);
        tos = -1;
    }

    public void push(Object val) {
        ensureCapacity();
        values[++tos] = val;
    }

    public Object pop() {
        if (tos == -1) {
            return null;
        }
        return values[tos--];

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
        for (int i = 0; i <= tos; i++) { //TODO : clarify this during the session
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

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Stack<Long> stackL = new Stack<>();
    }
}
