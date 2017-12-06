package auditorium.braceChecker;


@SuppressWarnings({"unchecked", "WeakerAccess"})
public class StackImpl<T> implements Stack<T>{
    public final static int DEFAULT_SIZE = 16;
    public static final int MAX_EMPTY_SIZE = 2000;

    private Object[] values;
    private int tos;

    public StackImpl() {
        this(DEFAULT_SIZE);
    }

    public StackImpl(int size) {
        values = new Object[size];
        tos = -1;
    }
//
//    public StackImpl(int[] stack) {
//        values = new Object[stack.length];
//        System.arraycopy(stack, 0, values, 0, stack.length);
//        tos = -1;
//    }

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
        for (int i = 0; i <= tos; i++) { //TODO : explane this during the session
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
        StackImpl<String> stackImpl = new StackImpl<>();
        StackImpl<Long> stackImplL = new StackImpl<>();
    }
}
