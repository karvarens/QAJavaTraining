package homework.lesson6.edgar.util;

import java.util.Arrays;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
    private static final int DEFAULT_SIZE = 16;
    private int size;
    private Object[] ObjectsArray;

    public DynamicArrayImpl() {
        this(DEFAULT_SIZE);
    }

    DynamicArrayImpl(int capacity) {
        this.ObjectsArray = new Object[capacity];
        this.size = 0;
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
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(T o) {

        if (o == null) {
            for (int i = 0; i < ObjectsArray.length; i++) {
                if (ObjectsArray[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < ObjectsArray.length; i++) {
                if (o.equals(ObjectsArray[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) throws IndexOutOfBoundsException {
        if (o == null) {
            for (int i = ObjectsArray.length; i > 0; i--) {
                if (ObjectsArray[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = ObjectsArray.length - 1; i >= 0; i--) {
                if (o.equals(ObjectsArray[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index <= ObjectsArray.length) {
            return (T) ObjectsArray[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public T set(int index, T element) throws IndexOutOfBoundsException{
//        if (index >= 0 && index <= ObjectsArray.length) {
////            this.ObjectsArray[index] = element;
////            return (T) ObjectsArray;
////        } else {
////            throw new IndexOutOfBoundsException();
////        }

        while (validateIndex(index)){
            T temp = getEement(index);
            ObjectsArray[index] = element;
            return temp;
        }
        return getEement(index);
    }

    @Override
    public boolean add(T e) {
        ensureArrayCapacity();
        ObjectsArray[size++] = e;
        return true;
    }
    /*Here is a problem*/
    @Override
    public void add(int index, T element) {
        if (validateIndex(index)){
            ensureArrayCapacity();
            T temp = getEement(index);

            for (int j = size; j > index; j--) {
                if (ObjectsArray[j] != null) {
                    swap(ObjectsArray, j, j + 1);
                }
            }
            set(index,element);
            set(index+1,temp);
            size++;
            ObjectsArray = ensureToReduce();
            if (index < 0 && index >= size) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    private void swap(Object[] objectsArray, int a, int b) {
        for (int i = 0; i < objectsArray.length; i++) {
            if (i == a) {
                Object temp = objectsArray[a];
                objectsArray[a] = objectsArray[b];
                objectsArray[b] = temp;
                break;
            }
        }
    }

    /*When array is full and we need to remove the element in
     *line 148 it dose not works without ensureArrayCapacity
     */
    @Override
    public T remove(int index) {
        T temp = null;
        ObjectsArray = ensureToReduce();
        lab:
        while (validateIndex(index)) {  // index >= 0 && index <= size
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    temp = getEement(i);  //getElement TODO
                    ObjectsArray[i] = null;
                    break lab;
                }
            }
        }
        ensureArrayCapacity();
        System.arraycopy(ObjectsArray, index + 1, ObjectsArray, index, size - index);
        size--;
        return temp;
    }

    @Override
    public boolean remove(T o) {
        if (indexOf(o) != -1) {
            remove(indexOf(o));
            return true;
        }
        return false;
    }

    public void printArray() {
        ObjectsArray = ensureToReduce();
        for (int i = 0; i < ObjectsArray.length; i++) {
            System.out.print(ObjectsArray[i] + " ");
        }
    }

    private Object [] ensureToReduce() {
//        Object[] newObjectArray = new Object[size];
////        System.arraycopy(ObjectsArray, 0, newObjectArray, 0, size);
////        return (T[]) (ObjectsArray = newObjectArray);
        if (size  < ObjectsArray.length && size > 3) {
            return Arrays.copyOf(ObjectsArray, size);
        }
        else {
            return ObjectsArray;
        }
    }

    private void ensureArrayCapacity() {
        if (size <= ObjectsArray.length - 1) {
            return;
        }
        Object[] newArray = new Object[size * 3 / 2];
        System.arraycopy(ObjectsArray, 0, newArray, 0, ObjectsArray.length);
        ObjectsArray = newArray;
    }

    private T getEement(int index) {
        if (validateIndex(index)) {
            return  (T)ObjectsArray[index];  // what mean unchecked cast??
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean validateIndex(int index)throws IndexOutOfBoundsException {
        if (index >= 0 && index <= size){
            return true;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
}
