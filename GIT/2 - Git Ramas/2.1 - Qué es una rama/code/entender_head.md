## Descripción

Este ejemplo explica qué es **HEAD** en Git y cómo se relaciona con las ramas y los commits.

Comprender HEAD es fundamental para entender cómo Git sabe **dónde estás parado** dentro del historial del repositorio.

---

## Comando

```
git branch  
git status
```

---

## Explicación

En Git, **HEAD** es un puntero especial que indica:

- La **rama actual**
- El **commit actual** sobre el que estás trabajando

Normalmente, HEAD apunta a una rama, y esa rama apunta a un commit.

Ejemplo conceptual: `HEAD -> feature-login -> commit`


Cuando hacés un commit:
- El commit se agrega al final de la rama activa.
- La rama avanza al nuevo commit.
- HEAD se mueve junto con la rama.

Si cambiás de rama:
- HEAD pasa a apuntar a la nueva rama.
- El contenido del proyecto se actualiza al estado de esa rama.

---

## Notas

### Buenas prácticas

- Entender HEAD evita confusiones al cambiar de ramas.
- Verificá siempre la rama activa antes de trabajar.
- Usá HEAD como referencia mental de “dónde estoy en el proyecto”.

### Errores comunes

- Pensar que HEAD es un commit fijo.
- Confundir HEAD con la rama `main`.
- No entender por qué los archivos cambian al cambiar de rama.

---



