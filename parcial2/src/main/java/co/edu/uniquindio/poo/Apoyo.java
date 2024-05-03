package co.edu.uniquindio.poo;

public class Apoyo extends Persona {

    private String experiencia;

    public Apoyo(String nombre, String apellido, String fechaNacimiento, String nacionalidad, String experiencia){
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.experiencia=experiencia;
    }

    public String getExperiencia() {
        return experiencia;
    }
    
}
