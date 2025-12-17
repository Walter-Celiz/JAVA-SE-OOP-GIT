## Descripción

Un rebase simple consiste en **mover una rama de trabajo** para que continúe desde el último commit de otra rama.

Es el uso más común de `git rebase`.

---
## Flujo

```
git checkout feature  
git rebase main
```

---

## Qué ocurre

- Los commits de `feature` se separan
- `feature` se coloca sobre `main`
- Los commits se reaplican uno a uno

---

## Representación conceptual

Antes:

```
A---B---C (main)
     \
      D---E (feature)
```

Después:

```
A---B---C---D'---E' (feature)
```

---

## Notas

- Los commits D y E cambian su hash
- No se crea commit de merge
- El historial queda lineal


