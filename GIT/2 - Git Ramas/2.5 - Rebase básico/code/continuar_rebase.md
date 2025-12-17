## Descripción

Una vez resuelto un conflicto, se debe indicar a Git que continúe con el proceso de rebase.

---
## Comando

```
git rebase --continue
```

---

## Qué hace Git

- Toma el commit actual
- Aplica el siguiente commit pendiente
- Repite el proceso hasta finalizar

---

## Posibles resultados

- Rebase finaliza correctamente
- Aparece un nuevo conflicto
- Git solicita continuar nuevamente

---
## Notas

- Puede requerir varios ciclos de resolución
- Cada conflicto corresponde a un commit distinto


