import java.util.Scanner;

public class EntradaDatosCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vidaJugador = 100;
        int vidaEnemigo = 80;

        while (vidaJugador > 0 && vidaEnemigo > 0) {
            System.out.println("\n--- TURNO ---");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");

            System.out.print("Elige una acción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                vidaEnemigo -= 20;
                System.out.println("Atacaste al enemigo");
            } else if (opcion == 2) {
                System.out.println("Te defendiste");
            } else {
                System.out.println("Opción inválida");
            }

            vidaJugador -= 15;

            System.out.println("Vida jugador: " + vidaJugador);
            System.out.println("Vida enemigo: " + vidaEnemigo);
        }

        if (vidaJugador > 0) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}
