# Proyecto PSA – Sistema de Gestión de Proyectos y Soporte

## 1. Introducción
## 1.1 Finalidad

Desarrollar funcionalidades el módulo de soporte aportando una solución para los equipos de soporte que son parte de proyectos, cuyas necesidades fueron relevadas bajo un análisis de la empresa Praxis Systems Argentina. 

---

## 1.2 Alcance

El Modulo de Soporte es parte de la herramienta utilizada para Gestión de Proyectos y Soporte, producto derivado de la necesidad de la empresa PSA, que busca con este producto continuar un proceso de expansión regional. Cada área de la empresa usa herramientas distintas para gestión tickets de soporte y la principal idea es unificar las tareas de soporte por medio de la herramienta e integrarla con la gestión de proyectos. Además se busca una integración de las distintas áreas respecto a las análiticas de soporte genera esfuerzo manual para consolidar datos críticos (costos, avances, facturación, etc.).

---

## 1.3 Definiciones, siglas, definiciones

A desarrollar...

## 1.4 Referencias
## 1.4.1 Organigrama

- [Organigrama de la Empresa PSA](./docs/Organigrama/organigrama.md)

## 1.4.2 Minutas de Reunión

- [Minuta de reunión 07/04/2025 - Juan Zeo (Gerente General)](./docs/minutas/minuta-JuanZeo-07042025.md)

- [Minuta de reunión 10/04/2025 - Roberto Ratio (Gerente de Finanzas)](./docs/minutas/minuta-RobertoRatio-10042025.md)

- [Minuta de reunión 24/04/2025 - Augusto Aguanti (Soporte a Clientes)](docs/Minutas/minuta-AugustoAguanti-24042025.md)

- [Minuta de reunión 24/04/2025 - Gustavo Cuccina (Implementaciones)](docs/Minutas/minuta-GustavoCuccina-24042025.md)

- [Minuta de reunión 10/04/2025 - Maximiliano Gantt (Desarrollo / Gestión de Proyectos)](docs/Minutas/minuta-MaximilianoGantt-24042025.md)

- [Minuta de reunión 08/05/2025 - Tomas Bruneleschi (Product Owner / Proyecto PSA)](docs/Minutas/minuta-TomasBrunelesohi-08052025.md)

## 1.4.4 Análisis de Interesados

- [Onion Model](./docs/Dominio/onionModel.md)

## 1.4.5 Modelo de Dominio

- [Modelo de Dominio](./docs/Dominio/mdd.md)

## 1.4.6 Análisis de Requisitos

- [Matriz de Trazabilidad - Gestión de Proyectos y Soporte](./docs/Requisitos/requisitos.md)

## 1.4.7 Documentos externos

- [Presentación de Visión PSA - Tomas Bruneleschi (Product Owner / Proyecto PSA)](https://docs.google.com/presentation/d/1RKjXip65SFtVxiFx2X7nD-ORf1ZTkyG8f94DVdFbizw/edit?usp=sharing)

## 1.5  Descripción General
Descripción de los contenidos del documento de visión

- 2. **Posicionamiento**: Se comunica la intención de la aplicación y la importancia del proyecto para todos los interesados.


---

### 2. Posicionamiento 
### 2.1 Oportunidad de negocio

Este proyecto se centra en aprovechar las necesidades operativas del área de Soporte a Clientes para mejorar la eficiencia, reducir costos y aumentar la satisfacción del cliente, lo que puede traducirse en una ventaja competitiva para la empresa.

### 2.2 El Problema

La resolución ineficiente de incidentes debido a la falta de información precisa sobre el entorno de los clientes, la pobre integración con el Área de Desarrollo y la gestión inadecuada de SLA afecta al equipo de Soporte, al equipo de Desarrollo y a los clientes de la empresa. El impacto del problema es retrasos en la resolución de incidentes, aumento de la carga de trabajo manual, posibles incumplimientos de SLA que derivan en penalizaciones económicas y una menor satisfacción del cliente. Una solución exitosa incluiría el registro automático de las versiones de software y módulos personalizados de los clientes, una integración fluida con Desarrollo para la derivación directa de tareas y trazabilidad completa, el seguimiento automatizado de SLA con alertas en tiempo real, un historial detallado de tickets para optimizar recursos y un sistema de categorización priorizado basado en severidad y condiciones del cliente.

### 2.3 La Solución 

Para los equipos de soporte a clientes y desarrollo de empresas con contratos SLA, que necesitan mejorar la eficiencia en la resolución de incidentes y cumplir con acuerdos de nivel de servicio bajo presión operativa. El Sistema de Gestión de Soporte es una plataforma integrada de gestión de tickets que ofrece un registro automático del entorno del cliente, integración fluida con Desarrollo, seguimiento en tiempo real de SLA con alertas automáticas, historial detallado de tickets y categorización priorizada, garantizando una atención rápida y confiable. A diferencia de las soluciones de gestión de tickets tradicionales, nuestro producto se diferencia por su enfoque en la automatización de procesos críticos y la trazabilidad completa, reduciendo la carga manual y minimizando penalizaciones económicas.

---
### 🧠 Funcionalidades previstas

El sistema posee un módulo dedicado a la **gestión soporte**, con el objetivo de mejorar la administración y el seguimiento de los tickets generados por el equipo de soporte, enfocado en la detección de demoras y eliminar ineficiencias en el proceso.

- Asegurar la **trazabilidad completa** de cada ticket a través de un historial, según el cliente y el producto asociado.
- Facilitar la **clasificación** de tickets por estado y naturaleza de los mismos.
- Brindar una solución para que las distintas áreas de la empresa mejoren su gestión de tickets con **integración** a la gestion proyectos y sus actividades. 

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
