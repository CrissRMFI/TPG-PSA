## Alcance de la solución

PSA Project Manager es una aplicación orientada a la gestión eficiente de proyectos bajo contratos Time & Materials y Llave en Mano. Su principal objetivo es hacer el seguimiento de dichos proyectos y representar fielmente los detalles de cada uno de ellos.

---

## Requisitos

### Códigos para requisitos

| CÓDIGO | DESCRIPCIÓN            |
| ------ | ---------------------- |
| RF     | Requisito funcional    |
| RNF    | Requisito no funcional |
| RN     | Requisito de negocio   |
| RU     | Requisito de usuario   |

---

### Matriz de trazabilidad

| ID      | REQUISITO                                                | DESCRIPCIÓN                                                                                                      | CATEGORÍA            | ASOCIACIÓN | PRIORIDAD |
| ------- | -------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | -------------------- | ---------- | --------- |
| RF1     | Crear proyecto                                           | Crear nuevos proyectos, asignando nombre y tipo de contrado                                                      | Funcional            |            | Alta      |
| RF1.1   | Asignar cliente                                          | Vincular un cliente al proyecto existente                                                                        | Funcional            | RF1        | Alta      |
| RF1.2   | Fechas estimadas de Proyecto                             | Asignar fecha de inicio y finalización previstas para el proyecto                                                | Funcional            | RF1        | Alta      |
| RF1.3   | Asignar equipo de proyecto                               | Elegir personas responables del proyecto y sus roles                                                             | Funcional            | RF1        | Alta      |
| RF1.4   | Registro de horas trabajadas                             | Registrar horas trabajadas por miembros asignados en proyectos                                                   | Funcional            | RF1.3      | Alta      |
| RF1.4.1 | Consulta de horas facturadas                             | Consultar cantidad de horas trabajadas desde la última fecha de facturación                                      | Funcional            | RF1.4      | Alta      |
| RF1.5   | Consulta de equipo de proyecto                           | Ver los miembros asignados a un equipo de proyecto                                                               | Funcional            | RF1.3      | Media     |
| RF1.5.1 | Distribución del trabajo por equipo                      | Mostrar tareas asignadas a cada miembro del proyecto                                                             | Funcional            | RF1.5      | Media     |
| RF1.6   | Registro de costos adicionales                           | Asignar costos adicionales del proyecto                                                                          | Funcional            | RF1        | Alta      |
| RF1.6.1 | Registro de licencias como costo adicional               | Asignar licencias necesarias como costos adicionales del proyecto                                                | Funcional            | RF1.6      | Alta      |
| RF1.6.2 | Registrar alquileres como costo adicional                | Agregar alquileres de equipos o espacios al proyecto como costo.                                                 | Funcional            | RF1.6      | Alta      |
| RF1.6.3 | Registrar capacitaciones como costo adicional            | Incluir capacitaciones como costos adicionales asociados al proyecto.                                            | Funcional            | RF1.6      | Media     |
| RF2     | Gestión de multas                                        | Permitir consultar el monto de multa por incumplimiento de SLA                                                   | Funcional            |            | Alta      |
| RF2.1   | Alerta preventiva de SLA                                 | Generar alerta cuando transcurra el 50%-60% del tiempo pactado sin resolver una incidencia                       | Funcional            | RF2        | Alta      |
| RF3     | Vista general de proyectos                               | Mostrar información resumida de proyectos en curso, futuros y terminados, con detalle de horas y equipo asignado | Funcional            |            | Media     |
| RF3.1   | Datos de contrato y equipo                               | Mostrar tipo de contrato y equipo encargado para cada proyecto en la vista general.                              | Funcional            | RF3        | Media     |
| RF4     | Integración con CRM y ERP                                | Integrar datos de cliente, servicio y pagos cruzados desde CRM y ERP                                             | Funcional            | RF4        | Baja      |
| RF4.2   | Intercambio de datos con Microsoft Project               | Importar y exportar información de planificación y seguimiento hacia y desde Microsoft Project.                  | Funcional            | RF4        | Baja      |
| RF4.3   | Exportación a Excel                                      | Permitir exportar datos en formato compatible con Excel                                                          | Funcional            | RF4        | Baja      |
| RF5     | Reporte de estado de proyectos                           | Generar reportes sobre el estado de avance de cada proyecto.                                                     | Funcional            | RF3        | Baja      |
| RF6     | Control de cambios                                       | Registrar cambios no pactados y permitir cotización y aceptación por parte del cliente                           | Funcional            | RF1        | Alta      |
| RN1     | Consideración de multas                                  | Las multas son informativas y no deben descontarse automáticamente en las cotizaciones.                          | Regla de negocio     | RF2        | Alta      |
| RU1     | Interfaz amigable y compatibilidad visual con MS Project | La interfaz debe ser familiar para usuarios acostumbrados a Microsoft Project                                    | Requisito de usuario | RF4        | Baja      |
| RNF1    | Compatibilidad con otras plataformas                     | Los datos con los que trabajará el sistema deberán poder ser importados o exportados desde otras aplicaciones    | No Funcional         |            | Baja      |

---

## Glosario

- **T&M (Time & Materials):**  
  Modelo contractual basado en horas trabajadas y materiales usados, permite flexibilidad en el cobro.
- **SLA (Service Level Agreement):**  
  Acuerdo contractual que establece tiempos de respuesta y resolución para incidencias o soporte técnico.

- **Gerente de Finanzas:**  
  Responsable de controlar la entrada y salida de dinero, validar facturación y multas.
- **CRM / ERP:**  
  Sistemas empresariales para la gestión de clientes (CRM) y recursos (ERP).

---

## Módulos Identificados

| Módulo                        | Descripción                                                                  | Clases principales                              |
| ----------------------------- | ---------------------------------------------------------------------------- | ----------------------------------------------- |
| Gestión de Proyectos          | Crear, planificar, asignar recursos y controlar avances y costos.            | `Proyecto`, `EquipoTrabajo`, `GerenteProyecto`  |
| Control de Horas              | Registro, validación y consulta de horas trabajadas.                         | `RegistroHoras`, `Empleado`                     |
| Control de Multas y SLA       | Seguimiento y alertas sobre cumplimiento de SLA y cálculo de multas.         | `Incidente`, `Multa`, `SLA`                     |
| Gestión de Costos Adicionales | Registrar y consultar costos asociados al proyecto más allá de horas hombre. | `CostoAdicional`, `Factura`                     |
| Integración Externa           | Sincronización de datos con CRM, ERP y Microsoft Project.                    | `IntegracionCRM`, `IntegracionERP`, `MSProject` |
| Reportes y Exportaciones      | Generación de reportes y exportación a Excel o MS Project.                   | `Reporte`, `ExportadorExcel`, `ExportadorMSP`   |
