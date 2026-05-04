public class EjercicioEstructurasControl {
    /*

    ## Nivel 1
- Crear un `if` que indique si un personaje está vivo o muerto
- Mostrar un mensaje distinto si la vida es mayor a 50

## Nivel 2
- Usar `switch` para acciones: atacar, defender, usar poción
- Crear un `for` que simule 5 turnos de combate

## Nivel 3
- Simular combate con `while` hasta que la vida llegue a 0
- Combinar `if` dentro de un bucle para decisiones dinámicas

 */

    public static void main(String[] args) {
        // 1
        int vida = 80;
        boolean vivo = vida > 0;

        if (vida > 0) {
            System.out.println("El personaje está vivo");
        } else if (vida != 0) {
            System.out.println("Su vida es distinta de 50");
        } else {
            System.out.println("El personaje está muerto");
        }

        System.out.println("¿Está vivo? " + vivo);
        System.out.println("Vida actual: " + vida);

        System.out.println("\n-------------------------");
        System.out.println("\n-------------------------");
        System.out.println("\n-------------------------");

        // 2

        int vidaJugador = 100;
        int vidaEnemigo = 100;

        System.out.println("Simulación de combate:");

        for (int turno = 1; turno <= 5; turno++) {

            System.out.println("\nTurno " + turno);

            int opcion = 1; // por ahora fijo (después será Scanner)

            switch (opcion) {
                case 1:
                    System.out.println("Atacás al enemigo");
                    vidaEnemigo -= 20;
                    break;
                case 2:
                    System.out.println("Te defendés");
                    break;
                case 3:
                    System.out.println("Usás poción");
                    vidaJugador += 15;
                    break;
                default:
                    System.out.println("Acción no válida");
            }

            // enemigo responde (simple)
            vidaJugador -= 10;
            System.out.println("El enemigo te ataca (-10)");

            // mostrar estado
            System.out.println("Vida jugador: " + vidaJugador);
            System.out.println("Vida enemigo: " + vidaEnemigo);
        }

        System.out.println("\nFin de la simulación");
        System.out.println("\n-------------------------");
        System.out.println("\n-------------------------");
        System.out.println("\n-------------------------");

        // 3

        int vidaPlayer = 100;
        int vidaEnemy = 60;
        int turn = 1;

        while (vidaPlayer > 0 && vidaEnemy > 0) {

            System.out.println("\nTurno " + turn);

            // jugador ataca
            vidaEnemy -= 15;
            System.out.println("Atacás al enemigo (-15)");

            // decisión dinámica
            if (vidaEnemy <= 0) {
                System.out.println("El enemigo fue derrotado");
            }

            // enemigo ataca
            vidaPlayer -= 10;
            System.out.println("El enemigo te ataca (-10)");

            if (vidaPlayer <= 0) {
                System.out.println("El jugador fue derrotado");
            }

            System.out.println("Vida jugador: " + vidaPlayer);
            System.out.println("Vida enemigo: " + vidaEnemy);

            turn++;
        }

        System.out.println("\nFin del combate");
    }
}

