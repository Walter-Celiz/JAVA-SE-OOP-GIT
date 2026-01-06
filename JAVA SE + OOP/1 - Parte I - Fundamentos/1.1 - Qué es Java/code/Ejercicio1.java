public class Ejercicio1 {
    /*
    ## 1) Ejercicio
    1. Cambiá el mensaje para que muestre tu nombre.
    2. Agregá una segunda línea que diga:
    `Aprendiendo Java desde cero`
    3. Probá qué sucede si el nombre del archivo no coincide
    con el nombre de la clase.
    * */

    public static void main(String[] args) {
        System.out.println("Aprendiendo Java desde cero");
    }

}

/*
Si cambio el nombre del archivo que no coincida con el nombre de
la clase no funciona el código, por que?
Porque Java impone una regla obligatoria cuando una clase es public,
si una clase es public, el archivo .java DEBE llamarse exactamente
igual que la clase.
* */
