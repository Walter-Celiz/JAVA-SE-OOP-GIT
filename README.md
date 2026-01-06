# Aprendizaje Java SE + OOP

Después de estudiar programación en un bootcamp hace algunos años, no pude ejercer mi profesión debido a circunstancias personales y migratorias.
Ahora retomo mis estudios, aprendiendo un nuevo lenguaje, enfocándome en backend y combinando Git para gestión de versiones.
Este repositorio documenta mi aprendizaje práctico de Java SE, programación orientada a objetos (OOP) y Git, incluyendo teoría, ejemplos y ejercicios de código.
Cada concepto se aplica directamente en proyectos de ejemplo, combinando teoría, práctica y control de versiones.

---
## Objetivo

Aprender de manera práctica y completa, combinando:

- Documentación estructurada en Obsidian.
- Ejemplos y ejercicios de código en Java.
- Control de versiones con Git y GitHub.
- Uso de IA (ChatGPT) para resolver dudas y generar ejemplos de código.

## Tecnologías y herramientas

- **Java SE** (v17 o superior)
- **IntelliJ IDEA** para desarrollo de código
- **Obsidian** para documentación y seguimiento
- **Git y GitHub** para control de versiones y portafolio
- **ChatGPT** para apoyo en aprendizaje y ejemplos prácticos

