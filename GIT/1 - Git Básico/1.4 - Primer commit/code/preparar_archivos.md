## Descripción

Antes de realizar el primer commit, es necesario **preparar los archivos del proyecto**.  
Esto implica crear, organizar y verificar qué archivos formarán parte del repositorio antes de agregarlos al control de versiones.

Preparar bien los archivos evita commits desordenados o con contenido innecesario.

---

## Flujo

- Crear o copiar archivos del proyecto
- Revisar su contenido
- Verificar el estado del directorio de trabajo

---

## Explicación

En esta etapa todavía **no interactuamos directamente con Git** para versionar, sino que trabajamos sobre el **Working Directory**.

Lo que sucede conceptualmente es:

1. Se crean archivos (por ejemplo `README.md`, código fuente, carpetas)
2. Git detecta que existen archivos nuevos
3. Estos archivos quedan en estado **untracked** (no rastreados)
4. Aún no forman parte del historial ni del stage

Git solo observa los cambios, pero no los guarda hasta que se lo indiquemos explícitamente.

---

## Notas

### Buenas prácticas
- Crear solo los archivos necesarios para el inicio del proyecto
- Usar nombres claros y consistentes
- Revisar que los archivos tengan contenido correcto antes de versionarlos
- Incluir un `README.md` desde el inicio si el proyecto lo requiere

### Errores comunes
- Preparar archivos incompletos o temporales
- Olvidar eliminar archivos de prueba
- Asumir que crear un archivo ya lo guarda Git automáticamente
- Mezclar demasiados cambios antes del primer commit
