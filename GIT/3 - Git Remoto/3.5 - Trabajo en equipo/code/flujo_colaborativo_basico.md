
#git #trabajoEnEquipo #flujoColaborativo #ramas #colaboración

---

## Descripción

El **flujo colaborativo básico** describe la forma estándar en la que varios desarrolladores trabajan sobre un mismo repositorio utilizando ramas individuales y sincronización constante con el repositorio remoto.

Este flujo permite que cada integrante trabaje de manera independiente sin afectar directamente el trabajo de los demás.

---

## Comando / Flujo

Flujo típico de trabajo colaborativo:

```bash
git pull  
git checkout -b nombre-rama
```

trabajar y commitear cambios

```bash
git push -u origin nombre-rama
```


---

## Explicación

### 1) Actualizar el repositorio local

```bash
git pull
```


Antes de comenzar a trabajar, se descargan los últimos cambios del repositorio remoto para evitar conflictos por versiones desactualizadas.

---

### 2) Crear una rama de trabajo

```bash
git checkout -b nombre-**rama**
```


Cada desarrollador crea su propia rama para aislar sus cambios del resto del equipo.

---

### 3) Realizar cambios y commits

Se trabaja normalmente sobre los archivos del proyecto y se generan commits claros y pequeños:

```bash
git add .  
git commit -m "descripción clara del cambio"
```


Esto permite mantener un historial comprensible y fácil de revisar.

---

### 4) Subir la rama al repositorio remoto

```bash
git push -u origin nombre-rama
```


La rama se publica en el repositorio remoto y queda disponible para el resto del equipo.

---

### 5) Integración del trabajo

- El código puede ser revisado por otros integrantes.
- Se integra mediante merge o pull request.
- Una vez integrado, la rama puede eliminarse.

---

## Notas

### Buenas prácticas
- Actualizar siempre antes de comenzar a trabajar.
- Usar una rama por tarea o funcionalidad.
- Mantener commits pequeños y descriptivos.
- Sincronizar la rama si el trabajo dura varios días.

### Errores comunes
- Trabajar directamente sobre `main`.
- No hacer pull antes de empezar.
- Subir muchos cambios en un solo commit.
- Resolver conflictos sin analizar ambos lados.

---

## Resumen

El flujo colaborativo básico es la base del trabajo en equipo con Git. Utilizando ramas, commits y sincronización constante, los equipos pueden trabajar en paralelo de forma ordenada, segura y eficiente.
