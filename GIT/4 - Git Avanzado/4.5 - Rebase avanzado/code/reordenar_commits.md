
#git #rebase #reordenarCommits #historial #ordenCommits

---
## Descripción

Reordenar commits permite **cambiar el orden en el que los commits aparecen en el historial** usando rebase interactivo.  
Es útil cuando los commits no siguen una secuencia lógica o cuando se quiere presentar una evolución más clara de los cambios.

Reordenar commits **no cambia el contenido**, pero sí reescribe el historial.

---

## Comando / Flujo

Iniciar rebase interactivo:

```bash
git rebase -i HEAD~N
```

Ejemplo de lista original:

```bash
pick a1b2c3 Configuración inicial  
pick d4e5f6 Agregar lógica  
pick g7h8i9 Ajustes finales
```

Reordenando commits:

```bash
pick a1b2c3 Configuración inicial  
pick g7h8i9 Ajustes finales  
pick d4e5f6 Agregar lógica
```


Guardar y cerrar el editor para que Git aplique el nuevo orden.

---

## Explicación

Durante el rebase interactivo:

1. Git aplica los commits en el orden en que aparecen en el editor
2. Al cambiar el orden de las líneas, se modifica la secuencia de aplicación
3. Git recrea los commits siguiendo ese nuevo orden
4. Cada commit obtiene un nuevo hash

Si el nuevo orden genera dependencias incorrectas, pueden surgir conflictos.

---
## Notas

Buenas prácticas:
- Reordenar commits que sean independientes entre sí
- Verificar el proyecto después del rebase
- Usar `git log` para validar el nuevo historial

Errores comunes:
- Mover commits que dependen de otros
- Ignorar conflictos durante el rebase
- Reordenar commits ya compartidos en remoto
