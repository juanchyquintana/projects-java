package ListSetMaps;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayLinkedVectorList {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la fiesta de los superhéroes!");

        List<String> superHeroes = new Vector<>();
        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("Gatubela");
        superHeroes.add("Hulk");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Superman");

        superHeroes.add("Iron man");

        if(superHeroes.contains("Spiderman")) {
            System.out.println("Spiderman si está en la fiesta");
        }

        System.out.println("Hay un superheroe que está ebrio y es " + superHeroes.get(0));

        superHeroes.set(6, "Tony Stark");
        System.out.println("Ironman se saca el traje mostrando su verdadera identidad que es: " + superHeroes.get(6));

        superHeroes.remove(3);

        if(!superHeroes.contains("Hulk")) {
            System.out.println("Hulk se ha ido de la fiesta");
        }

        superHeroes.remove("Superman");

        if(superHeroes.isEmpty()) {
            System.out.println("La fiesta ha terminado todos se han ido");
        } else {
            System.out.println("La fiesta continua aún hay " + superHeroes.size() + " superheoes");
        }

        System.out.println("Quienes estan aun en la fiesta?");
        for(String heroes : superHeroes) {
            System.out.println(heroes);
        }
    }
}
