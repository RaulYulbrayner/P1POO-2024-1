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
        }else if(operador == '/'){
            resultado = num1 / num2;
        }
        return resultado; 
    }


    public static boolean isVocal(char letra){
        boolean centinela = false;
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            centinela = true;
        }
        return centinela;
    }

    public static int cantidadVocales(String palabra){
        int canitidad = 0;
        for(int i = 0; i<=palabra.length()-1; i++){
            char letra = palabra.charAt(i);
            if(!isVocal(letra)){
                canitidad += 1;
            }
        }
        return canitidad;
    }




    public static void main(String[] args) {
       // double valor = calculadora(5,5,'+');
       // System.err.println("El resultado es: "+valor);
       String nombre = "Hola mundo";
       int canitidad = cantidadVocales(nombre);
       System.out.println("La cantidad de palabras son: "+ canitidad);

    }
}
