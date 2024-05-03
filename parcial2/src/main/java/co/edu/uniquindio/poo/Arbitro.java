package co.edu.uniquindio.poo;

public class Arbitro extends Persona {
    private String categoria;

    public Arbitro (String nombre, String apellido, String fechaNacimiento, String nacionalidad, String categoria){
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.categoria=categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
