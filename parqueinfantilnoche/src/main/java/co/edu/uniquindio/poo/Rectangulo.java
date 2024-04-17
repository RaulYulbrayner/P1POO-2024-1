package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {

    private double alto, ancho;

    /**
     * 
     * @param alto
     * @param ancho
     */
    public Rectangulo(double alto, double ancho){
        this.alto=alto;
        this.ancho=ancho;
    }

    /**
     * 
     */
    public double calcularArea(){
        return alto*ancho;
    }

    /**
     * 
     * @return
     */
    public double getAlto() {
        return alto;
    }

    /**
     * 
     * @return
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * 
     * @param alto
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * 
     * @param ancho
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    } 
    
}
