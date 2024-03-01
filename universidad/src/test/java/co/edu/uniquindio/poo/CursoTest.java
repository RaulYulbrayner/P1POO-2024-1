package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CursoTest {

    private static final Logger LOG = Logger.getLogger(CursoTest.class.getName());

    /**
     * Test para verificar que los datos de un curso esten completos
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio test datosCompletos");
        Curso curso = new Curso("Programación I");
        assertEquals("Programación I", curso.getNombre());
        LOG.info("Fin test datosCompletos");
    }

    /**
     * Test para verificar que el nombre de un curso no puede ser nulo
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio test datosNulos");
        assertThrows(Throwable.class, () -> new Curso(null));
        LOG.info("Fin test datosNulos");
    }

    /**
     * Test para agregar estudiantes a un curso
     */
    @Test
    public void agregarEstudiante() {
        LOG.info("Inicio test agregarEstudiante");
        Curso curso = new Curso("Programación I");
        Estudiante estudiante = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674", (byte) 18);
        curso.agregarEstudiante(estudiante);
        assertTrue(curso.getEstudiantes().contains(estudiante));
        assertEquals(1, curso.getEstudiantes().size());
        assertEquals("Programación I", curso.getNombre());
        LOG.info("Fin test agregarEstudiante");
    }

    /**
     * 
     */
    @Test
    public void verificarEstudianteRepetido(){
        LOG.info("Inicio test verificarEstudianteRepetido");
        Curso curso = new Curso("Programación I");

        var estudiante1 = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674", (byte) 18);

        Estudiante estudiante2 = new Estudiante("Raul", "Rivera", "109453264", "raul@uniquindio.edu.co", "315635674", (byte) 21);

        curso.agregarEstudiante(estudiante1);

        assertThrows(Throwable.class, ()-> curso.agregarEstudiante(estudiante2));
        
        LOG.info("Fin test verificarEstudianteRepetido");
    }




}
