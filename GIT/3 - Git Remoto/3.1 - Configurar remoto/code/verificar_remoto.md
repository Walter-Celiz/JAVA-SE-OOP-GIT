#git #gitRemoto #remote #origin #verificacion

---

## Descripción

Este ejemplo muestra cómo verificar qué repositorios remotos están configurados en un proyecto Git y qué URLs tiene asociadas cada uno.

Es un paso importante para confirmar que el remoto fue agregado correctamente antes de realizar un push o pull.

---

## Comando / Flujo

```bash
git remote
git remote -v
```


---

## Explicación

- `git remote` muestra únicamente los nombres de los remotos configurados.
- `git remote -v` muestra los nombres de los remotos junto con sus URLs para fetch y push.

Este comando no modifica el repositorio; solo permite inspeccionar la configuración actual.

---

## Notas
### Buenas prácticas

- Verificar el remoto antes del primer push.
- Usar `git remote -v` para confirmar que la URL es correcta.
- Revisar que fetch y push apunten al mismo repositorio.

### Errores comunes

- Asumir que el remoto existe sin verificarlo.
- Confundir múltiples remotos configurados.
- Hacer push a un remoto incorrecto por no revisar la URL.
