# Proyecto PSA – Sistema de Gestión de Proyectos y Soporte

---
# 1. Introducción {#intro}
## 1.1 Finalidad

Desarrollar funcionalidades el módulo de soporte aportando una solución para los equipos de soporte que son parte de proyectos, cuyas necesidades fueron relevadas bajo un análisis de la empresa Praxis Systems Argentina. 


## 1.2 Alcance

El Modulo de Soporte es parte de la herramienta utilizada para Gestión de Proyectos y Soporte, producto derivado de la necesidad de la empresa PSA, que busca con este producto continuar un proceso de expansión regional. Cada área de la empresa usa herramientas distintas para gestión tickets de soporte y la principal idea es unificar las tareas de soporte por medio de la herramienta e integrarla con la gestión de proyectos. Además se busca una integración de las distintas áreas respecto a las análiticas de soporte genera esfuerzo manual para consolidar datos críticos (costos, avances, facturación, etc.).


## 1.3 Definiciones, siglas, definiciones

A desarrollar...

## 1.4 Referencias
### 1.4.1 Organigrama

- [Organigrama de la Empresa PSA](./docs/Organigrama/organigrama.md)

### 1.4.2 Minutas de Reunión

- [Minuta de reunión 07/04/2025 - Juan Zeo (Gerente General)](./docs/minutas/minuta-JuanZeo-07042025.md)

- [Minuta de reunión 10/04/2025 - Roberto Ratio (Gerente de Finanzas)](./docs/minutas/minuta-RobertoRatio-10042025.md)

- [Minuta de reunión 24/04/2025 - Augusto Aguanti (Soporte a Clientes)](docs/Minutas/minuta-AugustoAguanti-24042025.md)

- [Minuta de reunión 24/04/2025 - Gustavo Cuccina (Implementaciones)](docs/Minutas/minuta-GustavoCuccina-24042025.md)

- [Minuta de reunión 10/04/2025 - Maximiliano Gantt (Desarrollo / Gestión de Proyectos)](docs/Minutas/minuta-MaximilianoGantt-24042025.md)

- [Minuta de reunión 08/05/2025 - Tomas Bruneleschi (Product Owner / Proyecto PSA)](docs/Minutas/minuta-TomasBrunelesohi-08052025.md)

### 1.4.4 Análisis de Interesados

- [Onion Model](./docs/Dominio/onionModel.md)

### 1.4.5 Modelo de Dominio

- [Modelo de Dominio](./docs/Dominio/mdd.md)

### 1.4.6 Análisis de Requisitos

- [Matriz de Trazabilidad - Gestión de Proyectos y Soporte](./docs/Requisitos/requisitos.md)

### 1.4.7 Documentos externos

