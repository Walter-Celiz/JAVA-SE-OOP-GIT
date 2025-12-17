##  Descripción

Resolver un conflicto consiste en **editar manualmente el archivo**, decidir qué cambios conservar y eliminar los marcadores de Git.

---

##  Pasos para resolver

1. Abrir el archivo en conflicto
2. Analizar ambas versiones
3. Elegir una versión o combinarlas
4. Eliminar todos los marcadores
5. Guardar el archivo

---

##  Ejemplo

Antes:
```
<<<<<<< HEAD
Hola desde main
=======
Hola desde rama-b
>>>>>>> rama-b
```

Después:
```
Hola desde main y rama-b
```

---

##  Buenas prácticas

- Leer ambas versiones antes de decidir
- No borrar contenido sin entenderlo
- Mantener coherencia lógica del archivo
