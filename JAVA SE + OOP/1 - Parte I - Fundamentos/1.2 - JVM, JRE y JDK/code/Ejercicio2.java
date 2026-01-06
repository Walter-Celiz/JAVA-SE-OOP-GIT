public class Ejercicio2 {
    /*
     Ejercicio2
    1. Ejecutar el programa y anotar:
        - Versión de Java
        - Sistema operativo
        - Arquitectura
    2. Investigar:
        - ¿Qué versión de JDK estás usando?
    3. Modificar el código para mostrar:
        - Directorio actual (`user.dir`)
    4. Reflexionar:
        - ¿Qué pasaría si no existiera la JVM?
    */
    public static void main(String[] args) {

        System.out.println("Versión de Java: " + System.getProperty("java.version"));
        System.out.println("Sistema Operativo: " + System.getProperty("os.name"));
        System.out.println("Arquitectura: " + System.getProperty("os.arch"));
        System.out.println("Versión de Java: " + System.getProperty("java.version"));
        System.out.println("Si no existiera la JVM: " +
                "Java no sería multiplataforma, " +
                "El bytecode no podría ejecutarse, " +
                "No habría recolección automática de basura, " +
                "Muchas herramientas de desarrollo dejarían de funcionar.");
    }
}