- [Presentación de Visión PSA - Tomas Bruneleschi (Product Owner / Proyecto PSA)](https://docs.google.com/presentation/d/1RKjXip65SFtVxiFx2X7nD-ORf1ZTkyG8f94DVdFbizw/edit?usp=sharing)

## 1.5  Descripción General
Descripción de los contenidos del documento de visión

2. [Posicionamiento](#posicionamiento): Se comunica la intención de la aplicación y la importancia del proyecto para todos los interesados.

3. [Interesados y perfil de usuario](#interesados-y-perfil-de-usuarios): Se describen los interesados y usuarios detectados en el análisis de interesados, y que forman parte de la definicón de requisitos.


---

# 2. Posicionamiento
## 2.1 Oportunidad de negocio

Este proyecto se centra en aprovechar las necesidades operativas del área de Soporte a Clientes para mejorar la eficiencia, reducir costos y aumentar la satisfacción del cliente, lo que puede traducirse en una ventaja competitiva para la empresa.

## 2.2 El Problema

La resolución ineficiente de incidentes debido a la falta de información precisa sobre el entorno de los clientes, la pobre integración con el Área de Desarrollo y la gestión inadecuada de SLA afecta al equipo de Soporte, al equipo de Desarrollo y a los clientes de la empresa. El impacto del problema es retrasos en la resolución de incidentes, aumento de la carga de trabajo manual, posibles incumplimientos de SLA que derivan en penalizaciones económicas y una menor satisfacción del cliente. Una solución exitosa incluiría el registro automático de las versiones de software y módulos personalizados de los clientes, una integración fluida con Desarrollo para la derivación directa de tareas y trazabilidad completa, el seguimiento automatizado de SLA con alertas en tiempo real, un historial detallado de tickets para optimizar recursos y un sistema de categorización priorizado basado en severidad y condiciones del cliente.

## 2.3 La Solución 

Para los equipos de soporte a clientes y desarrollo de empresas con contratos SLA, que necesitan mejorar la eficiencia en la resolución de incidentes y cumplir con acuerdos de nivel de servicio bajo presión operativa. El Sistema de Gestión de Soporte es una plataforma integrada de gestión de tickets que ofrece un registro automático del entorno del cliente, integración fluida con Desarrollo, seguimiento en tiempo real de SLA con alertas automáticas, historial detallado de tickets y categorización priorizada, garantizando una atención rápida y confiable. A diferencia de las soluciones de gestión de tickets tradicionales, nuestro producto se diferencia por su enfoque en la automatización de procesos críticos y la trazabilidad completa, reduciendo la carga manual y minimizando penalizaciones económicas.

---
# 3. Interesados y perfil de usuario
## 3.1 El Mercado
Las principales demografías que motivan las decisiones del producto son empresas con contratos SLA, especialmente en sectores como tecnología y servicios, que enfrentan presión operativa para resolver incidentes rápidamente. El mercado objetivo incluye equipos de soporte a clientes en empresas medianas y grandes, ubicadas en regiones en expansión como América Latina, donde la unificación de herramientas es una prioridad. Se segmenta en:

- Empresas tecnológicas: Necesitan soporte eficiente para clientes con software customizado.
- Proveedores de servicios: Requieren cumplimiento estricto de SLA para evitar penalizaciones.
- Organizaciones en crecimiento: Buscan soluciones estandarizadas y escalables para mejorar la satisfacción del cliente.

## 3.2 Resumen de interesados
### 3.2.1 Gerente de Soporte a Clientes
- **Nombre**: Gerente de Soporte a Clientes
- **Interesado**: Augusto Aguanti, líder del área de Soporte a Clientes.
- **Rol**: Define las necesidades operativas del equipo de soporte, incluyendo el registro automático del entorno del cliente, la gestión de SLA con alertas, la categorización de tickets por severidad y prioridad, y el seguimiento detallado de incidentes. Asegura que el sistema cumpla con los requisitos para mejorar la eficiencia y la satisfacción del cliente.

### 3.2.2 Product Owner 
- **Nombre**: Product Owner del Sistema PSA
- **Interesado**: Tomas Brunelesohi, Product Owner del sistema PSA.
- **Rol**: Establece el alcance funcional del módulo de soporte, definiendo características como la carga interna de tickets, la vinculación con clientes y productos externos, el control de SLA, y la creación de tareas para errores de producto. Valida los flujos mediante prototipos y asegura la alineación con las necesidades del soporte.

### 3.2.3 Equipo de Soporte
- **Nombre**: Equipo de Soporte (Niveles 1, 2 y 3)
- **Interesado**: Los agentes, analistas y especialistas del equipo de soporte interno (representados por Augusto Aguanti).
- **Rol**: Utilizan el sistema para registrar, categorizar, escalar y resolver tickets, dependiendo de su nivel. Su retroalimentación directa influye en la usabilidad y funcionalidad del sistema, como la necesidad de historiales detallados y alertas de SLA.

### 3.2.4 Gerente General
- **Nombre**: Gerente General de PSA
- **Interesado**: Juan Zeo, Gerente General de PSA.
- **Rol**: Define la visión estratégica de unificar la gestión de soporte en una herramienta estandarizada, estableciendo plazos (MVP en 15 semanas) y priorizando la flexibilidad para uso interno. Su enfoque en la expansión regional y la satisfacción del cliente impulsa la necesidad de un sistema robusto de soporte.

### 3.2.5 Área de Finanzas
- **Nombre**: Área de Finanzas
- **Interesado**: Equipo de Finanzas de PSA.
- **Rol**: Proporciona datos de costos asociados a penalizaciones por incumplimientos de SLA, asegurando que el sistema incluya alertas automáticas para mitigar riesgos financieros. Su participación es secundaria y se limita al impacto económico del soporte.

### 3.2.6 Área de Implementaciones
- **Nombre**: Líder de Implementaciones
- **Interesado**: Gustavo Cuccina, líder del área de Implementaciones.
- **Rol**: Aporta información sobre la documentación de configuraciones y versiones instaladas en clientes, que el sistema de soporte puede utilizar para registrar automáticamente el entorno del cliente. Su relevancia es menor, limitada a la integración de datos para mejorar la resolución de incidentes.

### 3.2.1 Resumen de interesados
- **Name**: Líder de Desarrollo y Gestión de Proyectos
- **Interesado**: Maximiliano Gantt, líder del área de Desarrollo.
- **Rol**: Facilita la integración técnica del sistema de soporte con el flujo de Desarrollo para la derivación de tareas relacionadas con errores de producto. Su relevancia es secundaria, enfocada en garantizar la compatibilidad y la trazabilidad de incidentes técnicos.

## 3.3 Resumen de usuarios

### 3.3.1 Agente de Soporte Nivel 1 
- **Nombre**: Agente de Soporte Nivel 1 (Call Center - PSA)
- **Descripción**: Responsable de la atención inicial y el registro de los tickets generados por los clientes. Utiliza el sistema para crear tickets, categorizarlos según severidad y prioridad, y escalarlos a niveles superiores si es necesario.
- **Interesado involucrado**: Augusto Aguanti, gerente del área de Soporte a Clientes, quien supervisa las operaciones y necesidades del equipo de soporte.

### 3.3.2 Agente de Soporte Nivel 2
- **Nombre**: Analista de Soporte Nivel 2
- **Descripción**: Interviene cuando un ticket requiere análisis más especializado. Utiliza el sistema para revisar los tickets escalados, acceder a información del entorno del cliente (como versión del software y módulos customizados), y resolver o escalar el incidente al nivel 3 si es necesario.
- **Interesado involucrado**: Augusto Aguanti, gerente del área de Soporte a Clientes, quien supervisa las operaciones y necesidades del equipo de soporte.

### 3.3.3 Especialista de Soporte Nivel 3
- **Nombre**: Especialista de Soporte Nivel 3
- **Descripción**: Maneja los tickets más complejos que requieren análisis funcional avanzado o derivación al equipo de Desarrollo. Usa el sistema para rastrear tickets, integrarse con el flujo de trabajo de Desarrollo, y documentar resoluciones detalladas.
- **Interesado involucrado**: Augusto Aguanti, gerente del área de Soporte a Clientes, quien supervisa las operaciones y necesidades del equipo de soporte.

### 3.3.4 Desarrollador
- **Nombre**: Desarrollador, integrante del Equipo de Desarrollo
- **Descripción**: Recibe tareas derivadas del sistema de soporte cuando un incidente requiere intervención técnica (por ejemplo, corrección de bugs o ajustes en módulos customizados). Utiliza el sistema para gestionar y rastrear estas tareas dentro de su flujo de trabajo.
- **Interesado involucrado**: Maximiliano Gantt, gerente del área de Desarrollo. 

### 3.3.5 Implementador
- **Nombre**: Implementador, integrante del Equipo de Implementaciones
- **Descripción**: Gestiona actualizaciones y personalizaciones del software como proyectos formales, no como tickets de soporte. Utiliza el sistema para registrar y consultar información sobre las versiones y módulos instalados en los clientes, asegurando que las implementaciones sean consistentes.
- **Interesado involucrado**: Gustavo Cuccina, líder del equipo de Implementaciones.

## 3.4 Ambiente de usuario

El ambiente de usuario para el sistema de Gestión de Soporte a Clientes, según las minutas, se desarrolla en un entorno interno de oficina donde el equipo de Soporte (Niveles 1, 2 y 3) gestiona tickets generados exclusivamente por el call center de PSA, sin acceso directo de los clientes al sistema. Los ciclos de tareas varían: Nivel 1 registra y categoriza tickets, Nivel 2 analiza y resuelve o escala, y Nivel 3 deriva a Desarrollo si es necesario, pudiendo extenderse de minutos a semanas para tickets de larga duración. El trabajo está limitado por plazos de SLA, con riesgo de penalizaciones económicas por incumplimiento. Los usuarios operan en computadoras internas, sin mención de trabajo móvil o externo. El sistema actual de ticketing no está especificado, pero el nuevo sistema debe integrarse con el flujo de Desarrollo y sistemas externos de clientes para datos de productos y versiones.

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
