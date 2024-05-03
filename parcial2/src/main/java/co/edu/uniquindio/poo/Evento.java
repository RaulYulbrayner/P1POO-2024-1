package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Evento {
    private String nombre;
    private String fechaInicio;
    private String ubicacion;
    private String deporte;
    private TipoCompeticion tipoCompeticion;
    private Collection<Atleta> atletas;
    private Collection<Participante> participantes;

    public Evento(String nombre, String fechaInicio, String ubicacion, String deporte, TipoCompeticion tipoCompeticion){
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.ubicacion = ubicacion;
        this.deporte = deporte;
        this.tipoCompeticion = tipoCompeticion;
        this.atletas = new LinkedList<>();
        this.participantes = new LinkedList<>();
    }

    public void agregarAtleta(Atleta atleta){
        atletas.add(atleta);
    }

    public Collection<Atleta> obtenerListaAtletas() {
        List<Atleta> listaAtletasFiltrados = new LinkedList<>();
        for (Atleta atleta : atletas) {
            if (getDeporte().equals("natacion") && TipoCompeticion.COMPETICION.equals(tipoCompeticion)) {
                listaAtletasFiltrados.add(atleta);
            }
        }
        return listaAtletasFiltrados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getDeporte() {
        return deporte;
    }

    public TipoCompeticion getTipoCompeticion() {
        return tipoCompeticion;
    }

    public Collection<Atleta> getAtletas() {
        return atletas;
    }

    
    
}