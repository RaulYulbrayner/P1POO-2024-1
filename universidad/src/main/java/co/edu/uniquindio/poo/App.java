package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {


    public static double calculadora(int num1, int num2, char operador){
        double resultado = 0;
        if(operador == '+'){
            resultado = num1+num2;
        }else if(operador == '-'){
            resultado = num1-num2;
        }else if(operador == '*'){
            resultado = num1*num2;
        }else if(operador == 3){
            resultado = num1 / num2;
        }
        return resultado;
    }


    public static void main(String[] args) {
        double valor = calculadora(5,5,'+');
        System.err.println("El resultado es: "+valor);
    }
}
