package animales;

public class Perro extends Animal{
    //constructor
    public Perro(String nombre, int edad){
        super(nombre,edad);
    }
    // Sobrescribir el metodo hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Ladrar");
    }
}
