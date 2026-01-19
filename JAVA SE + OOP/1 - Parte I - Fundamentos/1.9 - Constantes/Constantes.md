## 1) Descripción

En esta unidad aprenderás qué son las **constantes en Java**, cómo declararlas correctamente y **por qué son fundamentales para escribir código claro, seguro y mantenible**.

Las constantes permiten representar valores que **no deben cambiar durante la ejecución del programa**, como configuraciones, límites, reglas del juego o valores fijos del sistema.

---

## 2) Teoría

### ¿Qué es una constante?

Una **constante** es una variable cuyo valor **no puede modificarse una vez asignado**.

En Java, las constantes se declaran usando la palabra clave:

```java
final
```
### Sintaxis básica

```java
final tipo NOMBRE_CONSTANTE = valor;
```

Ejemplo:

```java
final int VIDA_MAXIMA = 100;
```

### Reglas importantes

- `final` indica que el valor **no puede cambiar**
- Debe inicializarse **al momento de declararse**
- Por convención, el nombre se escribe en:
  - MAYÚSCULAS
  - Separado por `_`

Ejemplos:

```java
final double PI = 3.1416;  
final String NOMBRE_JUEGO = "RPG Java";  
final boolean ES_MODO_DEBUG = false;
```

### ¿Por qué usar constantes?

- Evitan errores accidentales
- Mejoran la legibilidad
- Facilitan el mantenimiento
- Centralizan valores importantes

Ejemplo:

❌ Malo

```java
vida = vida - 10;
```

✅ Bueno

```java
vida = vida - DANIO_ENEMIGO;
```

---

## 3) Integración RPG

Ejemplos de uso real:

```java
final int VIDA_MAXIMA_GUERRERO = 150;  
final int DANIO_CRITICO = 30;  
final String ESTADO_MUERTO = "DEAD";  
final String ESTADO_VIVO = "ALIVE";
```


Permiten:
- Centralizar reglas del juego
- Evitar inconsistencias
- Mejorar la expresividad del código

---

## 4) Notas adicionales

Buenas prácticas:
- Usar constantes para valores repetidos
- Nombres claros y descriptivos
- Solo para valores realmente fijos

Errores comunes:
- No inicializar la constante
- Usar minúsculas en el nombre
- Intentar modificarla luego

---

## Resumen final

- Las constantes se declaran con `final`
- Su valor no cambia
- Mejoran claridad y seguridad
- Son fundamentales en proyectos grandes y RPG
