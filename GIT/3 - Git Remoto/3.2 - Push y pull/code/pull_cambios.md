# Traer cambios del repositorio remoto (pull)

#git #gitRemoto #pull #sincronizacion #fetch #merge

---
## 1) Descripción

El comando **`git pull`** se utiliza para **traer los cambios más recientes desde el repositorio remoto** e integrarlos en la rama local actual.

Es una operación esencial en trabajos colaborativos, ya que permite mantener el código local actualizado con respecto al remoto.

---

## 2) Teoría

Cuando otros desarrolladores realizan push al repositorio remoto, el repositorio local queda desactualizado.

`git pull` cumple dos funciones internas:

1. **Descargar** los cambios del remoto.
2. **Integrar** esos cambios en la rama local.

Conceptualmente:
`git pull = git fetch + git merge` 


Por defecto, la integración se realiza mediante **merge**.

---

## 3) Comando / Flujo

### Pull básico

```bash
git pull
```

### Pull indicando remoto y rama

```bash
git pull origin main
```


---

## 4) Explicación del comando

- `git pull`  
  Trae los cambios del remoto asociados a la rama actual.

- `origin`  
  Repositorio remoto desde donde se descargan los cambios.

- `main`  
  Rama remota que se integra con la rama local.

Si la rama tiene upstream configurado, no es necesario indicar remoto ni rama.

---

## 5) Flujo típico de trabajo

1. Otro desarrollador hace push al remoto.
2. Tu repositorio local queda desactualizado.
3. Ejecutas `git pull`.
4. Git descarga e integra los cambios.
5. Continúas trabajando con el código actualizado.

---

## 6) Posibles resultados del pull

### Pull sin conflictos

- Los cambios se integran automáticamente.
- El historial se actualiza sin intervención manual.

### Pull con conflictos

- Git detiene el proceso.
- Marca los archivos en conflicto.
- Es necesario resolverlos manualmente antes de continuar.

---

## 7) Buenas prácticas

- Ejecutar `git status` antes y después del pull.
- Realizar `git pull` antes de comenzar a trabajar.
- Evitar tener cambios sin commit antes de hacer pull.
- Leer siempre los mensajes que muestra Git.

---

## 8) Errores comunes

- Hacer pull con archivos modificados sin commit.
- Ignorar conflictos durante el merge.
- Hacer pull desde una rama incorrecta.
- Asumir que pull solo descarga archivos (también integra cambios).

---

## 9) Notas adicionales

- Si hay cambios locales sin commit, Git puede bloquear el pull.
- Los conflictos deben resolverse manualmente.
- En proyectos grandes, es común hacer pull frecuentemente para evitar conflictos mayores.
