package MyCollection;

import Bai12.DuyetTheoThuTuPostorderTrongBinarySearchTree.PostorderBST;
import MyCollection.TreeNode;

public class BinarySearchTree<E extends Comparable<E>> {
    protected TreeNode<E> root;
    protected int size;

    public BinarySearchTree() {
    }

    public BinarySearchTree(E[] object) {
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);
        }
    }


    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    public TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    public void inorder(TreeNode<E> root) {      ///trái->gốc->phải
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    public void inorder() {
        inorder(root);
    }

    public void postorder(TreeNode<E> root) {     ///trái->phải->gốc
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    public void postorder(){
        postorder(root);
    }


    public void preorder(TreeNode<E> root){     ///gốc ->trái->phải
        if(root==null) return;
        System.out.print(root.element+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void preorder(){
        preorder(root);
    }


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


    public void deleteNode(E element){
        deleteNode( root,element);
    }

    public int getSize() {
        return size;
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<E> root) {
        this.root = root;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

