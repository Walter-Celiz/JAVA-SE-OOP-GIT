
#git #stash #aplicarStash #gitAvanzado

---

## Descripción  

Este ejemplo muestra cómo recuperar y aplicar los cambios guardados previamente en un stash.  
Aplicar un stash permite continuar el trabajo exactamente desde el punto en el que fue pausado.

Git ofrece distintas formas de aplicar un stash, dependiendo de si se desea conservarlo o eliminarlo después.

---

## Comando / Flujo  

Aplicar el stash más reciente sin eliminarlo:
```bash
git stash apply
```

Aplicar un stash específico:
```bash
git stash apply stash@{1}
```

Aplicar el stash más reciente y eliminarlo de la pila:
```bash
git stash pop
```

---

## Explicación  

**git stash apply**  

Aplica los cambios guardados en el stash más reciente (`stash@{0}`) sobre el *working directory* actual, pero mantiene el stash en la lista.

**git stash apply stash@{n}**  

Permite aplicar un stash específico indicando su índice.  
Esto es útil cuando existen varios stashes y no se desea aplicar el más reciente.

**git stash pop**  

Aplica el stash más reciente y luego lo elimina automáticamente de la pila.  
Es la opción más común cuando se retoma el trabajo y ya no se necesita conservar el stash.

Después de aplicar un stash:

- Los archivos vuelven al estado que tenían al momento de guardarse  
- Pueden aparecer conflictos si el contexto cambió  
- El repositorio queda con cambios sin confirmar  

---

## Notas  

- Aplicar un stash puede generar conflictos, igual que un merge  
- Es recomendable listar los stashes antes de aplicarlos  
- `apply` es más seguro que `pop` si no se está seguro del resultado  
- Los cambios aplicados deben confirmarse con un commit cuando estén listos  

