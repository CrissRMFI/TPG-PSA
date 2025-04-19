# Onion Model – Proyecto PSA

Este modelo identifica los stakeholders del sistema PSA Cloud Spring ERP.

---

## 🧅 Capas del Modelo

### 🟣 Núcleo – El sistema

- PSA Cloud Spring ERP

---

### 🔴 Capa 1 – Usuarios del sistema

Interactúan directamente con el sistema (usan la interfaz para tareas reales):

- Vendedores
- Empleados administrativos
- Operadores de facturación
- Personal de compras y contabilidad

---

### 🟡 Capa 2 – Personal de soporte

No son usuarios directos, pero configuran, mantienen o aseguran el funcionamiento del sistema:

- Desarrolladores
- Analistas funcionales
- Testers
- Técnicos de infraestructura
- Mesa de ayuda
- Consultores de implementación

---

### 🟢 Capa 3 – Stakeholders indirectos

No interactúan con el sistema directamente, pero son influenciados por él o lo influyen:

- Product Owner (PO)
- Program Manager (PM)
- Gerencia de Operaciones
- Management de PSA
- Clientes corporativos
- Proveedores estratégicos

## ![Onion Model](<R1.2 Onion Model.png>)

[figma.com/R1.2-OnionModel](https://www.figma.com/design/F0SGrgwunPUi7RblxnMZny/R1.2-Onion-Model?node-id=0-1&t=NHcL0pkH9tGpiTU9-1) .

| Rol                               | Descripción                                                                               |
| --------------------------------- | ----------------------------------------------------------------------------------------- |
| **PSA Cloud Spring ERP**          | Sistema ERP desarrollado por PSA, actualmente migrado a la nube.                          |
| **Vendedores**                    | Operan el módulo de ventas del ERP: presupuestos, pedidos, gestión de clientes.           |
| **Empleados administrativos**     | Usan el ERP para tareas de gestión, carga de datos, emisión de comprobantes y reportes.   |
| **Operadores de modulos ERP**     | Emiten y registran facturas, gestionan comprobantes y colaboran con contabilidad.         |
| **Personal Contable**             | Planifican compras, gestionan facturas y realizan conciliación contable dentro del ERP.   |
| **Consultores de implementación** | Parametrizan el ERP para cada cliente, participan del relevamiento y puesta en marcha.    |
| **Mesa de ayuda**                 | Brindan soporte de primer nivel a usuarios; registran, escalan y resuelven incidencias.   |
| **Testers**                       | Ejecutan pruebas funcionales para validar el comportamiento del sistema.                  |
| **Analistas funcionales**         | Relevan requerimientos, modelan funciones, y validan entregables con usuarios y clientes. |
| **Desarrolladores**               | Programan funcionalidades, corrigen errores y mantienen el código del ERP.                |
| **Product Owner (PO)**            | Define el alcance funcional, prioriza tareas y representa la visión del producto.         |
| **Program Manager (PM)**          | Gestiona proyectos a nivel de tribu, coordina tiempos, equipos y alineación estratégica.  |
| **Gerencia de Operaciones**       | Supervisa arquitectura, productos y estrategia técnica de PSA.                            |
| **Management de PSA**             | Nivel directivo encabezado por Juan Zeo; toma decisiones estratégicas.                    |
| **Clientes corporativos**         | Empresas que adquieren el ERP; participan en definiciones funcionales y validaciones.     |
| **Proveedores estratégicos**      | Brindan tecnologías o servicios integrados al ERP de PSA.                                 |

## 📎 Fuente

- [Psa v2020.pdf](https://drive.google.com/drive/folders/0B-OprvtGicVBYmpGUi1OMGsxLUU?resourcekey=0-9XgFyQ4ip67BE8zXErZ4Xg) .
- Basado en la estructura del Onion Model original de Robertson & Robertson
