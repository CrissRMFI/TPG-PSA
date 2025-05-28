Feature: Registro de tickets
  # Como analista de soporte
  # quiero registrar un nuevo ticket
  # para dejar constancia del incidente reportado por un cliente.

  Background:
    Given existe un portafolio de tickets

  Scenario: Registrar un nuevo incidente
    Given un cliente reporta un problema en un producto y modulo funcional
    When el soporte solicita agregar un nuevo ticket
    Then se genera un ticket con identificador unico, titulo, version, cliente, modulo funcional, prioridad y severidad
    And se agrega al portafolio
    And inicia en estado "Nuevo"

  Scenario: No se permite registrar un ticket sin cliente
    Given un cliente reporta un problema en un producto y modulo funcional
    When el soporte intenta registrar un ticket sin especificar el cliente
    Then el ticket no se registra
    And se informa un mensaje indicando que el cliente es obligatorio

  Scenario: No se permite registrar un ticket sin descripcion del incidente
    Given un cliente reporta un problema en un producto y modulo funcional
    When el soporte intenta registrar un ticket sin descripcion del incidente
    Then el ticket no se registra
    And se informa un mensaje indicando que la descripcion del incidente es obligatoria

  Scenario: La severidad debe estar entre 1 y 5
    Given un cliente reporta un problema en un producto y modulo funcional
    When el soporte solicita agregar un nuevo ticket con severidad "6"
    Then el ticket no se registra
    And se informa un mensaje indicando que la severidad debe estar entre 1 y 5

  Scenario: No se permite registrar un ticket sin modulo funcional
    Given un cliente reporta un problema en un producto
    When el soporte intenta registrar un ticket sin modulo funcional
    Then el ticket no se registra
    And se informa un mensaje indicando que el modulo funcional es obligatorio

  Scenario: El modulo funcional debe corresponder al producto
    Given un cliente reporta un problema en un producto y modulo funcional
    When el soporte selecciona un modulo funcional que no pertenece al producto
    Then el ticket no se registra
    And se informa un mensaje indicando que el modulo funcional no corresponde al producto seleccionado

  Scenario: El ticket incluye la fecha de creacion
    Given un cliente reporta un problema en un producto y modulo funcional
    When el soporte registra un nuevo ticket
    Then el ticket debe tener registrada la fecha de creacion

  Scenario: No se permite registrar un ticket con version vacia
    Given un cliente reporta un problema en un producto y modulo funcional
    When el soporte intenta registrar un ticket sin version
    Then el ticket no se registra
    And se informa un mensaje indicando que la version es obligatoria
