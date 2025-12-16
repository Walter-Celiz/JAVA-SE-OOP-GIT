## Descripción

Ejemplo práctico para entender la diferencia entre archivos **trackeados** y **no trackeados** en Git, y cómo un archivo pasa de no estar controlado a formar parte del repositorio.

Este ejemplo muestra el ciclo inicial de un archivo dentro de Git.

---
## Comando / Flujo

```
git status  
git add <archivo>  
git status
```

---
## Explicación

1. Se crea un archivo nuevo dentro del repositorio.
   - Git lo detecta como **no trackeado**.
   - Aparece en `git status` bajo *Untracked files*.

2. Al ejecutar `git status`, Git informa que:
   - El archivo existe
   - Pero aún no está siendo controlado

3. Se utiliza `git add <archivo>`:
   - El archivo pasa a estar **trackeado**
   - Entra en el área de **staging**

4. Al ejecutar nuevamente `git status`:
   - El archivo aparece como *Changes to be committed*
   - Está listo para formar parte de un commit

Este flujo marca el inicio del control de versiones de un archivo.

---
## Notas

- Un archivo no trackeado **nunca entra en un commit automáticamente**
- `git add` es el punto donde Git comienza a seguir un archivo
- No todos los archivos deben ser trackeados
- Archivos temporales o de configuración local deben ignorarse con `.gitignore`

Errores comunes:

- Pensar que crear un archivo ya lo versiona
- Hacer commit sin revisar `git status`
- Trackear archivos innecesarios
