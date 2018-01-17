package homework.lesson6.edgar.util;

import java.util.Arrays;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
    private static final int DEFAULT_SIZE = 16;
    private int size;
    private Object[] objectsArray;

    public DynamicArrayImpl() {
        this(DEFAULT_SIZE);
    }

    DynamicArrayImpl(int capacity) {
        this.objectsArray = new Object[capacity];
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
            for (int i = 0; i < size; i++) {
                if (objectsArray[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(objectsArray[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o)  {
        if (o == null) {
            for (int i = size - 1; i > 0; i--) {
                if (objectsArray[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (o.equals(objectsArray[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        validateIndex(index);  /*if validate method trows exeption mthod get will continued compile?*/
        return getEement(index);
    }

    @Override
    public T set(int index, T element) {
        validateIndex(index);
        T temp = getEement(index);
        objectsArray[index] = element;
        return temp;
    }

    @Override
    public boolean add(T e) {
        ensureArrayCapacity();
        objectsArray[size++] = e;
        return true;
    }
    /*Here is a problem*/
    @Override
    public void add(int index, T element) {

        validateIndex(index);
        ensureArrayCapacity();
        System.arraycopy(objectsArray, index, objectsArray, index + 1, size - index);
        objectsArray[index] = element;
        size++;
//            validateIndex(index);
//            ensureArrayCapacity();
//            T temp = getEement(index);
//
//            for (int j = size; j > index; j--) {
//                if (objectsArray[j] != null) {
//                    swap(objectsArray, j, j + 1);
//                }
//            }
//            set(index,element);
//            set(index+1,temp);
//            size++;
//            objectsArray = ensureToReduce();
//            if (index < 0 && index >= size) {
//                throw new IndexOutOfBoundsException();
//            }

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
        validateIndex(index);
        T temp = getEement(index);
        System.arraycopy(objectsArray,index + 1, objectsArray,index,size -index);
        objectsArray[index - 1] = null;
        size--;
        ensureToReduce();
//        T temp = null;
//        objectsArray = ensureToReduce();
//        lab:
//        while (validateIndex(index)) {  // index >= 0 && index <= size
//            for (int i = 0; i < size; i++) {
//                if (index == i) {
//                    temp = getEement(i);  //getElement TODO
//                    objectsArray[i] = null;
//                    break lab;
//                }
//            }
//        }
//        ensureArrayCapacity();
//        System.arraycopy(objectsArray, index + 1, objectsArray, index, size - index);
//        size--;
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
        objectsArray = ensureToReduce();
        for (int i = 0; i < objectsArray.length; i++) {
            System.out.print(objectsArray[i] + " ");
        }
    }

    private Object [] ensureToReduce() {
//        Object[] newObjectArray = new Object[size];
////        System.arraycopy(objectsArray, 0, newObjectArray, 0, size);
////        return (T[]) (objectsArray = newObjectArray);
        if (size  < objectsArray.length && size > 3) {
            return Arrays.copyOf(objectsArray, size);
        }
        else {
            return objectsArray;
        }
    }

    private void ensureArrayCapacity() {
        if (size <= objectsArray.length - 1) {
            return;
        }
        Object[] newArray = new Object[size * 3 / 2];
        System.arraycopy(objectsArray, 0, newArray, 0, objectsArray.length);
        objectsArray = newArray;
    }
@SuppressWarnings("uncheked")
    private T getEement(int index) {
        return  (T) objectsArray[index];  // what mean unchecked cast??
    }

    private void validateIndex(int index) {
        if (index >= 0 && index <= size){
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
}
