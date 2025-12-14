## Descripción

Ejemplo práctico de cómo agregar un primer archivo a un repositorio Git y realizar el primer commit.

Aprender este paso es fundamental para empezar a versionar archivos y entender cómo Git rastrea los cambios desde el inicio del proyecto.

---

## Comando / Flujo

```bash
git add nombre_del_archivo
git commit -m "Primer commit"
```

Flujo básico:
1. Crear un archivo nuevo dentro del proyecto (por ejemplo: `README.md` o `archivo.txt`)
2. Ejecutar `git add nombre_del_archivo` para preparar el archivo en el staging area
3. Ejecutar `git commit -m "Primer commit"` para guardar los cambios en el repositorio

---

## Explicación

- `git add` mueve los cambios del archivo al **staging area**, indicando a Git que esos cambios se incluirán en el próximo commit.
- `git commit -m "Primer commit"` crea un **commit** que guarda de forma permanente el estado actual del archivo dentro del repositorio.
- Cada commit tiene un identificador único (hash) que permite rastrear el historial de cambios.
- El primer commit marca el **punto de partida** del historial del proyecto.

---

## Notas

### Buenas prácticas

- Es recomendable que el primer commit contenga **archivos esenciales** y un mensaje claro, como "Primer commit".
- Agregar un archivo `README.md` y/o `.gitignore` en el primer commit ayuda a estructurar correctamente el repositorio.
- Revisar con `git status` antes de hacer commit para confirmar qué archivos se van a incluir.

### Errores comunes

- Olvidar hacer `git add` antes del commit.
- Hacer commit de archivos innecesarios o temporales.
- Usar mensajes de commit poco descriptivos.
