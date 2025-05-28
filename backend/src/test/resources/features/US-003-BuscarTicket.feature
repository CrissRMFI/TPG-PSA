Feature: Busqueda de tickets
  # Como analista de soporte
  # quiero buscar un ticket por nombre, estado, prioridad o severidad
  # para encontrarlo y acceder a el

  Scenario: Buscar tickets por nombre del cliente
    Given existen tickets registrados
    When el soporte busca por el nombre de cliente "AgroTech"
    Then obtiene los tickets asociados al cliente "AgroTech"

  Scenario: Buscar tickets por estado "Escalado"
    Given existen tickets registrados
    When el soporte busca por estado "Escalado"
    Then obtiene los tickets con estado "Escalado"

  Scenario: Buscar tickets con prioridad alta
    Given existen tickets registrados
    When el soporte busca por prioridad "Alta"
    Then obtiene los tickets que tienen prioridad "Alta"

  Scenario: Buscar tickets con severidad 5
    Given existen tickets registrados
    When el soporte busca por severidad "5"
    Then obtiene los tickets que tienen severidad "5"