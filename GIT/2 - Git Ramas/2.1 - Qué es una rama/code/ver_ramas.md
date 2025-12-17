# Ver ramas en Git

## Descripción

Este ejemplo muestra cómo **listar las ramas existentes** en un repositorio Git y entender cuál es la rama activa en ese momento.

Es uno de los primeros comandos que se deben conocer al comenzar a trabajar con ramas.

---

## Comando 

```
git branch
```


---

## Explicación

- El comando `git branch` lista **todas las ramas locales** del repositorio.
- La rama en la que estás trabajando actualmente aparece marcada con un `*` (asterisco).
- La salida típica se ve así:

```
*main  
feature-login  
hotfix-bug
```

En este caso:
- `main` es la rama activa.
- `feature-login` y `hotfix-bug` existen, pero no están activas.

---

## Notas

### Buenas prácticas

- Verificá siempre en qué rama estás antes de hacer commits.
- Usá este comando frecuentemente para evitar trabajar en la rama incorrecta.
- Combiná este comando con otros de navegación de ramas (`switch`, `checkout`).

### Errores comunes

- Asumir que estás en `main` sin comprobarlo.
- Hacer cambios importantes sin saber la rama activa.
- Confundir ramas locales con ramas remotas (este comando solo muestra las locales).

---

