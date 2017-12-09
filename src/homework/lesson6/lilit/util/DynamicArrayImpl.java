package homework.lesson6.lilit.util;

import homework.lesson6.vardankhalatyan.util.*;

/**
 * Created by lilitsharkhatunyan on 12/1/17.
 */

public class DynamicArrayImpl<T> implements DynamicArray<T> {
    private static final int DEFAULT_CAPACITY = 16;

    private Object[] values;
    private int size;

    public DynamicArrayImpl(int capacity) {
        this.values = new Object[capacity];
        values = new Object[capacity];
        this.size = 0;
    }

    public DynamicArrayImpl(T[] initialValues) {
        this.values = new Object[initialValues.length];
        System.arraycopy(initialValues, 0, values, 0, initialValues.length);
        size = initialValues.length; //??? why not this
    }

    public DynamicArrayImpl() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T o) {
//        if(o == null){
//            for (int i = 0; i < size; i++) {
//                if (values[i] == null)
//                    return true;
//            }
//        } else {
//            for (int i = 0; i < size; i++) {
//                if (o.equals(values[i]))
//                    return true;
//            }
//        }  // TO AVOID CODE DUPLICATION
        return indexOf(o) > -1;
    }

    @Override
    public int indexOf(T o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (values[i] == null)
                    return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(values[i]))
                    return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (values[i] == null)
                    return i;
            }
        } else
            for (int i = size - 1; i >= 0; i--) {
                if (o.equals(values[i]))
                    return i;
            }
        return -1;
    }

    @Override
    public T get(int index) {
        validateIndex(index, true);

        return getElement(index);
    }

    @SuppressWarnings("unchecked")
    private T getElement(int index) {
        validateIndex(index, true);

        return (T) values[index];
    }

    private void validateIndex(int index, boolean equalToSize) {
        if(equalToSize) {
            if (index < 0 && index >= size) { // index >= size for set, get remove methods and > size for add method > DONE
                //TODO have boolean parameter to identify the condition case > add, remove
                //TODO: It should be thrown exception later.
            }
        }
        else {
            if (index < 0 && index > size){
                //TODO: It should be thrown exception later.
            }
        }
    }

    @Override
    public T set(int index, T element) {
        validateIndex(index, true);

        T oldValue = getElement(index);
        values[index] = element;

        return oldValue;
    }

    @Override
    public boolean add(T e) {
        //ensure capacity

        values[size++] = e;
        return true;
    }

    @Override
    public void add(int index, T element) {
        validateIndex(index, false);

        ensureCapacity();

        for (int i = size-1; i > index; i--) {
            values[i+1] = values[i];
        }
        values[index] = element;
        size++;
    }

    private void ensureCapacity(){
        if(size+1 < values.length){
            return;
        }
        else {
            Object[] tmp = new Object[values.length * 3 / 2];
            System.arraycopy(values, 0, tmp, 0, values.length);
            values = tmp;
        }
    }

    @Override
    public T remove(int index) {
        validateIndex(index, true);

        T removedValue = getElement(index);

        for (int i = index; i < size + 1; i++) {
            values[i+1] = values[i];
        }
        size--;

        return removedValue;
    }

    @Override
    public boolean remove(T o) {
        int index = indexOf(o);
        if(index < 0){
            return false;
        }

        remove(index);
        return true;
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(values[i]);
        }
    }

    public static void main(String[] args) {
        DynamicArray<String> testingString = new DynamicArrayImpl<String>(5);
        testingString.add(0, "one");
        testingString.add(1, "two");
        testingString.add(0, "three");
        testingString.add(-1, "aaa");

        testingString.print();
    }

}