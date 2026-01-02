# Clonar repositorio usando SSH

#git #clone #ssh #repositorioRemoto #seguridad

---

## 1) Descripción

Clonar un repositorio mediante **SSH** permite establecer una conexión segura entre el equipo local y el repositorio remoto utilizando un par de claves criptográficas.

Es el método recomendado para trabajo profesional y colaborativo, ya que evita la autenticación manual en cada operación.

---

## 2) Comando / Flujo

Comando básico de clonación:
`git clone git@github.com:usuario/repositorio.git`

Flujo conceptual:
Repositorio Remoto (SSH)  
│  
▼  
git clone  
│  
▼  
Repositorio Local


---

## 3) Explicación

Al ejecutar el comando de clonación por SSH:

- Git verifica la clave SSH configurada en el sistema.
- Se autentica automáticamente contra el servidor remoto.
- Descarga todo el historial del repositorio.
- Configura el remoto `origin` sin requerir credenciales adicionales.
- El repositorio queda listo para trabajar de forma inmediata.

---

## 4) Casos de uso

- Trabajo diario en equipos de desarrollo.
- Repositorios privados.
- Proyectos empresariales.
- Automatización de procesos con Git.

---

## 5) Ventajas

- No solicita usuario ni contraseña en cada push.
- Mayor seguridad frente a credenciales expuestas.
- Flujo de trabajo más rápido y cómodo.
- Estándar en entornos profesionales.

---

## 6) Requisitos previos

Para utilizar SSH es necesario:

- Tener una clave SSH generada en el sistema.
- Registrar la clave pública en el proveedor remoto (GitHub, GitLab, etc.).
- Verificar la conexión SSH antes de clonar.

---

## 7) Buenas prácticas

- Usar una clave SSH por equipo.
- Proteger la clave privada con passphrase.
- No compartir claves entre usuarios.
- Verificar la conexión con el servidor remoto antes de trabajar.

---

## 8) Notas

- SSH es independiente del sistema operativo.
- Un repositorio clonado por SSH funciona igual que uno por HTTPS.
- El método solo afecta la autenticación, no el contenido del repositorio.

---

## 9) Resumen final

Clonar repositorios usando SSH es la forma más segura y eficiente de trabajar con Git en entornos profesionales.  
Permite una autenticación automática y un flujo de trabajo continuo sin interrupciones.
