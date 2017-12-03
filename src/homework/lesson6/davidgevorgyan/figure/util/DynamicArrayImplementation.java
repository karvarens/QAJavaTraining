package homework.lesson6.davidgevorgyan.figure.util;

import java.util.Arrays;

public class DynamicArrayImplementation<T> implements homework.lesson6.figure.util.DynamicArray<T> {
    private Object objects[];
    private int size;
    private final static int DEFAULT_SIZE = 16;

    public DynamicArrayImplementation(){
        this.objects = new Object[DEFAULT_SIZE];
    }

    public DynamicArrayImplementation(int capacity){
        this.objects = new Object[capacity];
    }



    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(T object){
        return indexOf(object) != -1;
    }


    public int indexOf(T object){
        int i = -1;
        for (int j = 0; j < size; j++) {
            if( objects[j] == object) {
                i = j;
                break;
            }
        }
        return i;
    }

    public int lastIndexOf(T object) {
        int i = -1;
        for (int j = size; j > -1; j--) {
            if( objects[j] == object) {
                i = j;
                break;
            }
        }
        return i;
    }

    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Can't get item");
        }
        return (T)objects[index];
    }

    public T set(int index, T object) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Can't set item");
        }
        T temp = (T) objects[index];
        objects[index] = object;
        return temp;
    }

    public boolean add(Object object) {
        objects = enlargeArraySize();
        this.objects[size] = object;
        size++;
        return true;
    }

    public void add(int index, T object) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Can't add item");
        }
        objects = enlargeArraySize();
        T temp;
        for (int i = index; i < size; i++) {
            temp = set(i, object);
            object = temp;
        }
        objects[size] = object;
        size++;
    }

    public T remove (int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Can't remove item");
        }
        T temp = (T) objects[index];
        System.arraycopy(objects, index + 1, objects, index, size - index);
        objects[size] = null;
        size--;
        if (size * 3 < objects.length && size > 3) {
            objects = ensureToReduce();
        }
        return temp;
    }

    public boolean remove(T object) {
        int temp = indexOf(object);
        if ( temp != -1){
            remove(temp);
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * Increases the size of array
     */
    private Object [] enlargeArraySize() {
        if (size == objects.length - 1) {
            return Arrays.copyOf(objects, objects.length * 3 / 2);
        }
        else {
            return objects;
        }
    }


    /**
     * Reduces the sise of an array
     */
    private Object [] ensureToReduce() {
        return Arrays.copyOf(objects, objects.length / 2);
    }


    /**
     * Takes an array item an puts it at the end of array

     * @param index which array will be move to the end
     */
    public void moveToEnd(int index) throws Exception {
        if (index > objects.length || index < 0 || size == 0 ) {
            throw new Exception("Demo exception: Can't move item"); //I understand that it's not necessary to handle runtime exceptions. Just putted it here to test
        }
        add(remove(index));

    }

}
