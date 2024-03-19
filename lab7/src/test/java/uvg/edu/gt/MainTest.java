package uvg.edu.gt;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test() {
        // Redirige la salida estándar a un ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecuta el programa principal
        Main.main(null);

        // Restaura la salida estándar
        System.setOut(System.out);

        // Obtiene la salida del programa
        String output = outContent.toString().trim();

        // Comprueba la traducción esperada
        assertEquals("*The* mujer *asked* *me* *to* *do* *my* tarea *about* *my* pueblo.", output);
    }
    }


