## 1) Código

```java
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
```


### 🔍 ¿Qué demuestra este código?

- El programa se ejecuta dentro de la **JVM**
- Accede a propiedades del entorno Java
- Confirma la independencia del sistema operativo
- Muestra información real del runtime

---

## 2) Ejercicios

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
