##  Descripción

Cuando ocurre un conflicto, Git **modifica el archivo** insertando marcadores especiales para mostrar las versiones en disputa.

---

##  Ejemplo de marcadores

```
<<<<<<< HEAD
Contenido de la rama actual
=======
Contenido de la rama que se intenta mergear
>>>>>>> rama-b
```

---

##  Significado de cada marcador

- `<<<<<<< HEAD`
  → Inicio del contenido de la rama actual

- `=======`
  → Separador entre versiones

- `>>>>>>> rama-b`
  → Fin del contenido de la rama entrante

---

##  Objetivo del usuario

Editar el archivo y dejar **una sola versión final**, eliminando **todos los marcadores**.

---

##  Importante

- Git **no acepta commits** con marcadores presentes
- El archivo debe quedar limpio y coherente

