package Bai12.DuyetTheoThuTuPostorderTrongBinarySearchTree;


public class PostorderBST<E extends Comparable<E>> {
    private int size;
    private TreeNode<E> root;

    public PostorderBST() {
    }

    public PostorderBST(E[] object) {
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);

        }
    }


    public class TreeNode<E> {
        private TreeNode<E> left;
        private TreeNode<E> right;
        private E element;

        public TreeNode(E e) {
            this.element = e;
        }
    }

    public void insert(E e) {
        if (root == null) {
            root = new TreeNode<>(e);
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
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<>(e);
            } else {
                parent.right = new TreeNode<>(e);
            }
        }
        size++;
    }


    public void postorderTraversal(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.element + " ");

    }

    public void postorderTraversal(){
        postorderTraversal(root);
    }

    public int getSize(){
        return size;
    }

}
