## Descripción

Ejemplo de cómo realizar un commit mínimo en Git, es decir, guardar un solo archivo en el repositorio para marcar el inicio del historial.

Este flujo es útil para comprender el proceso más básico de versionado y cómo Git rastrea cambios desde el primer archivo agregado.

---

## Comando / Flujo

```bash
# Crear un archivo simple
echo "Hola Git" > archivo_minimo.txt

# Preparar el archivo en el staging area
git add archivo_minimo.txt

# Hacer el commit mínimo
git commit -m "Primer commit mínimo"
```

Flujo básico:
1. Crear un archivo sencillo dentro del proyecto (`archivo_minimo.txt`)  
2. Agregarlo al staging area con `git add archivo_minimo.txt`  
3. Hacer el commit mínimo con `git commit -m "Primer commit mínimo"`

---

## Explicación

- Se crea un archivo nuevo que inicialmente está **untracked**.  
- `git add` lo coloca en la **staging area**, listo para el commit.  
- `git commit` guarda el archivo de forma permanente en el historial del repositorio.  
- Este es el commit **más básico posible**, ideal para entender el flujo fundamental: crear archivo → preparar → commit.  
- Después de este commit, la staging area queda vacía y el repositorio tiene un historial inicial.

---

## Notas

### Buenas prácticas

- Incluso en commits mínimos, usar mensajes descriptivos como “Primer commit mínimo” ayuda a mantener claridad en el historial.  
- Revisar el estado del repositorio con `git status` antes del commit para confirmar qué archivos están en staging.

### Errores comunes

- Olvidar hacer `git add` antes de `git commit`, lo que hace que no se guarde ningún cambio.  
- Confundir un archivo mínimo con un archivo sin importancia; todos los archivos iniciales son importantes para el historial.
