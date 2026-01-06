(annotated)
#git #tags #annotated #versionado #releases

---
## Descripción

Un **tag anotado** es un tipo de tag más completo y profesional en Git.  
A diferencia del tag ligero, este **almacena información adicional** como el autor, la fecha y un mensaje descriptivo.

Es el tipo de tag **recomendado para marcar versiones oficiales o releases** del proyecto.

---

## Comando / Flujo

Crear un tag anotado sobre el commit actual:
```bash
git tag -a <nombre-del-tag> -m "mensaje del tag"
```

Ejemplo:
```bash
git tag -a v1.0 -m "Release inicial estable"
```

Crear un tag anotado sobre un commit específico:
```bash
git tag -a <nombre-del-tag> <commit-sha> -m "mensaje del tag"
```

Ejemplo:
```bash
git tag -a v1.1 a1b2c3d -m "Mejoras en autenticación"
```


---

## Explicación
- La opción `-a` indica que se crea un **tag anotado**.
- Git genera un objeto adicional que contiene:
  - nombre del autor
  - correo
  - fecha
  - mensaje descriptivo
- El tag queda fijado al commit indicado y **no se mueve** con nuevos commits.
- Este tipo de tag es el más utilizado en flujos profesionales.

---

## Verificación

Listar los tags:

```bash
git tag
```

Ver información detallada del tag:

```bash
git show v1.0
```


El comando mostrará el mensaje del tag y el commit al que apunta.

---
## Notas

- Los tags anotados pueden **firmarse con GPG** (`-s`).
- Son ideales para integrarse con sistemas de releases.
- Permiten auditoría clara de versiones.
- Pueden apuntar a cualquier commit del historial.

---

## Buenas prácticas y errores comunes

**Buenas prácticas**
- Usar tags anotados para versiones publicadas.
- Seguir versionado semántico (`v1.0.0`).
- Escribir mensajes claros y descriptivos.
- Crear el tag solo cuando el estado sea estable.

**Errores comunes**
- Usar tags ligeros para releases.
- Crear tags sin mensaje significativo.
- Modificar o borrar tags ya publicados.

