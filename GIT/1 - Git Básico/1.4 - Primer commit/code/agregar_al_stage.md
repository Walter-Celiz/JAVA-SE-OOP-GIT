## Descripción

En este paso se **seleccionan los archivos que formarán parte del commit**.  
Agregar archivos al *stage* significa indicarle a Git qué cambios queremos guardar en el próximo commit.

El *Staging Area* actúa como una zona intermedia entre el directorio de trabajo y el repositorio.

---

## Comando / Flujo

```
git add <archivo>
git add .
```

---

## Explicación

Cuando ejecutamos el comando para agregar archivos al stage:

1. Git toma los archivos del **Working Directory**
2. Los copia al **Staging Area (Index)**
3. Los marca como **listos para ser confirmados**
4. Aún no se guardan en el historial

Esto permite decidir con precisión **qué cambios entran en el commit** y cuáles no.

Para el primer commit, normalmente se agregan todos los archivos iniciales del proyecto.

---

## Notas

### Buenas prácticas

- Revisar el estado del repositorio antes de agregar archivos
- Agregar solo archivos que estén listos para versionarse
- Usar `git add <archivo>` para mayor control
- Verificar el stage antes de hacer commit

### Errores comunes

- Usar `git add .` sin revisar qué archivos se incluyen
- Pensar que `git add` ya crea el commit
- Olvidar agregar archivos nuevos
- Confundir stage con commit
