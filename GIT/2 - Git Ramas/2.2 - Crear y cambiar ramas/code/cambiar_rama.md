## Descripción

Ejemplo práctico de cómo **cambiar la rama activa en Git** para comenzar a trabajar en otra línea de desarrollo existente.

## Comando

```
git checkout nombre-rama
```

**Ejemplo**

```
git checkout feature-login
```

## Explicación

- `git checkout` permite moverse entre ramas existentes.
- `nombre-rama` indica la rama a la que se desea cambiar.
- Al cambiar de rama, el puntero `HEAD` se actualiza.
- El directorio de trabajo se ajusta para reflejar el estado de la rama seleccionada.

## Notas

### Buenas prácticas

- Asegurarse de tener el directorio de trabajo limpio antes de cambiar de rama.
- Verificar la rama actual con `git branch`.
- Cambiar de rama solo cuando los cambios estén correctamente guardados.

### Errores comunes

- Intentar cambiar de rama con cambios sin guardar.
- Confundir el nombre de la rama.
- Pensar que cambiar de rama crea una nueva rama.
