#git #rebase #rebaseInteractivo #historial #commits

---
## Descripción

El **rebase interactivo** permite modificar el historial de commits de una rama de forma controlada e intencional.  
A través de `git rebase -i`, Git ofrece una interfaz donde se puede **editar, reordenar, combinar o eliminar commits** antes de que formen parte de una rama principal.

Es una herramienta clave para mantener un historial limpio y profesional.

---

## Comando / Flujo

Comando base: 
```bash
git rebase -i HEAD~N
```

Ejemplo: 
```bash
git rebase -i HEAD~4
```

Esto abre un editor con los últimos 4 commits listados desde el más antiguo al más reciente.

---

## Explicación

Al ejecutar `git rebase -i`, Git muestra una lista similar a:

```bash
pick a1b2c3 Primer commit  
pick d4e5f6 Segundo commit  
pick g7h8i9 Tercer commit  
pick j1k2l3 Cuarto commit
```

Cada línea representa un commit y una acción.  
Las acciones más comunes son:

- `pick`: mantiene el commit tal como está
- `reword`: cambia el mensaje del commit
- `edit`: permite modificar el contenido del commit
- `squash`: combina el commit con el anterior
- `drop`: elimina el commit

Git ejecuta estas acciones en orden, recreando los commits uno a uno.

---

## Notas

Buenas prácticas:
- Usar rebase interactivo solo en **ramas locales**
- Revisar cuidadosamente el orden de los commits
- Leer los mensajes que Git muestra durante el proceso
- Confirmar el resultado final con `git log`

Errores comunes:
- Usar rebase interactivo en ramas ya pusheadas
- Confundir el orden de los commits (van de más antiguo a más nuevo)
- Salir del editor sin guardar los cambios



