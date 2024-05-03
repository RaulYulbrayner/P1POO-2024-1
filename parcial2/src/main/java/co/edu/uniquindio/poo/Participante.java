package co.edu.uniquindio.poo;

public class Participante extends Persona {
    public int edad;
    public String pais;

    public Participante(String nombre, String apellido, String fechaNacimiento, String nacionalidad, int edad, String pais){
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.edad=edad;
        this.pais=pais;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }
    
}
