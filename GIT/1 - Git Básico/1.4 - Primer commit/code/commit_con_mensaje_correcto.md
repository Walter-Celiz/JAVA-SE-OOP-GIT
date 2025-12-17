## Descripción

El mensaje del commit es la **explicación breve y clara del cambio que se está guardando**.  
Un buen mensaje permite entender el historial del proyecto sin necesidad de revisar el código.

Es especialmente importante desde el primer commit para mantener un historial legible y profesional.

---

## Comando / Flujo

```
git commit -m "mensaje descriptivo del commit"
```

---

## Explicación

El mensaje del commit debe describir **qué se hizo**, no cómo ni por qué en detalle.

Características de un buen mensaje:

- Claro
- Corto
- Descriptivo
- Relacionado con el cambio realizado

En el primer commit, el mensaje suele indicar la creación inicial del proyecto.

Ejemplos correctos:
- `Initial commit`
- `Primer commit del proyecto`
- `Estructura inicial del repositorio`

---
## Convenciones comunes para mensajes de commit

Además de ser claro y descriptivo, en muchos proyectos profesionales se utiliza una **convención** para estandarizar los mensajes de commit.

Una de las más conocidas es **Conventional Commits**, que propone comenzar el mensaje con una palabra clave que indique el tipo de cambio realizado.

### Prefijos más usados

- ==**feat**: se agrega una nueva funcionalidad o contenido.==
- ==**fix**: se corrige un error.==
- ==**docs**: cambios solo en documentación.==
- ==**style**: cambios de formato (espacios, orden, estilo) sin afectar el contenido.==
- ==**refactor**: reestructuración del código sin cambiar su comportamiento.==
- ==**test**: agregado o modificación de tests.==
- ==**chore**: tareas de mantenimiento o configuración.==

Ejemplo de mensaje siguiendo esta convención:
`feat: agregar ejemplos sobre ramas y HEAD`

### Aclaraciones importantes

- Esta convención **no es obligatoria** en Git.
- Su uso depende del equipo o del proyecto.
- Ayuda a mantener un historial más claro y profesional.
- Lo más importante sigue siendo que el mensaje explique **qué se hizo** y **por qué**.

---

## Notas

### Buenas prácticas

- Usar verbo en presente (crear, agregar, configurar)
- Evitar mensajes largos o ambiguos
- Mantener consistencia en el estilo de mensajes
- Pensar en el mensaje como documentación

### Errores comunes

- Usar mensajes genéricos (`update`, `changes`)
- Incluir demasiada información técnica
- Escribir mensajes poco claros
- Dejar mensajes vacíos o irrelevantes
