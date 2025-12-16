
#git #historial #log #simple

---
## Descripción
Este ejemplo muestra cómo **visualizar el historial básico de commits** en un repositorio Git de manera clara y rápida.

---

## Comando

``` 
git log
```

> Muestra todos los commits desde el más reciente hasta el más antiguo.

---

## Explicación

Al ejecutar `git log`, se obtiene información de cada commit:

- **Hash completo** del commit  
- **Autor**  
- **Fecha**  
- **Mensaje de commit**

Opciones útiles para mejorar la legibilidad:

- `git log --oneline` → versión resumida (hash corto + mensaje)  
- `git log -p` → muestra los **cambios realizados** (diff)  
- `git log --stat` → resumen de **archivos modificados y líneas cambiadas**

---

## Notas

- Este comando **solo muestra commits locales**.  
- Ideal para revisar rápidamente **qué cambios se han hecho**.  
- Combinar con **filtros o formatos** para historiales más largos o específicos.
