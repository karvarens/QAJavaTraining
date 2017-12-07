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

    public DynamicArrayImpl(){
        this(DEFAULT_CAPACITY);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size > 0)
            return false;
        else
            return true;
    }

    @Override
    public boolean contains(T o) {
        if(o == null){
            for (int i = 0; i < size; i++) {
                if (values[i] == null)
                    return true;
            }
            for (int i = 0; i < size; i++) {
                if (o.equals(values[i]))
                    return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T o) {
        if (o == null){
            for (int i = 0; i < size; i++) {
                if (values[i] == null)
                    return i;
            }
        }
        else
            for (int i = 0; i < size; i++) {
                if (o.equals(values[i]))
                    return i;
            }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        if (o == null){
            for (int i = size-1; i >= 0; i--) {
                if (values[i] == null)
                    return i;
            }
        }
        else
            for (int i = size-1; i >= 0; i--) {
                if (o.equals(values[i]))
                    return i;
            }
        return -1;
    }

    @Override
    public T get(int index) {
        return getElement(index);
    }

    private T getElement(int index) {
        if(validateIndex(index))
            return (T)values[index];
        else
            return null;
    }

    private boolean validateIndex(int index){
        if(index >= 0 && index <= size)
            return true;
        else
            return false;
    }

    @Override
    public T set(int index, T element) {
        T oldValue = getElement(index);
        values[index] = element;
        return oldValue;
    }

    @Override
    public boolean add(T e) {
        return false;
    }

    @Override
    public void add(int index, T element) {
        if(validateIndex(index)){
            size++;
            T replacedValue;
            for (int i = index; i < size; i++) {
                replacedValue = set(i, element);
                element = replacedValue;
            }
            values[size] = element;
        }
        else
            System.out.println("Invalid value of Index for '" + element.toString() + "' value");
    }

    @Override
    public T remove(int index) {
        if(validateIndex(index)){
            size--;
            T removedValue = getElement(index);;
            //TODO to continue...
        }
        return null;
    }

    @Override
    public boolean remove(T o) {
        return false;
    }

    @Override
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(values[i]);
        }
    }

    public static void main(String[] args) {
        DynamicArray<String> testingString = new DynamicArrayImpl<String>(5);
        testingString.add(0,"one");
        testingString.add(1,"two");
        testingString.add(0, "three");
        testingString.add(-1, "aaa");

        testingString.print();
    }

}