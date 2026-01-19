## 1) Descripción

Las variables son uno de los conceptos más importantes de la programación.  
Permiten **almacenar datos en memoria** para poder usarlos, modificarlos y consultarlos durante la ejecución del programa.

En Java, aprender variables es clave porque:
- Todo el lenguaje se basa en el manejo de datos
- Son la base para métodos, clases, objetos y lógica del programa
- Se usan constantemente en cualquier aplicación real (y en el RPG)

---
## 2) Teoría

### ¿Qué es una variable?
Una variable es un **espacio en memoria** que tiene:
- Un **tipo de dato**
- Un **nombre**
- Un **valor**

Ejemplo conceptual:

```java
int edad = 25;
```

- `int` → tipo de dato
- `edad` → nombre de la variable
- `25` → valor almacenado

---

### Declaración de variables

Declarar una variable significa **crear el espacio en memoria**:

```java
int numero;
```

Todavía no tiene valor.

---
### Inicialización de variables

Inicializar es **asignar un valor por primera vez**:

```java
numero = 10;
```

---
### Declaración + inicialización

Lo más común es hacer ambas cosas juntas:

```java
int numero = 10;
```

---

### Tipos de variables según su alcance (introductorio)

Por ahora veremos solo **variables locales**, que:
- Se declaran dentro de un método
- Solo existen mientras el método se ejecuta

Más adelante veremos:
- Variables de instancia
- Variables de clase (static)

---

### Reglas para nombrar variables

✔️ Deben empezar con letra, `_` o `$`  
✔️ No pueden empezar con números  
✔️ No pueden usar palabras reservadas (`int`, `class`, `public`, etc.)  
✔️ Se recomienda **camelCase**

Ejemplos correctos:

```java
int edad;  
int puntosTotales;  
double vidaActual;
```

Ejemplos incorrectos:

```java
int 1edad;  
int class;  
int vida-actual;
```


---

### Buenas prácticas

- Usar nombres descriptivos
- Evitar nombres como `x`, `a`, `temp` (salvo casos muy específicos)
- Declarar las variables lo más cerca posible de donde se usan

---
## 3) Integración RPG

En el RPG, las variables representan el **estado del juego**:

Ejemplos:

- Vida del personaje
    
- Daño del arma
    
- Nivel del jugador
    
- Cantidad de oro
    
- Estado del enemigo
    

Ejemplo conceptual:

```java
int vidaJugador = 100;
int ataqueEspada = 25;
boolean enemigoVivo = true;
```

Sin variables, un juego (o cualquier programa) **no podría existir**.

---

## 5) Notas adicionales

- Java es **fuertemente tipado**: no podés cambiar el tipo de una variable
    
- Una variable debe inicializarse antes de usarse
    
- El compilador de Java detecta muchos errores antes de ejecutar el programa
    
- Este tema se conecta directamente con:
    
    - Tipos de datos
        
    - Operadores
        
    - Condicionales

