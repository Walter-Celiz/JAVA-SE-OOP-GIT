/*
## Ejercicio 3

Probá declarar una variable sin inicializarla y usarla.
¿Qué sucede? ¿Por qué Java no lo permite?
error de compilacion, la variable debe estar inicializada para mostrarla por pantalla.
Java reserva el espacio, pero NO sabe qué valor tiene
*/
public class VarieblesExercises3 {
    public static void main(String[] args) {
        int vida;
        System.out.println(vida);
    }
}
