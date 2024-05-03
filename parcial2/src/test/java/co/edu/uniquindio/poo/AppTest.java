/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void obtenerListaAtletas2() {
        LOG.info("Iniciado test obtenerListaAtletas");

        Evento evento = new Evento("Juegos", "24/04/2024", "Colombia", "natacion", TipoCompeticion.COMPETICION);

        Atleta a1 = new Atleta("Luisa", "Celis", "11-11-11", "Peruana", "2 Años");

        Atleta a2 = new Atleta("Juan", "Soto", "11-11-11", "Colombiano", "2 Años");

        Atleta a3 = new Atleta("Oscar", "Salazar", "11-11-11", "Colombiano", "5 Años");

        Atleta a4 = new Atleta("Ana", "Cardona", "11-11-11", "Colombiana", "5 Años");

        Atleta a5 = new Atleta("Juliana", "Gomez", "11-11-11", "Colombiana", "2 Años");

        evento.agregarAtleta(a1);
        evento.agregarAtleta(a2);
        evento.agregarAtleta(a3);
        evento.agregarAtleta(a4);
        evento.agregarAtleta(a5);

        Collection<Atleta> resultado = evento.obtenerListaAtletas();

        // Assert
        assertEquals(5, resultado.size());

        LOG.info("Finalizando test obtenerListaAtletas");
    }

}
