## Descripción

Ejemplo práctico de uso de Git para **crear un repositorio local** en tu máquina.  
Este paso es importante porque permite inicializar un proyecto bajo control de versiones, generando la estructura interna que Git necesita para llevar el historial de cambios.

---

## Comando

```bash
git init
```

## Flujo básico

- Abrir la terminal o consola del sistema operativo.  
- Navegar hasta la carpeta donde se desea inicializar el repositorio.  
- Ejecutar el comando:`git init`
- Git creará una carpeta oculta `.git` que contiene toda la información del repositorio local.

---

## Explicación

- `git init` crea un **repositorio local vacío**, listo para recibir commits y rastrear cambios en los archivos.  
- La carpeta `.git` generada contiene todo el historial, configuraciones y referencias de Git.  
- Permite trabajar totalmente en local, sin necesidad de conexión a un repositorio remoto.

**Importante:**  
- Este comando no agrega archivos automáticamente al control de versiones, solo inicializa el repositorio.  
- Es recomendable agregar un archivo `.gitignore` antes de hacer commits para excluir archivos temporales o de sistema.

---

## Notas

### Buenas prácticas

- Inicializar el repositorio en la carpeta raíz del proyecto.  
- Agregar un `.gitignore` adecuado para el proyecto antes del primer commit.  
- Confirmar que se encuentra en el repositorio correcto con `git status` después de inicializar.

### Errores comunes

- Ejecutar `git init` dentro de otra carpeta Git existente por error.  
- Olvidar agregar archivos antes de hacer commits.  
- Confundir repositorio local con remoto: `git init` **no crea un remoto**, solo la estructura local.
