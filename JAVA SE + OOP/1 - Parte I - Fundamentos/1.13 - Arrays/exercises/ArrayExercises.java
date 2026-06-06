package exercises;

public class ArrayExercises {

    public static void main(String[] args) {
        /*
        Nivel 1: Crear Arrays

        - Crear un array de 5 números enteros
        - Asignar valores manualmente
        - Mostrar cada elemento utilizando `System.out.println()`
        */

        int[] numeros = new int[5];
        numeros[0] = 11;
        numeros[1] = 23;
        numeros[2] = 35;
        numeros[3] = 47;
        numeros[4] = 58;

        /*
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice"+ i + " Valor: " + numeros[i]);
        }
        */

        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("==== FIN EJ 1 ====");

        /*
        Nivel 2: Recorrer Arrays

        Crear un array con los siguientes valores:

        ```java
        {10, 20, 30, 40, 50}
        ```

        - Recorrerlo utilizando un bucle `for`
        - Mostrar cada elemento en pantalla
        */

        int[] numeros2 = new int[5];
        numeros2[0] = 10;
        numeros2[1] = 20;
        numeros2[2] = 30;
        numeros2[3] = 40;
        numeros2[4] = 50;

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Indice: " + i + ", Valor: " + numeros2[i]);
        }
        System.out.println("==== FIN EJ 2 ====");

        /*
        Nivel 3: Recorrido con foreach

        Utilizar el mismo array anterior.

        - Recorrerlo utilizando `foreach`
        - Comparar el resultado con el recorrido usando `for`
        */

        for (int numero : numeros2) {
            System.out.println(numero);
        }
        System.out.println("==== FIN EJ 3 ====");

        /*
        Nivel 4: Modificar Elementos

        Crear un array de nombres:

        ```java
        {"Juan", "Ana", "Pedro"}
        ```

        - Mostrar todos los nombres
        - Modificar uno de ellos
        - Mostrar nuevamente el array completo
        */

        String[] nombres = new String[3];

        nombres[0] = "Juan";
        nombres[1] = "Ana";
        nombres[2] = "Pedro";

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        System.out.println("==== Fin 1 String ====");

        nombres[1] = "Luis";

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("==== Fin 2 String ====");
        System.out.println("==== Fin EJ 4 ====");

        /*
        Nivel 5: Suma de Elementos

        Crear un array de números.

        ```java
        {5, 10, 15, 20, 25}
        ```

        - Recorrer el array
        - Calcular la suma total
        - Mostrar el resultado final
        */

        int suma = 0;
        int[] numeros3 = new int[5];
        numeros3[0] = 5;
        numeros3[1] = 10;
        numeros3[2] = 15;
        numeros3[3] = 20;
        numeros3[4] = 15;

        for (int i = 0; i < numeros3.length; i++) {
            suma += numeros3[i];
        }
        System.out.println("Total suma: " + suma);
        System.out.println("==== Fin EJ 5 ====");

        /*
        Nivel 6: Encontrar el Mayor

        Crear un array de números.

        - Recorrer todos los elementos
        - Encontrar el número más grande
        - Mostrar el resultado
        */

        int mayor = 0;
        int[] numeros4 = new int[4];
        numeros4[0] = 111;
        numeros4[1] = 555;
        numeros4[2] = 333;
        numeros4[3] = 444;

        for (int i = 0; i < numeros4.length; i++) {
            if (numeros4[i] > mayor) {
                mayor = numeros4[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("==== Fin EJ 6 ====");


        /*
        Nivel 7: Inventario RPG

        Crear un array llamado `inventario`.

        Debe contener:

        - Espada
        - Escudo
        - Poción
        - Arco

        Mostrar todos los objetos del inventario utilizando un bucle.
        */

        String[] inventario = new String[4];
        inventario[0] = "Espada";
        inventario[1] = "Escudo";
        inventario[2] = "Poción";
        inventario[3] = "Arco";

        for (String items: inventario){
            System.out.println(items);
        }
        System.out.println("==== Fin EJ 7 ====");

        /*
        Nivel 8: Estadísticas RPG

        Crear un array llamado `estadisticas`.

        ```java
        {15, 10, 8}
        ```

        Representan:

        - Fuerza
        - Defensa
        - Velocidad

        Mostrar cada estadística indicando qué representa cada posición.

        Ejemplo:

        ```text
        Fuerza: 15
        Defensa: 10
        Velocidad: 8
        ```
        */
        int[] estadisticas = new int[3];
        estadisticas[0] = 15;
        estadisticas[1] = 10;
        estadisticas[2] = 8;

        System.out.println("Fuerza: " + estadisticas[0]);
        System.out.println("Defensa: " + estadisticas[1]);
        System.out.println("Velocidad: " + estadisticas[2]);
        System.out.println("==== Fin EJ 8 ====");

        /*
        Nivel 9: Sistema de Daños

        Crear un array con daños de habilidades.

        ```java
        {10, 20, 35, 50}
        ```

        - Mostrar todas las habilidades
        - Calcular el daño total
        - Mostrar el daño promedio
        */

        int totalDmg = 0;
        int[] dmg = new int[4];
        dmg[0] = 10;
        dmg[1] = 20;
        dmg[2] = 35;
        dmg[3] = 50;

        System.out.println("=== Daño de habilidades ===");
        System.out.println("Habilidad 1: " + dmg[0]);
        System.out.println("Habilidad 2: " + dmg[1]);
        System.out.println("Habilidad 3: " + dmg[2]);
        System.out.println("Habilidad 4: " + dmg[3]);
        System.out.println("=== Fin Sistema de Daños ===");

        for (int i = 0; i < dmg.length; i++) {
            totalDmg += dmg[i];
        }

        System.out.println("Daño total: " + totalDmg);
        System.out.println("Daño promedio: " + (totalDmg / dmg.length));
        System.out.println("=== Fin Ej 9 ===");
        
    }
}
