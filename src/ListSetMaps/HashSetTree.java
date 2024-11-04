package ListSetMaps;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTree {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la fiesta de los superhéroes!");

        Set<String> superHeroes = new LinkedHashSet<>();
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

        superHeroes.remove("Hulk");

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
