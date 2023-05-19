package Bai11.TrienKhaiQueueSuDungDanhSachLienKetVong;

public class Test {
    public static void main(String[] args) {
        QueueUsingCircularLinkedList test=new QueueUsingCircularLinkedList(1);
        test.enQueue(2);
        test.enQueue(3);
        test.enQueue(4);
        test.enQueue(5);
        test.enQueue(6);
        test.enQueue(7);
        test.enQueue(8);
        test.displayQueue();
    }
}
