package homework.lesson6.davidgevorgyan.figure;

import java.util.Arrays;

public class DynamicArray {
    //TODO improve constructor. Add validation and default value

    private Object objects[];
    private int size;

    DynamicArray(int capacity){
        this.objects = new Object[capacity];
        size = 0;
    }

    public Object[] getObjects() {
        return objects;
    }

    public Object get(int index) {
        return objects[index];
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public void add(Object object) {

    }

    public void add(Object object, int index) {
        size++;
    }

    public void setObject(Object object, int index) {
        int temp = countNotNullValues();
        this.objects[temp] = object;
    }


    /**
     * Removed an item from array of objects
     * @param index index to be removed
     * @return removed object
     */
    public Object remove (int index){

        Object temp = objects[index];
        for (int i = index; i < size; i++) {
            objects[i] = objects [i + 1];
        }
        objects[size] = null;
        size--;
        return temp;
    }

    /**
     * Increases the size of array
     */
    private Object [] enlargeArraySize() {
        return Arrays.copyOf(objects, objects.length * 3 / 2);
    }



    /**
     * Reduces the sise of an array
     */
    private Object [] ensureToReduce() {
        return Arrays.copyOf(objects, objects.length / 2);
    }

    /**
     * Count not null values in array
     * @return count of not null values
     */
    public int countNotNullValues(){
        int i = 0;
        for (; i < objects.length; i++) {
            if (objects[i] == null)
                break;
        }
        if (i == objects.length - 1) {
            objects = enlargeArraySize();
        }
        if (i * 3 < objects.length && i > 3)
            objects = ensureToReduce();

        return i;
    }

    /**
     * Takes an array item an puts it at the end of array

     * @param index which array will be move to the end
     */
    public void moveToEnd(int index){
        int size = countNotNullValues();
        if (index > objects.length || index < 0 || size == 0 ) {
            throw new IllegalArgumentException();
        }
       // setObject(remove(index));

    }

}
