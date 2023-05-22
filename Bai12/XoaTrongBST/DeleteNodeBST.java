package Bai12.XoaTrongBST;

import Bai12.CaiDatCayTimKiemNhiPhan.BinarySearchTree;
import Bai12.CaiDatCayTimKiemNhiPhan.TreeNode;

public class DeleteNodeBST<E extends Comparable<E>> extends BinarySearchTree {

    public TreeNode<E> findMin(TreeNode<E> node) {
        if (node == null) return node;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void delete(E e) {
        if (root == null) return;
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (e != current.element && current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            }
        }
        if (current.left == null && current.right == null) {
            if ((current.element.compareTo(parent.element)) < 0) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.left == null) {
            if ((current.element.compareTo(parent.element)) < 0) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if ((current.element.compareTo(parent.element)) < 0) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else {
            BinarySearchTree<E> newBST=new BinarySearchTree<>();
            TreeNode<E> nodeRightOfCurrent=current.right;
            TreeNode<E> nodeLeftOfCurrent=current.left;

        }
    }
}



