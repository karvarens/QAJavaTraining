package homework.lesson6.vardankhalatyan.util;

import java.util.NoSuchElementException;

public class DynamicArrayImpl<T> implements DynamicArray<T> {

    enum Direction {RIGHT, LEFT;}

    private static final int DEFAULT_CAPACITY = 16;

    private Object[] values;
    /**
     * Count of elements in this DynamicArray, initial value is zero.
     */
    private int size;

    public DynamicArrayImpl() {
        this(DEFAULT_CAPACITY);
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

    @SuppressWarnings("unchecked")
    private T getElement(int index){

        if (index > size() || index < 0) { //TODO: it will be better to have validateIndex method
            throw new IndexOutOfBoundsException();
        }
        return (T)values[index];
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

    private void validateIndex(int index) {
        validateIndex(index, false);
    }

    private void validateIndex(int index, boolean isIndexAfterLastElementValid) {
        int upperBound = isIndexAfterLastElementValid ? size() : size() -1;
        if (index > upperBound || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void shiftTo(int index, Direction direction) {
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
        if (direction == Direction.RIGHT) {
            for (int i = s - 1; i >= index; s--) {
                values[s] = values[s - 1];
            }
            values[index] = null;
        } else if (direction == Direction.LEFT) {
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
        validateIndex(index, true);
        //ensureCapacity

        if (isEmpty()) {
            values[size()] = element;
            size++;
            return;
        }
        shiftTo(index, Direction.RIGHT);
        set(index, element);
        size++;
    }

    @Override
    public T remove(int index) {
        T element = getElement(index);
        shiftTo(index, Direction.LEFT);
        size--;
        return element;
    }

    @Override
    public boolean remove(T o) {
        if (!contains(o)) {
            return false;
        }
        remove(indexOf(o));
        return true;
        //We should return false if the specified element is not exist in array
//        throw new NoSuchElementException("There is no such element to be removed");
    }
}


class Outer {
    private class Inner {}

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
    }
}