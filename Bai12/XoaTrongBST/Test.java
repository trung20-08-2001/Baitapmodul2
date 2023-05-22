package Bai12.XoaTrongBST;

public class Test {
    public static void main(String[] args) {
        DeleteNodeBST<Integer> test=new DeleteNodeBST<>();
        test.insert(2);
        test.insert(4);
        test.insert(6);
        test.insert(9);
        test.insert(12);
        test.insert(7);
        test.insert(12);
        test.inorder();
        System.out.println("------Sau xóa---------");
        test.deleteNode(6);
        test.inorder();
    }
}
