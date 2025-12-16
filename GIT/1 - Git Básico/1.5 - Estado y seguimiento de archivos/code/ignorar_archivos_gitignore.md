## Descripción

Ejemplo práctico para aprender a **ignorar archivos y carpetas** que no deben ser versionados en Git mediante el archivo `.gitignore`.

Este mecanismo evita subir archivos temporales, configuraciones locales o generados automáticamente.

---

## Comando / Flujo

````
# Crear o editar el archivo .gitignore
# (se realiza con cualquier editor de texto)

# Ver el estado del repositorio
git status

# Agregar el archivo .gitignore al stage
git add .gitignore

# Confirmar los cambios
git commit -m "Agregar reglas de gitignore"
````

---

## Explicación

El archivo `.gitignore` le indica a Git qué archivos o carpetas **debe ignorar**.

1. Se crea un archivo llamado `.gitignore` en la raíz del repositorio.
2. Dentro del archivo se definen patrones que Git no debe trackear.
3. Al ejecutar `git status`, los archivos ignorados:
   - No aparecen como *untracked*
   - No pueden ser agregados al stage

Ejemplos comunes de reglas dentro de `.gitignore`:

````
# Ignorar archivos de compilación
/bin/
/out/

# Ignorar archivos temporales
*.log
*.tmp

# Ignorar configuraciones locales
.env
````

---

## Notas

- `.gitignore` solo afecta a archivos **no trackeados**
- Si un archivo ya está trackeado, debe quitarse del repositorio antes
- Se recomienda versionar siempre el archivo `.gitignore`

Errores comunes:
- Intentar ignorar archivos ya trackeados
- No revisar las reglas antes de commitear
- Usar patrones demasiado generales

---

## Buenas prácticas

- Definir `.gitignore` al inicio del proyecto
- Usar reglas claras y específicas
- Mantener el archivo organizado y comentado
- Utilizar plantillas oficiales según el lenguaje

---

## Nota importante

Si un archivo ya fue trackeado y luego se agrega al `.gitignore`, Git **seguirá controlándolo**.

En ese caso, se debe ejecutar:
````
git rm --cached <archivo>
````

Esto elimina el archivo del control de Git sin borrarlo del disco.
