/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Esta prueba verifica que la infomración de un estudiante es completa y bien diligenciada.
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");
        Estudiante estudiante = new Estudiante("Yulbryner", "vargas", "10944", "yul@gmail", "314654", (byte) 20);

        assertEquals("Yulbryner", estudiante.nombre());
        assertEquals("vargas", estudiante.apellido());
        assertEquals("10944", estudiante.identificacion());
        assertEquals("yul@gmail", estudiante.correo());
        assertEquals("314654", estudiante.telefono());
        assertEquals(20, estudiante.edad());

        LOG.info("Finalizando test datosCompletos");
    }
}
