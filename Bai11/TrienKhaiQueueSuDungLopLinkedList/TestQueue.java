package Bai11.TrienKhaiQueueSuDungLopLinkedList;

public class TestQueue{
    public static void main(String[] args) {
        MyLinkedListQueue<String> queueString = new MyLinkedListQueue<>();
        MyLinkedListQueue<Integer> queueInt=new MyLinkedListQueue<>();
        queueString.enqueue("a");
        queueString.enqueue("s");
        queueString.enqueue("d");
        queueString.enqueue("f");
        queueString.enqueue("g");
        queueString.enqueue("h");
        queueString.enqueue("j");
        while (queueString.getTail() != null)
            System.out.print(queueString.dequeue().key+" ");
        System.out.println("\n---------------------");

        queueInt.enqueue(1);
        queueInt.enqueue(2);
        queueInt.enqueue(3);
        queueInt.enqueue(4);
        queueInt.enqueue(5);
        queueInt.enqueue(6);
        queueInt.enqueue(7);
        while (queueInt.getTail()!=null)
            System.out.print(queueInt.dequeue().key+" ");
    }
}
