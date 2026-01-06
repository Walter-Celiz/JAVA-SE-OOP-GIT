
# Listar y consultar tags

#git #tags #versionado #releases

---
## Descripción

Git permite **listar, filtrar y consultar información** sobre los tags existentes en un repositorio.  
Esto es fundamental para identificar versiones disponibles y entender a qué commit apunta cada una.

---

## Comando / Flujo

Listar todos los tags del repositorio:

```bash
git tag
```

Listar tags ordenados alfabéticamente:

```bash
git tag --list
```

Filtrar tags por patrón:
```bash
git tag -l "v1.*"
```

Mostrar información detallada de un tag específico:
```bash
git show <nombre-del-tag>
```

Ejemplo:
```bash
git show v1.0
```

---
## Explicación

- `git tag` muestra todos los tags locales.
- `-l` o `--list` permite aplicar filtros por nombre.
- Los patrones usan comodines (`*`).
- `git show` permite ver:
  - mensaje del tag (si es anotado)
  - commit asociado
  - cambios incluidos en esa versión

Esto facilita revisar qué contiene una versión sin cambiar de rama.

---

## Uso práctico

Escenarios comunes:
- Ver qué versiones existen antes de crear un nuevo release.
- Confirmar que un tag apunta al commit correcto.
- Auditar cambios incluidos en una versión anterior.
- Comparar versiones históricas del proyecto.

---

## Notas

- Solo se listan **tags locales**.
- Los tags remotos deben descargarse previamente.
- Un repositorio puede tener múltiples tags apuntando al mismo commit.
- `git show` es más útil con tags anotados.

---

## Buenas prácticas y errores comunes

**Buenas prácticas**
- Usar prefijos claros (`v1.0`, `v2.0-beta`).
- Verificar un tag antes de publicarlo.
- Mantener una convención consistente de nombres.

**Errores comunes**
- Confundir tags locales con remotos.
- No revisar a qué commit apunta un tag.
- Crear versiones duplicadas con nombres similares.

