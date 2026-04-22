
## 1) Descripción

En este tema aprendemos qué son los **tipos de datos en Java**, para qué sirven y por qué son fundamentales al momento de declarar variables.  
Los tipos de datos determinan **qué tipo de información puede almacenar una variable**, cuánta memoria ocupa y qué operaciones se pueden realizar con ella.

Este concepto es clave porque **todo programa en Java trabaja con datos**, y entenderlos correctamente evita errores y comportamientos inesperados.

---

## 2) Teoría

En Java, los tipos de datos se dividen en **dos grandes grupos**:

### 🔹 Tipos de datos primitivos
Son los tipos más básicos del lenguaje.  
Almacenan valores simples y **no son objetos**.

| Tipo | Tamaño | Descripción | Ejemplo |
|----|----|----|----|
| byte | 8 bits | Números enteros pequeños | `byte edad = 25;` |
| short | 16 bits | Enteros medianos | `short año = 2025;` |
| int | 32 bits | Enteros más usados | `int puntos = 100;` |
| long | 64 bits | Enteros grandes | `long poblacion = 8000000L;` |
| float | 32 bits | Decimales (menos precisión) | `float altura = 1.75f;` |
| double | 64 bits | Decimales (más precisión) | `double precio = 199.99;` |
| char | 16 bits | Un solo carácter | `char letra = 'A';` |
| boolean | 1 bit aprox. | Verdadero o falso | `boolean activo = true;` |

📌 ==**Notas importantes**:==
- ==`int` y `double` son los más utilizados.==
- ==`char` usa comillas simples `'A'`.==
- ==`float` requiere la letra `f` al final del valor.==

---

### 🔹 Tipos de datos de referencia
No almacenan el valor directamente, sino una **referencia a un objeto**.

Ejemplos comunes:
- `String`
- Arrays
- Clases personalizadas

```java
String nombre = "Walter";
```

📌 A diferencia de los primitivos, los tipos de referencia:

- Pueden ser `null`
    
- Tienen métodos
    
- Ocupan más memoria

### 🔹 Strings en Java

Los **Strings** representan cadenas de texto y son uno de los tipos de referencia más usados en Java.
#### Características principales:

- Son objetos, no tipos primitivos.
- Son **inmutables**: una vez creados, su valor no puede cambiar.
- Se pueden comparar con `equals()` y no con `==` (que compara referencias, no contenido).
- Se pueden concatenar usando el operador `+`.
#### Ejemplos básicos:

```java
String nombre = "Walter";
String saludo = "Hola, " + nombre + "!";

System.out.println(saludo); // Salida: Hola, Walter!
```

#### Métodos más comunes de String:

|Método|Descripción|Ejemplo|
|---|---|---|
|`length()`|Devuelve la cantidad de caracteres|`"Hola".length()` → 4|
|`charAt(int index)`|Devuelve el carácter en la posición indicada|`"Hola".charAt(1)` → 'o'|
|`substring(int inicio, int fin)`|Extrae parte de la cadena|`"Hola".substring(1,3)` → "ol"|
|`toUpperCase()` / `toLowerCase()`|Convierte a mayúsculas/minúsculas|`"Hola".toUpperCase()` → "HOLA"|
|`equals(String otro)`|Compara contenido|`"Hola".equals("hola")` → false|
|`contains(String s)`|Verifica si contiene un texto|`"Hola mundo".contains("mundo")` → true|
|`trim()`|Elimina espacios al inicio y fin|`" Hola ".trim()` → "Hola"|

#### Buenas prácticas con Strings:

- Usar `equals()` para comparar contenido, nunca `==`.
    
- Para muchas concatenaciones, usar **`StringBuilder` o `StringBuffer`** para mejorar eficiencia.
    
- Aprovechar métodos de manipulación de cadenas en lugar de escribir lógica manual.
  
  ejemplo:
```java
	String frase = "Java es divertido";
	System.out.println("Longitud: " + frase.length());
	System.out.println("Primer caracter: " + frase.charAt(0));
	System.out.println("Subcadena: " + frase.substring(0, 4));
	System.out.println("En mayúsculas: " + frase.toUpperCase());
```

#### IMPRIMIR EN PANTALLA SEGUN TIPO DE DATO UTILIZANDO PRINTF

| Código | Tipo de dato   | Significado                     | Ejemplo         |
| ------ | -------------- | ------------------------------- | --------------- |
| `%s`   | String         | texto                           | `"Hola %s"`     |
| `%d`   | int            | entero (decimal)                | `"Edad: %d"`    |
| `%f`   | double / float | decimal                         | `"Altura: %f"`  |
| `%b`   | boolean        | true / false                    | `"Activo: %b"`  |
| `%c`   | char           | carácter                        | `"Letra: %c"`   |
| `%x`   | int            | hexadecimal                     | `"Hex: %x"`     |
| `%o`   | int            | octal                           | `"Octal: %o"`   |
| `%e`   | double         | notación científica             | `"%.2e"`        |
| `%n`   | —              | salto de línea (mejor que `\n`) | `"Hola%nMundo"` |
| `%%`   | —              | imprime `%`                     | `"100%%"`       |
|        |                |                                 |                 |

ejemplo:
```java
String nombre = "Walter";
int edad = 33;
double altura = 1.81;
boolean activo = true;

System.out.printf("Nombre: %s%nEdad: %d%nAltura: %.2f%nActivo: %b%n",
                  nombre, edad, altura, activo);
```

## Detalles importantes

##  `%.2f`
 controla decimales

%.2f → 2 decimales

##  `%n` vs `\n`

 `%n` es más correcto en `printf`

```java
System.out.printf("Hola%nMundo");
```

✔️ portable  
✔️ recomendado en Java

## `%%`

```java
System.out.printf("Progreso: 100%%");
```

imprime `100%`

## 3) Notas adicionales

- Elegir correctamente el tipo de dato mejora rendimiento y claridad.
    
- No usar tipos más grandes de lo necesario.
    
- ==`String` no es un tipo primitivo.==
    
- Java es **fuertemente tipado**: no permite mezclar tipos sin conversión.
    

---

## 4) Conceptos clave

- Tipos primitivos
    
- Tipos de referencia
    
- Memoria
    
- Variables
    
- Fuertemente tipado
    

---

## 5) Resumen final

Los tipos de datos son la base de cualquier programa en Java.  
Entenderlos correctamente permite escribir código más seguro, eficiente y fácil de mantener, y prepara el terreno para trabajar con clases, objetos y estructuras más complejas.