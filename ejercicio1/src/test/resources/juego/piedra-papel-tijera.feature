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

  Scenario: TIJERA vs PAPEL
    Given jugadorUno juega TIJERA
    When jugadorDos juega PAPEL
    Then gana jugadorUno

  Scenario: TIJERA vs TIJERA
    Given jugadorUno juega TIJERA
    When jugadorDos juega TIJERA
    Then hay empate

  # Otra forma de plantear escenarios es usando tablas con escenarios como layout.
  Scenario Outline: jugadorUno vs jugadorDos
    Given jugadorUno juega <elementoUno>
    When jugadorDos juega <elementoDos>
    Then <resultado>

    Examples:
      | elementoUno | elementoDos | resultado       |
      | PIEDRA      | PAPEL       | gana jugadorDos |
      | PIEDRA      | TIJERA      | gana jugadorUno |
      | PIEDRA      | PIEDRA      | hay empate      |
      | PAPEL       | PIEDRA      | gana jugadorUno |
      | PAPEL       | TIJERA      | gana jugadorDos |
      | PAPEL       | PAPEL       | hay empate      |
      | TIJERA      | PIEDRA      | gana jugadorDos |
      | TIJERA      | PAPEL       | gana jugadorUno |
      | TIJERA      | TIJERA      | hay empate      |
