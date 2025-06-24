Feature: Busqueda de tickets
  # Como analista de soporte
  # quiero buscar un ticket por nombre, estado, prioridad o severidad
  # para encontrarlo y acceder a el

  Scenario: Buscar tickets por nombre del cliente
    Given existen tickets registrados
    When el soporte busca por el nombre de cliente "AgroTech"
    Then obtiene los tickets asociados al cliente "AgroTech"

  Scenario: Buscar tickets por estado "IN_PROGRESS"
    Given existen tickets registrados
    When el soporte busca por estado "IN_PROGRESS"
    Then obtiene los tickets con estado "IN_PROGRESS"

  Scenario: Buscar tickets con prioridad HIGH_PRIORITY
    Given existen tickets registrados
    When el soporte busca por prioridad "HIGH_PRIORITY"
    Then obtiene los tickets que tienen prioridad "HIGH_PRIORITY"

  Scenario: Buscar tickets con severidad 5
    Given existen tickets registrados
    When el soporte busca por severidad "LEVEL_5"
    Then obtiene los tickets que tienen severidad "LEVEL_5"