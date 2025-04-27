# 📝 Minuta de Reunión – Roberto Ratio (Gerencia de Finanzas)

**📅 Fecha:** 10/04/2025  
**👤 Participante:** Roberto Ratio – Gerente de Administración y Finanzas  
**👥 Equipo:** Equipo de Dessarrollo  
**🎯 Objetivo:** Relevar necesidades del área de finanzas vinculadas al nuevo sistema de gestión de proyectos y soporte

---

## 🧠 Temas tratados

### 💸 Entrada de dinero – Facturación

- PSA trabaja con proyectos bajo modalidad **Time and Materials (T&M)** y **Llave en mano**.
- Problema grave: **subfacturación** por mal registro de horas trabajadas.
- Necesitan hacer un **seguimiento fiel de horas** para facturar correctamente.
- Funcionalidad crítica: consultar **horas trabajadas desde la última facturación**.

---

### 💰 Salida de dinero – Soporte y multas

- PSA brinda **servicios de soporte post-proyecto**, regulados por **Acuerdos de Nivel de Servicio**.
- Existen **multas contractuales** si no se cumple el tiempo de respuesta según la prioridad del ticket.
- Necesitan:
  - Consultar el **monto exacto de la multa** pactado en cada caso.
  - Generar **alertas automáticas** si se supera el 50–60% del tiempo pactado sin resolución.
  - Poder anticipar posibles penalidades.

> 💡 _Roberto expresó que conocer esta información con antelación le permitiría tomar decisiones estratégicas, como contratar más personal o reasignar recursos para cumplir con los acuerdos de servicio y evitar sanciones._

---

## 🧾 Funcionalidades requeridas

- **Vista general de proyectos:**

  - En curso, terminados, futuros.
  - Tipo de contrato, equipo asignado, horas trabajadas.

- **Consultas operativas:**

  - Qué equipo está asignado.
  - Cómo se distribuye el trabajo.
  - Cuántas horas dedica cada equipo.
  - Costos adicionales (capacitaciones, servidores, licencias, etc.).

- **Reportes y exportaciones:**

  - Estado de proyectos (baja prioridad para finanzas).
  - Exportación a Excel.
  - Compatibilidad con Microsoft Project (importar/exportar datos).

- **Control de cambios:**
  - Registrar modificaciones no pactadas.
  - Enviar cotización al cliente para su aprobación antes de ejecutar.

---

## ⚠️ Observaciones clave

- Roberto podría convertirse en un **stakeholder negativo** si no se contempla compatibilidad con herramientas que ya usa (MS Project).
- Está dispuesto a adoptar la nueva solución si permite **interoperabilidad con sus flujos actuales**.
- Considera que **la información en tiempo real del estado de los proyectos** debe ser un insumo para **tomar decisiones de gestión de recursos humanos y presupuestarios**.

---

## 🔄 Pendientes / Próximos pasos

- Validar con Product Owner los tipos de prioridad en soporte.
- Modelar requisitos vinculados a penalidades y recursos.
- Evaluar cómo representar visualmente SLA en riesgo.
- Explorar opciones de integración con ERP, CRM y MS Project.

---
