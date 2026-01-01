
#git #gitRemoto #remote #origin #remoteSetUrl #configuracion

---
## Descripción

Este ejemplo muestra cómo cambiar la URL de un repositorio remoto ya configurado en un proyecto Git.

Es útil cuando el repositorio remoto cambia de ubicación, cuando se pasa de HTTPS a SSH o cuando se migra el proyecto a otro servidor.

---

## Comando / Flujo

```bash
git remote set-url origin <nueva-url>
```

ejemplo: `git remote set-url origin git@github.com:usuario/proyecto.git`


---

## Explicación

- `git remote set-url` permite modificar la URL asociada a un remoto existente.
- `origin` indica el remoto al que se le cambiará la URL.
- `<nueva-url>` es la nueva dirección del repositorio remoto.

Este comando no altera el historial de commits ni las ramas, solo actualiza la configuración del remoto.

---

## Notas

### Buenas prácticas

- Verificar la URL actual antes de cambiarla.
- Confirmar el cambio usando `git remote -v`.
- Usar URLs SSH para evitar ingresar credenciales repetidamente.

### Errores comunes

- Cambiar la URL de un remoto incorrecto.
- Escribir mal la nueva URL.
- Olvidar verificar el remoto luego del cambio.
