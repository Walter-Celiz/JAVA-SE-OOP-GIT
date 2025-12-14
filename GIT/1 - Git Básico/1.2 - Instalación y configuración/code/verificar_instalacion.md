## Descripción

Ejemplo práctico de uso de Git para verificar que la instalación se realizó correctamente y conocer la versión instalada.

Este paso es fundamental porque si Git no está instalado, no se podrán ejecutar comandos, ni hacer commits ni gestionar repositorios.

---

## Comando / Flujo

```bash
git --version
```

Flujo básico:
1. Abrir la terminal o consola del sistema operativo.
2. Escribir `git --version` y presionar Enter.
3. Git mostrará la versión instalada si todo está correcto.

---

## Explicación

- `git --version` muestra la versión de Git instalada en el sistema.  
- Permite confirmar que la instalación se realizó correctamente.  
- Si Git no está instalado, el comando devolverá un error indicando que no se reconoce.  

Después de ejecutar este comando:
- Sabremos que Git está disponible para usar.  
- Se puede continuar con la configuración de usuario y otros comandos sin problemas.

Importante:
- Este comando **no instala Git**, solo verifica su existencia.  
- Es recomendable ejecutarlo antes de realizar cualquier configuración o iniciar un repositorio.

---

## Notas

### Buenas prácticas

- Verificar la instalación antes de empezar a configurar Git.  
- Usar la versión más reciente disponible para tu sistema operativo.  
- Abrir la terminal en modo administrador si es necesario (Windows).  

### Errores comunes

- Pensar que Git está instalado por defecto en el sistema.  
- Confundir la terminal del sistema con un intérprete de comandos distinto.  
- Ignorar un error de versión antigua que pueda generar incompatibilidades.
