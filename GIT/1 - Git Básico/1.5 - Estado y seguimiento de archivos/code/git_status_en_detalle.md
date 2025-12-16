## Descripción

Ejemplo práctico para comprender en profundidad la salida del comando `git status`, qué información muestra y cómo interpretarla correctamente en el flujo de trabajo diario con Git.

Este comando es la principal herramienta para conocer el estado real del repositorio.

---
## Comando / Flujo

````
# Ver el estado general del repositorio
git status

# Modificar un archivo existente
# (por ejemplo, editar un archivo .md)

# Consultar nuevamente el estado
git status

# Preparar el archivo modificado
git add <archivo>

# Volver a verificar el estado del repositorio
git status
````

---
## Explicación

El comando `git status` muestra una fotografía actual del estado del repositorio y divide la información en secciones claras.

1. **Estado de la rama**  
   Indica la rama actual y si está sincronizada con el repositorio remoto.

2. **Cambios no preparados para commit**  
   Aparecen bajo *Changes not staged for commit*.  
   Son archivos modificados pero que aún no están en el stage.

3. **Cambios preparados para commit**  
   Aparecen bajo *Changes to be committed*.  
   Son archivos listos para formar parte del próximo commit.

4. **Archivos no trackeados**  
   Aparecen bajo *Untracked files*.  
   Git los detecta pero todavía no los controla.

Cada ejecución de `git status` representa un momento distinto del flujo de trabajo.

---
## Notas

- `git status` no modifica el repositorio, solo informa  
- Se recomienda usarlo antes de `git add` y antes de `git commit`  
- Ayuda a decidir qué cambios incluir y cuáles dejar fuera  

Errores comunes:
- No revisar `git status` antes de commitear  
- Pensar que `git add` hace commit  
- No interpretar correctamente las secciones del estado  
