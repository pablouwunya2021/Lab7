package uvg.edu.gt;

import java.util.StringTokenizer;

public class BinaryTree<E extends Comparable<E>> {
    private TreeNode<E> root;

    public BinaryTree() {
        root = null;
    }

    // Método para insertar un elemento en el árbol
    public void insert(E data) {
        root = insertRec(root, data);
    }

    private TreeNode<E> insertRec(TreeNode<E> root, E data) {
        if (root == null) {
            root = new TreeNode<>(data);
            return root;
        }

        if (data.compareTo(root.data) < 0)
            root.left = insertRec(root.left, data);
        else if (data.compareTo(root.data) > 0)
            root.right = insertRec(root.right, data);

        return root;
    }

    // Método para recorrer el árbol en orden y producir la salida
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(TreeNode<E> root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print("(" + root.data + ")");
            inorderTraversal(root.right);
        }
    }

    // Método para buscar un elemento en el árbol
    public boolean search(E data) {
        return searchRec(root, data);
    }

    private boolean searchRec(TreeNode<E> root, E data) {
        if (root == null)
            return false;
        if (root.data.equals(data))
            return true;
        if (data.compareTo(root.data) < 0)
            return searchRec(root.left, data);
        return searchRec(root.right, data);
    }
}
