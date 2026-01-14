public class TiposDatosExercise {
    /*
    1. Declarar una variable de cada tipo primitivo.
    2. Cambiar valores y observar los resultados.
    3. Probar qué sucede si se asigna un valor incorrecto a un tipo.
    4. Crear una pequeña ficha personal usando variables.
    */

    public static void main(String[] args) {
        // 1.
        byte perros = 6;
        short nacimiento = 1993;
        int hermanos = 2;
        long dni = 281405233;
        float salario = 1400.50f;
        double alturaDeseada = 1.85;
        char inicial = 'W';
        boolean soltero = true;

        System.out.println("Cantidad de perros: " + perros);
        System.out.println("Año de nacimiento: " + nacimiento);
        System.out.println("Cantidad de hermanos: " + hermanos);
        System.out.println("DNI: " + dni);
        System.out.println("Salario: $" + salario);
        System.out.println("Altura deseada: " + alturaDeseada + "m");
        System.out.println("Inicial: " + inicial);
        System.out.println("Estado civil: " + soltero);

        // 2.
        //boolean soltero = false;
        //System.out.println("estas saliendo con alguien?" + soltero);

        // 3.
        //boolean soltero = 1;
        //System.out.println("estas saliendo con alguien?" + soltero);

        // 4.
        // Segunda sección de variables
        short nacimiento2 = 1993;
        byte cantidadPadres = 2;
        int numHermanos = 2;
        long numeroDNI = 37373737;
        float ingresoMensual = 0.0001f;
        double alturaActual = 1.80;
        char letraInicial = 'W';
        boolean estadoCivil = true;

        System.out.println("Año de nacimiento: " + nacimiento2);
        System.out.println("Cantidad de padres: " + cantidadPadres);
        System.out.println("Número de hermanos: " + numHermanos);
        System.out.println("Número de DNI: " + numeroDNI);
        System.out.println("Ingreso mensual: $" + ingresoMensual);
        System.out.println("Altura actual: " + alturaActual + "m");
        System.out.println("Letra inicial: " + letraInicial);
        System.out.println("Estado civil (true=Soltero): " + estadoCivil);
    }
}
