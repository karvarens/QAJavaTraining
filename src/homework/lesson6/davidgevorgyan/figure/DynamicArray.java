package homework.lesson6.davidgevorgyan.figure;

import java.util.Arrays;

public class DynamicArray {
    /**
     * Removed an item from array of objects
     * @param objects array of objects
     * @param index index to be removed
     * @return removed object
     */

    public static Object removeFromArray(Object [] objects, int index){
        int size = countNotNullValues(objects);
        Object temp = objects[index];
        for (int i = index; i < size - 1; i++) {
            objects[i] = objects [i + 1];
        }

        objects[size-1] = null;
        return temp;
    }

    /**
     * Add an array item to the of an array
     * @param objects Array name
     * @param object item which will be added to the end of an array
     */
    public static Object [] appendToArray(Object [] objects, Object object){
        int size = countNotNullValues(objects);
        objects = enlargeArraySize(size, objects);
        objects[size] = object;
        return objects;
    }

    /**
     * Increases the size of array
     * @param objects
     */
    public static Object [] enlargeArraySize(int size, Object [] objects) {
        if (size >= objects.length - 1) {
            objects = Arrays.copyOf(objects, objects.length * 3 / 2);
            return objects;
        }
        return objects;
    }



    /**
     * Reduces the sise of an array
     * @param objects array
     * @param desiredSize acceptable size
     */
    public static Object [] ensureToReduce(Object [] objects, int desiredSize) {
        int size = countNotNullValues(objects);
        if (desiredSize <= size || desiredSize >= objects.length) {
            throw new IllegalArgumentException();
        }
        Object [] newValues = Arrays.copyOf(objects, desiredSize);
        return newValues;
    }

    /**
     * Count not null values in array
     * @param objects
     * @return count of not null values
     */
    public static int countNotNullValues(Object[] objects){
        int i = 0;
        for (; i < objects.length; i++) {
            if (objects[i] == null)
                break;
        }
        return i;
    }

    /**
     * Takes an array item an puts it at the end of array
     * @param objects Array name
     * @param index which array will be move to the end
     */
    public static Object[] moveToEnd(Object [] objects, int index){
        int size = countNotNullValues(objects);
        if (index > objects.length || index < 0 || size == 0 ) {
            throw new IllegalArgumentException();
        }
        objects = appendToArray(objects, removeFromArray(objects, index));

        return objects;
    }

}
