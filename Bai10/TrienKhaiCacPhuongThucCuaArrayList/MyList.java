package Bai10.TrienKhaiCacPhuongThucCuaArrayList;


public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    E[] elements = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int capacity) {
        Object[] elements = new Object[capacity];
    }


    public void add(int index, E element) {
        checkIndex(index);
         if (index >= elements.length) {
            int newSize = elements.length * 2;
            E[] newElements = (E[]) new Object[newSize];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements[size++] = element;
            elements = newElements;
        } else {
            elements[size++] = element;
        }
    }

    public E remove(int index) {
        checkIndex(index);
        E element = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i + 1] = elements[i];
        }
        elements[size - 1] = null;
        size--;
        return (E) elements;
    }

    public int getSize() {
        return size;
    }

    public E[] clone() {
        E[] newElements = (E[]) new Object[size];
        for (int i = 0; i < size - 1; i++) {
            newElements[i] = elements[i];
        }
        return newElements;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size - 1; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }


    public int indexOf(E element) {
        int index = 0;
        for (int i = 0; i < size - 1; i++) {
            if (elements[i] == element) {
                index = i;
            }
        }
        return index;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            E[] newElements = (E[]) new Object[size * 2 + 1];
            for (int i = 0; i < size - 1; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index không hợp lê.");
        }
    }

    public E get(int index){
        checkIndex(index);
        return elements[index];
    }
    public E[] clear(){
        return (E[])new Object[DEFAULT_CAPACITY];
    }
}
