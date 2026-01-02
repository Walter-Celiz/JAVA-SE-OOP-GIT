# Resolver conflictos en equipo
#git #trabajoEnEquipo #conflictos #merge #colaboración

---

## Descripción

Los conflictos en Git ocurren cuando dos o más desarrolladores modifican las mismas líneas de un archivo y Git no puede decidir automáticamente qué cambio conservar.

Resolver conflictos en equipo es una tarea habitual en proyectos colaborativos y forma parte natural del flujo de trabajo profesional.

---

## Comando / Flujo

Flujo típico para resolver conflictos:

```bash
git pull
```
# aparece el conflicto

# editar archivos en conflicto

```bash
git add archivo_resuelto  
git commit -m "resolver conflicto de merge"
```

---

## Explicación

### 1) Detección del conflicto

Al intentar integrar cambios (mediante `pull`, `merge` o `rebase`), Git puede mostrar un mensaje indicando que existen conflictos.

El archivo afectado queda marcado como **unmerged**.

---

### 2) Identificar el archivo en conflicto

```bash
git status
```

Este comando indica qué archivos presentan conflictos y requieren intervención manual.

---

### 3) Editar el archivo en conflicto

Dentro del archivo aparecen marcas como:
<<<<<<< HEAD
# cambio local

cambio remoto
nombre-rama


Se debe:
- Analizar ambos cambios
- Decidir qué líneas conservar
- Eliminar las marcas de conflicto

---

### 4) Marcar el conflicto como resuelto

Una vez editado el archivo:

```bash
git add archivo_resuelto
```


Esto indica a Git que el conflicto fue solucionado.

---

### 5) Finalizar la integración

```bash
git commit -m "resolver conflicto de merge"
```


El commit deja constancia de que el conflicto fue resuelto correctamente.

---

## Notas

### Buenas prácticas
- Leer cuidadosamente ambos cambios antes de decidir.
- Comunicarse con el equipo si el conflicto no es claro.
- Probar el proyecto luego de resolver conflictos.
- Resolver conflictos apenas aparecen.

### Errores comunes
- Borrar cambios sin analizarlos.
- Dejar marcas de conflicto en el archivo.
- Resolver conflictos sin ejecutar pruebas.
- Forzar commits sin entender el problema.

---

## Resumen

Los conflictos en Git no son errores, sino consecuencias normales del trabajo en equipo. Resolverlos correctamente garantiza la integración segura de cambios y mantiene la calidad del proyecto en entornos colaborativos.
