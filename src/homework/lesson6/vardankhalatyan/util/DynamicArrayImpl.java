package homework.lesson6.vardankhalatyan.util;

import java.util.NoSuchElementException;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
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
        return size == 0;
    }

    @Override
    public boolean contains(T o) {
        for (int i = 0; i < size - 1; i++) {
            if (o.equals(values[i])) return true;
        }
        return false;
    }

    @Override
    public int indexOf(T o) {
        for (int i = 0; i < size - 1; i++) {
            if (o.equals(values[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        for (int i = size - 1; i <= 0; i++) {
            if (o.equals(values[i])) {
                return i;
            }
        }
        return -1;
    }

    private boolean getElement(int index){
        if (index <= size && index >= 0){
            return true;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public T get(int index) {
        if (getElement(index)) {
            return (T) values[index];
        } else {
            throw new NoSuchElementException("Something went wrong: There is no element in mentioned index");
        }
    }

    @Override
    public T set(int index, T element) {
        if (getElement(index)){
            return (T) (values[index] = element);
        } else {
            throw new NoSuchElementException("Something went wrong: Can't set the mentioned index element");
        }
    }

    @Override
    public boolean add(T e) {
        return false;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean remove(T o) {
        return false;
    }
}
