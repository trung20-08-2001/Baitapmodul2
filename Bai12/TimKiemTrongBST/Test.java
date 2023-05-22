package Bai12.TimKiemTrongBST;

public class Test {
    public static void main(String[] args) {
        FindNodeOfBST<Integer> test=new FindNodeOfBST<>();
        test.insert(3);
        test.insert(56);
        test.insert(8);
        test.insert(12);
        test.insert(78);
        test.insert(12);
        test.insert(23);
        if(test.findElement(30)){
            System.out.println("Có trong danh sách");
        }else{
            System.out.println("Không có trong danh sách.");
        }
    }
}
