## Descripción

Resolver un **merge simple** consiste en solucionar un **conflicto de merge** cuando Git no puede integrar automáticamente los cambios de dos ramas.

Un conflicto ocurre cuando **las mismas líneas de un archivo fueron modificadas en ramas distintas**, y Git necesita que el desarrollador decida qué versión conservar.

---

## Cuándo ocurre un conflicto

Un conflicto de merge aparece cuando:

- Dos ramas modifican la misma línea de un archivo.
- Una rama elimina un archivo que otra modifica.
- Git no puede determinar automáticamente qué cambio aplicar.

Los conflictos son normales y forman parte del trabajo con ramas.

---

## Flujo básico para resolver un merge simple

```
git checkout main  
git merge feature
```

Si hay conflictos, Git:

- Detiene el merge.
- Marca los archivos en conflicto.
- Espera que se resuelvan manualmente.

---

## Identificar archivos en conflicto

Para ver el estado del repositorio: `git status`

Git mostrará los archivos con conflictos como: `both modified: archivo.txt`


---

## Cómo se ve un conflicto en un archivo

Dentro del archivo en conflicto, Git inserta marcas especiales:
# <<<<<<< HEAD  Contenido de la rama actual

Contenido de la rama que se está mergeando > > > > > > > feature

Estas marcas indican:
- `HEAD`: versión de la rama actual.
- `feature`: versión de la rama que se intenta integrar.

---

## Resolver el conflicto manualmente

Pasos para resolver un merge simple:

1. Abrir el archivo en conflicto.
2. Decidir qué contenido conservar (o combinar ambos).
3. Eliminar **todas** las marcas de conflicto.
4. Guardar el archivo.

Ejemplo de archivo resuelto: `Contenido final decidido por el desarrollador`


---

## Marcar el conflicto como resuelto

Una vez corregido el archivo: `git add archivo.txt`


Esto indica a Git que el conflicto fue resuelto.

---

## Finalizar el merge

Después de resolver todos los conflictos: `git commit`

Git creará el **commit de merge**, cerrando el proceso.

---

## Cancelar un merge (opcional)

Si se desea abortar el merge: `git merge --abort`


Esto devuelve el repositorio al estado previo al merge.

---

## Buenas prácticas

- Leer con atención ambas versiones antes de decidir.
- No dejar marcas de conflicto en el archivo.
- Probar el proyecto después del merge.
- Resolver conflictos con calma y criterio.

---

## Errores comunes

- Olvidar eliminar las marcas de conflicto.
- Hacer commit sin revisar el archivo.
- Resolver conflictos sin entender el código.
- Forzar merges innecesarios.

---

## Notas

- Un merge con conflictos **no se completa automáticamente**.
- Git nunca decide por vos en un conflicto.
- Resolver conflictos mejora la comprensión del proyecto.

---

## Resumen

Resolver un **merge simple** implica analizar cambios en conflicto, decidir la versión correcta y finalizar el merge manualmente.  
Es una habilidad clave para trabajar con ramas y en equipos colaborativos.


