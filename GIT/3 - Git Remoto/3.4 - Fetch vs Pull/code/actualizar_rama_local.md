# Actualizar rama local con cambios remotos
#git #gitRemoto #fetch #merge #actualización

---
## Descripción

Actualizar una rama local consiste en **integrar los cambios obtenidos desde el repositorio remoto** de forma controlada, normalmente después de usar `git fetch`.

Este enfoque permite revisar los cambios antes de aplicarlos a la rama local.

---

## Comando / Flujo

Flujo recomendado:
```bash
git fetch origin  
git merge origin/main
```

Opcionalmente, con rebase:
```bash
git fetch origin  
git rebase origin/main
```


---

## Explicación

1. `git fetch origin`
   - Descarga los cambios del remoto
   - Actualiza las referencias (`origin/main`)
   - No modifica la rama local

2. `git merge origin/main`
   - Integra los cambios en la rama actual
   - Puede crear un commit de merge

Alternativa con `rebase`:
- Reescribe el historial local
- Mantiene un historial lineal
- Debe usarse con cuidado en ramas compartidas

---

## Ejemplo práctico

Estás en la rama `main`:
```bash
git status  
git fetch origin  
git log main..origin/main  
git merge origin/main
```


De esta forma:
- Ves qué commits faltan
- Integras solo cuando estás seguro

---

## Notas

**Buenas prácticas**
- Usar `fetch` antes de `merge` o `rebase`
- Revisar commits antes de integrar
- Preferir merge en ramas compartidas

**Errores comunes**
- Usar `rebase` en ramas públicas
- Hacer `pull` sin revisar cambios
- Confundir `origin/main` con `main`

