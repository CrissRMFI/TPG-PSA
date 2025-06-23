Feature: Registro de tickets
  # Como analista de soporte
  # Quiero registrar un nuevo ticket
  # Para dejar constancia del incidente reportado por un cliente.

  Background:
    Given existe un portafolio de tickets

  Scenario: Registrar un nuevo incidente
    Given un problema reportado en la version identificada con el id <id_version> cuya severidad es de nivel <severidad>  
    And un cliente identificado ID <id_cliente> que reporta el problema
    And un responsable para solucionar el problema se lo identifica con el ID <id_empleado>
    When el soporte solicita agregar un nuevo ticket y asigna el titulo <titulo>, la descripcion <descripcion> y la prioridad <prioridad>
    Then se crea un ticket con identificador unico
    And el ticket creado tiene el titulo <titulo>
    And el ticket creado tiene la descripcion <descripcion>
    And el ticket creado tiene la prioridad <prioridad>
    And el ticket creado marca la severidad como <severidad>
    And el ticket creado esta asociado a la version con id <id_version>
    And el ticket creado tiene como responsable al empleado con el id <id_empleado>
    And el ticket creado tiene como reportador al cliente con el id <id_cliente>
    And el ticket creado se inicia en el estado "CREADO"
    And el ticket creado tiene la fecha de creacion

    Examples:
    | titulo | descripcion | prioridad| severidad| id_version| id_empleado| id_cliente |
    | "Titulo" | "Descripcion" | "ALTA" | 5 | "213" | "R-001" | "C-001" |