package co.edu.uniquindio.poo;

public class Entrenador extends Persona {
    private String especializacion;

    public Entrenador(String nombre, String apellido, String fechaNacimiento, String nacionalidad, String especializacion){
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.especializacion=especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }
    
}
