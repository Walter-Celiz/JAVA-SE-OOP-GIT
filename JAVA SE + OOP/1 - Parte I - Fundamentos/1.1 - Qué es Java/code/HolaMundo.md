## 1) Descripción

Este ejemplo representa el **primer contacto práctico con Java**.  
Su objetivo es comprender la **estructura mínima de un programa Java**, cómo se define una clase y cuál es el punto de entrada de ejecución.

Este archivo acompaña al tema teórico **1.1 – Qué es Java** y sirve como base para todos los programas que se desarrollarán más adelante.


---

## 2) Teoría

Todo programa Java necesita:

- Una **clase**
- Un **método principal (`main`)**
- Instrucciones que se ejecutan dentro de ese método

Puntos clave a recordar:

- El nombre del archivo debe coincidir con el nombre de la clase
- Java distingue entre mayúsculas y minúsculas
- La ejecución siempre comienza en el método `main`


---

## 3) Código

Archivo: `HolaMundo.java`

```java
	public class HolaMundo {
	public static void main(String[] args) {     
		System.out.println("Hola mundo desde Java"); 
	}
}
```

### Explicación del código

- `public class HolaMundo`  
  Define una clase llamada **HolaMundo**.  
  El nombre debe coincidir exactamente con el archivo `HolaMundo.java`.

- `public static void main(String[] args)`  
  Es el **punto de entrada** del programa.  
  Java comienza la ejecución desde este método.

- `System.out.println(...)`  
  Imprime un mensaje en la consola del sistema.

---

- `class`  
    → Define una **clase** (un molde)
    
- `public`  
    → Hace que Java pueda **ver** esa clase desde afuera
    
- `main`  
    → Es el **punto de inicio** del programa
    
- `static` y `void`  
    → **Existen**, pero no hace falta dominarlos todavía


---

## 4) Ejercicios

1. Cambiá el mensaje para que muestre tu nombre.
2. Agregá una segunda línea que diga:  
   `Aprendiendo Java desde cero`
3. Probá qué sucede si el nombre del archivo no coincide con el nombre de la clase.


---

## 5) Integración RPG

En el proyecto RPG:

- La clase `HolaMundo` representa el **inicio del juego**
- El método `main` será el punto donde se iniciará la lógica principal
- Más adelante, desde `main`, se crearán personajes, mapas y combates


---

## 6) Recursos

- Documentación oficial de Java
- Concepto de método `main`
- Salida estándar en Java (`System.out.println`)


---

## 7) Notas adicionales

- Usá `Ctrl + Alt + L` para formatear el código en IntelliJ
- No escribas instrucciones fuera de una clase
- Este ejemplo es intencionalmente simple
- Todos los programas Java partirán de esta estructura básica
