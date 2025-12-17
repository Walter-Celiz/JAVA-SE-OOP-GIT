##  Descripción

Este ejemplo muestra cómo **provocar intencionalmente un conflicto** para entender cómo Git lo detecta y cómo se inicia el proceso de resolución.

---

##  Flujo de acciones

1. Crear dos ramas desde un mismo punto
2. Modificar la **misma línea** en ambas ramas
3. Intentar hacer un merge

---

## Comandos / Flujo

```
git checkout -b rama-a
# editar archivo.txt
git commit -am "Cambio en rama A"

git checkout main
git checkout -b rama-b
# editar la misma línea del archivo.txt
git commit -am "Cambio en rama B"

git checkout main
git merge rama-a
git merge rama-b
```

---

##  Resultado esperado

Git detiene el merge y muestra un mensaje de conflicto.

---

##  Notas

- El conflicto se produce porque Git no puede elegir qué versión es correcta
- El merge queda **incompleto**
- Es obligatorio resolverlo antes de continuar
