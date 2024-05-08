package co.edu.uniquindio.poo;


/**
 * Hello world!
 *
 */
public class App {

    /**
     * 
     */
    public static void tablarMultiplicar(){
        for(int i = 1; i <= 9 ; i++){
            System.out.println("La tabla del: " + i + " es:");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
           System.out.println();
        }
    }

    public static void main(String[] args) {
        tablarMultiplicar();
    }
}
