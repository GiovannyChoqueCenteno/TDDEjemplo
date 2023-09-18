import org.example.PalindromaChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalidromaCheckerTest {
    @Test
    public void testInsertarPalindroma() {
        PalindromaChecker checker = new PalindromaChecker();

        checker.insertarPalindromo("radar");
        checker.insertarPalindromo("hola");
        checker.insertarPalindromo("ana");

        // Verificar que solo las palabras palíndromas se han insertado en el ArrayList
        assertEquals(2, checker.getPalabras().size());
        assertTrue(checker.getPalabras().contains("radar"));
        assertTrue(checker.getPalabras().contains("ana"));
        assertFalse(checker.getPalabras().contains("hola"));
    }

    @Test
    public void testInsertarVacio() {
        PalindromaChecker checker = new PalindromaChecker();

        checker.insertarPalindromo("");

        // Verificar que una cadena vacía no se inserta en el ArrayList
        assertEquals(0, checker.getPalabras().size());
    }

    @Test
    public void testInsertarNoPalindroma() {
        PalindromaChecker checker = new PalindromaChecker();

        checker.insertarPalindromo("tina");

        assertEquals(0, checker.getPalabras().size());
    }
}
