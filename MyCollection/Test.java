package MyCollection;


public class Test {
    public static void main(String[] args) {
        MyQueueLinkedList<Integer> queue = new MyQueueLinkedList<>();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.remove());


    }

}
