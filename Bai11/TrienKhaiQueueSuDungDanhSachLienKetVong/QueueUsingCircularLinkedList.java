package Bai11.TrienKhaiQueueSuDungDanhSachLienKetVong;

public class QueueUsingCircularLinkedList {
    private Node font;
    private int numberNode;
    private Node rear;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object object) {
            this.data = object;
        }
    }

    public QueueUsingCircularLinkedList(Object data) {
        font = new Node(data);
        rear=font;
        numberNode++;
    }

    public boolean isEmpty() {
        if (numberNode == 0) {
            return true;
        }
        return false;
    }

    public void enQueue(Object object) {
        Node newNode=new Node(object);
        if (isEmpty()) {
            font =rear = newNode;
            newNode.next=font;
        } else {
            rear.next=newNode;
            rear=newNode;
            rear.next=font;
        }
        numberNode++;
    }

    public Object deQueue(){
        Object node=font.data;
        if(isEmpty()){
            return null;
        }
        if(numberNode==1) {
            font=rear=null;
        }else{
            font = font.next;
            rear.next=font;
            return font;
        }
        numberNode--;
        return node;
    }

    public void displayQueue(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Danh sách trống.");
        }else {
            Node temp = font;
            do {
                System.out.println(temp.data);
                temp = temp.next;
            }while (temp != font);
        }
    }


}
