package Bai10.TrienKhaiCacPhuongThucCuaLinkedList;

public class LinkedList<E> {

    private Node head;

    private int numNodes=0;

    public LinkedList() {
    }

    public LinkedList(E object) {
        head = new Node(object);
        numNodes++;
    }

    private class Node {
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

    }

    public void addLast(E object) {
        Node temp = head;
        Node newNode = new Node(object);
        if (head == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        numNodes++;
    }

    public void addFist(E object) {
        Node temp = head;
        head = new Node(object);
        head.next = temp;
        numNodes++;
    }

    public void add(int index, E object) {
        Node newNode = new Node(object);
        Node temp = head;
        if (index > numNodes || index < 0) {
            throw new IndexOutOfBoundsException("Index không hợp lệ.");
        } else if (index == 0) {
            addFist(object);
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    public void removeIndex(int index) {
        if (index >=numNodes || index < 0) {
            throw new IndexOutOfBoundsException("Index không hợp lệ.");
        } else if (index == 0) {
            head=head.next;
        } else {
            Node temp = head;
            Node previous=null;
            for (int i = 0; i < index; i++) {
                previous=temp;
                temp = temp.next;
            }
            previous.next=temp.next;
        }
        numNodes--;
    }


    public E removeObject(E object){
        Node temp=head;
        Node previous;
        boolean check=false;
        if(temp.data==object){
            check=true;
            removeIndex(0);
        }else {
            previous=temp;
            temp=temp.next;
            while (temp != null) {
                if (temp.data == object) {
                    previous.next=temp.next;
                    numNodes--;
                    check=true;
                }
                if (previous.next != temp.next){
                    previous = temp;
                }
                temp = temp.next;
            }
        }
        if(!check){
            throw new UnsupportedOperationException(object+" không có trong danh sách.");
        }
        return object;
    }

    public int getSize(){
        return numNodes;
    }

    public void printList(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public boolean contains(E object){
        Node temp=head;
        while (temp!=null){
           if( temp.data==object){
               return true;
           }
           temp=temp.next;
        }
        return false;
    }

    public int indexOf(E object ){
        Node temp=head;
        for(int i=0;i<numNodes;i++){
            if(temp.data==object){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }
}
