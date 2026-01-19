/*
    ## Ejercicio 1
    Declará variables para:
    - Nombre de un jugador
    - Nivel
    - Vida
    - Mana
    - Estado (vivo o muerto)
    Asignales valores y mostralos por consola.
*/

public class VariablesExercises1 {
    public static void main(String[] args) {
        String nombreJugador = "Nash";
        int nivel = 0, vida = 100, mana = 100;
        boolean muerto = false;

        System.out.println("Player: " + nombreJugador);
        System.out.println("LvL: " + nivel);
        System.out.println("HP: " + vida + "%" + " , MP: " + mana + "%");
        System.out.println("Dead: " + muerto);

    }
}
