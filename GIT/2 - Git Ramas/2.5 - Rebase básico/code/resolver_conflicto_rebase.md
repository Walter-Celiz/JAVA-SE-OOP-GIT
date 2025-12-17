## Descripción

Durante un rebase pueden surgir conflictos si Git no puede aplicar un commit automáticamente.

Git detiene el proceso y espera intervención manual.

---

## Flujo

```
git rebase main
```


Si hay conflicto:
```
Auto-merging archivo.txt  
CONFLICT (content): Merge conflict in archivo.txt
```


---

## Pasos para resolver

1. Abrir el archivo con conflicto
2. Elegir o combinar los cambios
3. Guardar el archivo
4. Marcarlo como resuelto

```
git add archivo.txt
```


---

## Importante

- El rebase queda **pausado**
- No se debe hacer commit manual
- Git espera una orden explícita
