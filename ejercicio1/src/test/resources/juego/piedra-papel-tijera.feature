Feature: Juego Piedra Papel Tijera

  Scenario: PIEDRA vs PAPEL
    Given jugadorUno juega PIEDRA
    When jugadorDos juega PAPEL
    Then gana jugadorDos

  Scenario: PIEDRA vs TIJERA
    Given jugadorUno juega PIEDRA
    When jugadorDos juega TIJERA
    Then gana jugadorUno

  Scenario: PIEDRA vs PIEDRA
    Given jugadorUno juega PIEDRA
    When jugadorDos juega PIEDRA
    Then hay empate
