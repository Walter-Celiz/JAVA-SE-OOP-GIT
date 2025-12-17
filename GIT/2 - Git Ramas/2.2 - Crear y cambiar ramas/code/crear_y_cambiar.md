## Descripción

Ejemplo práctico de cómo **crear una nueva rama y cambiar automáticamente a ella** en un solo paso.  
Este comando simplifica el flujo de trabajo cuando se quiere comenzar inmediatamente a trabajar en una nueva funcionalidad.

## Comando

```
git checkout -b nombre-rama
```

**Ejemplo**

```
git checkout -b feature-login
```

## Explicación

- `git checkout -b` crea una nueva rama.
- La nueva rama se genera a partir del commit actual.
- Git cambia automáticamente a la rama recién creada.
- El puntero `HEAD` pasa a apuntar a la nueva rama.

Este método es equivalente a ejecutar `git branch` seguido de `git checkout`.

## Notas

### Buenas prácticas

- Usar este comando cuando se tenga claro que se va a trabajar directamente en la nueva rama.
- Verificar la rama actual antes de crear la nueva.
- Mantener nombres de ramas claros y descriptivos.

### Errores comunes

- Pensar que este comando solo cambia de rama y no la crea.
- Crear ramas sin una necesidad clara.
- Usar nombres genéricos o poco descriptivos.

