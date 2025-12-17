## Descripción

Ejemplo práctico para **crear una nueva rama en Git** sin cambiar automáticamente a ella.  
Este paso es fundamental para comenzar una nueva funcionalidad de forma aislada, sin afectar la rama principal.

## Comando

```
git branch nombre-rama
```

**Ejemplo**

```
git branch feature-login
```

## Explicación

- `git branch` crea una nueva rama.
- La nueva rama se genera a partir del **commit actual**.
- La rama activa **no cambia** después de ejecutar el comando.
- A partir de ese punto, cada rama puede evolucionar de forma independiente.

## Notas

### Buenas prácticas

- Usar nombres descriptivos y consistentes para las ramas.
- Crear la rama antes de comenzar a modificar archivos.
- Verificar la rama actual antes de crear una nueva (`git branch`).

### Errores comunes

- Pensar que crear una rama también cambia automáticamente a ella.
- Utilizar nombres genéricos como `test` o `prueba`.
- Crear ramas desde una rama incorrecta sin darse cuenta.
