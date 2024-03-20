package uvg.edu.gt;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMainMethod_NoExceptionThrown() {
        // Simula la entrada de datos para evitar NullPointerException
        System.setIn(new ByteArrayInputStream("".getBytes()));

        // Verifica que no se lance una excepción
        assertDoesNotThrow(() -> Main.main(null));
    }
}
