## Descripción

Realizar un commit significa **guardar de forma permanente los cambios que están en el Staging Area** dentro del historial del repositorio.

Este paso crea un **snapshot del proyecto**, permitiendo volver a ese estado en cualquier momento.

---

## Comando / Flujo

```
git commit -m "mensaje del commit"
```

---

## Explicación

Cuando se ejecuta el commit:

1. Git toma los archivos que están en el **Staging Area**
2. Crea un **objeto commit** con un identificador único (hash)
3. Guarda el estado completo del proyecto
4. Registra autor, fecha y mensaje
5. Actualiza el historial de la rama actual

A partir de este momento, los cambios pasan a formar parte del historial del repositorio.

---

## Notas

### Buenas prácticas

- Escribir mensajes claros y descriptivos
- Confirmar que el stage está correcto antes de commitear
- Hacer commits pequeños y coherentes
- Usar el commit como punto lógico de avance

### Errores comunes

- Hacer commits sin revisar el contenido
- Usar mensajes genéricos como “update”
- Pensar que el commit sube los cambios a un remoto
- Intentar commitear sin archivos en el stage
