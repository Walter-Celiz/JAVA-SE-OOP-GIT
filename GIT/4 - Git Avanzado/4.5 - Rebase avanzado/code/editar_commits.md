#git #rebase #editarCommits #historial #amend

---
## Descripción

Editar commits permite **modificar el contenido o el mensaje de un commit ya creado** mediante rebase interactivo.  
Es especialmente útil cuando un commit tiene errores, cambios incompletos o un mensaje poco claro.

Esta técnica **reescribe el historial**, creando un nuevo commit que reemplaza al original.

---

## Comando / Flujo

Iniciar rebase interactivo:

```bash
git rebase -i HEAD~N
```

Marcar el commit a editar:
```bash
edit a1b2c3 Commit con error
```


Git se detiene en ese commit y permite modificarlo.

Modificar archivos y preparar cambios:

```bash
git add .
```

Actualizar el commit:
```bash
git commit --amend
```

Continuar el rebase:
```bash
git rebase --continue
```

---

## Explicación

Cuando se marca un commit con `edit`, Git:

1. Aplica los commits anteriores normalmente
2. Se detiene exactamente en el commit marcado
3. Permite cambiar archivos, agregar o quitar contenido
4. Reemplaza el commit original con uno nuevo
5. Continúa recreando los commits siguientes

El commit editado obtiene un **nuevo hash**, ya que su contenido o mensaje cambia.

---

## Notas

Buenas prácticas:
- Editar commits antes de hacer push
- Usar mensajes de commit claros al hacer amend
- Revisar el historial final con `git log`

Errores comunes:
- Olvidar ejecutar `git rebase --continue`
- Cambiar commits ya compartidos con otros
- Confundir `edit` con `reword` (este solo cambia el mensaje)
