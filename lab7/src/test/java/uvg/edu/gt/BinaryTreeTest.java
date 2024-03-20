package uvg.edu.gt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    public void testInsert() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.insert(5);
        assertTrue(tree.search(5)); // Verifica que el elemento insertado esté presente
    }

    @Test
    public void testSearch() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.insert(5);
        assertTrue(tree.search(5)); // Verifica que un elemento insertado sea encontrado
        assertFalse(tree.search(10)); // Verifica que un elemento no insertado no sea encontrado
    }
}
