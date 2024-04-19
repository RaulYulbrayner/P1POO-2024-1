package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class RectanguloTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Prueba para verifciar el area positiva de un rectangulo
     */
    @Test
    public void areaPositivoRectangulo() {
        LOG.info("Iniciado test areaPositivoRectangulo");

        Rectangulo rectangulo = new Rectangulo(20, 10);

        assertEquals(200, rectangulo.calcularArea(), App.PRECISION);


        LOG.info("Finalizando test areaPositivoRectangulo");
    }

    /**
     * Prueba para verifciar el area positiva y negativa de un rectangulo
     */
    @Test
    public void areaPositivoNegativoRectangulo() {
        LOG.info("Iniciado test areaPositivoNegativoRectangulo");

        assertThrows(Throwable.class, ()-> new Rectangulo(20, -10));

        LOG.info("Finalizando test areaPositivoNegativoRectangulo");
    }

    /**
     * Prueba para verifciar el area positiva y negativa de un rectangulo
     */
    @Test
    public void areaPositivoNegativoRectangulo2() {
        LOG.info("Iniciado test areaPositivoNegativoRectangulo");

        assertThrows(Throwable.class, ()-> new Rectangulo(-20, 10));

        LOG.info("Finalizando test areaPositivoNegativoRectangulo");
    }

    
}
