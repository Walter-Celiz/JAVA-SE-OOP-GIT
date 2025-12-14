Ejercicio práctico 1.1 - Flujo completo de Git

Objetivo:
Practicar todos los comandos vistos en la clase 1.1 de Git: inicializar repositorio, ver estado, agregar archivos, hacer el primer commit y commit mínimo.

---

Paso 1: Crear un nuevo proyecto
1. Crear una carpeta llamada "ProyectoGit".
2. Ubicarse dentro de la carpeta en la terminal.

---

Paso 2: Inicializar el repositorio
Comando:
git init
Verificar que se creó la carpeta oculta .git

---

Paso 3: Verificar el estado del repositorio
Comando:
git status
Identificar que no hay archivos rastreados.

---

Paso 4: Crear un primer archivo
1. Crear un archivo llamado "README.md".
2. Agregar contenido simple: "# Mi primer proyecto Git"

---

Paso 5: Preparar el archivo para commit (staging area)
Comando:
git add README.md

---

Paso 6: Hacer el primer commit
Comando:
git commit -m "Primer commit con README"

---

Paso 7: Crear un archivo mínimo adicional
1. Crear un archivo llamado "archivo_minimo.txt" con contenido: "Hola Git"
2. Prepararlo en staging area:
git add archivo_minimo.txt
3. Hacer commit:
git commit -m "Primer commit mínimo"

---

Paso 8: Verificar estado final
Comando:
git status
Confirmar que no hay cambios pendientes y el repositorio está limpio.

---

Notas:
- Revisar con git status después de cada paso para entender el flujo.
- Practicar la diferencia entre archivos untracked, staged y committed.
- Usar mensajes de commit claros y descriptivos.
