## Descripción

El **merge no fast-forward** ocurre cuando la rama destino **sí tiene commits propios** además de los commits de la rama que se quiere integrar.

En este caso, Git **no puede simplemente avanzar el puntero**, porque el historial ya se bifurcó.  
Para resolverlo, Git crea un **commit de merge** que une ambos historiales.

---

## Comando

Flujo típico de un merge no fast-forward:

```
git checkout main  
git merge feature
```

Si ambas ramas tienen commits diferentes, Git realizará automáticamente un **merge no fast-forward**.

También se puede forzar este comportamiento con:

```
git checkout main  
git merge --no-ff feature
```

---

## Explicación paso a paso

1. Se crea una rama nueva desde `main`.
2. Se realizan commits en la rama `feature`.
3. Mientras tanto, `main` también recibe uno o más commits.
4. Al ejecutar el merge:
   - Git detecta historiales divergentes.
   - Combina los cambios de ambas ramas.
   - Crea un commit de merge.

---

## Representación gráfica

### Antes del merge

```
A---B---C (main)  
  
D---E (feature)
```


- `main` avanzó hasta `C`
- `feature` avanzó hasta `E`
- El historial se bifurcó

---

### Después del merge no fast-forward

```
- `main` avanzó hasta `C`
- `feature` avanzó hasta `E`
- El historial se bifurcó
```

---
### Después del merge no fast-forward

```
A---B---C------M (main)  
\ /  
D------E (feature)
```


- `M` es el commit de merge
- Se conserva el contexto del trabajo en ramas

---

## Características principales

- Se crea un commit de merge.
- El historial no es completamente lineal.
- Se conserva la información de la rama integrada.
- Refleja trabajo en paralelo.

---

## Cuándo ocurre un merge no fast-forward

Este tipo de merge ocurre cuando:

- La rama destino tiene commits propios.
- Hubo trabajo simultáneo en ambas ramas.
- El historial ya se separó en dos caminos.

---

## Buenas prácticas

- Usar merge no fast-forward para integrar features completas.
- Revisar los cambios antes de confirmar el merge.
- Mantener mensajes claros en commits de merge.
- Entender el historial antes de ejecutar el merge.

---

## Errores comunes

- No comprender por qué Git crea un commit adicional.
- Pensar que el historial quedó “sucio”.
- Forzar fast-forward cuando no corresponde.
- Confundir merge no fast-forward con rebase.

---

## Notas

- Git crea este tipo de merge automáticamente cuando no puede hacer fast-forward.
- El flag `--no-ff` permite forzarlo incluso si fast-forward es posible.
- Es muy usado en flujos de trabajo colaborativos.

---

## Resumen

El **merge no fast-forward** une dos historiales divergentes creando un **commit de merge**, dejando evidencia explícita del trabajo realizado en ramas separadas.

