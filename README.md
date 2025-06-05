# Proyecto PSA – Sistema de Gestión de Proyectos y Soporte

## 📌 Propósito del proyecto

Desarrollar un sistema propio e integrado para gestionar proyectos y soporte dentro de PSA, con posibilidad futura de comercialización como parte del ecosistema de productos de la empresa (junto a PSA Spring ERP y CRM).

---

## 🧩 Contexto actual

- PSA está en un proceso de expansión regional.
- Cada área usa herramientas distintas para gestión de proyectos y tickets.
- La falta de integración genera esfuerzo manual para consolidar datos críticos (costos, avances, facturación, etc.).
- Se busca unificar en una **única herramienta desarrollada internamente**, aprovechando las capacidades de PSA como software factory.

---

## 🧭 Visión del producto

El sistema será una plataforma integral para la **gestión de proyectos y soporte**, desarrollada por PSA para unificar procesos actualmente fragmentados, mejorar la eficiencia operativa y permitir una visión estratégica del portafolio de iniciativas de la compañía. A futuro, se proyecta su evolución como producto comercializable dentro del ecosistema de soluciones PSA.

### 🧱 Objetivos principales

- Brindar una **herramienta única y centralizada** para que las distintas áreas de PSA puedan gestionar proyectos, actividades y tickets de soporte de forma integrada.
- Asegurar la **trazabilidad completa** de cada proyecto: desde su planificación inicial hasta la carga de horas, ejecución, seguimiento, entrega y soporte post-implementación.
- Facilitar la **transparencia, colaboración y control**, eliminando tareas manuales y dispersión de información.

## Modulos funcionales por producto

A continuacion se listan los modulos funcionales correspondientes a cada uno de los productos desarrollados por PSA:

---

### 📦 PSA ERP

| Modulo funcional | Descripcion                                 |
| ---------------- | ------------------------------------------- |
| Contabilidad     | Gestion de asientos contables y balances    |
| Tesoreria        | Pagos, cobranzas y conciliaciones bancarias |
| Compras          | Solicitudes y ordenes de compra             |
| Ventas           | Facturacion y gestion de remitos            |
| Inventario       | Control de stock, entradas y salidas        |
| Proyectos        | Planificacion y seguimiento de proyectos    |
| Recursos Humanos | Liquidacion de sueldos, legajos, ausencias  |
| Reportes         | Informes administrativos y financieros      |

---

### 📇 PSA CRM

| Modulo funcional      | Descripcion                                    |
| --------------------- | ---------------------------------------------- |
| Gestion de clientes   | Alta, baja y modificacion de datos de clientes |
| Seguimiento comercial | Seguimiento de oportunidades y contactos       |
| Agenda                | Tareas, reuniones y compromisos comerciales    |
| Campañas              | Gestion de campañas de marketing               |
| Reclamos              | Atencion postventa y soporte al cliente        |

---

### 📊 PSA Business Analytics

| Modulo funcional        | Descripcion                             |
| ----------------------- | --------------------------------------- |
| Paneles de control      | Visualizacion grafica de indicadores    |
| Reportes financieros    | Generacion de reportes personalizables  |
| Integracion de datos    | Conexion con ERP, CRM y otras fuentes   |
| Analisis predictivo     | Proyecciones, escenarios y tendencias   |
| Exportacion de informes | Descarga en Excel, PDF u otros formatos |

---

> Esta clasificacion permite asociar cada ticket registrado a su producto y modulo correspondiente, facilitando su tratamiento y seguimiento.

---

### 🧠 Funcionalidades previstas

El sistema se compondrá de dos módulos principales interrelacionados: **Gestión de Proyectos** y **Gestión de Soporte**, con funcionalidades de seguimiento, reportes y trazabilidad.

#### 1. Gestión de Proyectos

- Creación de proyectos con nombre, código único, fechas (planificadas y reales), presupuesto y total de horas estimadas.
- Visualización de actividades del proyecto en un tablero dinámico con estados como: “no iniciada”, “en curso”, “completada”, “cancelada” o “pausada”, lo que permite un seguimiento claro del avance.
- Registro de progreso en tiempo real, con asignación de actividades a responsables y carga de horas asociadas.
- Control de tiempos y esfuerzo invertido en cada actividad, facilitando la trazabilidad de los recursos utilizados y el cálculo de costos asociados.

#### 2. Gestión de Soporte

- Registro y seguimiento de tickets asociados a clientes, versiones y productos específicos.
- Clasificación automática según el tipo de consulta o incidente.
- Asignación de tickets a agentes de soporte, con control de cumplimiento de SLA.
- Historial completo por ticket, por cliente y por producto.
- Visualización de tickets activos, vencidos, resueltos y reabiertos.

#### 3. Otras funcionalidades

- Preparación para integración con PSA Spring ERP, permitiendo futura conexión con módulos de facturación, compras y gestión financiera.

---

### 🌍 Proyección comercial

Aunque inicialmente será usado internamente, el sistema está siendo diseñado con una arquitectura y una interfaz que permitan:

- Su reutilización y adaptación por parte de **clientes externos de PSA**, especialmente aquellos que ya utilizan otros productos que esán dentro del catálogo de la compañía.
- Su incorporación como **producto de software comercializable**, ampliando la oferta de PSA en soluciones de gestión empresarial.

---

### 💡 Beneficios esperados

- **Mayor eficiencia operativa** en las áreas de proyectos y soporte.
- **Visibilidad unificada de proyectos**, facilitando la priorización y gestión estratégica.
- **Mejora en la experiencia del cliente**, a través de una atención de soporte más ordenada, trazable y medible.

---

## 📅 Línea de tiempo esperada

- ✅ Semana 0: Reunión inicial con Juan Zeo.
- 🗓️ Semana 4-5: Reunión con Juan Zeo para validar la visión del MVP.
- ⏳ Semana 15: Entrega del MVP funcional.

---

## 🗣️ Reuniones y descubrimiento

➡️ Ver [Minuta completa de la reunión del 07/04/2025 - Juan Zeo (Gerente General)](./docs/minutas/minuta-JuanZeo-07042025.md)

➡️ Ver [Minuta completa de la reunión del 10/04/2025 - Roberto Ratio (Gerente de Finanzas)](./docs/minutas/minuta-RobertoRatio-10042025.md)

➡️ Ver [Minuta completa de la reunión del 24/04/2025 - Augusto Aguanti (Soporte a Clientes)](docs/Minutas/minuta-AugustoAguanti-24042025.md)

➡️ Ver [Minuta completa de la reunión del 24/04/2025 - Gustavo Cuccina (Implementaciones)](docs/Minutas/minuta-GustavoCuccina-24042025.md)

➡️ Ver [Minuta completa de la reunión del 10/04/2025 - Maximiliano Gantt (Desarrollo / Gestión de Proyectos)](docs/Minutas/minuta-MaximilianoGantt-24042025.md)

## 📋 Requisitos identificados

[Ver tabla de requisitos detallada](docs/Requisitos/requisitos.md)

---
