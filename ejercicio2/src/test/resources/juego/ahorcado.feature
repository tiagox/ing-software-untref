Feature: Ahorcado

  Scenario: Arriesgo una letra y acierto
    Given la palabra secreta es "auto" y tengo 7 vidas
    And el resultado inicial es "****"
    When arriesgo la letra 'a'
    Then el resultado actual es "a***"
    And me quedan 7 vidas
    And el estado es "en juego"

  Scenario: Arriesgo una letra y acierto sin importar mayusculas
    Given la palabra secreta es "auto" y tengo 7 vidas
    And el resultado inicial es "****"
    When arriesgo la letra 'A'
    Then el resultado actual es "a***"
    And me quedan 7 vidas
    And el estado es "en juego"

  Scenario: Arriesgo una letra y no acierto pero todavía me quedan vidas
    Given la palabra secreta es "auto" y tengo 7 vidas
    And el resultado inicial es "****"
    When arriesgo la letra 'x'
    Then el resultado actual es "****"
    And me quedan 6 vidas
    And el estado es "en juego"

  Scenario: Arriesgo una letra, no acierto y pierdo porque no me quedaban más vidas
    Given la palabra secreta es "auto" y tengo 1 vidas
    And el resultado inicial es "****"
    When arriesgo la letra 'x'
    Then el resultado actual es "****"
    And me quedan 0 vidas
    And el estado es "ahorcado"

  Scenario: Arriesgo una letra acierto y ya había acertado otras antes
    Given la palabra secreta es "auto" y tengo 7 vidas
    And el resultado inicial es "a*t*"
    When arriesgo la letra 'o'
    Then el resultado actual es "a*to"
    And me quedan 7 vidas
    And el estado es "en juego"

  Scenario: Arriesgo una letra acierto y está mas de una vez
    Given la palabra secreta es "ALABAMA" y tengo 7 vidas
    And el resultado inicial es "*******"
    When arriesgo la letra 'a'
    Then el resultado actual es "A*A*A*A"
    And me quedan 7 vidas
    And el estado es "en juego"
