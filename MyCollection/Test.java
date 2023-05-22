package MyCollection;


public class Test {
    public static void main(String[] args) {
        MyQueueLinkedList<Integer> queue = new MyQueueLinkedList<>();
        BinarySearchTree<Integer> integers=new BinarySearchTree<>();
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        System.out.println(queue.remove());

        integers.insert(1);
        integers.insert(10);
        integers.insert(23);
        integers.insert(26);
        integers.insert(15);
        integers.insert(13);
        integers.insert(99);
        integers.insert(3);
        System.out.println("---------------Trước xóa------------");
        integers.inorder();
        integers.deleteNode(10);
        System.out.println("--------------Sau xóa---------------");
        integers.inorder();


    }

}
