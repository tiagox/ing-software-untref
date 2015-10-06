Feature: Ahorcado

  Scenario: Arriesgo una letra y acierto
    Given la palabra secreta es "auto", tengo 7 vidas y el estado actual es "****"
    When arriesgo la letra 'a'
    Then el estado actual es "a***"
    And me quedan 7 vidas
