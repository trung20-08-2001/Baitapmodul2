package Bai12.DuyetTheoThuTuPostorderTrongBinarySearchTree;

public class Test {
    public static void main(String[] args) {
        PostorderBST<Integer> postorderBST=new PostorderBST<>();
        postorderBST.insert(10);
        postorderBST.insert(5);
        postorderBST.insert(3);
        postorderBST.insert(7);
        postorderBST.insert(15);
        postorderBST.insert(20);
        postorderBST.postorderTraversal();
    }
}
