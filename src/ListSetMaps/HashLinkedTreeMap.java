package ListSetMaps;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashLinkedTreeMap {
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestra verduleria");
        System.out.println("-".repeat(30));

        Map<String, Double> inventario = new LinkedHashMap<>();

        inventario.put("Banana", 0.89);
        inventario.put("Tomate", 0.75);
        inventario.put("Palta", 0.65);
        inventario.put("Frutilla", 0.89);
        inventario.put("Manzana", 0.77);
        inventario.put("Pimiento", 0.25);

        System.out.println("Este es el inventario de frutas y verduras");
        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        System.out.println("-".repeat(30));
        String frutaBuscada = "Durazno";
        System.out.println("Se acerca un cliente y nos pide la siguiente furta: " + frutaBuscada);

        if (inventario.containsKey(frutaBuscada)) {
            System.out.println(frutaBuscada + " esta en el inventario, encantados le vendemos");
        } else {
            System.out.println("Lamentablemente nos quedamos sin " + frutaBuscada);
        }

        String sinStock = "Manzana";
        inventario.remove(sinStock);
        System.out.println("Nos hemos quedad sin: " + sinStock);

        System.out.println("-".repeat(30));
        System.out.println("Inventario actualizado: ");
        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        System.out.println("La cantidad de mercaderia es: " + inventario.size());

    }
}
