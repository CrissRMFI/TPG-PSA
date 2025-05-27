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

| ID     | Requisito                                | Descripción                                                                                                                                         | Categoría            | Fuente                                                              | Prioridad |
| ------ | ---------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------- | ------------------------------------------------------------------- | --------- |
| RF1    | Crear proyecto                           | Crear nuevos proyectos, asignando nombre, tipo de contrato y fechas estimadas.                                                                      | Funcional            | [Juan Zeo](../Minutas/minuta-JuanZeo-07042025.md)                   | Alta      |
| RF2    | Asignar cliente a proyecto               | Vincular un cliente al proyecto existente.                                                                                                          | Funcional            | [Juan Zeo](../Minutas/minuta-JuanZeo-07042025.md)                   | Alta      |
| RF3    | Asignar equipo al proyecto               | Elegir personas responsables del proyecto y sus roles.                                                                                              | Funcional            | [Maximiliano Gantt](../Minutas/minuta-MaximilianoGantt-24042025.md) | Alta      |
| RF4    | Registrar horas trabajadas               | Registrar horas trabajadas por miembros asignados a proyectos.                                                                                      | Funcional            | [Maximiliano Gantt](../Minutas/minuta-MaximilianoGantt-24042025.md) | Alta      |
| RF5    | Consulta de horas facturadas             | Consultar cantidad de horas trabajadas desde la última fecha de facturación.                                                                        | Funcional            | [Maximiliano Gantt](../Minutas/minuta-MaximilianoGantt-24042025.md) | Media     |
| RF6    | Vista general de proyectos               | Mostrar proyectos en curso, futuros y terminados, con detalle de horas y equipo asignado.                                                           | Funcional            | [Maximiliano Gantt](../Minutas/minuta-MaximilianoGantt-24042025.md) | Media     |
| RF7    | Control de cambios                       | Registrar cambios no pactados y permitir cotización y aceptación por parte del cliente.                                                             | Funcional            | [Juan Zeo](../Minutas/minuta-JuanZeo-07042025.md)                   | Alta      |
| RF8    | Integración con CRM y ERP                | Integrar datos de cliente, servicio y pagos cruzados desde CRM y ERP.                                                                               | Funcional            | [Gustavo Cuccina](../Minutas/minuta-GustavoCuccina-24042025.md)     | Media     |
| RF11   | Compatibilidad multiplataforma           | El sistema deberá poder importar/exportar datos desde otras aplicaciones.                                                                           | No Funcional         | [Gustavo Cuccina](../Minutas/minuta-GustavoCuccina-24042025.md)     | Media     |
| RF12   | Registrar ticket                         | Permitir a N1 registrar tickets incluyendo cliente, módulo funcional, versión, prioridad y severidad.                                               | Funcional            | [Augusto Aguanti](../Minutas/minuta-AugustoAguanti-24042025.md)     | Alta      |
| RF13   | Ver listado de tickets                   | Visualizar tickets con filtros por estado, producto, cliente, prioridad y nivel asignado.                                                           | Funcional            | [Roberto Ratio](../Minutas/minuta-RobertoRatio-10042025.md)         | Alta      |
| RF14   | Detalle del ticket                       | Mostrar toda la información del ticket incluyendo historial y comentarios.                                                                          | Funcional            | [Tomas Brunelesohi](../Minutas/minuta-TomasBrunelesohi-08052025.md) | Alta      |
| RF15   | Cambiar estado del ticket                | Permitir transiciones de estado según nivel, con validación de reglas.                                                                              | Funcional            | [Tomas Brunelesohi](../Minutas/minuta-TomasBrunelesohi-08052025.md) | Alta      |
| RF16   | Escalar ticket                           | Permitir escalar el ticket con comentario obligatorio y nueva asignación.                                                                           | Funcional            | [Tomas Brunelesohi](../Minutas/minuta-TomasBrunelesohi-08052025.md) | Alta      |
| RF17   | Agregar comentarios                      | Permitir agregar comentarios al ticket, con visibilidad para todos los niveles.                                                                     | Funcional            | [Roberto Ratio](../Minutas/minuta-RobertoRatio-10042025.md)         | Media     |
| RF18   | Historial de acciones                    | Registrar automáticamente todos los cambios con fecha y usuario.                                                                                    | Funcional            | [Roberto Ratio](../Minutas/minuta-RobertoRatio-10042025.md)         | Alta      |
| RF19   | Notificaciones internas                  | Enviar notificación al nuevo responsable al reasignar el ticket.                                                                                    | Funcional            | [Roberto Ratio](../Minutas/minuta-RobertoRatio-10042025.md)         | Media     |
| RF20   | Gestión de multas                        | Permitir consultar el monto de multa por incumplimiento de SLA.                                                                                     | Funcional            | [Roberto Ratio](../Minutas/minuta-RobertoRatio-10042025.md)         | Alta      |
| RF21   | Alerta preventiva de SLA                 | Generar alerta cuando se haya cumplido el 60% del tiempo pactado sin resolución.                                                                    | Funcional            | [Roberto Ratio](../Minutas/minuta-RobertoRatio-10042025.md)         | Alta      |
| RU-01  | Interfaz similar a MS Project            | La interfaz del sistema debe proveer una visualización compatible con los patrones de MS Project para facilitar la adopción por usuarios avanzados. | Requisito de Usuario | [Augusto Aguanti](../Minutas/minuta-AugustoAguanti-24042025.md)     | Media     |
| RNF-02 | Compatibilidad con aplicaciones externas | El sistema debe poder importar y exportar datos de aplicaciones como CRM, ERP u hojas de cálculo.                                                   | No Funcional         | [Gustavo Cuccina](../Minutas/minuta-GustavoCuccina-24042025.md)     | Media     |
| BUS-01 | Mejorar imagen postventa                 | El sistema debe contribuir a mejorar la imagen del soporte ante los clientes, reduciendo fricciones y aumentando la trazabilidad.                   | Negocio              | [Tomas Brunelesohi](../Minutas/minuta-TomasBrunelesohi-08052025.md) | Alta      |
| BUS-02 | Trazabilidad entre versiones y mejoras   | Debe mantenerse un vínculo entre los cambios introducidos en cada versión y los requerimientos o tickets asociados.                                 | Negocio              | [Juan Zeo](../Minutas/minuta-JuanZeo-07042025.md)                   | Media     |
| BUS-03 | Reducir tiempos de resolución en soporte | El rediseño debe permitir escalar y resolver incidentes críticos en menor tiempo.                                                                   | Negocio              | [Roberto Ratio](../Minutas/minuta-RobertoRatio-10042025.md)         | Alta      |
| BUS-04 | Consolidar gestión de proyectos          | El sistema debe permitir centralizar la planificación, avance y control de los proyectos activos.                                                   | Negocio              | [Maximiliano Gantt](../Minutas/minuta-MaximilianoGantt-24042025.md) | Alta      |

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
