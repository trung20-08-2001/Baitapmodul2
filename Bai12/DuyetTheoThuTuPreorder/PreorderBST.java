package Bai12.DuyetTheoThuTuPreorder;

import Bai12.CaiDatCayTimKiemNhiPhan.BinarySearchTree;
import Bai12.CaiDatCayTimKiemNhiPhan.TreeNode;

public class PreorderBST<E> extends BinarySearchTree {

    public void preorder(TreeNode<E> root){
        if(root==null) return;
        System.out.print(root.element+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void preorder(){
        preorder(root);
    }
}
