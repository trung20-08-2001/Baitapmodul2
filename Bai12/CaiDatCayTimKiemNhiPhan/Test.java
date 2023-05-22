package Bai12.CaiDatCayTimKiemNhiPhan;

import Bai12.LuyenTapDungArrayListVaLinkedList.Product;

public class Test {
    public static void main(String[] args) {
        BinarySearchTree<String> tree=new BinarySearchTree<>();
        BinarySearchTree<Integer> tree1=new BinarySearchTree<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        System.out.println("-------------Sort Name------------- ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());


        tree1.insert(6);
        tree1.insert(2);
        tree1.insert(4);
        tree1.insert(9);
        tree1.insert(5);
        tree1.insert(67);
        tree1.insert(12);
        tree1.insert(85);
        System.out.println("------------Sort Integer------------");
        tree1.inorder();

    }
}
