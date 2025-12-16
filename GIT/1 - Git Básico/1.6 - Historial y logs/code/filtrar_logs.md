
#git #historial #log #filtrar

---

## Descripción

Este ejemplo muestra cómo **filtrar commits en el historial** para encontrar información específica rápidamente, usando diferentes criterios como autor, fecha o mensaje.

---

## Comando / Flujo

``` 
git log --author="Nombre del autor"
git log --since="2025-12-01" --until="2025-12-15"
git log --grep="mensaje clave"
git log -- <archivo>
```

---

## Explicación
Opciones comunes para filtrar logs:

1. **Por autor**
   - `git log --author="Nombre"` → muestra commits realizados por un autor específico.
2. **Por rango de fechas**
   - `git log --since="YYYY-MM-DD" --until="YYYY-MM-DD"` → commits dentro de un período.
3. **Por mensaje**
   - `git log --grep="palabra"` → busca commits que contengan cierta palabra o frase en el mensaje.
4. **Por archivo**
   - `git log -- <archivo>` → commits que afectaron un archivo específico.

Opciones combinables para mayor precisión:

- `git log --author="Nombre" --since="YYYY-MM-DD" --oneline` → filtrado resumido por autor y fecha  
- `git log --grep="bug" --stat` → búsqueda de commits relacionados con bugs mostrando archivos modificados

---

## Notas

- Filtrar el historial **ahorra tiempo** al buscar cambios específicos  
- Combinar filtros y formatos hace los logs más **legibles y útiles**  
- Muy útil para **revisiones de código y debugging**
