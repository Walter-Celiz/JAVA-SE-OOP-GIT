
#git #reset #hard #historial #workingdirectory

---
## Descripción

El comando `git reset --hard` se utiliza para mover el puntero **HEAD** a un commit anterior y **descartar completamente** los cambios tanto del área de staging como del working directory.

Es el modo más **peligroso** de `git reset`, ya que puede provocar **pérdida irreversible de información**.

---

## Comando / Flujo

```bash
git reset --hard <commit>
```

Ejemplo:

```bash
git reset --hard HEAD~1
```


---

## Explicación
Cuando se ejecuta un `reset --hard`:

- El puntero **HEAD** se mueve al commit indicado
- El área de staging se limpia
- Los archivos del working directory se restauran al estado del commit
- Los commits posteriores desaparecen del historial

Estado resultante:
- Working Directory: restaurado
- Staging Area: vacío
- Historial: reescrito

---

## Ejemplo práctico

Situación inicial: `A -- B -- C (HEAD)`

Ejecutamos:``git reset --hard B`

Resultado: `A -- B (HEAD)`


- El commit `C` desaparece
- Los cambios de `C` se pierden
- El proyecto queda exactamente como en `B`

---

## Cuándo usarlo
- Descartar cambios locales que no sirven
- Volver a un estado limpio del proyecto
- Corregir errores antes de hacer push
- Reiniciar un entorno de trabajo

---

## Notas
- No usar jamás en ramas compartidas
- Usar solo si estás seguro de perder los cambios
- Considerar `git stash` antes de ejecutarlo
- Verificar siempre con `git status` y `git log`
