package Bai11.TrienKhaiStackDungMang;


public class MyGenericStack<T> {
    private static final int INITIAL_SIZE = 10;
    private T[] elements;
    private int size;

    public MyGenericStack() {
        elements = (T[]) new Object[INITIAL_SIZE];
    }

    public void push(T element) {
        T[] elements = ensureCapacity();
        elements[size] = element;
    }

    private T[] ensureCapacity() {
        T[] newElement = (T[]) new Object[size * 2 + 1];
        if (isFull()) {
            for (int i = 0; i < size; i++) {
                newElement[i] = elements[i];
            }
            elements = newElement;
        }
        return elements;
    }

    public T pop() {
        isEmpty();
        T output = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return output;

    }

    public T peek() {
        isEmpty();
        return elements[size - 1];
    }

    public boolean isFull(){
        if(size== elements.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Stack rỗng.");
        }
        return false;
    }

    public int search(T element) {
        isEmpty();
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int getSize(){
        return size;
    }
}
