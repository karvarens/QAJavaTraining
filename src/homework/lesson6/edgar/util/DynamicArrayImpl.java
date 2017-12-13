package homework.lesson6.edgar.util;

import java.util.Arrays;

public class DynamicArrayImpl implements DynamicArray {


    private static final int DEFAULT_SIZE = 16;
    private int size = 0;
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
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(Object o) {

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
    public int lastIndexOf(Object o) throws IndexOutOfBoundsException {
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
    public Object get(int index) {
        if (index >= 0 && index <= ObjectsArray.length) {
            return ObjectsArray[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Object set(int index, Object element) {
        if (index >= 0 && index <= ObjectsArray.length) {
            this.ObjectsArray[index] = element;
            return ObjectsArray;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean add(Object e) {
        ensureArrayCapacity();
        ObjectsArray[size++] = e;
        return true;
    }

    @Override
    public void add(int index, Object element) {
        Object temp = null;
        lab:
        while (index >= 0 && index <= size) {
            ensureArrayCapacity();
            for (int i = index; i <= size; i++) {
                temp = ObjectsArray[index];
                ObjectsArray[index] = element;
                break lab;
            }
        }

        for (int j = ObjectsArray.length - 1; j > index; j--) {
            if (ObjectsArray[j] != null) {
                swap(ObjectsArray, j, j + 1);
            }
        }
        ObjectsArray[index + 1] = temp;
        size++;
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException();
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
    public Object remove(int index) {
        Object temp = null;
        lab:
        while (index >= 0 && index <= size) {
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    temp = get(i);
                    ObjectsArray[i] = null;
                    break lab;
                }
            }
        }
        ensureArrayCapacity();
        System.arraycopy(ObjectsArray,index + 1,ObjectsArray,index,size - index);
        size--;
        return temp;
    }

    @Override
    public boolean remove(Object o) {
        if (indexOf(o) != -1){
            remove(indexOf(o));
            size--;
            return true;
        }
        return false;
    }

    public void printArray() {
        for (int i = 0; i < ObjectsArray.length; i++) {
//            if (ObjectsArray[i] != null) {
//                System.out.print(ObjectsArray[i] + " ");
//            }
            System.out.print(ObjectsArray[i] + " ");
        }
    }

    private Object [] ensureToReduce(){
        int counter = 0;
        for (int i = ObjectsArray.length; i > 0; i--) {
            if (get(i).equals(null)){
                counter++;
            }
        }
        return Arrays.copyOf(ObjectsArray,ObjectsArray.length - counter);
    }
    private void ensureArrayCapacity() {
        if (size <= ObjectsArray.length - 1) {
            return;
        }
        Object[] newArray = new Object[size * 3 / 2];
        System.arraycopy(ObjectsArray, 0, newArray, 0, ObjectsArray.length);
        ObjectsArray = newArray;
    }
}
