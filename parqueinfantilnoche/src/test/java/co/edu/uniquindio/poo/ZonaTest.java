package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class ZonaTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * 
     */
    @Test
    public void areaZonaCircularArena() {
        LOG.info("Iniciado test areaZonaCircularArena");

        Zona zona = new Zona("Zona 1", new Circulo(10), Material.ARENA);

        assertEquals(3141592.65, zona.calcularValor(), App.PRECISION);

        LOG.info("Finalizando test areaZonaCircularArena");
    }
    
}
