package Bai11.TrienKhaiQueueSuDungMang;

public class Test {
    public static void main(String[] args) {
        MyQueue<Integer>  queue=new MyQueue<>();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        System.out.println("Size: "+queue.getSize());
        while (!queue.isQueueEmpty()){
            System.out.println(queue.dequeue());
        }
        System.out.println("Size: "+queue.getSize());
//        System.out.println(queue.isQueueFull());
    }
}
