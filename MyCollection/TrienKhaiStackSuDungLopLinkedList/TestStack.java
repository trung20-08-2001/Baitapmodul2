package Bai11.TrienKhaiStackSuDungLopLinkedList;

public class TestStack {
    public static void main(String[] args) {
        MyGenericStack<Integer> stackint = new MyGenericStack<>();
        MyGenericStack<String> stackString=new MyGenericStack<>();
        stackint.push(5);
        stackint.push(4);
        stackint.push(3);
        stackint.push(2);
        stackint.push(1);
        stackint.push(0);
        System.out.println("Size before: "+stackint.size());
        while(!stackint.isEmpty()) {
            System.out.println("element fist: " + stackint.pop());
        }
        System.out.println("Size after: "+stackint.size());

        System.out.println("--------------------");
        stackString.push("a");
        stackString.push("b");
        stackString.push("c");
        stackString.push("d");
        stackString.push("e");
        stackString.push("f");
        System.out.println("Size before: "+stackString.size());
        while(!stackString.isEmpty()) {
            System.out.println("element fist: " + stackString.pop());
        }
        System.out.println("Size after: "+stackString.size());
    }

}
