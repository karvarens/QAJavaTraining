package homework.lesson6.vardankhalatyan.util;

import java.util.NoSuchElementException;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
    enum Direction {
        right("right"), left("left");
        Direction(String right) {}
    }

    private static final int DEFAULT_CAPACITY = 16;

    private Object[] values;
    /**
     * Count of elements in this DynamicArray, initial value is zero.
     */
    private int size;

    public DynamicArrayImpl() {
        new DynamicArrayImpl(DEFAULT_CAPACITY);
    }

    public DynamicArrayImpl(int capacity) {
        values = new Object[capacity];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(T o) {
        for (int i = 0; i < size() - 1; i++) {
            if (o.equals(values[i])) return true;
        }
        return false;
    }

    @Override
    public int indexOf(T o) {
        if (o == null) {
            for (int i = 0; i < values.length ; i++) {
                if (values[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size() - 1; i++) {
                if (o.equals(values[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        for (int i = size() - 1; i <= 0; i++) {
            if (o.equals(values[i])) {
                return i;
            }
        }
        return -1;
    }

    private T getElement(int index){
        if (index <= size() && index >= 0){
            return (T)values[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public T get(int index) {
        return getElement(index);
    }

    @Override
    public T set(int index, T element) {
        T oldValue = getElement(index);
        values[index] = element;
        return oldValue;
    }

    private void switcher(int index, Direction direction) {
        int s = size();
        int val = values.length;
        if (s == val){
            Object[] copyArray = new Object[val * 3/2];
            System.arraycopy(values, 0, copyArray, 0, val);
            values = copyArray;
        } else if (s == val/3){
            Object[] copyArray = new Object[val/2];
            System.arraycopy(values, 0, copyArray, 0, s);
            values = copyArray;
        }
        if (direction == Direction.right) {
            for (int i = s - 1; i >= index; s--) {
                values[s] = values[s - 1];
            }
            values[index] = null;
        } else if (direction == Direction.left) {
            for (int i = index; i < s; i++) {
                values[i] = values[i+1];
            }
        }
    }

    @Override
    public boolean add(T e) {
        add(size(), e);
        return true;
    }

    @Override
    public void add(int index, T element) {
        switcher(index, Direction.right);
        set(index, element);
        size++;
    }

    @Override
    public T remove(int index) {
        Object element = get(index);
        switcher(index, Direction.left);
        size--;
        return (T) element;
    }

    @Override
    public boolean remove(T o) {
        if (contains(o)){
            remove(indexOf(o));
            return true;
        }
        throw new NoSuchElementException("There is no such element to be removed");
    }
}
