## 1) Descripción

Los **operadores** en Java permiten realizar operaciones sobre variables y valores.  
Son una parte esencial del lenguaje, ya que gracias a ellos podemos **calcular**, **comparar**, **evaluar condiciones** y **modificar estados**.

Este tema es fundamental porque los operadores se utilizan en:
- Condicionales (`if`, `else`)
- Bucles (`while`, `for`)
- Lógica de negocio
- Mecánicas de juegos (vida, daño, experiencia, estados)

Dominar los operadores es un paso obligatorio antes de avanzar hacia estructuras de control.

---

## 2) Teoría

En Java, los operadores se agrupan según el tipo de operación que realizan.

### 2.1 Operadores aritméticos

Permiten realizar cálculos matemáticos básicos.

| Operador | Descripción |
|--------|-------------|
| `+` | Suma |
| `-` | Resta |
| `*` | Multiplicación |
| `/` | División |
| `%` | Módulo (resto de la división) |

Ejemplos conceptuales:
- `10 / 3` → `3`
- `10 % 3` → `1`

⚠️ **Importante**  
Si ambos valores son enteros, el resultado también será entero.

---

### 2.2 Operadores de asignación

Se utilizan para asignar valores a las variables.

| Operador | Ejemplo | Equivalente |
|--------|--------|------------|
| `=` | `x = 5` | Asignación directa |
| `+=` | `x += 2` | `x = x + 2` |
| `-=` | `x -= 1` | `x = x - 1` |
| `*=` | `x *= 3` | `x = x * 3` |
| `/=` | `x /= 2` | `x = x / 2` |

Estos operadores ayudan a escribir código **más limpio y legible**.

---

### 2.3 Operadores de comparación (relacionales)

Comparan valores y devuelven un resultado booleano (`true` o `false`).

| Operador | Significado |
|--------|-------------|
| `==` | Igual a |
| `!=` | Distinto de |
| `>` | Mayor que |
| `<` | Menor que |
| `>=` | Mayor o igual que |
| `<=` | Menor o igual que |

Ejemplo conceptual:
- `vida > 0`

⚠️ **Error común**  
No confundir:
- `=` → asignación  
- `==` → comparación

---

### 2.4 Operadores lógicos

Permiten combinar condiciones booleanas.

| Operador | Nombre | Descripción |
|--------|--------|-------------|
| `&&` | AND | Ambas condiciones deben ser verdaderas |
| `||` | OR | Al menos una condición debe ser verdadera |
| `!` | NOT | Niega el valor de la condición |

Ejemplos conceptuales:
- `vida > 0 && energia > 10`
- `!estaMuerto`

---

### 2.5 Operadores de incremento y decremento

Sirven para aumentar o disminuir el valor de una variable en una unidad.

| Operador | Ejemplo |
|--------|--------|
| `++` | `nivel++` |
| `--` | `vidas--` |

Diferencia importante:
- `++x` → incrementa primero
- `x++` → incrementa después

Este detalle será clave cuando se estudien los bucles.

---

### 2.6 Operador de concatenación

El operador `+` también se utiliza para unir textos (`String`).

Ejemplo conceptual:
- `"Vida: " + vida`

Si uno de los valores es `String`, Java convierte automáticamente el resto.

---

### 2.7 Precedencia de operadores

No todos los operadores se ejecutan en el mismo orden.

Orden simplificado de prioridad:
1. Paréntesis `()`
2. Multiplicación, división, módulo
3. Suma y resta
4. Comparaciones
5. Operadores lógicos
6. Asignación

==👉 Usar paréntesis mejora la claridad y evita errores lógicos.==

---
## 3) Integración RPG

Aplicaciones típicas en un juego:
- Restar vida al recibir daño → `vida -= dano`
- Verificar si puede atacar → `vida > 0 && stamina > 10`
- Subir de nivel → `nivel++`
- Mostrar estado del personaje → `"HP: " + vida + "/" + vidaMax`

Los operadores son la **base de la lógica del combate, estados y reglas del juego**.

---
## 4) Notas adicionales

- Usá paréntesis para mejorar la legibilidad
- Evitá expresiones demasiado largas
- No mezcles asignaciones y comparaciones en una misma línea
- Prioriza claridad antes que complejidad

---
## 5) Resumen final

- Los operadores permiten operar, comparar y tomar decisiones
- Java ofrece operadores aritméticos, lógicos, relacionales y de asignación
- Son indispensables para condicionales y bucles
- Un buen uso de operadores produce código claro y mantenible
