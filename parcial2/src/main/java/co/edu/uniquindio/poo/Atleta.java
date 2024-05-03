package co.edu.uniquindio.poo;

public class Atleta extends Persona {
    private String experiencia;

    public Atleta(String nombre, String apellido, String fechaNacimiento, String nacionalidad, String experiencia){
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.experiencia=experiencia;
    }

    public String getExperiencia() {
        return experiencia;
    }
}
