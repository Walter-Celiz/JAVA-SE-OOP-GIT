# Fetch desde repositorio remoto

#git #gitRemoto #fetch #sincronización #ramasRemotas

---

## Descripción

El comando `git fetch` se utiliza para **obtener los cambios del repositorio remoto** sin modificar el estado actual de la rama local.  
Es una forma segura de mantenerse actualizado y revisar cambios antes de integrarlos.

---

## Comando / Flujo

```bash
git fetch
```

Flujo general:
1. Conexión al repositorio remoto
2. Descarga de nuevos commits y referencias
3. Actualización de ramas remotas (`origin/*`)
4. Rama local sin cambios

---

## Explicación

Al ejecutar `git fetch`, Git:

- Descarga los commits nuevos del remoto
- Actualiza las referencias como `origin/main`
- **No hace merge ni rebase**
- No altera archivos locales ni el historial de la rama actual

Esto permite inspeccionar los cambios antes de decidir cómo integrarlos.

---

## Ejemplo práctico

Situación:
- Estás en la rama `main`
- El remoto tiene nuevos commits

Ejecutas: `git fetch origin`

Luego puedes revisar:
```bash
git log origin/main  
git diff main origin/main
```


Nada cambia en tu rama local hasta que lo decidas explícitamente.

---

## Notas

**Buenas prácticas**
- Usar `git fetch` antes de integrar cambios importantes
- Revisar diferencias antes de hacer merge
- Ideal para trabajo en equipo

**Errores comunes**
- Pensar que `fetch` actualiza la rama local
- Olvidar integrar los cambios luego del fetch
- Confundir `origin/main` con `main`
