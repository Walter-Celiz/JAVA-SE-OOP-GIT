
#git #cherrypick #conflictos #gitAvanzado #code

---
## Descripción

Este ejemplo muestra qué hacer cuando **`git cherry-pick` genera un conflicto**, cómo identificarlo y cómo resolverlo correctamente para continuar el proceso.

Los conflictos ocurren cuando Git no puede aplicar automáticamente los cambios del commit seleccionado sobre la rama actual.

---

## ¿Cuándo ocurre un conflicto?

Un conflicto durante cherry-pick ocurre cuando:

- El mismo archivo fue modificado en ambas ramas
- Las líneas afectadas ya cambiaron en la rama destino
- El contexto del commit original no coincide con el actual

---

## Comando / Flujo

1) Aplicar el cherry-pick  
```bash
git cherry-pick <hash-del-commit>
```
2) Git detecta conflicto  
```
CONFLICT (content): Merge conflict in archivo.txt
```

3) Ver estado del repositorio 
```bash
git status
```

4) Resolver el conflicto manualmente  
- Editar los archivos marcados
- Elegir qué cambios conservar

5) Marcar archivos como resueltos  
```bash
git add archivo.txt
```

6) Continuar el cherry-pick 
```bash
git cherry-pick --continue
```


---

## Explicación paso a paso

- Al producirse el conflicto, Git **pausa el cherry-pick**
- Los archivos conflictivos quedan marcados
- Debés resolverlos manualmente
- Una vez resueltos, se continúa el proceso

Durante este estado:
- No podés iniciar otro cherry-pick
- No se debe hacer commit manual

---

## Marcadores de conflicto

Dentro del archivo vas a ver algo como:

# <<<<<<< HEAD  
código de la rama actual
código del commit cherry-pick a1b2c3d


Acción:
- Elegir una versión
- O combinar ambas
- Eliminar los marcadores

---

## Resultado esperado

Si el conflicto se resuelve correctamente:

- Git crea el nuevo commit
- El cherry-pick finaliza
- El historial queda limpio
- El estado vuelve a normal

---

## Buenas prácticas

- Leer con atención los cambios
- Probar el código luego del cherry-pick
- Resolver un conflicto a la vez
- Usar `git status` frecuentemente
- No apurarse en conflictos complejos

---

## Errores comunes

- Hacer `git commit` en lugar de `--continue`
- Olvidar hacer `git add`
- Dejar marcadores de conflicto
- Resolver sin entender el cambio original


