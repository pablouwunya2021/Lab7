package uvg.edu.gt;

public class TreeNode<E extends Comparable<E>> {
    E data;
    TreeNode<E> left, right;

    public TreeNode(E item) {
        data = item;
        left = right = null;
    }
}
