import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Juan", "Quintana", 23);

        persona1.setNombre("Diego");
        persona1.setApellido("pupi");

        System.out.println(persona1.darNombreCompleto() + " y tiene " + persona1.getEdad() + " años");

        Animal animal = new Animal("Rocco", 7);
        Gato gato = new Gato("Moon", 3);
        Perro perro = new Perro("Kiarita", 7);

        System.out.println("El animal llamado " + animal.nombre + " hace: ");
        System.out.println(animal.hacerSonido());
        System.out.println("El perro llamado " + perro.nombre + " hace: ");
        System.out.println(perro.hacerSonido());
        System.out.println("El gato llamado " + gato.nombre + " hace: ");
        System.out.println(gato.hacerSonido());
    }
}
