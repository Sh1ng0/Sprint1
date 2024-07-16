package n1ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OutOfBoundsTestTest {

    @Test
    void testErrorTestThrowsException() {
        OutOfBoundsTest outOfBoundsTest = new OutOfBoundsTest();
        
        // Verifica que el método errorTest lanza ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, outOfBoundsTest::errorTest);
    }
}