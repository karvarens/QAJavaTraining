package homework.lesson6.edgar;
import homework.lesson6.edgar.util.DynamicArray;

public class UseDynamicArray implements DynamicArray {
    private static final int DEFAULT_SIZE = 16;
    private int size = 0;
    private Object[] ObjectsArray;

    UseDynamicArray() {
        this(DEFAULT_SIZE);
    }

    UseDynamicArray(int capacity) {
        this.ObjectsArray = new Object[capacity];
        this.size = 0;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean b = true;
        for (int i = 0; i < ObjectsArray.length; i++) {
            if (ObjectsArray[i] != null) {
                b = false;
            }
        }
        return b;
    }

    @Override
    public boolean contains(Object o) {
        boolean contains = false;
        for (int i = 0; i < ObjectsArray.length; i++) {
            if (o.equals(ObjectsArray[i])) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        for (int i = 0; i < ObjectsArray.length; i++) {
            if (ObjectsArray[i].equals(o)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < ObjectsArray.length; i++) {
            if (o.equals(ObjectsArray[i])) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public Object get(int index) {
        return ObjectsArray[index];
    }

    @Override
    public Object set(int index, Object element) {
        if (index == DEFAULT_SIZE) {
            enlargeArray();
        }
        size++;
        this.ObjectsArray[index] = element;
        return ObjectsArray;
    }

    @Override
    public boolean add(Object e) {
        return false;
    }

    @Override
    public void add(int index, Object element) {

        size++;

    }

    @Override
    public Object remove(int index) {
        size--;
        return null;
    }

    @Override
    public boolean remove(Object o) {
        size--;
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

    private void enlargeArray() {
        if (size < ObjectsArray.length - 1) {
            return;
        }
        Object[] newArray = new Object[size * 3 / 2];
        System.arraycopy(ObjectsArray, 0, newArray, 0, ObjectsArray.length);
        ObjectsArray = newArray;
    }

}
