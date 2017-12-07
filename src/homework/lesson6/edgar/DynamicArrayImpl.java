package homework.lesson6.edgar;
import homework.lesson6.edgar.util.DynamicArray;

public class DynamicArrayImpl implements DynamicArray {
    private static final int DEFAULT_SIZE = 16;

    private Object[] objectsArray;  // variables should start with small later
    private int size;

    DynamicArrayImpl() {
        this(DEFAULT_SIZE);
    }

    DynamicArrayImpl(int capacity) {
        this.objectsArray = new Object[capacity];
        this.size = 0;
    }

    @Override
    public int size() {
//        if (isEmpty()) {  TODO: We don't need to check anything. Just return size field value.
//            return 0;
//        }
        return size;
    }

    @Override
    public boolean isEmpty() {
//        boolean b = true;
//        for (int i = 0; i < objectsArray.length; i++) {
//            if (objectsArray[i] != null) {
//                b = false;
//            }
//        }
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
//        boolean contains = false;
//        for (int i = 0; i < objectsArray.length; i++) {
//            if (o.equals(objectsArray[i])) {
//                contains = true;
//                break;
//            }
//        }
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(Object o) {
//        int index = -1;
        if(o == null) {      //     To avoid NullPointerException
            for (int i = 0; i < objectsArray.length; i++) {
                if (objectsArray[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < objectsArray.length; i++) {
                if (o.equals(objectsArray[i])) {
                    return i;
//                break;
                }
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) { //TODO : see the changes on indexOf method and do the same for this method
        int lastIndex = -1;
        for (int i = 0; i < objectsArray.length; i++) {
            if (o.equals(objectsArray[i])) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public Object get(int index) {
        //Validation of index argument
        return objectsArray[index];
    }

    @Override
    public Object set(int index, Object element) {
        if (index == DEFAULT_SIZE) {
            enlargeArray();
        }
        size++;
        Object oldValue = objectsArray[index];
        this.objectsArray[index] = element;
        return oldValue;
    }

    @Override
    public boolean add(Object e) {
        //TODO ensure capacity
        objectsArray[size++] = e;
        return true; // In this class(implementation) we return true.
    }

    @Override
    public void add(int index, Object element) {
        //1. Validation for index
        //2. Ensure capacity
        //3. insert the 'element' into the objectsArray on 'index' location.
        size++;

    }

    @Override
    public Object remove(int index) {
        //1. Validation for index
        Object removedValue = objectsArray[size];
        //remove the element by the specified "index"
        size--;
        return removedValue;
    }

    @Override
    public boolean remove(Object o) {
        //1. call indexOf method, and if indexOf is negative then nothing to remove, just return false, else use remove(int index) method

        return false;
    }

    public void printArray() {
        for (int i = 0; i < objectsArray.length; i++) {
//            if (objectsArray[i] != null) {
//                System.out.print(objectsArray[i] + " ");
//            }
            System.out.print(objectsArray[i] + " ");
        }
    }

    private void enlargeArray() {
        if (size < objectsArray.length - 1) {
            return;
        }
        Object[] newArray = new Object[size * 3 / 2];
        System.arraycopy(objectsArray, 0, newArray, 0, objectsArray.length);
        objectsArray = newArray;
    }

}
