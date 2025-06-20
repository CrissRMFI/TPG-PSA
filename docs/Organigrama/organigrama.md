# R1. 1 Organigrama de la Empresa PSA (Praxis Systems Argentina)

## 1. Objetivo

Este documento presenta la estructura organizativa de la empresa Praxis Systems Argentina (PSA). El propósito es mostrar cómo se distribuyen jerárquicamente las responsabilidades y los roles dentro de la compañía.

---

## 2. Descripción General

La empresa PSA está liderada por el Director General, Juan Zeo, socio fundador y accionista mayoritario. Por debajo de su dirección, la compañía se organiza en cuatro gerencias principales, cada una a cargo de un socio minoritario: Operaciones, Marketing, Ventas y Administración y Finanzas.

Dentro de estas gerencias existen diversas áreas funcionales, equipos técnicos y roles específicos que permiten el desarrollo, comercialización, soporte y administración de los productos de la empresa (ERP, CRM y BI).

---

## 3. Diagrama Jerárquico

```mermaid
graph TB
  A[Dirección General<br>Juan Zeo]

  A ----> B[Gerencia de Operaciones<br>Fernando Soluzzia]
  A --> C[Gerencia de Marketing<br>José Mercado]
  A --> D[Gerencia de Ventas<br>Juan Anvizzio]
  A --> E[Gerencia de Administración y Finanzas<br>Roberto Ratio]

  B --> B1[Área de Desarrollo / Gestión de proyectos<br>Maximiliano Gantt]
  B --> B2[Jefe de Implementaciones<br>Gustavo Cuccina]
  B --> B3[Soporte a clientes<br> Augusto Aguanti]
  B --> B4[Infraestructura tecnológica]

  B1 --> B1a[Líderes de proyecto]
  B1 --> B1b[Desarrolladores]
  B1 --> B1c[Arquitecto jefe]
  B1 --> B1d[Jefe de Producto]

  B1d --> B1d1[Analistas Funcionales]


  B2 --> B2b[Consultores de Implementacion]
  B2 --> B2c[Desarrolladores de Implementacion]

  B3 ---> B3a[Supervisor de Soporte]
  B3a --> B3b[Analistas de Nivel 1<br>Mesa de Ayuda]
  B3a --> B3c[Analistas de Nivel 2 <br>Soporte Especializado]

  B4 --> B4a[Supervisor de Infraestructura]
  B4 --> B4b[2 especialistas técnicos]

  C --> C1[Analistas de marketing]

  D --> D1[8 Vendedores senior]

  E --> E1[Tres contadores]
  E --> E2[Varios administrativos]
```

## 5. Glosario de Roles y Áreas del Organigrama

# Glosario de Roles y Áreas del Organigrama – PSA

| Término o Rol                                | Definición resumida                                                                                               |
| -------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| Dirección General                            | Liderazgo máximo de la empresa. Encargado de la estrategia general y decisiones clave.                            |
| Gerencia de Operaciones                      | Área técnica y de desarrollo. Supervisa el ciclo de vida de los productos, soporte e infraestructura.             |
| Gerencia de Marketing                        | Encargada de publicidad, relación con clientes y análisis de mercado.                                             |
| Gerencia de Ventas                           | Responsable de la comercialización y trato con los clientes.                                                      |
| Administración y Finanzas                    | Maneja facturación, impuestos, sueldos, tesorería y planificación financiera.                                     |
| Desarrollo de productos                      | Equipos que diseñan, desarrollan y prueban los productos ERP, CRM y BI.                                           |
| Implementaciones                             | Instalan y personalizan los productos en clientes, relevan necesidades y desarrollan adaptaciones.                |
| Soporte a clientes                           | Área de atención a usuarios finales. Resuelve incidentes y consultas.                                             |
| Infraestructura tecnológica                  | Administra servidores, herramientas internas y evalúa infraestructura de clientes.                                |
| Líder de proyecto                            | Coordina equipos técnicos por producto.                                                                           |
| Arquitecto jefe                              | Supervisa la arquitectura técnica general de los productos.                                                       |
| Analista funcional                           | Releva requisitos, diseña y prueba funcionalidades.                                                               |
| Consultor de implementacion                  | Relevan necesidades del cliente, detectan gaps funcionales, parametrizan y lideran implementaciones.              |
| Desarrolladores de Implementaciones          | Programan funcionalidades específicas para cada cliente durante la implementación.                                |
| Supervisor                                   | Responsable operativo de un equipo dentro de un área.                                                             |
| Especialista técnico                         | Personal con conocimientos específicos en infraestructura o herramientas.                                         |
| Vendedor senior                              | Encargado de negociar y vender los productos a empresas.                                                          |
| Contador                                     | Profesional que gestiona aspectos contables de la empresa.                                                        |
| Administrativo                               | Personal de soporte en tareas operativas del área administrativa.                                                 |
| Soporte a Clientes                           | Área que atiende usuarios finales. Gestiona incidentes de Nivel 1 y Nivel 2; escala casos críticos a otras áreas. |
| Supervisor de Soporte                        | Supervisa la operación diaria de Nivel 1 y Nivel 2; coordina el escalamiento a Desarrollo o Implementaciones.     |
| Analistas de Nivel 1 (Mesa de Ayuda)         | Registran y clasifican incidentes, primer punto de contacto con el usuario.                                       |
| Analistas de Nivel 2 (Soporte Especializado) | Resuelven incidentes complejos que superan el primer nivel de atención.                                           |
| Infraestructura Tecnológica                  | Administra servidores, herramientas internas y participa en evaluaciones de infraestructura de clientes.          |
| Supervisor de Infraestructura                | Coordina la operación de los ambientes tecnológicos internos.                                                     |
| Especialistas Técnicos de Infraestructura    | Administran servidores, redes, sistemas de correo y herramientas de desarrollo.                                   |
| Analistas de Marketing                       | Ejecutan investigaciones de mercado, campañas publicitarias y análisis de tendencias.                             |

## 6. Fuente

Este organigrama fue elaborado a partir del documento oficial **"PSA v2020.pdf"**

📎 El archivo completo está incluido en la entrega como anexo, con nombre: [Psa v2020.pdf](https://drive.google.com/drive/folders/0B-OprvtGicVBYmpGUi1OMGsxLUU?resourcekey=0-9XgFyQ4ip67BE8zXErZ4Xg) .

Minutas de reuinion

- [Juan Zeo - 07/04/2025](../Minutas/minuta-JuanZeo-07042025.md)
- [Roberto Ratio - 10/04/2025](../Minutas/minuta-RobertoRatio-10042025.md)
- [Maximiliano Gantt - 24/04/2025](../Minutas/minuta-MaximilianoGantt-24042025.md)
- [Gustavo Cuccini - 24/04/2025](../Minutas/minuta-GustavoCuccina-24042025.md)
- [Augusto Aguanti - 24/04/2025](../Minutas/minuta-AugustoAguanti-24042025.md)
