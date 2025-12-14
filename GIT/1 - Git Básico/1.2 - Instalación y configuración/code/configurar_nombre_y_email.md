## Descripción

Ejemplo práctico de uso de Git para configurar el nombre y correo electrónico que identificarán tus commits en todos los repositorios locales.

Este paso es fundamental porque sin configurar estos datos, los commits no estarán correctamente identificados y no habrá trazabilidad de cambios en los proyectos.

---

## Comando / Flujo

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@dominio.com"
```

Flujo básico:
1. Abrir la terminal o consola del sistema operativo.
2. Ejecutar `git config --global user.name "Tu Nombre"` para definir tu nombre.  
3. Ejecutar `git config --global user.email "tuemail@dominio.com"` para definir tu correo electrónico.  
4. Estos valores se aplicarán globalmente a todos los repositorios del usuario.

---

## Explicación

- `--global` indica que la configuración se aplica a todos los repositorios del usuario.  
- `user.name` define el nombre que aparecerá en los commits.  
- `user.email` define el correo electrónico asociado a los commits.  
- Estos datos son fundamentales para la trazabilidad y colaboración en repositorios, especialmente si se trabaja con repositorios remotos o en equipos.  

Importante:
- Para configuraciones específicas de un repositorio, se puede usar `--local` en lugar de `--global`.  
- Cambiar estos valores frecuentemente puede generar inconsistencias en el historial de commits.

---

## Notas

### Buenas prácticas

- Configurar nombre y correo al iniciar Git por primera vez.  
- Mantener siempre consistencia en los datos de usuario.  
- Usar la misma información que se utiliza en plataformas remotas como GitHub o GitLab.  

### Errores comunes

- Configurar solo el nombre o solo el correo, dejando incompleta la información.  
- Cambiar los datos constantemente, generando commits con autor diferente.  
- Usar un correo incorrecto que no esté vinculado a la cuenta remota.
