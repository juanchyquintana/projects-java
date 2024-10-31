import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la máquina expendedora de bebidas");
        System.out.println("""
                Elegí una opción de las siguientes:
                1 - Cafe
                2 - Mate
                3 - Gaseosa
                4 - Vino
                """);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("cafe cafeeeee");
                break;
            case 2:
                System.out.println("mate con canarias o baldo");
                break;
            case 3:
                System.out.println("pepsi, coca y pritty");
                break;
            case 4:
                System.out.println("vinito vinito");
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }

        if(option <= 4) {
            System.out.println("Disfruta tu bebida, capo!");
        }


        scanner.close();
    }
}
