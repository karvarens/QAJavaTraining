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
        this.values = values;
        values = new Object[capacity];
        size = 0;
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
        // Validation layer

        return getElement(index);
    }

    @SuppressWarnings("unchecked")
    private T getElement(int index) {
        validateIndex(index);

        return (T) values[index];
    }

    private void validateIndex(int index) {
        if (index < 0 && index >= size) { // index >= size for set, get remove methods and > size for add method
            //TODO: It should be thrown exception later.
        }
    }

    @Override
    public T set(int index, T element) {
        validateIndex(index);

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
        validateIndex(index);
        //insure Capacity

        T replacedValue;
        for (int i = index; i < size; i++) {
            values[i + 1] = values[i];
        }
        values[index] = element;
    }

    @Override
    public T remove(int index) {
        validateIndex(index);

        size--;
        T removedValue = getElement(index);



        //TODO to continue...

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