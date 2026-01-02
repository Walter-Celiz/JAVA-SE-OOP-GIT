#git #gitRemoto #fetch #pull #comparación

---
## Descripción

`git fetch` y `git pull` se utilizan para traer cambios desde un repositorio remoto, pero **difieren en cómo y cuándo esos cambios impactan en la rama local**.

Este archivo compara ambos comandos para entender **cuándo usar cada uno**.

---

## Comando / Flujo

### Fetch

```bash
git fetch
```

Flujo:
1. Descarga cambios del remoto
2. Actualiza ramas remotas (`origin/*`)
3. No modifica la rama local

---
### Pull

```bash
git pull
```

Flujo:
1. Ejecuta `git fetch`
2. Integra cambios con `merge` o `rebase`
3. Modifica la rama local

---

## Explicación

### `git fetch`
- Solo descarga información
- No toca tu código
- Permite inspeccionar cambios
- Requiere un paso extra para integrar

### `git pull`
- Descarga e integra automáticamente
- Puede generar conflictos
- Afecta directamente a la rama actual
- Menos control, más rapidez

---

## Comparación directa

| Aspecto              | git fetch              | git pull                     |
|----------------------|------------------------|------------------------------|
| Descarga cambios     | Sí                     | Sí                           |
| Integra cambios      | No                     | Sí                           |
| Modifica rama local  | No                     | Sí                           |
| Riesgo de conflictos | No                     | Sí                           |
| Control              | Alto                   | Bajo                         |
| Uso recomendado      | Equipos / producción   | Proyectos pequeños           |

---

## Ejemplo práctico

Caso seguro:

```bash
git fetch origin  
git diff main origin/main  
git merge origin/main
```

Caso rápido:

```bash
git pull origin main
```

En el primer caso decides **cuándo y cómo** integrar los cambios.

---

## Notas

**Buenas prácticas**
- Preferir `fetch` en ramas críticas
- Usar `pull` solo cuando sabes qué cambios vienen
- Revisar siempre antes de integrar

**Errores comunes**
- Usar `pull` sin entender que hace un merge
- Asumir que `fetch` actualiza archivos locales
- Trabajar directamente sobre `main` sin revisar
