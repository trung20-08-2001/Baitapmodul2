package Bai10.LinkedList;

public class MyListTest {
    public static void main(String[] args) {
        System.out.println("----------TEST lINKED LIST----------");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFist(1);
        myLinkedList.add(2, 2);
        myLinkedList.add(3, 30);
        myLinkedList.add(4, 12);
        myLinkedList.add(5, 9);
        myLinkedList.add(3, 2);
        System.out.println("element 1 is "+myLinkedList.get(1));
        System.out.println("element 4 is "+myLinkedList.get(4));
        System.out.println("element 2 is "+myLinkedList.get(2));
        System.out.print("Danh sách: ");
        myLinkedList.printList();
    }
}
