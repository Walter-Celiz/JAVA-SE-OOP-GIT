# Clonar repositorio usando HTTPS

#git #clone #https #repositorioRemoto

---

## 1) Descripción

Clonar un repositorio mediante **HTTPS** consiste en utilizar una URL segura basada en web para descargar un repositorio remoto a tu equipo local.

Es el método más sencillo para comenzar y no requiere configuraciones previas como claves SSH.

---

## 2) Comando / Flujo

Comando básico de clonación: 
`git clone https://github.com/usuario/repositorio.git`

Flujo conceptual:
Repositorio Remoto (HTTPS)  
│  
▼  
git clone  
│  
▼  
Repositorio Local


---

## 3) Explicación

Al ejecutar el comando:

- Git descarga todo el historial del repositorio.
- Se crea una carpeta con el nombre del repositorio.
- Se configura automáticamente el remoto `origin`.
- El repositorio queda listo para trabajar localmente.

Para **subir cambios (push)**, Git solicitará autenticación mediante:
- Usuario + token
- Gestor de credenciales del sistema

---

## 4) Casos de uso

- Aprendizaje y práctica individual.
- Clonación rápida de repositorios públicos.
- Entornos donde no se permite configurar SSH.
- Uso ocasional de Git.

---

## 5) Ventajas

- No requiere configuración previa.
- Fácil de entender y usar.
- Ideal para principiantes.

---

## 6) Limitaciones

- Solicita autenticación al hacer push.
- Menos cómodo para trabajo diario.
- No es el estándar en equipos profesionales.

---

## 7) Buenas prácticas

- Usar HTTPS solo para aprendizaje o repositorios públicos.
- Configurar un token de acceso personal en lugar de contraseña.
- Migrar a SSH para trabajo continuo.

---

## 8) Notas

- GitHub y otros servicios ya no permiten contraseñas clásicas.
- El token actúa como reemplazo de la contraseña.
- El método HTTPS no afecta la estructura del repositorio.

---

## 9) Resumen final

Clonar por HTTPS es la forma más simple de comenzar a trabajar con repositorios remotos.  
Es ideal para aprender Git, aunque en entornos profesionales se recomienda el uso de SSH.
