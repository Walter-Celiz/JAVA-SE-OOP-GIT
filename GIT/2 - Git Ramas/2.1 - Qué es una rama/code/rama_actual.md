## Descripción

Este ejemplo explica cómo **identificar la rama activa** en un repositorio Git y entender qué significa trabajar sobre una rama específica.

Saber cuál es la rama actual es fundamental antes de realizar cambios o commits.

---

## Comando 

```
git branch
```

---

## Explicación

Al ejecutar el comando `git branch`, Git muestra la lista de ramas locales.

- La rama activa se indica con un **asterisco (`*`)** al inicio de la línea.
- Esa rama es donde se aplicarán todos los cambios y commits.

Ejemplo de salida:

```
main
*feature-login
```

En este caso:
- La rama activa es `feature-login`.
- Cualquier cambio realizado impactará únicamente en esa rama.
- La rama `main` no se verá afectada hasta que se haga un merge.

---

## Notas

### Buenas prácticas

- Comprobá siempre la rama actual antes de empezar a trabajar.
- Evitá hacer commits en `main` directamente si el proyecto lo requiere.
- Usá ramas específicas para cada funcionalidad o corrección.

### Errores comunes

- Olvidar verificar la rama activa antes de commitear.
- Pensar que cambiar de rama copia los archivos (Git solo mueve el puntero).
- Mezclar cambios de distintas tareas en una misma rama.

---



