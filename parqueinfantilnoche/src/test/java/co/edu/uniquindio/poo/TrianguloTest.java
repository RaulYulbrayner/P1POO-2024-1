package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class TrianguloTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * 
     */
    @Test
    public void areaPositivoTriangulo() {
        LOG.info("Iniciado test areaPositivoRectangulo");

        Triangulo tirangulo = new Triangulo(10, 20);

        assertEquals(100, tirangulo.calcularArea(), App.PRECISION);

        LOG.info("Finalizando test areaPositivoRectangulo");
    }

    /**
     * 
     */
    @Test
    public void areaPositivoNegativoTriangulo() {
        LOG.info("Iniciado test areaPositivoRectangulo");

        assertThrows(Throwable.class, ()-> new Triangulo(20, -10));

        LOG.info("Finalizando test areaPositivoRectangulo");
    }

    /**
     * 
     */
    @Test
    public void areaPositivoNegativoTriangulo2() {
        LOG.info("Iniciado test areaPositivoRectangulo");

        assertThrows(Throwable.class, ()-> new Triangulo(-20, 10));

        LOG.info("Finalizando test areaPositivoRectangulo");
    }
    
}
