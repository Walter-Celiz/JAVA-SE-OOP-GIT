(lightweight)

#git #tags #lightweight #versionado
 
---
## Descripción

Un **tag ligero** es la forma más simple de crear un tag en Git.  
Funciona como un **puntero directo a un commit**, sin información adicional como autor, fecha o mensaje.

Se utiliza cuando se necesita marcar rápidamente un punto del historial, sin tratarlo como un release oficial.

---

## Comando / Flujo

```bash
git tag <nombre-del-tag>
```

Para crear el tag sobre un commit específico:
```bash
git tag <nombre-del-tag> <commit-sha>
```

ejemplo:
```bash
git tag v0.1
```


---

## Explicación
- `git tag` crea una referencia fija en `refs/tags/`.
- El tag queda asociado al commit actual (`HEAD`) si no se especifica otro.
- No se crea ningún objeto adicional en Git, solo un puntero.
- El tag no se mueve aunque la rama avance con nuevos commits.

Un tag ligero es ideal para:
- pruebas internas
- checkpoints rápidos
- marcas temporales en el historial

---

## Verificación
Para comprobar que el tag fue creado:
```bash
git tag
```

Para ver a qué commit apunta:
```bash
git show v0.1
```

---
## Notas

- Los tags ligeros **no incluyen mensaje ni metadata**.
- No son recomendados para versiones oficiales.
- No se suben al remoto automáticamente.
- Pueden eliminarse fácilmente si fueron creados por error.

---

## Buenas prácticas y errores comunes

**Buenas prácticas**
- Usarlos solo para referencias rápidas.
- Nombrarlos de forma clara (`test-1`, `checkpoint-ui`).
- Preferir tags anotados para releases.

**Errores comunes**
- Usar tags ligeros para versiones públicas.
- Olvidar que no se suben al remoto.
- Confundir un tag con una rama.

