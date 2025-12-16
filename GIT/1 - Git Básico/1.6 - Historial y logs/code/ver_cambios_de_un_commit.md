
#git #historial #log #diff #commit

---

## Descripción

Este ejemplo muestra cómo **visualizar los cambios realizados en un commit específico**, para analizar exactamente qué se modificó.

---

## Comando

``` 
git show <hash_del_commit>
```

> Muestra todos los cambios (diff) incluidos en un commit, junto con información de autor, fecha y mensaje.

---

## Explicación
Al ejecutar `git show <hash_del_commit>` se obtiene:

1. **Información del commit**
   - Hash completo  
   - Autor  
   - Fecha  
   - Mensaje del commit
2. **Cambios realizados**
   - Diferencias en archivos modificados (líneas añadidas y eliminadas)  
   - Resumen de inserciones y eliminaciones por archivo  

Opciones útiles:

- `git show --stat <hash>` → resumen de archivos modificados y número de líneas cambiadas  
- `git show --name-only <hash>` → muestra solo los nombres de los archivos afectados  
- `git show --oneline <hash>` → versión resumida, solo hash y mensaje

---

## Notas

- Muy útil para **analizar errores** o **revisar cambios históricos**  
- Permite identificar **exactamente qué código fue modificado** en un commit  
- Combinar con filtros de `git log` ayuda a **localizar rápidamente el commit de interés**