## Estructura del repositorio
```
JAVA SE + OOP + GIT/
│
├── JAVA SE + OOP/
│   │
│   ├── 0 - Índice/
│   │   ├── 0.1 - Índice.md
│   │   ├── code/
│   │   └── resources/
│   │
│   ├── 1 - Parte I - Fundamentos/
│   │   │
│   │   ├── 1.1 - Qué es Java/
│   │   │   ├── 1.1 - Qué es Java.md
│   │   │   ├── code/
│   │   │   │   └── HolaMundo.java
│   │   │   └── resources/
│   │   │
│   │   ├── 1.2 - JVM, JRE y JDK/
│   │   │   ├── 1.2 - JVM, JRE y JDK.md
│   │   │   ├── code/
│   │   │   │   └── ConfiguracionJVM.java
│   │   │   └── resources/
│   │   │
│   │   ├── 1.3 - Instalación y configuración/
│   │   │   ├── 1.3 - Instalación y configuración.md
│   │   │   ├── code/
│   │   │   └── resources/
│   │   │
│   │   ├── 1.4 - Compilación y ejecución/
│   │   │   ├── 1.4 - Compilación y ejecución.md
│   │   │   ├── code/
│   │   │   │   └── Compilacion.java
│   │   │   └── resources/
│   │   │
│   │   ├── 1.5 - Comentarios/
│   │   │   ├── 1.5 - Comentarios.md
│   │   │   ├── code/
│   │   │   │   └── Comentarios.java
│   │   │   └── resources/
│   │   │
│   │   └── 1.6 - Buenas prácticas iniciales/
│   │       ├── 1.6 - Buenas prácticas iniciales.md
│   │       ├── code/
│   │       └── resources/
│   │           └── buenas_practicas.png
│   │
│   ├── 2 - Parte II - Intermedio/
│   │   │
│   │   ├── 2.1 - Métodos/
│   │   │   ├── 2.1 - Métodos.md
│   │   │   ├── code/
│   │   │   │   └── MetodosEjemplo.java
│   │   │   └── resources/
│   │   │
│   │   ├── 2.2 - Clases/
│   │   │   ├── 2.2 - Clases.md
│   │   │   ├── code/
│   │   │   │   └── ClasesEjemplo.java
│   │   │   └── resources/
│   │   │
│   │   ├── 2.3 - Modificadores/
│   │   │   ├── 2.3 - Modificadores.md
│   │   │   ├── code/
│   │   │   │   └── Modificadores.java
│   │   │   └── resources/
│   │   │
│   │   ├── 2.4 - Enums/
│   │   │   ├── 2.4 - Enums.md
│   │   │   ├── code/
│   │   │   │   └── EnumsEjemplo.java
│   │   │   └── resources/
│   │   │
│   │   ├── 2.5 - Excepciones/
│   │   │   ├── 2.5 - Excepciones.md
│   │   │   ├── code/
│   │   │   │   └── ExcepcionesEjemplo.java
│   │   │   └── resources/
│   │   │
│   │   ├── 2.6 - Archivos/
│   │   │   ├── 2.6 - Archivos.md
│   │   │   ├── code/
│   │   │   │   └── ArchivosEjemplo.java
│   │   │   └── resources/
│   │   │
│   │   ├── 2.7 - java.time/
│   │   │   ├── 2.7 - java.time.md
│   │   │   ├── code/
│   │   │   │   └── JavaTimeEjemplo.java
│   │   │   └── resources/
│   │   │       └── tabla_fechas.png
│   │   │
│   │   ├── 2.8 - BigDecimal y BigInteger/
│   │   │   ├── 2.8 - BigDecimal y BigInteger.md
│   │   │   ├── code/
│   │   │   │   └── BigNumberEjemplo.java
│   │   │   └── resources/
│   │   │
│   │   └── 2.9 - Colecciones y Object/
│   │       ├── 2.9 - Colecciones y Object.md
│   │       ├── code/
│   │       │   └── ColeccionesEjemplo.java
│   │       └── resources/
│   │           └── diagrama_colecciones.png
│   │
│   ├── 3 - Parte III - OOP/
│   │   │
│   │   ├── 3.1 - Encapsulamiento/
│   │   │   ├── 3.1 - Encapsulamiento.md
│   │   │   ├── code/
│   │   │   │   └── Encapsulamiento.java
│   │   │   └── resources/
│   │   │
│   │   ├── 3.2 - Herencia/
│   │   │   ├── 3.2 - Herencia.md
│   │   │   ├── code/
│   │   │   │   └── Herencia.java
│   │   │   └── resources/
│   │   │
│   │   ├── 3.3 - Polimorfismo/
│   │   │   ├── 3.3 - Polimorfismo.md
│   │   │   ├── code/
│   │   │   │   └── Polimorfismo.java
│   │   │   └── resources/
│   │   │
│   │   ├── 3.4 - Clases abstractas/
│   │   │   ├── 3.4 - Clases abstractas.md
│   │   │   ├── code/
│   │   │   │   └── ClasesAbstractas.java
│   │   │   └── resources/
│   │   │
│   │   ├── 3.5 - Interfaces/
│   │   │   ├── 3.5 - Interfaces.md
│   │   │   ├── code/
│   │   │   │   └── Interfaces.java
│   │   │   └── resources/
│   │   │
│   │   ├── 3.6 - Interfaces funcionales/
│   │   │   ├── 3.6 - Interfaces funcionales.md
│   │   │   ├── code/
│   │   │   │   └── InterfacesFuncionales.java
│   │   │   └── resources/
│   │   │
│   │   ├── 3.7 - Lambdas/
│   │   │   ├── 3.7 - Lambdas.md
│   │   │   ├── code/
│   │   │   │   └── Lambdas.java
│   │   │   └── resources/
│   │   │
│   │   ├── 3.8 - Streams/
│   │   │   ├── 3.8 - Streams.md
│   │   │   ├── code/
│   │   │   │   └── Streams.java
│   │   │   └── resources/
│   │   │
│   │   └── 3.9 - Clases anónimas y JavaDoc/
│   │       ├── 3.9 - Clases anónimas y JavaDoc.md
│   │       ├── code/
│   │       │   └── ClasesAnonimas.java
│   │       └── resources/
│   │           └── diagrama_clases.png
│   │
│   ├── 4 - Parte IV - Avanzado/
│   │   │
│   │   ├── 4.1 - Paquetes y organización/
│   │   │   ├── 4.1 - Paquetes y organización.md
│   │   │   ├── code/
│   │   │   │   └── Paquetes.java
│   │   │   └── resources/
│   │   │
│   │   ├── 4.2 - Generics/
│   │   │   ├── 4.2 - Generics.md
│   │   │   ├── code/
│   │   │   │   └── Generics.java
│   │   │   └── resources/
│   │   │
│   │   ├── 4.3 - Concurrencia básica/
│   │   │   ├── 4.3 - Concurrencia básica.md
│   │   │   ├── code/
│   │   │   │   └── Concurrencia.java
│   │   │   └── resources/
│   │   │       └── diagrama_concurrencia.png
│   │   │
│   │   ├── 4.4 - Serialización/
│   │   │   ├── 4.4 - Serialización.md
│   │   │   ├── code/
│   │   │   │   └── Serializacion.java
│   │   │   └── resources/
│   │   │
│   │   ├── 4.5 - Optional/
│   │   │   ├── 4.5 - Optional.md
│   │   │   ├── code/
│   │   │   │   └── OptionalEjemplo.java
│   │   │   └── resources/
│   │   │
│   │   └── 4.6 - NIO.2/
│   │       ├── 4.6 - NIO.2.md
│   │       ├── code/
│   │       │   └── NIO2.java
│   │       └── resources/
│   │
│   └── 5 - Parte V - Proyecto RPG/
│       │
│       ├── 5.1 - Diseño del proyecto/
│       │   ├── 5.1 - Diseño del proyecto.md
│       │   ├── code/
│       │   └── resources/
│       │       └── mapa_juego.png
│       │
│       ├── 5.2 - Implementación paso a paso/
│       │   ├── 5.2 - Implementación paso a paso.md
│       │   ├── code/
│       │   │   ├── model/
│       │   │   │   └── Personaje.java
│       │   │   ├── service/
│       │   │   │   └── CombateService.java
│       │   │   ├── ui/
│       │   │   │   └── ConsolaUI.java
│       │   │   └── Main.java
│       │   └── resources/
│       │
│       ├── 5.3 - Persistencia del juego/
│       │   ├── 5.3 - Persistencia del juego.md
│       │   ├── code/
│       │   │   └── GuardarJuego.java
│       │   └── resources/
│       │
│       ├── 5.4 - Mejoras opcionales/
│       │   ├── 5.4 - Mejoras opcionales.md
│       │   ├── code/
│       │   │   └── Mejoras.java
│       │   └── resources/
│       │
│       └── 5.5 - Publicación y ejecución final/
│           ├── 5.5 - Publicación y ejecución final.md
│           ├── code/
│           │   └── Main.java
│           └── resources/
│
│====================================================================
│====================================================================
│
│
GIT/
│
├── 0 - Índice/
│   └── 0 - Índice.md
│
├── 1 - Git Básico/
│   ├── 1.1 - Qué es Git/
│   │   ├── 1.1 - Qué es Git.md
│   │   ├── code/
│   │   │   ├── inicializar_repositorio.md
│   │   │   ├── ver_estado_del_repo.md
│   │   │   ├── primer_archivo_versionado.md
│   │   │   └── primer_commit_minimo.md
│   │   └── resources/
│   ├── 1.2 - Instalación y configuración/
│   │   ├── 1.2 - Instalación y configuración.md
│   │   ├── code/
│   │   │   ├── verificar_instalacion.md
│   │   │   ├── configurar_nombre_y_email.md
│   │   │   ├── configurar_editor.md
│   │   │   └── ver_configuracion_actual.md
│   │   └── resources/
│   ├── 1.3 - Repositorios locales y remotos/
│   │   ├── 1.3 - Repositorios locales y remotos.md
│   │   ├── code/
│   │   │   ├── crear_repo_local.md
│   │   │   ├── agregar_remoto.md
│   │   │   ├── ver_remotos.md
│   │   │   └── eliminar_remoto.md
│   │   └── resources/
│   ├── 1.4 - Primer commit/
│   │   ├── 1.4 - Primer commit.md
│   │   ├── code/
│   │   │   ├── preparar_archivos.md
│   │   │   ├── agregar_al_stage.md
│   │   │   ├── realizar_commit.md
│   │   │   └── commit_con_mensaje_correcto.md
│   │   └── resources/
│   ├── 1.5 - Estado y seguimiento de archivos/
│   │   ├── 1.5 - Estado y seguimiento de archivos.md
│   │   ├── code/
│   │   │   ├── archivos_trackeados_y_no_trackeados.md
│   │   │   ├── git_status_en_detalle.md
│   │   │   ├── quitar_archivos_del_stage.md
│   │   │   └── ignorar_archivos_gitignore.md
│   │   └── resources/
│   ├── 1.6 - Historial y logs/
│   │   ├── 1.6 - Historial y logs.md
│   │   ├── code/
│   │   │   ├── ver_historial_simple.md
│   │   │   ├── log_resumido_oneline.md
│   │   │   ├── filtrar_logs.md
│   │   │   └── ver_cambios_de_un_commit.md
│   │   └── resources/     
│
├── 2 - Git Ramas/
│   ├── 2.1 - Qué es una rama/
│   │   ├── 2.1 - Qué es una rama.md
│   │   ├── code/
│   │   │   ├── ver_ramas.md
│   │   │   ├── rama_actual.md
│   │   │   └── entender_head.md
│   │   └── resources/
│   ├── 2.2 - Crear y cambiar ramas/
│   │   ├── 2.2 - Crear y cambiar ramas.md
│   │   ├── code/
│   │   │   ├── crear_rama.md
│   │   │   ├── cambiar_rama.md
│   │   │   ├── crear_y_cambiar.md
│   │   │   └── borrar_rama.md
│   │   └── resources/
│   ├── 2.3 - Merge básico/
│   │   ├── 2.3 - Merge básico.md
│   │   ├── code/
│   │   │   ├── merge_fast_forward.md
│   │   │   ├── merge_no_fast_forward.md
│   │   │   └── resolver_merge_simple.md
│   │   └── resources/
│   ├── 2.4 - Conflictos y resolución/
│   │   ├── 2.4 - Conflictos y resolución.md
│   │   ├── code/
│   │   │   ├── provocar_conflicto.md
│   │   │   ├── entender_marcadores_conflicto.md
│   │   │   ├── resolver_conflicto.md
│   │   │   └── confirmar_resolucion.md
│   │   └── resources/
│   └── 2.5 - Rebase básico/
│       ├── 2.5 - Rebase básico.md
│       ├── code/
│       │   ├── rebase_simple.md
│       │   ├── resolver_conflicto_rebase.md
│       │   ├── continuar_rebase.md
│       │   └── abortar_rebase.md
│       └── resources/
│
├── 3 - Git Remoto/
│   ├── 3.1 - Configurar remoto/
│   │   ├── 3.1 - Configurar remoto.md
│   │   ├── code/
│   │   │   ├── agregar_origin.md
│   │   │   ├── verificar_remoto.md
│   │   │   └── cambiar_url_remoto.md
│   │   └── resources/
│   ├── 3.2 - Push y pull/
│   │   ├── 3.2 - Push y pull.md
│   │   ├── code/
│   │   │   ├── primer_push.md
│   │   │   ├── pull_cambios.md
│   │   │   ├── push_con_rama.md
│   │   │   └── resolver_rechazo_push.md
│   │   └── resources/
│   ├── 3.3 - Clonar repositorios/
│   │   ├── 3.3 - Clonar repositorios.md
│   │   ├── code/
│   │   │   ├── clonar_https.md
│   │   │   ├── clonar_ssh.md
│   │   │   └── verificar_repo_clonado.md
│   │   └── resources/
│   ├── 3.4 - Fetch vs Pull/
│   │   ├── 3.4 - Fetch vs Pull.md
│   │   ├── code/
│   │   │   ├── fetch_remoto.md
│   │   │   ├── comparar_fetch_y_pull.md
│   │   │   └── actualizar_rama_local.md
│   │   └── resources/
│   └── 3.5 - Trabajo en equipo/
│       ├── 3.5 - Trabajo en equipo.md
│       ├── code/
│       │   ├── flujo_colaborativo_basico.md
│       │   ├── actualizar_rama_antes_de_trabajar.md
│       │   └── resolver_conflictos_equipo.md
│       └── resources/
│
└── 4 - Git Avanzado/
    ├── 4.1 - Stash/
    │   ├── 4.1 - Stash.md
    │   ├── code/
    │   │   ├── guardar_cambios_stash.md
    │   │   ├── listar_stash.md
    │   │   ├── aplicar_stash.md
    │   │   └── eliminar_stash.md
    │   └── resources/
    ├── 4.2 - Cherry-pick/
    │   ├── 4.2 - Cherry-pick.md
    │   ├── code/
    │   │   ├── aplicar_commit_especifico.md
    │   │   ├── resolver_conflicto_cherrypick.md
    │   │   └── abortar_cherrypick.md
    │   └── resources/
    ├── 4.3 - Reset y Revert/
    │   ├── 4.3 - Reset y Revert.md
    │   ├── code/
    │   │   ├── reset_soft.md
    │   │   ├── reset_mixed.md
    │   │   ├── reset_hard.md
    │   │   └── revert_commit.md
    │   └── resources/
    ├── 4.4 - Tags/
    │   ├── 4.4 - Tags.md
    │   ├── code/
    │   │   ├── crear_tag_ligero.md
    │   │   ├── crear_tag_anotado.md
    │   │   └── listar_tags.md
    │   └── resources/
    └── 4.5 - Rebase avanzado/
        ├── 4.5 - Rebase avanzado.md
        ├── code/
        │   ├── rebase_interactivo.md
        │   ├── editar_commits.md
        │   ├── reordenar_commits.md
        │   └── squash_commits.md
        └── resources/


```

> Cada capítulo tendrá su documentación en Markdown, ejemplos de código en la carpeta `code/` y recursos opcionales en `resources/`.

## Cómo usarlo

1. Abrir IntelliJ IDEA o IDE/editor de preferencia e importar la carpeta `JAVA SE + OOP` como proyecto Java.
2. Ejecutar los archivos `.java` dentro de la carpeta `code/`.
3. Consultar la documentación `.md` en Obsidian o programa de preferencia para repasar teoría y ejercicios.

