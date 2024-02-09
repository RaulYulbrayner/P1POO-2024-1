package co.edu.uniquindio.poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio {


    public static void main(String[] args) {

        int min =0;
        int max =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor inicial");
        min = scanner.nextInt();
        System.out.println("Ingrese el valor final");
        max = scanner.nextInt();
        int valor = sumarImpar(min, max);
        String mensaje = generarMensaje(valor);
        mostrarMensaje(mensaje);

    }

    public static int sumarImpar(int min, int max){
        int suma = 0;
        for(int i = min; i <= max; i++){
            if(i % 2 != 0){
                suma +=i;
            }
        }
        return suma;
    }

    public static String generarMensaje(int num) {
        String mensaje = "El resultado de la suma es: " + num;
        return mensaje;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
        JOptionPane.showMessageDialog(null,mensaje);
    }

}
