package co.edu.uniquindio.poo;

public class Equipo {
    private String nombre;
    private String paisOrigen;
    private Entrenador entrenador;
    private Atleta atleta;

    public Equipo(String nombre, String paisOrigen, Entrenador entrenador, Atleta atleta){
        this.nombre=nombre;
        this.paisOrigen=paisOrigen;
        this.entrenador=entrenador;
        this.atleta=atleta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }
    
}
