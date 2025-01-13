package animales;

public class Gato extends Animal {

    // Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribir el metodo hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Maullar");
    }


}
