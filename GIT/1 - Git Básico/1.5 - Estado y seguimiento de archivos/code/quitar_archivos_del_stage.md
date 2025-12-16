## Descripción

Ejemplo práctico para aprender a **quitar archivos del área de staging** sin perder los cambios realizados en el archivo.

Este flujo es fundamental para corregir errores antes de hacer un commit.

---

## Comando / Flujo

````
# Ver el estado actual del repositorio
git status

# Agregar un archivo al stage
git add <archivo>

# Verificar que el archivo está en staging
git status

# Quitar el archivo del stage
git restore --staged <archivo>

# Volver a consultar el estado
git status
````

---

## Explicación

En ocasiones se agregan archivos al **staging area** por error o antes de tiempo.  
Git permite revertir esta acción sin perder el contenido modificado.

1. Al ejecutar `git add <archivo>`  
   - El archivo pasa al **stage**  
   - Queda listo para el commit  

2. Si se detecta un error antes de commitear  
   - Se utiliza `git restore --staged <archivo>`  
   - El archivo sale del stage  

3. El archivo:
   - **No pierde los cambios**
   - Vuelve al estado *Modified*

Este comando solo afecta al staging, no al archivo en sí.

---

## Notas

- `git restore --staged` **no borra cambios**
- Es seguro usarlo antes de un commit
- Permite mantener commits limpios y bien definidos

Errores comunes:
- Pensar que se pierden los cambios del archivo
- Hacer commit sin revisar el contenido del stage
- Usar `git reset` sin entender sus efectos

---

## Alternativa histórica

En versiones antiguas de Git, se utilizaba:
````
git reset HEAD <archivo>
````

Hoy se recomienda `git restore --staged` por ser más claro y explícito.
