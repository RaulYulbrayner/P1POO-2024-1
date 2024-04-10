package co.edu.uniquindio.poo;

public class Circulo extends Figura {

    private double radio;

    /**
     * Este es el metodo constructor de la clase circulo
     * @param radio
     */
    public Circulo(double radio) {
        assert radio > 0;
        this.radio = radio;
    }

    /**
     * Metodo para calcular el area de un circulo
     */
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Metodo get para obtener el radio de un circulo
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Metodo set para modificar el radio de un circulo
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

}
