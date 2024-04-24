package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {

    private double lado, ancho;

    /**
     * @param lado
     * @param ancho
     */
    public Rectangulo(double lado, double ancho){
        super("Rectangulo");
        assert lado > 0;
        assert ancho > 0;
        this.lado=lado;
        this.ancho=ancho;
    }

    /**
     * Metodo que permite calcular el area de un rectangulo
     */
    public double calcularArea(){
        return lado*ancho;
    }

    /**
     * Metodo que permite obtener el alto de un rectangulo
     * @return
     */
    public double getlado() {
        return lado;
    }

    /**
     * Metodo que permite obtener el ancho de un rectangulo
     * @return
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Metodo que permite modificar el alto de un rectangulo
     * @param alto
     */
    public void setlado(double lado) {
        this.lado = lado;
    }

    /**
     * Metodo que permite modificar el ancho de un rectangulo
     * @param ancho
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    } 
    
}
