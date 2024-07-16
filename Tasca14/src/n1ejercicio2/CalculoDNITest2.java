package n1ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculoDNITest2 {

    @Test
    public void testValidarDNI() {
        
        String[] dnIsCorrectos = {
            "12345678T",
            "23456789R",
            "34567890W",
            "45678901A",
            "56789012G",
            "67890123M",
            "78901234Y",
            "89012345F",
            "90123456P",
            "01234567D"
        };

        String[] dnIsIncorrectos = {
            "12345678R", // Letra incorrecta
            "23456789W", // Letra correcta (dado correcto en la lista de test)
            "34567890T", // Letra incorrecta
            "45678901G", // Letra incorrecta
            "56789012A", // Letra incorrecta
            "67890123Y", // Letra correcta (dado correcto en la lista de test)
            "78901234F", // Letra incorrecta
            "89012345M", // Letra incorrecta
            "90123456D", // Letra incorrecta
            "01234567T"  // Letra incorrecta
        };

        // Probar DNIs correctos
        for (String dni : dnIsCorrectos) {
            assertEquals("Correcto", CalculoDNI.validarDNI(dni));
        }

        // Probar DNIs incorrectos
        for (String dni : dnIsIncorrectos) {
            String expectedMessage = "Incorrecto, la letra correcta es " +
                                     CalculoDNI.validarDNI(dni).split(",")[1].trim();
            assertEquals(expectedMessage, CalculoDNI.validarDNI(dni));
        }
    }
}