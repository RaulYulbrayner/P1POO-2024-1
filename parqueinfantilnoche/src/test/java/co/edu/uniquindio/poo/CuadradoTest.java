package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CuadradoTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * 
     */
    @Test
    public void areaLadoNegativoCuadrado() {
        LOG.info("Iniciado test areaLadoNegativoCuadrado");

        assertThrows(Throwable.class, () -> new Cuadrado(-10));

        LOG.info("Finalizando test areaLadoNegativoCuadrado");
    }

    /**
     * 
     */
    @Test
    public void areaLadoPositivoCuadrado() {
        LOG.info("Iniciado test areaLadoPositivoCuadrado");

        Cuadrado cuadrado = new Cuadrado(10);

        assertEquals(100, cuadrado.calcularArea());

        LOG.info("Finalizando test areaLadoPositivoCuadrado");
    }

}
