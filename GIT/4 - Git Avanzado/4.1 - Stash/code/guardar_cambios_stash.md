
#git #stash #workingDirectory #stagingArea #gitAvanzado

---
## Descripción  

Git Stash permite guardar temporalmente cambios no confirmados sin necesidad de crear un commit.  
De esta forma, el repositorio vuelve a un estado limpio y listo para cambiar de rama o realizar otra tarea.

Es especialmente útil cuando el trabajo aún no está terminado, pero se necesita interrumpirlo de forma segura.

---

## Comando / Flujo  

Guardar cambios modificados y en staging:

```bash
git stash
```

Guardar cambios incluyendo archivos no trackeados:

```bash
git stash -u
```

Guardar cambios con un mensaje descriptivo:

```bash
git stash push -m "cambios temporales en formulario"
```

---

## Explicación  

**git stash**  

Guarda los cambios del *working directory* y del *staging area* en una pila interna de stashes y limpia el repositorio, dejándolo en el estado del último commit.

**git stash -u**  

Además de los archivos modificados, incluye archivos no trackeados (archivos nuevos que aún no fueron agregados).

**git stash push -m "mensaje"**  

Permite identificar claramente qué contiene cada stash mediante un mensaje descriptivo, facilitando su recuperación posterior.

Después de ejecutar estos comandos:

- El directorio de trabajo vuelve al estado del último commit  
- Los cambios quedan almacenados de forma temporal  
- El trabajo puede retomarse más adelante sin pérdida de información  

---

## Notas  

- El stash no crea commits, solo guarda cambios temporales  
- No debe usarse como almacenamiento a largo plazo  
- Es recomendable usar mensajes descriptivos en los stashes  
- Los cambios guardados pueden aplicarse en la misma o en otra rama  
