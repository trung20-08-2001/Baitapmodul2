package Bai12.TimKiemTrongBST;

import Bai12.CaiDatCayTimKiemNhiPhan.BinarySearchTree;
import Bai12.CaiDatCayTimKiemNhiPhan.TreeNode;

public class FindNodeOfBST<E extends Comparable> extends BinarySearchTree {
    public boolean findElement(E element){
        if(root==null) return false;
        TreeNode<E> current=root;
        while (current!=null){
            if(element.compareTo(current.element)<0){
                current=current.left;
            }else if(element.compareTo(current.element)>0) {
                current = current.right;
            }else{
                return true;
            }
        }
        return false;
    }
}
