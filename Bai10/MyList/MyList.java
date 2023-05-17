package Bai10.MyList;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements=new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int size, Object[] element) {
        this.size = size;
        this.elements = element;
    }

    public void ensureCape() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCape();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i > size || i < 0) {
            throw new UnsupportedOperationException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElement() {
        return elements;
    }

    public void setElement(Object[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}