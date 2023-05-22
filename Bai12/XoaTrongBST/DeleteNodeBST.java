package Bai12.XoaTrongBST;

import Bai12.CaiDatCayTimKiemNhiPhan.BinarySearchTree;
import Bai12.CaiDatCayTimKiemNhiPhan.TreeNode;

public class DeleteNodeBST<E extends Comparable<E>> extends BinarySearchTree {

    public TreeNode<E> findMin(TreeNode<E> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public TreeNode<E> deleteNode(TreeNode<E> root, E element) {
        if (root == null) return null;
        if (element.compareTo(root.element) < 0) {
            root.left = deleteNode(root.left, element);
        } else if (element.compareTo(root.element) > 0) {
            root.right = deleteNode(root.right, element);
        }else{
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            TreeNode<E> minRight=findMin(root.right);
            root.element=minRight.element;
            root.right=deleteNode(root.right,minRight.element);
        }
        return root;
    }


    public void deleteNode(E element){
        deleteNode( root,element);
    }
}



