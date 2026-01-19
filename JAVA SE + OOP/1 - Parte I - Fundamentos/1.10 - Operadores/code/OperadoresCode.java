package code;

public class OperadoresCode {
    public static void main(String[] args) {
        int vida = 100;
        int dano = 30;

        // Operadores aritméticos
        vida = vida - dano;

        // Operadores de comparación
        boolean sigueVivo = vida > 0;

        // Operadores lógicos
        boolean puedePelear = sigueVivo && vida > 20;

        // Incremento
        int nivel = 1;
        nivel++;

        // Concatenación
        System.out.println("Vida actual: " + vida);
        System.out.println("Sigue vivo: " + sigueVivo);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puede pelear: " + puedePelear);
    }
}
