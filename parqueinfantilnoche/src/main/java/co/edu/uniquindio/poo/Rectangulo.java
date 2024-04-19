package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {

    private double alto, ancho;

    /**
     * 
     * @param alto
     * @param ancho
     */
    public Rectangulo(double alto, double ancho){
        assert alto > 0;
        assert ancho > 0;
        this.alto=alto;
        this.ancho=ancho;
    }

    /**
     * Metodo que permite calcular el area de un rectangulo
     */
    public double calcularArea(){
        return alto*ancho;
    }

    /**
     * Metodo que permite obtener el alto de un rectangulo
     * @return
     */
    public double getAlto() {
        return alto;
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
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * Metodo que permite modificar el ancho de un rectangulo
     * @param ancho
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    } 
    
}
