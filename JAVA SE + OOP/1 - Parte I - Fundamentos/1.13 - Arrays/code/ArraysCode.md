## Arrays básicos

```java
public class ArraysEjemplo {

    public static void main(String[] args) {

        String[] inventario = {
            "Espada",
            "Escudo",
            "Pocion",
            "Arco"
        };

        System.out.println("=== INVENTARIO ===");

        // Acceso a elementos
        System.out.println("Primer objeto: " + inventario[0]);
        System.out.println("Segundo objeto: " + inventario[1]);

        // Modificación de elemento
        inventario[2] = "Pocion Grande";

        System.out.println("\n=== INVENTARIO ACTUALIZADO ===");

        // Recorrido con for
        for (int i = 0; i < inventario.length; i++) {
            System.out.println(
                "Posicion " + i + ": " + inventario[i]
            );
        }

        System.out.println("\n=== RECORRIDO FOREACH ===");

        // Recorrido con foreach
        for (String objeto : inventario) {
            System.out.println(objeto);
        }

        System.out.println(
            "\nCantidad de objetos: "
            + inventario.length
        );
    }
}