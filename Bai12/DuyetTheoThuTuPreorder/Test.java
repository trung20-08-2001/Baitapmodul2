package Bai12.DuyetTheoThuTuPreorder;

public class Test {
    public static void main(String[] args) {
        PreorderBST<Integer> test=new PreorderBST<>();
        test.insert(3);
        test.insert(1);
        test.insert(7);
        test.preorder();
    }
}
