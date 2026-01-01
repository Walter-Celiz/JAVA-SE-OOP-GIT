# Push a una rama específica

#git #gitRemoto #push #ramas #origin

---
## 1) Descripción

El comando **`git push`** permite enviar commits locales al repositorio remoto.  
Cuando se trabaja con múltiples ramas, es posible **indicar explícitamente a qué rama remota** se desean enviar los cambios.

Esto es útil cuando:
- Se trabaja con varias ramas al mismo tiempo.
- No hay upstream configurado.
- Se quiere mayor control sobre el destino del push.

---

## 2) Teoría

En Git, el push siempre ocurre entre:
- Una **rama local**
- Una **rama remota**

Si la rama local no tiene una rama remota asociada (upstream), Git necesita que se indique explícitamente el remoto y la rama destino.

Indicar la rama evita errores y hace el flujo más claro, especialmente en equipos grandes.

---

## 3) Comando / Flujo

### Push indicando remoto y rama

```bash
git push origin nombre-rama
```
### Ejemplo práctico

```bash
git push origin footer
```


---

## 4) Explicación del comando

- `git push`  
  Envía los commits locales al remoto.

- `origin`  
  Repositorio remoto.

- `nombre-rama`  
  Rama local que se sube y se actualiza en el remoto.

Si la rama remota no existe, Git la crea automáticamente.

---

## 5) Diferencia con el primer push

- **Primer push de una rama:**  `git push -u origin nombre-rama`

Se establece la relación upstream.

- **Push posteriores:**  `git push`

Se utiliza la relación ya configurada.

Usar `git push origin rama` no establece upstream si no se usa `-u`.

---

## 6) Flujo típico de trabajo con ramas

1. Crear una rama nueva.
2. Trabajar y hacer commits.
3. Primer push con `-u`.
4. Continuar haciendo pushes sin parámetros.
5. Abrir un Pull Request si el flujo lo requiere.

---

## 7) Buenas prácticas

- Verificar la rama actual antes del push: `git branch`
- Usar nombres descriptivos para las ramas.
- Evitar hacer push directo a `main`.
- Confirmar el remoto configurado con: `git remote -v`

---

## 8) Errores comunes

- Hacer push a una rama equivocada.
- Olvidar configurar upstream en el primer push.
- Confundir rama local con rama remota.
- Forzar push sin comprender las consecuencias.

---

## 9) Notas adicionales

- Un push siempre impacta una rama específica.
- El control explícito del push mejora la seguridad del flujo.
- En entornos colaborativos, los cambios suelen integrarse mediante Pull Requests.
