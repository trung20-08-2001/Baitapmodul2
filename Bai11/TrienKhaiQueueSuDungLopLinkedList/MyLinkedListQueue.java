package Bai11.TrienKhaiQueueSuDungLopLinkedList;

public class MyLinkedListQueue<E> {
    private Node head;
    private Node tail;
    public MyLinkedListQueue(){
        this.head=null;
        this.tail=null;
    }

    public void enqueue(E key){
        Node temp=new Node(key);
        if(this.tail==null){
            this.head=this.tail=temp;
        }
        this.tail.next=temp;
        this.tail=temp;
    }


    public Node dequeue(){
        if(this.head==null){
           return null;
        }
        Node temp=this.head;
        this.head=this.head.next;
        if(this.head==null){
            this.tail=null;
        }
        return temp;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
