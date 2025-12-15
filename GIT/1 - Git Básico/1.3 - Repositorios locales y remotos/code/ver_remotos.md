## Descripción

Ejemplo práctico de uso de Git para **ver los repositorios remotos configurados** en un proyecto local.  
Este paso es importante porque permite confirmar que los remotos fueron agregados correctamente y verificar sus URLs antes de hacer push o pull.

---

## Comando

```bash
git remote -v
```

## Flujo

- Abrir la terminal o consola del sistema operativo.  
- Navegar hasta la carpeta del proyecto local.  
- Ejecutar el comando: `git remote -v`
- Git mostrará una lista de todos los remotos configurados, incluyendo sus URLs para `fetch` y `push`.

## Explicación

- `git remote -v` lista todos los remotos configurados en el repositorio local junto con sus URLs.  
- Permite confirmar que el remoto principal (por ejemplo, `origin`) apunta a la dirección correcta.  
- Se puede usar antes de hacer `git push` o `git pull` para evitar errores de sincronización.

**Importante:**  
- Este comando **no modifica** la configuración del repositorio; solo muestra información.  
- Es útil para detectar remotos duplicados o incorrectos.

---

## Notas

### Buenas prácticas

- Revisar los remotos antes de sincronizar cambios con el servidor.  
- Verificar que el nombre y la URL de cada remoto sean correctos.  
- Mantener consistencia entre remotos en distintos entornos de trabajo.

### Errores comunes

- Asumir que el remoto está correctamente configurado sin verificarlo.  
- Confundir URLs de remotos para distintos entornos (por ejemplo, prueba vs producción).  
- Ignorar remotos antiguos que ya no se usan, generando confusión.


