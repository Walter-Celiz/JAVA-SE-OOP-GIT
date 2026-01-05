# Aplicar un commit específico con Cherry-pick

#git #cherrypick #gitAvanzado #commits #code

---
## Descripción

Este ejemplo muestra cómo **aplicar un commit específico de otra rama** sobre la rama actual utilizando `git cherry-pick`.

Es el uso más común de cherry-pick y sirve cuando necesitás traer **un cambio puntual** sin integrar toda una rama.

---

## Comando / Flujo

1) Ver los commits disponibles  
```bash
git log --oneline
```
2) Cambiar a la rama destino  
```bash
git checkout main
```
3) Aplicar el commit específico  
```bash
git cherry-pick <hash-del-commit>
```


---

## Explicación paso a paso

- `git log --oneline`  
  Permite identificar el **hash corto** del commit que querés aplicar.

- `git checkout main`  
  Te ubicás en la rama donde querés **aplicar el cambio**.

- `git cherry-pick <hash>`  
  Git toma los cambios de ese commit y los aplica sobre la rama actual.

Si no hay conflictos:
- El commit se aplica correctamente
- Se crea un **nuevo commit** con un hash diferente
- El historial queda actualizado

---

## Ejemplo práctico

Escenario:

- Rama `feature-login`
- Commit: `a1b2c3d` → corrige validación de contraseña
- Rama destino: `main`

Flujo:
```bash
git checkout main  
git cherry-pick a1b2c3d
```

Resultado:
- `main` recibe solo la corrección
- No se mezclan otros commits de `feature-login`

---

## Resultado esperado

Después del cherry-pick:

- El commit aparece en `git log`
- Tiene **nuevo hash**
- El contenido es igual al commit original
- El historial sigue siendo lineal

---

## Notas y buenas prácticas

- Cherry-pick **duplica commits**, no los mueve
- Usar solo para cambios puntuales
- Verificar siempre el hash correcto
- Evitar cherry-pick masivos
- Ideal para hotfixes y correcciones críticas

---

## Errores comunes

- Ejecutar cherry-pick desde la rama incorrecta
- Usar el hash equivocado
- No revisar conflictos
- Abusar de cherry-pick en lugar de merge o rebase

