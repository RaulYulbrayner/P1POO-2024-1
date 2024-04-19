package co.edu.uniquindio.poo;

public class Triangulo extends Figura {

    private double base, altura;

    /**
     * Metodo constructor de la clase triangulo
     * @param base
     * @param altura
     */
    public Triangulo(double base, double altura){
        assert base > 0;
        assert altura > 0;
        this.base=base;
        this.altura=altura;
    }

    /**
     * Metodo que permite calcular el area de un triangulo;
     */
    public double calcularArea(){
        return (base*altura) / 2.0;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    
    
}
