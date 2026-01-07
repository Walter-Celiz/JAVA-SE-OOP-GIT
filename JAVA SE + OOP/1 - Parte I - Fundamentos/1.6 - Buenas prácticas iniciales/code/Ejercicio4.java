package code;

public class Ejercicio4 {
    /*
    ## Ejercicio4
    1. Renombrá variables mal nombradas en un código antiguo.
    2. Reordená un código desordenado aplicando indentación correcta.
    3. Detectá comentarios innecesarios y eliminarlos.
    4. Separá un método largo en métodos más pequeños.
     */

    //codigo malo
    /*
    public class b {

        int a=10;
        int b=5;

        void c(){
            System.out.println(a+b);
        }
    }
    */

    //codigo bien
    // Nombre de la clase claro y representativo
    public class Calculadora {

        // Variables con nombres descriptivos
        int numeroUno = 10;
        int numeroDos = 5;

        // Método con una única responsabilidad:
        // calcular y mostrar la suma de dos números
        void mostrarSuma() {
            int resultado = numeroUno + numeroDos;
            System.out.println("Resultado de la suma: " + resultado);
        }
    }

}
