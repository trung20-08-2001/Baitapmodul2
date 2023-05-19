package Bai11.TrienKhaiQueueSuDungMang;

public class MyQueue<T> {
    private static final int CAPACITY = 10;
    private static int size;
    private T[] queueArray;

    public MyQueue() {
        queueArray = (T[]) new Object[CAPACITY];
    }

    public boolean isQueueFull() {
        if (size == CAPACITY) {
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void ensureCapacity() {
        T[] newQueueArray = (T[]) new Object[queueArray.length * 2];
        for (int i = 0; i < size; i++) {
            newQueueArray[i] = queueArray[i];
        }
        queueArray = newQueueArray;
    }

    public void enqueue(T object) {
        if (isQueueFull()) {
            ensureCapacity();
        }
        queueArray[size]=object;
        size++;
    }

    public T dequeue(){    ///lấy và xóa phần tử đầu tiên
        T temp;
        if(isQueueEmpty()){
            throw new IndexOutOfBoundsException("Hàng đợi trống.");
        }else{
            temp=queueArray[0];
            T[] newQueueArray=(T[])new Object[queueArray.length];
            for(int i=0;i<size;i++){
                newQueueArray[i]=queueArray[i+1];
            }
            queueArray=newQueueArray;
        }
        size--;
        return temp;
    }

    public int getSize(){
        return size;
    }

}
