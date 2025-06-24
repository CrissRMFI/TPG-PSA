Feature: Registro de tickets
  # Como analista de soporte
  # Quiero registrar un nuevo ticket
  # Para dejar constancia del incidente reportado por un cliente.

  Background:
    Given existe un portafolio de tickets

  Scenario: Registrar un nuevo incidente
    Given un problema reportado cuya severidad es de nivel <severidad> y se encuentra en el producto con id <id_producto> con la version identificada con el id <id_version>
    And un cliente identificado ID <id_cliente> que reporta el problema
    And un responsable para solucionar el problema se lo identifica con el ID <id_empleado>
    When el soporte solicita agregar un nuevo ticket y asigna el titulo <titulo>, la descripcion <descripcion> y la prioridad <prioridad>
    Then se crea un ticket con identificador unico
    And el ticket creado tiene el titulo <titulo>
    And el ticket creado tiene la descripcion <descripcion>
    And el ticket creado tiene la prioridad <prioridad>
    And el ticket creado marca la severidad como <severidad>
    And el ticket creado esta asociado a la version con id <id_version> del producto con id <id_producto>
    And el ticket creado tiene como responsable al empleado con el id <id_empleado>
    And el ticket creado tiene como reportador al cliente con el id <id_cliente>
    And el ticket creado se inicia en el estado "CREADO"
    And el ticket creado tiene la fecha de creacion

    Examples:
      | titulo                | descripcion         | prioridad | severidad | id_version | id_empleado | id_cliente | id_producto |
      | "Titulo"              | "Descripcion"       | "ALTA"    | 5         | 213        | "Ri-001"    | "Co-001"   | 01          |
      | "Titulo Tarea"        | "Descripcion Tarea" | "MEDIA"   | 4         | 2113       | "IR-101"    | "AC-133"   | 123         |
      | "Tarea 2"             | "lorem ipsum"       | "BAJA"    | 3         | 23         | "R2-155"    | "C-213"    | 3           |
      | "Tarea 20"            | "ipsum lorem"       | "ALTA"    | 2         | 203        | "RUD-5"     | "CRO-2"    | 23          |
      | "Titulo Tarea prueba" | "ipsumlorem"        | "BAJA"    | 1         | 3          | "5"         | "2"        | 523         |

  Scenario: Registrar un nuevo incidente sin asignar responsable
    Given un problema reportado cuya severidad es de nivel <severidad> y se encuentra en el producto con id <id_producto> con la version identificada con el id <id_version>
    And un cliente identificado ID <id_cliente> que reporta el problema
    When el soporte solicita agregar un nuevo ticket y asigna el titulo <titulo>, la descripcion <descripcion> y la prioridad <prioridad>
    Then se crea un ticket con identificador unico
    And el ticket creado tiene el titulo <titulo>
    And el ticket creado tiene la descripcion <descripcion>
    And el ticket creado tiene la prioridad <prioridad>
    And el ticket creado marca la severidad como <severidad>
    And el ticket creado esta asociado a la version con id <id_version> del producto con id <id_producto>
    And el ticket creado tiene responsable sin asignar
    And el ticket creado tiene como reportador al cliente con el id <id_cliente>
    And el ticket creado se inicia en el estado "CREADO"
    And el ticket creado tiene la fecha de creacion

    Examples:
      | titulo                | descripcion         | prioridad | severidad | id_version | id_cliente | id_producto |
      | "Titulo"              | "Descripcion"       | "ALTA"    | 5         | 213        | "Co-001"   | 01          |
      | "Titulo Tarea"        | "Descripcion Tarea" | "MEDIA"   | 4         | 2113       | "AC-133"   | 123         |
      | "Tarea 2"             | "lorem ipsum"       | "BAJA"    | 3         | 23         | "C-213"    | 3           |
      | "Tarea 20"            | "ipsum lorem"       | "ALTA"    | 2         | 203        | "CRO-2"    | 23          |
      | "Titulo Tarea prueba" | "ipsumlorem"        | "BAJA"    | 1         | 3          | "2"        | 523         |

  Scenario: Error al registrar un nuevo incidente sin titulo
    Given un problema reportado cuya severidad es de nivel <severidad> y se encuentra en el producto con id <id_producto> con la version identificada con el id <id_version>
    And un cliente identificado ID <id_cliente> que reporta el problema
    And un responsable para solucionar el problema se lo identifica con el ID <id_empleado>
    When el soporte solicita agregar un nuevo ticket sin titulo pero con descripcion <descripcion> y la prioridad <prioridad>
    Then se retorna un error al crear un ticket con el siguente mensaje: "No fue posible crear el ticket porque: ticket.titulo es requerido"
    And el nuevo ticket no fue creado

    Examples:
      | descripcion         | prioridad | severidad | id_version | id_empleado | id_cliente | id_producto |
      | "Descripcion"       | "ALTA"    | 5         | 213        | "Ri-001"    | "Co-001"   | 01          |
      | "Descripcion Tarea" | "MEDIA"   | 4         | 2113       | "IR-101"    | "AC-133"   | 123         |
      | "lorem ipsum"       | "BAJA"    | 3         | 23         | "R2-155"    | "C-213"    | 3           |
      | "ipsum lorem"       | "ALTA"    | 2         | 203        | "RUD-5"     | "CRO-2"    | 23          |
      | "ipsumlorem"        | "BAJA"    | 1         | 3          | "5"         | "2"        | 523         |

  Scenario: Error al registrar un nuevo incidente sin priorizar
    Given un problema reportado cuya severidad es de nivel <severidad> y se encuentra en el producto con id <id_producto> con la version identificada con el id <id_version>
    And un cliente identificado ID <id_cliente> que reporta el problema
    And un responsable para solucionar el problema se lo identifica con el ID <id_empleado>
    When el soporte solicita agregar un nuevo ticket y asigna el titulo <titulo>, la descripcion <descripcion> sin priorizar
    Then se retorna un error al crear un ticket con el siguente mensaje: "No fue posible crear el ticket porque: ticket.prioridad es requerido"
    And el nuevo ticket no fue creado

    Examples:
      | titulo                | descripcion         | severidad | id_version | id_empleado | id_cliente | id_producto |
      | "Titulo"              | "Descripcion"       | 5         | 213        | "Ri-001"    | "Co-001"   | 01          |
      | "Titulo Tarea"        | "Descripcion Tarea" | 4         | 2113       | "IR-101"    | "AC-133"   | 123         |
      | "Tarea 2"             | "lorem ipsum"       | 3         | 23         | "R2-155"    | "C-213"    | 3           |
      | "Tarea 20"            | "ipsum lorem"       | 2         | 203        | "RUD-5"     | "CRO-2"    | 23          |
      | "Titulo Tarea prueba" | "ipsumlorem"        | 1         | 3          | "5"         | "2"        | 523         |

  Scenario: Error al registrar un nuevo incidente sin conocer al cliente
    Given un problema reportado cuya severidad es de nivel <severidad> y se encuentra en el producto con id <id_producto> con la version identificada con el id <id_version>
    And un cliente no identificado
    And un responsable para solucionar el problema se lo identifica con el ID <id_empleado>
    When el soporte solicita agregar un nuevo ticket y asigna el titulo <titulo>, la descripcion <descripcion> y la prioridad <prioridad>
    Then se retorna un error al crear un ticket con el siguente mensaje: "No fue posible crear el ticket porque: ticket.cliente es requerido"
    And el nuevo ticket no fue creado

    Examples:
      | titulo                | descripcion         | prioridad | severidad | id_version | id_empleado | id_producto |
      | "Titulo"              | "Descripcion"       | "ALTA"    | 5         | 213        | "Ri-001"    | 01          |
      | "Titulo Tarea"        | "Descripcion Tarea" | "MEDIA"   | 4         | 2113       | "IR-101"    | 123         |
      | "Tarea 2"             | "lorem ipsum"       | "BAJA"    | 3         | 23         | "R2-155"    | 3           |
      | "Tarea 20"            | "ipsum lorem"       | "ALTA"    | 2         | 203        | "RUD-5"     | 23          |
      | "Titulo Tarea prueba" | "ipsumlorem"        | "BAJA"    | 1         | 3          | "5"         | 523         |

  Scenario: Error al registrar un nuevo incidente sin detectar severidad
    Given un problema reportado cuya severidad no se estudió y se encuentra en el producto con id <id_producto> con la version identificada con el id <id_version>
    And un cliente identificado ID <id_cliente> que reporta el problema
    And un responsable para solucionar el problema se lo identifica con el ID <id_empleado>
    When el soporte solicita agregar un nuevo ticket y asigna el titulo <titulo>, la descripcion <descripcion> y la prioridad <prioridad>
    Then se retorna un error al crear un ticket con el siguente mensaje: "No fue posible crear el ticket porque: ticket.severidad es requerido"
    And el nuevo ticket no fue creado

    Examples:
      | titulo                | descripcion         | prioridad | id_version | id_empleado | id_cliente | id_producto |
      | "Titulo"              | "Descripcion"       | "ALTA"    | 213        | "Ri-001"    | "Co-001"   | 01          |
      | "Titulo Tarea"        | "Descripcion Tarea" | "MEDIA"   | 2113       | "IR-101"    | "AC-133"   | 123         |
      | "Tarea 2"             | "lorem ipsum"       | "BAJA"    | 23         | "R2-155"    | "C-213"    | 3           |
      | "Tarea 20"            | "ipsum lorem"       | "ALTA"    | 203        | "RUD-5"     | "CRO-2"    | 23          |
      | "Titulo Tarea prueba" | "ipsumlorem"        | "BAJA"    | 3          | "5"         | "2"        | 523         |

  Scenario: Error al registrar un nuevo incidente sin conocer la version del producto
    Given un problema reportado cuya severidad es de nivel <severidad> y se encuentra en el producto con id <id_producto> sin version identificada
    And un cliente identificado ID <id_cliente> que reporta el problema
    When el soporte solicita agregar un nuevo ticket y asigna el titulo <titulo>, la descripcion <descripcion> y la prioridad <prioridad>
    And un responsable para solucionar el problema se lo identifica con el ID <id_empleado>
    When el soporte solicita agregar un nuevo ticket y asigna el titulo <titulo>, la descripcion <descripcion> y la prioridad <prioridad>
    Then se retorna un error al crear un ticket con el siguente mensaje: "No fue posible crear el ticket porque: ticket.version es requerido"
    And el nuevo ticket no fue creado

    Examples:
      | titulo                | descripcion         | prioridad | severidad | id_empleado | id_cliente | id_producto |
      | "Titulo"              | "Descripcion"       | "ALTA"    | 5         | "Ri-001"    | "Co-001"   | 01          |
      | "Titulo Tarea"        | "Descripcion Tarea" | "MEDIA"   | 4         | "IR-101"    | "AC-133"   | 123         |
      | "Tarea 2"             | "lorem ipsum"       | "BAJA"    | 3         | "R2-155"    | "C-213"    | 3           |
      | "Tarea 20"            | "ipsum lorem"       | "ALTA"    | 2         | "RUD-5"     | "CRO-2"    | 23          |
      | "Titulo Tarea prueba" | "ipsumlorem"        | "BAJA"    | 1         | "5"         | "2"        | 523         |