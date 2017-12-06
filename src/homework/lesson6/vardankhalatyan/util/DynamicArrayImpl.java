package homework.lesson6.vardankhalatyan.util;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
    private static final int DEFAULT_CAPACITY = 16;

    private Object[] values;
    /**
     * Count of elements in this DynamicArray, initial value is zero.
     */
    private int size;

    //TODO: add two constructors: default and with specified capacity.

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(T o) {
        return false;
    }

    @Override
    public int indexOf(T o) {
        return 0;
    }

    @Override
    public int lastIndexOf(T o) {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
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
