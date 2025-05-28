Feature: Cambio de estado
  # Como analista de soporte
  # quiero actualizar el estado del ticket
  # para reflejar su progreso

  Scenario Outline: Cambiar estado de "<estadoInicial>" a "<estadoFinal>"
    Given existe un ticket con estado "<estadoInicial>"
    When el soporte cambia su estado a "<estadoFinal>"
    Then el ticket cambia al estado "<estadoFinal>"
    And el historial registra el cambio de estado

    Examples:
    | estadoInicial | estadoFinal |
    | NUEVO         | EN_PROGRESO |
    | EN_PROGRESO   | ESCALADO    |
    | ESCALADO      | RESUELTO    |
    | RESUELTO      | CERRADO    |

  Scenario: No se permite cambiar de estado de "Resuelto" a "En progreso"
    Given existe un ticket con estado "Resuelto"
    When el soporte intenta cambiar su estado a "En progreso"
    Then el cambio no se realiza
    And se informa que la transicion no es valida

  Scenario Outline: No se permite cambiar estado de "<estadoInicial>" a "<estadoFinal>"
    Given existe un ticket con estado "<estadoInicial>"
    When el soporte intenta cambiar su estado a "<estadoFinal>"
    Then se imforma un mensaje indicando que no es posible ese cambio de estado
    And el tiket permanece en "<estadoInicial>"

    Examples:
      | estadoInicial | estadoFinal |
      | NUEVO         | ESCALADO    |
      | NUEVO         | RESUELTO    |
      | NUEVO         | CERRADO     |
      | EN_PROGRESO   | NUEVO       |
      | EN_PROGRESO   | CERRADO     |
      | ESCALADO      | NUEVO       |
      | ESCALADO      | CERRADO     |
      | CERRADO       | EN_PROGRESO |
      | CERRADO       | NUEVO       |
      | CERRADO       | ESCALADO    |