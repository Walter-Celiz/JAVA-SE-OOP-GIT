public class ConfiguracionJVM {

    public static void main(String[] args) {

        // Información de la JVM y Java
        System.out.println("Versión de Java: " + System.getProperty("java.version"));
        System.out.println("Proveedor de Java: " + System.getProperty("java.vendor"));
        System.out.println("Directorio de Java: " + System.getProperty("java.home"));

        // Información del sistema operativo
        System.out.println("Sistema Operativo: " + System.getProperty("os.name"));
        System.out.println("Arquitectura: " + System.getProperty("os.arch"));
        System.out.println("Usuario: " + System.getProperty("user.name"));
    }

}
