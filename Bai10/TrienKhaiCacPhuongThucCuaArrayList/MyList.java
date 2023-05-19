package Bai10.TrienKhaiCacPhuongThucCuaArrayList;


public class MyList<E> {
    private int size;
    static final int DEFAULT_CAPACITY = 10;
    E[] elements = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int capacity) {
        Object[] elements = new Object[capacity];
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size] = element;
        size++;
    }

    public void add(int index, E element) {
        checkIndex(index);
        if (size == elements.length) {
            ensureCapacity();
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }


    public E remove(int index) {
        checkIndex(index);
        E element = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size - 1] = null;
        size--;
        return (E) element;
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
        for (int i = 0; i < size - 1; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity() {
        E[] newElements = (E[]) new Object[elements.length * 2 + 1];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index không hợp lê.");
        }
    }

    public E get(int index) {
        checkIndex(index);
        return elements[index];
    }

    public E[] clear() {
        size=0;
        return elements=(E[]) new Object[DEFAULT_CAPACITY];
    }

    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(elements[i]+" ");
        }
    }
}
