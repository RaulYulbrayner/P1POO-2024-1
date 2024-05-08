package co.edu.uniquindio.poo;

public class Granja {
    
    public static void main(String[] args) {
        Animal[] animales = new Animal[5];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Pato();
        animales[3] = new Perro();
        animales[4] = new Pato();

        //   0     1      2     3      4
        //[Perro, Gato, Pato, Perro, Pato]

        for (Animal animal : animales) {
            //2
            animal.hacerSonido();
        }
        
    }



}
