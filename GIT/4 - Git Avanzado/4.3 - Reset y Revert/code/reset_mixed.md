
#git #reset #mixed #staging #head

---
## Descripción

El comando `git reset --mixed` se utiliza para mover el puntero **HEAD** a un commit anterior y **limpiar el área de staging**, manteniendo los cambios únicamente en el working directory.

Es el modo **por defecto** de `git reset` cuando no se especifica una opción.

---

## Comando / Flujo

```bash
git reset --mixed <commit>
```

Ejemplo: `git reset HEAD~1`


---

## Explicación
Cuando se ejecuta un `reset --mixed`:

- El puntero **HEAD** se mueve al commit indicado
- El área de staging se vacía
- Los cambios permanecen en los archivos del proyecto
- El historial se reescribe

Estado resultante:
- Working Directory: conserva los cambios
- Staging Area: vacío
- Historial: reescrito

---

## Ejemplo práctico

Situación inicial: `A -- B -- C (HEAD)`

Ejecutamos:
```bash
git reset --mixed B
```

Resultado: `A -- B (HEAD)`


- El commit `C` desaparece del historial
- Los cambios de `C` quedan sin stage
- Se pueden revisar o seleccionar archivos antes de volver a commitear

---

## Cuándo usarlo
- Quitar archivos del staging sin perder cambios
- Reorganizar commits recientes
- Revisar cambios antes de volver a agregar con `git add`
- Trabajo local previo a un nuevo commit

---

## Notas
- Es el comportamiento por defecto de `git reset`
- No usar en ramas compartidas
- Muy útil para control fino del staging
- Combina bien con `git status`
