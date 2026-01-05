
#git #revert #historial #seguridad #trabajoenequipo

---
## Descripción
El comando `git revert` se utiliza para **deshacer los cambios de un commit específico** creando un **nuevo commit inverso**, sin modificar el historial existente.

Es la forma **más segura** de deshacer cambios en ramas compartidas o en producción.

---

## Comando / Flujo

```bash
git revert <commit>
```

Ejemplo: `git revert HEAD`


---

## Explicación

Cuando se ejecuta `git revert`:

- Git identifica los cambios del commit indicado
- Aplica la operación inversa sobre el código
- Crea un **nuevo commit**
- El historial **no se reescribe**

Estado resultante:
- Working Directory: cambios revertidos
- Staging Area: commit automático
- Historial: preservado

---

## Ejemplo práctico

Situación inicial: `A -- B -- C (HEAD)`

Ejecutamos: `git revert C`

Resultado: `A -- B -- C -- C`


- `C'` revierte los cambios de `C`
- El historial queda completo y trazable
- Ideal para auditoría y trabajo en equipo

---

## Cuándo usarlo

- Deshacer un commit ya publicado
- Corregir errores en producción
- Trabajo colaborativo
- Mantener historial limpio y seguro

---

## Notas

- Puede generar conflictos si hay cambios posteriores
- Se puede revertir más de un commit
- Revertir un revert restaura los cambios
- Recomendado frente a `reset` en equipos
