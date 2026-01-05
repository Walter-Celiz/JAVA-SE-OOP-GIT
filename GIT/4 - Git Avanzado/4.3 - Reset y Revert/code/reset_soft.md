
#git #reset #soft #head #historial

---
## Descripción

El comando `git reset --soft` se utiliza para mover el puntero **HEAD** a un commit anterior **sin modificar** ni el área de staging ni los archivos del working directory.

Es ideal cuando se quiere **deshacer uno o más commits**, pero **mantener los cambios preparados** para crear un nuevo commit corregido.

---

## Comando / Flujo

```bash
git reset --soft <commit>
```

Ejemplo:

```bash
git reset --soft HEAD~1
```

---
## Explicación

Cuando se ejecuta un `reset --soft`:

- El puntero **HEAD** se mueve al commit indicado
- Los commits posteriores dejan de existir en el historial
- **Todos los cambios permanecen en staging**
- Ningún archivo es modificado

Estado resultante:
- Working Directory: sin cambios
- Staging Area: conserva los cambios
- Historial: reescrito

---

## Ejemplo práctico

Situación inicial: `A -- B -- C (HEAD)`

Ejecutamos:

```bash
git reset --soft B
```

Resultado: `A -- B (HEAD)`


- El commit `C` desaparece del historial
- Los cambios de `C` siguen en staging
- Se puede crear un nuevo commit corregido

---

## Cuándo usarlo

- Corregir el mensaje de un commit
- Unir varios commits recientes en uno solo
- Ajustar el contenido antes de volver a commitear
- Trabajo local antes de hacer push

---

## Notas

- No usar en ramas ya publicadas
- Es el modo de reset más seguro
- Ideal antes de un `git commit --amend`
- Siempre revisar el historial antes con `git log --oneline`
