
#git #gitRemoto #origin #remoteAdd #repositorioRemoto

---

## Descripción

Este ejemplo muestra cómo agregar un repositorio remoto al proyecto local utilizando el nombre estándar `origin`.

Agregar `origin` permite conectar el repositorio local con un repositorio remoto para poder enviar (push) y recibir (pull) cambios.

---

## Comando / Flujo

```bash
git remote add origin <url-del-repositorio>
```

Ejemplo: `git remote add origin https://github.com/usuario/proyecto.git`

---

## Explicación

- `git remote add` indica que se va a agregar un nuevo remoto.
- `origin` es el nombre asignado al remoto (convención más usada).
- `<url-del-repositorio>` es la dirección del repositorio remoto (HTTPS o SSH).

Este comando **no sube archivos**, solo registra la conexión entre el repositorio local y el remoto.

---

## Notas
### Buenas prácticas

- Usar `origin` como nombre del remoto principal.
- Verificar la URL antes de agregarla.
- Preferir URLs SSH si se trabaja frecuentemente con el repositorio.

### Errores comunes

- Intentar agregar `origin` cuando ya existe.
- Escribir mal la URL del repositorio.
- Confundir HTTPS con SSH sin tener las credenciales configuradas.

