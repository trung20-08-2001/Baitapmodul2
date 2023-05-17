package Bai10.TrienKhaiCacPhuongThucCuaLinkedList;

public class Test {
    public static void main(String[] args) {
            LinkedList<Integer> listint=new LinkedList<>();
            listint.add(0,8);
            System.out.println("size: "+listint.getSize());
            listint.addLast(3);
            listint.add(1,0);
            listint.add(2,9);
            listint.add(2,9);
            listint.addLast(9);
            listint.add(2,9);
            listint.addFist(5);
            System.out.print("Danh sách: ");
            listint.printList();
            System.out.println();
            System.out.println("size: "+listint.getSize());
            listint.removeIndex(3);
            listint.removeObject(9);
            System.out.print("\nDanh sách sau xóa: ");
            listint.printList();
            System.out.println();
            System.out.println("size: " +listint.getSize());
            System.out.println("9 có trong danh sách không: "+listint.contains(9));
            System.out.println("4 có trong danh sách không: "+listint.contains(4));
            System.out.println("Vị trí của 3 "+listint.indexOf(3));
            System.out.println("Vị trí của 9 "+listint.indexOf(9));
            System.out.println("Vị trí của 8 "+listint.indexOf(8));

    }


}
