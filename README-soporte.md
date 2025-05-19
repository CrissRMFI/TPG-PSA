# Proyecto PSA – Sistema de Gestión de Proyectos y Soporte

## 📌 Propósito del proyecto

Desarrollar el módulo de soporte parte del Sistema de Gestión de Proyectos y Soporte dedicado al soporte dentro del producto a desarrollar.

---

## 🧩 Contexto actual

- PSA está en un proceso de expansión regional.
- Cada área usa herramientas distintas para gestión tickets de soporte.
- La falta de integración de las distintas áreas respecto a las análiticas de soporte genera esfuerzo manual para consolidar datos críticos (costos, avances, facturación, etc.).

---

## 🧭 Definiciones 

A desarrollar...

## 📋 Referencias

- [Minuta de reunión 07/04/2025 - Juan Zeo (Gerente General)](./docs/minutas/minuta-JuanZeo-07042025.md)

- [Minuta de reunión 10/04/2025 - Roberto Ratio (Gerente de Finanzas)](./docs/minutas/minuta-RobertoRatio-10042025.md)

- [Minuta de reunión 24/04/2025 - Augusto Aguanti (Soporte a Clientes)](docs/Minutas/minuta-AugustoAguanti-24042025.md)

- [Minuta de reunión 24/04/2025 - Gustavo Cuccina (Implementaciones)](docs/Minutas/minuta-GustavoCuccina-24042025.md)

- [Minuta de reunión 10/04/2025 - Maximiliano Gantt (Desarrollo / Gestión de Proyectos)](docs/Minutas/minuta-MaximilianoGantt-24042025.md)

- [Minuta de reunión 08/05/2025 - Tomas Bruneleschi (Product Owner / Proyecto PSA)](docs/Minutas/minuta-TomasBrunelesohi-08052025.md)

## 🧭 Descripción General

A desarrollar...


---

## 🧭 Visión del producto

El sistema posee un módulo dedicado a la **gestión soporte**, con el objetivo de mejorar la administración y el seguimiento de los tickets generados por el equipo de soporte, enfocado en la detección de demoras y eliminar ineficiencias en el proceso.


### 🧱 Objetivos principales

- Asegurar la **trazabilidad completa** de cada ticket a través de un historial, según el cliente y el producto asociado.
- Facilitar la **clasificación** de tickets por estado y naturaleza de los mismos.
- Brindar una solución para que las distintas áreas de la empresa mejoren su gestión de tickets con **integración** a la gestion proyectos y sus actividades. 

---

### 🧠 Funcionalidades previstas

El módulo es el de **Gestión de Soporte** con funcionalidades de seguimiento, reportes y trazabilidad.

#### Gestión de Soporte

- Registro de tickets asociados a clientes, versiones y productos específicos.
- Visualizar la version del software utilizado por el cliente, vinculado al incidente.
- Derivar automáticamente incidentes como tareas de desarrollo.
- Control de cumplimiento de SLA.
- Visualizar tiempo restante de cada incidente según el SLA correspondiente.
- Alertar proximos vencimientos de contratos SLA.
- Mostrar el ciclo de vida de cada ticket, incluyendo asignaciónes, tiempos de atención y equipos implicados.
- Agrupar tickets por distintos criterios (cliente, producto, módulo, etc).
- Clasificación por severidad del caso, basado en el impacto del incidente.
- Clasificación por prioridad según las condiciones del cliente.
- Seguimiento de tickets a través de niveles de la estructura de soporte. 
- Clasificación por nivel
- Etiquetar automáticamente según el tipo de consulta o incidente.
- Vincular ticket con tareas de proyectos.
- Asignación de tickets a agentes de soporte
- Visualización de tickets activos, vencidos, resueltos y reabiertos.

---

### 🌍 Proyección comercial

Aunque inicialmente será usado internamente, el sistema está siendo diseñado con una arquitectura y una interfaz que permitan:

- Su reutilización y adaptación por parte de **clientes externos de PSA**, especialmente aquellos que ya utilizan otros productos que esán dentro del catálogo de la compañía.
- Su incorporación como **producto de software comercializable**, ampliando la oferta de PSA en soluciones de gestión empresarial.

---

### 💡 Beneficios esperados

- **Facilitar** el trabajo de clasificación de tickets para los clientes que usen el producto.
- **Mejorar** el seguimiento del ciclo de vida de los tickets generados.
- **Aumentar** la comunicación entre los equipos implicados en el ticket generado.
- **Separar** el desarrollo de las funcionalidades del módulo de Soporte con el de Gestión del Proyecto.
---
