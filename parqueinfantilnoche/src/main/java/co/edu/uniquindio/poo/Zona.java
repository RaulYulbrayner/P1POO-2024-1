package co.edu.uniquindio.poo;

public class Zona {

    private String nombre;
    private Material material;
    private Figura figura;

    /**
     * 
     * @param nombre
     * @param figura
     * @param material
     */
    public Zona(String nombre, Figura figura, Material material){
        assert nombre != null;
        assert material != null;
        assert figura != null;
        this.nombre=nombre;
        this.material=material;
        this.figura=figura;
    }

    /**
     * 
     * @return
     */
    public double calcularValor(){
        double valor = figura.calcularArea()*material.getValorMetroCuadrado();
        return valor;
    }

    /**
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * 
     * @return
     */
    public Figura getFigura() {
        return figura;
    }

}
