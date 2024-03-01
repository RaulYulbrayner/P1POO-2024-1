package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Curso {

    private String nombre;
    private Collection <Estudiante> estudiantes;


    /**
     * Metodo constructor de la clase Curso
     * @param nombre
     */
    public Curso(String nombre){
        assert nombre != null;
        this.nombre = nombre;
        estudiantes = new LinkedList<>();
    }

    /**
     * Metodo que permite agregar estudiantes a un curso
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante){
        assert verificarEstudiante(estudiante.identificacion())==false;
        estudiantes.add(estudiante);
    }

    /**
     * Metodo para verificar que un estudiante no se repita
     * @param numID
     * @return
     */
    private boolean verificarEstudiante(String numID){
        boolean existe = false;
        for(Estudiante estudiante : estudiantes){
            if(estudiante.identificacion().equals(numID)){
                existe = true;
            }
        }
        return existe;
    }

    /**
     * Metodo para obtener el nombre de un curso
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que permite obtener la lista de estudiantes
     * @return estudaintes
     */
    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
}