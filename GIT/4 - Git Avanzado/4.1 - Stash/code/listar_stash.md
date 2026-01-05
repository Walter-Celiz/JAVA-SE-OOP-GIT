
#git #stash #listarStash #gitAvanzado

---

## Descripción  

Este ejemplo muestra cómo visualizar los stashes almacenados en Git.  
Listar los stashes permite conocer qué cambios fueron guardados temporalmente, en qué orden y con qué descripción.

Es un paso fundamental antes de aplicar o eliminar un stash.

---

## Comando / Flujo  

Listar todos los stashes existentes:

```bash
git stash list
```

---

## Explicación  

**git stash list**  

Muestra la pila de stashes almacenados en el repositorio.  
Cada entrada se presenta con el siguiente formato general:

    stash@{n}: mensaje descriptivo

Donde:

- `n` representa el índice del stash dentro de la pila  
- `stash@{0}` es siempre el stash más reciente  
- El mensaje ayuda a identificar el contenido del stash  

Este listado no modifica el repositorio ni el directorio de trabajo.

---

## Notas  

- Los stashes se almacenan en forma de pila (LIFO)  
- Es recomendable revisar la lista antes de aplicar o borrar un stash  
- Un stash puede aplicarse en una rama diferente a la que fue creado  
- Si no se usan mensajes descriptivos, puede resultar difícil identificar los cambios  
