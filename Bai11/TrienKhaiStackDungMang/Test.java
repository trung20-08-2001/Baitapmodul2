package Bai11.TrienKhaiStackDungMang;

public class Test {
    public static void main(String[] args) {
        MyGenericStack<Integer> stackInt = new MyGenericStack<>();
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        stackInt.push(4);
        System.out.print("Vị trí cuối:");
        System.out.println(stackInt.pop());
        System.out.print("Vị trí cuối sau xóa:");
        System.out.println(stackInt.peek());
        System.out.println("Vị tí của 2: "+stackInt.search(2));
        stackInt.isEmpty();
    }
}
