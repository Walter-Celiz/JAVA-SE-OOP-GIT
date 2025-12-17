##  Descripción

Una vez resuelto el conflicto, es necesario **informar a Git** que el problema fue solucionado y confirmar el merge.

---

##  Flujo correcto

```
git status
git add archivo_resuelto.txt
git commit
```

---

##  El commit

- Este commit **finaliza el merge**
- Representa la resolución del conflicto
- No debe incluir cambios adicionales innecesarios

---

##  Resultado final

- El merge se completa
- El repositorio vuelve a un estado normal
- El historial registra la resolución

---

##  Error común

❌ Olvidar hacer `git add`  
❌ Intentar commitear sin resolver todos los conflictos
