## Descripción

Ejemplo práctico de uso de Git relacionado con este tema.

En este caso, se muestra cómo crear un repositorio Git desde cero en un proyecto local, estableciendo el punto de inicio para el control de versiones.

Este paso es fundamental porque sin repositorio no existe Git: no hay historial, ni commits, ni seguimiento de cambios.

---
## Comando / Flujo

```bash
git init
```

Flujo básico:
1. Crear o ubicarse dentro de una carpeta de proyecto
2. Ejecutar `git init`
3. Git inicializa el repositorio en ese directorio

---
## Explicación

- `git init` crea un repositorio Git local.
- Se genera automáticamente una carpeta oculta llamada `.git`.
- Dentro de `.git`, Git almacena:
  - el historial de commits
  - la configuración del repositorio
  - las referencias internas (HEAD, ramas, etc.)

Después de ejecutar este comando:
- el proyecto pasa a estar bajo control de versiones
- Git comienza a rastrear los cambios, aunque todavía no haya commits

Importante:
- `git init` no crea commits
- solo prepara el entorno para empezar a versionar

---
## Notas

### Buenas prácticas

- Ejecutar `git init` solo una vez por proyecto
- Inicializar la raíz del proyecto
- Verificar que la carpeta `.git` se haya creado correctamente

### Errores comunes

- Ejecutar `git init` dentro de otra carpeta que ya es un repositorio
- Eliminar la carpeta `.git` pensando que no es importante
- Confundir `git init` con `git clone`
