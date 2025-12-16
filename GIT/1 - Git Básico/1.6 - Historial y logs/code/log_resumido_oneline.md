
#git #historial #log #oneline

---

## Descripción

Este ejemplo muestra cómo **ver el historial de commits de forma resumida**, ideal para historiales largos o para obtener un panorama rápido de los cambios.

---

## Comando / Flujo

``` 
git log --oneline
```

> Muestra cada commit en **una sola línea**, con hash corto y mensaje resumido.

---

## Explicación

Al ejecutar `git log --oneline` se obtiene:

- **Hash corto** del commit (primeros 7 caracteres del SHA)  
- **Mensaje de commit** resumido en una línea  

Beneficios:

- Permite **ver muchos commits rápidamente**  
- Facilita la **búsqueda visual de commits importantes**  
- Útil al combinar con otras opciones de log, como ramas o filtros por autor

Opciones adicionales:

- `git log --oneline --graph` → añade un **diagrama de ramas y merges**  
- `git log --oneline --all` → muestra commits de **todas las ramas**

---

## Notas

- Recomendado para **historias largas de commits**  
- Ideal para revisiones rápidas y merges  
- Combinar con **filtros y gráficas** para análisis más detallado
