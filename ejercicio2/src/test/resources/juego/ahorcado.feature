Feature: Ahorcado

  Scenario: Arriesgo una letra y acierto
    Given la palabra secreta es "auto" y tengo 7 vidas
    And el estado inicial es "****"
    When arriesgo la letra 'a'
    Then el estado actual es "a***"
    And me quedan 7 vidas

  Scenario: Arriesgo una letra y acierto sin importar mayusculas
    Given la palabra secreta es "auto" y tengo 7 vidas
    And el estado inicial es "****"
    When arriesgo la letra 'A'
    Then el estado actual es "a***"
    And me quedan 7 vidas

  Scenario: Arriesgo una letra y no acierto pero todavía me quedan vidas
    Given la palabra secreta es "auto" y tengo 7 vidas
    And el estado inicial es "****"
    When arriesgo la letra 'x'
    Then el estado actual es "****"
    And me quedan 6 vidas
