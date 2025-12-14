## Descripción

Ejemplo práctico de uso de Git para revisar la configuración actual y verificar que todo esté correctamente definido, incluyendo nombre, correo y editor predeterminado.

Este paso es importante porque permite confirmar que las configuraciones globales o locales se aplicaron correctamente antes de empezar a trabajar en un repositorio.

---

## Comando / Flujo

```bash
git config --list
```

Flujo básico:
1. Abrir la terminal o consola del sistema operativo.
2. Ejecutar `git config --list`.
3. Git mostrará todas las configuraciones activas, tanto globales como locales.
4. Para revisar un valor específico:
   - `git config user.name`
   - `git config user.email`
   - `git config core.editor`

---

## Explicación

- `git config --list` muestra todas las configuraciones activas en Git, combinando globales, locales y del sistema.  
- Permite comprobar que el nombre de usuario, correo electrónico y editor están correctamente configurados.  
- Ayuda a detectar posibles conflictos o configuraciones no deseadas en repositorios específicos.

Importante:
- Este comando **no cambia ninguna configuración**, solo las muestra.  
- Es recomendable ejecutarlo después de cualquier cambio para confirmar que se aplicó correctamente.

---

## Notas

### Buenas prácticas

- Revisar la configuración antes de iniciar un proyecto nuevo.  
- Asegurarse de que los datos de usuario coincidan con la cuenta remota (GitHub, GitLab, etc.).  
- Mantener consistencia entre configuraciones globales y locales.

### Errores comunes

- Asumir que los cambios se aplicaron sin verificarlos.  
- Confundir configuraciones locales con globales.  
- No revisar el editor configurado, lo que puede causar problemas al hacer commits.
