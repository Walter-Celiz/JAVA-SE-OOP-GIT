/*
### Ejercicio 3

Intenta modificar una constante y observa el error del compilador.
Explica por qué ocurre.

la constante final es inmutable, es decir, no puede ser modificada.
*/

package exercises;

public class ConstantesExercises3 {
    public static void main(String[] args) {
        final int VIDA_MAXIMA = 100;
        final int VIDA_MAXIMA = 101;
        System.out.println("Full HP = " + VIDA_MAXIMA);
    }
}
