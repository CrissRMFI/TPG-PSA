# 📝 Minuta de Reunión – Product Owner (Proyecto PSA)

**📅 Fecha:** 24/04/2025  
**👤 Participante principal:** Product Owner del sistema PSA - Tomas Brunelesohi
**🎯 Objetivo:** Establecer el alcance funcional y las prioridades del MVP, definiendo los módulos principales que deberá cubrir el sistema en su primera versión.

---

## Temas tratados

### 1. Estructura general del sistema

El Product Owner explicó que el nuevo PSA tiene que ser el corazón operativo de la empresa, centralizando la **gestión de proyectos** y el **manejo de soporte** en una sola plataforma, estos módulos serán los principales

---

### 2. Módulo de Gestión de Proyectos

Se acordó que este módulo debe permitir:

- Crear y listar proyectos de manera ágil.
- Asociar tareas específicas a cada proyecto.
- Consultar el estado de avance de cada proyecto en cualquier momento.
- Asignar responsables a las tareas (asignar roles).
- Integrar los usuarios responsables desde un sistema externo ya existente.
- Detectar de manera temprana proyectos que muestren desvíos, para actuar preventivamente (registro de riesgos).
- Integración con el módulo de finanzas

Se dejó claro que, en esta primera etapa, **no se va a implementar ni asignación detallada de recursos ni gestión de permisos**.

---

### 3. Módulo de Gestión de Soporte

Respecto al módulo de soporte, se definió que:

- Los tickets serán cargados únicamente por el equipo de soporte interno (los clientes no tendrán acceso directo).
- Cada ticket deberá vincularse a un cliente proveniente de un sistema externo.
- Deberá poder asociarse uno o varios tickets a tareas existentes en proyectos.
- Será necesario registrar severidad y prioridad en cada caso, de forma estandard.
- El sistema tendrá que controlar el cumplimiento de los SLA y alertar ante posibles incumplimientos.
- La relación entre tickets y tareas podrá ser de uno a muchos, o de muchos a uno, según necesidad.
- Chekear las tareas si un cliente está teniendo muchos problemas

---

### 4. Alcance del MVP

Se aclaró que en esta primera versión **no se trabajará sobre**:

- Asignación de permisos.
- Gestión de productos o versiones (esta información vendrá de sistemas externos).
- Desarrollo de reportes complejos o tableros analíticos.

Caracteristicas necesarias que el PO sugiere/demanda:
Proyecto:

- Listado de proyectos, filtros para obtener por poryecto en curso y cerrado
- Mostrar las tareas que conforman el proyecto al entrar
- Poder crear y borrar proyectos
- Para la asignación de empleados la información se extrae de una basese de datos

Soporte:

- Listado de todos los productos con sus respectivas versiones que tiene PSA.
- Cuando se ingresa a un producto/versión deben mostrarse tickets abiertos.
- Debemos filtrar por estado del ticket.
- El dato principal que debe figurar en el ticket es el producto con su versión.
- Debe poderse catalogar el ticket según el error (usuario, consulta ó producto).
- Si es error del producto se debe crear una tarea en el proyecto que sea el manejo de errores.
- Tickets deben ser asociados a un empleado, se debe asociar soporte al módulo de recursos.
- No se permite la creación de nuevos productos.
- Cada proyecto debe estar asociado a clientes.
- Consultar qué proyectos existen para poder crear las tareas.

---

### 5. Comentarios finales

El Product Owner remarcó que uno de los objetivos clave del sistema será **detectar desviaciones a tiempo** para evitar problemas mayores en clientes o proyectos críticos.  
También destacó que PSA deberá integrarse fácilmente con los sistemas externos existentes y potenciar la colaboración entre las áreas de **soporte**, **ingeniería** y **gestión de proyectos**.

Finalmente, se acordó comenzar con la construcción de prototipos durante la próxima semana para validar los flujos antes de iniciar el desarrollo formal.

---
