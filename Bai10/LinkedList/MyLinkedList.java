package Bai10.LinkedList;

public class MyLinkedList {
    private int numberNodes=0;
    private Node head;

    public MyLinkedList(Object object) {
        head = new Node(object);
        numberNodes++;
    }

    private class Node {
        Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(Object data, int index) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index -1&& temp.next  != null; i++) {
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new Node(data);
        temp.next.next=holder;
        numberNodes++;
    }

    public void addFist(Object data){
        Node temp=head;
        head=new Node(data);
        head.next=temp;
        numberNodes++;
    }

    public Object get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    public void printList(){
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }



    public int getNumberNodes() {
        return numberNodes;
    }

    public void setNumberNodes(int numberNodes) {
        this.numberNodes = numberNodes;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
