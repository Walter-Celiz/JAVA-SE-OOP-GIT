
#git #stash #eliminarStash #gitAvanzado

---
## Descripción  

Este ejemplo muestra cómo eliminar stashes que ya no son necesarios.  
Eliminar stashes ayuda a mantener el repositorio ordenado y evita confusiones con cambios antiguos o irrelevantes.

Git permite borrar un stash específico o limpiar todos los stashes de una sola vez.

---

## Comando / Flujo  

Eliminar un stash específico:

```bash
git stash drop stash@{1}
```

Eliminar el stash más reciente:

```bash
git stash drop
```

Eliminar todos los stashes:

```bash
git stash clear
```

---

## Explicación  

**git stash drop stash@{n}**  

Elimina el stash indicado por su índice sin afectar el resto de la pila.

**git stash drop**  

Elimina el stash más reciente (`stash@{0}`) de la lista.

**git stash clear**  

Elimina todos los stashes almacenados en el repositorio.  
Esta acción es irreversible y debe usarse con precaución.

Después de eliminar un stash:

- Los cambios guardados ya no pueden recuperarse  
- El estado del repositorio no se ve afectado  
- El historial de commits permanece intacto  

---

## Notas  

- Eliminar un stash es una acción permanente  
- Es recomendable verificar el contenido antes de borrarlo  
- Usar `drop` es más seguro que `clear`  
- Mantener la lista de stashes limpia facilita el trabajo diario  
