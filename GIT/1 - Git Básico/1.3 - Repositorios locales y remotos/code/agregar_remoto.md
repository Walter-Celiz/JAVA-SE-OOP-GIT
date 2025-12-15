## Descripción

Ejemplo práctico de uso de Git para **agregar un repositorio remoto** a un proyecto local.  
Este paso es importante porque permite sincronizar el repositorio local con un servidor remoto (GitHub, GitLab, Bitbucket), facilitando la colaboración y el respaldo de los cambios.

---

## Comando

```bash
git remote add origin <URL-del-repositorio>
```

## Flujo

- Abrir la terminal o consola del sistema operativo.  
- Navegar hasta la carpeta del proyecto local que ya fue inicializado con `git init`.  
- Ejecutar el comando reemplazando `<URL-del-repositorio>` con la URL real del remoto: `git remote add origin <URL-del-repositorio>`
- Git agregará un remoto llamado origin apuntando al repositorio especificado.

## Explicación

- `git remote add` vincula un repositorio local con un remoto.  
- `origin` es el nombre convencional del remoto principal; puedes usar otro nombre si lo deseas.  
- Una vez agregado, se puede enviar cambios con `git push` y traer cambios con `git pull`.

**Importante:**  
- Este comando **no envía automáticamente** los commits al remoto; solo crea la referencia al servidor.  
- Asegúrate de que la URL del remoto sea correcta y tengas permisos de acceso.

---

## Notas

### Buenas prácticas

- Usar nombres claros y consistentes para remotos (por ejemplo, `origin` para el principal).  
- Verificar que la URL del remoto corresponde al proyecto correcto antes de hacer push.  
- Configurar correctamente la autenticación con HTTPS o SSH según la plataforma usada.

### Errores comunes

- Confundir `git remote add` con `git clone` (este último crea el repositorio local automáticamente).  
- Intentar agregar un remoto con un nombre que ya existe.  
- No verificar permisos o autenticación antes de hacer push, causando errores de acceso.
