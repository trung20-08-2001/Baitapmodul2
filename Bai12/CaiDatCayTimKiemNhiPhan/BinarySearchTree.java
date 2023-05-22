package Bai12.CaiDatCayTimKiemNhiPhan;

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

    public void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }



    public void inorder() {
        inorder(root);
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

}
