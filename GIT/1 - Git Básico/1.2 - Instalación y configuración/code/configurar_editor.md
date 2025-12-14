## Descripción

Ejemplo práctico de uso de Git para configurar el editor de texto predeterminado que se utilizará al escribir mensajes de commit.

Este paso es importante porque Git requiere un editor para los commits, y elegir uno con el que estés familiarizado evita errores o problemas al crear mensajes.

---

## Comando / Flujo

```bash
git config --global core.editor "nombre_editor"
```

Flujo básico:
1. Abrir la terminal o consola del sistema operativo.
2. Ejecutar `git config --global core.editor "nombre_editor"` reemplazando `"nombre_editor"` por tu editor preferido.  
   - Ejemplos: `"vim"`, `"nano"`, `"code --wait"` (para VSCode).
3. La configuración se aplicará a todos los repositorios del usuario.

---

## Explicación

- `core.editor` define qué editor se abrirá automáticamente cuando Git necesite que escribas un mensaje de commit.  
- `--global` aplica la configuración a todos los repositorios del usuario.  
- Elegir un editor conocido facilita la edición de mensajes y evita confusiones.

Importante:
- Este comando **no cambia el contenido de los commits**, solo el programa que se abrirá para editarlos.  
- Para configurar un editor solo para un repositorio específico, se puede usar `--local` en lugar de `--global`.

---

## Notas

### Buenas prácticas

- Configurar un editor que realmente uses y conozcas.  
- Evitar usar editores complicados si no estás familiarizado con ellos (ej. Vim sin experiencia).  
- Mantener consistencia en todos tus proyectos.

### Errores comunes

- No configurar ningún editor y depender del predeterminado del sistema, que puede ser incómodo.  
- Confundir la sintaxis del comando para VSCode (`"code --wait"`).  
- Cambiar el editor constantemente, generando inconsistencia en los hábitos de trabajo.

