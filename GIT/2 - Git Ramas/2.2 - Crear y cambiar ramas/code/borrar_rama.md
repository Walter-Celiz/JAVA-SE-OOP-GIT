## Descripción

Ejemplo práctico de cómo **eliminar una rama local en Git** cuando ya no es necesaria, generalmente después de haber sido fusionada.

## Comando 

```
git branch -d nombre-rama
```

**Ejemplo**

```
git branch -d feature-login
```

## Explicación

- `git branch -d` elimina una rama local.
- Git verifica que la rama ya haya sido fusionada.
- Si la rama contiene cambios no fusionados, Git evita el borrado.
- Este mecanismo protege contra la pérdida accidental de trabajo.

Para forzar el borrado:
```
git branch -D nombre-rama
```

## Notas

### Buenas prácticas

- Borrar ramas solo después de haberlas fusionado.
- Mantener el repositorio limpio eliminando ramas que ya no se usan.
- Verificar la rama actual antes de eliminar otra.

### Errores comunes

- Intentar borrar la rama en la que se está trabajando.
- Forzar el borrado sin entender las consecuencias.
- Confundir ramas locales con ramas remotas.
