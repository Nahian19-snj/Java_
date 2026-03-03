import java.util.Arrays;

/******************************************
 *  Author : Nahian Karim   
 *  Created On : Thu May 08 2025
 *  File : ArrayList.java
 *******************************************/

public class MyArrayList<T> {
    private static final int CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[CAPACITY];
        size= 0 ;
    }

    public int getSize() {
        return size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElement(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        elements[index] = element;
    }

    public void add(T element) throws CapacityExtendException {
        if (size >= CAPACITY) {
            throw new CapacityExtendException("Array is full.Cannot add more");
        }
        elements[size++] = element;
    }

    public void remove() throws EmptyArrayException {
        if (size > 0) {
            elements[--size] = null;
        } else {
            throw new EmptyArrayException("Array is empty. Nothing to remove.\"");
        }
    }

    @Override
    public String toString() {
        return "MyArrayList [elements=" + Arrays.toString(elements) + ", size=" + size + "]";
    }
    

    }

