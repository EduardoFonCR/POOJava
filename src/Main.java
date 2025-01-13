import animales.Animal;
import animales.Gato;
import animales.Perro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //se crear una lista de animales
        List<Animal> animales = List.of(
                new Perro("rex", 5),
                new Gato("wonka", 3)
        );

        hacerSonidoDeAnimales(animales);
    }

    public static void hacerSonidoDeAnimales(List<Animal> animales) {
        for (Animal animal : animales) {
            animal.hacerSonido(); // El metodo se comportará según el tipo de animal
        }
    }
}