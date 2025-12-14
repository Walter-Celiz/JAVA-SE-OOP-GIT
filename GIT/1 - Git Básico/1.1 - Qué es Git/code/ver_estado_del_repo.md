## Descripción

Ejemplo práctico de cómo verificar el estado de un repositorio Git, para conocer qué archivos están modificados, cuáles están en el staging area y cuáles no están siendo rastreados.

Este paso es fundamental para entender el flujo de trabajo en Git y preparar correctamente los archivos antes de hacer un commit.

---

## Comando / Flujo

```bash
git status
```

Flujo básico:
1. Ubicarse dentro de la carpeta del repositorio
2. Ejecutar `git status`
3. Git muestra el estado de los archivos:
   - Archivos **sin seguimiento** (untracked)
   - Archivos **modificados** pero no preparados para commit
   - Archivos **preparados** en el staging area

---

## Explicación

- `git status` permite **ver en qué estado se encuentran los archivos del repositorio**.
- Las categorías principales que muestra son:
  - **Untracked:** archivos nuevos que Git no está rastreando
  - **Changes not staged for commit:** archivos modificados que todavía no están en el staging area
  - **Changes staged for commit:** archivos preparados para el próximo commit
- Esta información ayuda a decidir qué archivos agregar al staging area con `git add` y qué archivos descartar o seguir modificando.

==NOTA: Cuando decimos que los archivos están en la **staging area** (también llamada _index_), significa que:==

- ==Git **ya sabe que quieres incluir esos archivos en el próximo commit**, pero aún **no los ha guardado de manera permanente** en el historial del repositorio.==
- ==Es como una **zona de preparación**: los archivos están listos para ser “capturados” en un commit, pero todavía puedes modificar, agregar o quitar archivos antes de confirmar los cambios.==

---

## Notas

### Buenas prácticas

- Revisar el estado del repositorio antes de cada commit con `git status`.
- Usar `git status` después de ejecutar `git add` para confirmar qué archivos están listos para el commit.
- Mantener el repositorio organizado y limpio evitando commits con archivos innecesarios.

### Errores comunes

- No revisar el estado antes del commit y terminar incluyendo archivos no deseados.
- Confundir archivos modificados con archivos preparados para commit.
- Ignorar los archivos “untracked” que deberían estar versionados.
