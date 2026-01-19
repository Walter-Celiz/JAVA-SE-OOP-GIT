package exercises;

/*
1. Declara dos variables `int` y realiza:
   - suma
   - resta
   - multiplicación
   - división
2. Usa el operador `%` para verificar si un número es par.
3. Declara una variable `vida` y comprueba si el personaje sigue vivo.
4. Combina al menos dos condiciones lógicas.
5. Usa los operadores `++` y `--` y analiza el resultado.
*/
public class OperadoresExercises1 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int par = numero1 % 2;
        int vida = 100;
        int nivel = 0;

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));
        System.out.println("División: " + (numero1 / numero2));
        System.out.println("Modulo: " + (numero1 % numero2));

        if (par == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        if (vida > 0) {
            System.out.println("El personaje sigue vivo");
        } else {
            System.out.println("El personaje ha muerto");
        }

        if (vida > 0 && vida < 20) {
            System.out.println("El personaje esta por morir");
        } else {
            System.out.println("El personaje ha muerto");
        }

        nivel++;
        System.out.println("Nivel: " + nivel);
        nivel+=3;
        System.out.println("Nivel: " + nivel);

        nivel--;
        System.out.println("Nivel: " + nivel);
    }
}
