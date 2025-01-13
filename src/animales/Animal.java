package animales;

public class Animal {
    //Atributos de la clase
    private String nombre;
    private int edad;

    //Constructor
    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    //Metodos get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Metodo para herencia y polimorfismo
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

}
