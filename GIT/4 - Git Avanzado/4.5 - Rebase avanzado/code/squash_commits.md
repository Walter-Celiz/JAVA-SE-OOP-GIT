
#git #rebase #squash #historial #commits

---
## Descripción

El **squash de commits** permite **combinar varios commits en uno solo** usando rebase interactivo.  
Se utiliza para agrupar cambios relacionados y eliminar commits intermedios que no aportan valor al historial final.

Es una práctica común antes de integrar una rama a `main` o `develop`.

---

## Comando / Flujo

Iniciar rebase interactivo:

```bash
git rebase -i HEAD~N
```

Ejemplo de historial inicial:
```bash
pick a1b2c3 Agregar estructura base  
pick d4e5f6 Ajustar estilos  
pick g7h8i9 Corregir errores
```

Aplicando squash:

```bash
pick a1b2c3 Agregar estructura base  
squash d4e5f6 Ajustar estilos  
squash g7h8i9 Corregir errores
```


Guardar y cerrar el editor.

Git abrirá un editor para **fusionar los mensajes de commit** en uno solo.

---
## Explicación

Cuando se usa `squash`:

1. El primer commit se mantiene como base
2. Los commits marcados como `squash` se combinan con el anterior
3. Git solicita un mensaje final unificado
4. Se crea un único commit nuevo
5. Los commits originales dejan de existir

También puede usarse `fixup`, que combina commits **sin conservar los mensajes**.

---

## Notas

Buenas prácticas:
- Usar squash para commits pequeños o de prueba
- Escribir un mensaje final claro y representativo
- Squash antes de hacer push o antes de un merge

Errores comunes:
- Squash de commits con funcionalidades no relacionadas
- Olvidar editar el mensaje final
- Aplicar squash sobre commits compartidos
