package uvg.edu.gt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssociationTest {

    @Test
    public void testGetKey() {
        Association<String, Integer> association = new Association<>("apple", 10);
        assertEquals("apple", association.getKey());
    }

    @Test
    public void testGetValue() {
        Association<String, Integer> association = new Association<>("apple", 10);
        assertEquals(10, association.getValue());
    }
}
