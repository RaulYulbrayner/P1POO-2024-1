package co.edu.uniquindio.poo;

public enum Material {
    ARENA(10000),
    GRAMASINTECTICA(35000),
    GRAMANATURAL(20000),
    ASFALTO(40000);

    private final double valorMetroCuadrado;

    /**
     * Metodo constructor de la lista de materiales
     * @param valorMetroCuadrado
     */
    private Material(double valorMetroCuadrado){
        this.valorMetroCuadrado=valorMetroCuadrado;
    }

    /**
     * Metodo que permite obtener el valor del metro cuadrado
     * @return
     */
    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    




}
