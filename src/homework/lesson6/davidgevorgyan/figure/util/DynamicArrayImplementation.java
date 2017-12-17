package homework.lesson6.davidgevorgyan.figure.util;

import java.util.Arrays;

public class DynamicArrayImplementation<T> implements DynamicArray<T> {
    enum Error {
        add("Can't add item"), remove("Can't remove item"), get("Can't get item"), set("Can't set item"), move("Can't move item");

        private String message;
        Error(String message) {
            this.message = message;
        }
    }

    private Object objects[];
    private int size;
    private final static int DEFAULT_SIZE = 16;

    public DynamicArrayImplementation(){
        this(DEFAULT_SIZE);
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
        if ( object == null)
        {
            for (int j = 0; j < size; j++) {
                if (objects[j] == null ) {
                    return j;
                }
            }
        }
        else {
            for (int j = 0; j < size; j++) {
                if (object.equals(objects[j])) {
                    return j;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(T object) {
        if ( object == null)
        {
            for (int j = size - 1; j > -1; j--) {
                if (objects[j] == null ) {
                    return j;
                }
            }
        }
        else {
            for (int j = size - 1; j > -1; j--) {
                if (object.equals(objects[j])) {
                    return j;
                }
            }
        }
        return -1;
    }

    public T get(int index) {
        isValid(index, true, Error.get);
        return getElement(index);
    }

    public T set(int index, T object) {
        isValid(index, true, Error.set);
        T temp = getElement(index);
        objects[index] = object;
        return temp;
    }

    public boolean add(Object object) {
        objects = enlargeArraySize();
        objects[size++] = object;
        return true;
    }

    public void add(int index, T object) {
        isValid(index, false, Error.add);
        objects = enlargeArraySize();
        System.arraycopy(objects, index, objects, index + 1, size - index);
        objects[index] = object;
        size++;
        System.out.println();
    }



    public T remove(int index) {
        isValid(index, false, Error.remove);
        T temp = getElement(index);
        System.arraycopy(objects, index + 1, objects, index, size - index);
        objects[size - 1] = null;
        size--;
        objects = ensureToReduce();
        return temp;
    }

    public boolean remove(T object) {
        if (indexOf(object) != -1){
            remove(indexOf(object));
            return true;
        }

        return false;
    }

    @SuppressWarnings("unchecked")
    private T getElement(int index) {
        return (T) objects[index];
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
     * Reduces the size of an array
     */
    private Object [] ensureToReduce() {
        if (size * 3 < objects.length && size > 3) {
            return Arrays.copyOf(objects, objects.length / 2);
        }
        else {
            return objects;
        }
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

    private void isValid(int index, boolean withSize, Error errorMessage){
        if (index < 0) {
            throw new IndexOutOfBoundsException(errorMessage.message);
        }
        if (withSize && index >= size) {
            throw new IndexOutOfBoundsException(errorMessage.message);
        }
        if (!withSize && index > size) {
            throw new IndexOutOfBoundsException(errorMessage.message);
        }

    }

}
