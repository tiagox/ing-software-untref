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

  Scenario: PAPEL vs PIEDRA
    Given jugadorUno juega PAPEL
    When jugadorDos juega PIEDRA
    Then gana jugadorUno

  Scenario: PAPEL vs TIJERA
    Given jugadorUno juega PAPEL
    When jugadorDos juega TIJERA
    Then gana jugadorDos

  Scenario: PAPEL vs PAPEL
    Given jugadorUno juega PAPEL
    When jugadorDos juega PAPEL
    Then hay empate

  Scenario: TIJERA vs PIEDRA
    Given jugadorUno juega TIJERA
    When jugadorDos juega PIEDRA
    Then gana jugadorDos
