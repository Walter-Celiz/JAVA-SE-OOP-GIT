## Descripción

Si el rebase se vuelve complejo o incorrecto, es posible **cancelarlo por completo** y volver al estado anterior.

---
## Comando

```
git rebase --abort
```

---
## Qué ocurre

- Se descarta todo el rebase en curso
- La rama vuelve a su estado original
- No se pierden commits

---
## Cuándo usarlo

- Conflictos demasiado complejos
- Rebase iniciado por error
- Cambios incorrectos detectados

---
## Advertencia

- Solo funciona mientras el rebase esté activo
- Una vez finalizado, no se puede abortar


