Feature: Batalla Naval

  Scenario: Posiciono un destructor en el tablero en una posicion que estaba libre
    Given un tablero de batalla naval
    When un jugador posiciona un barco de tipo "destructor" en la posicion ("C", 5) en dirección "horizontal"
    Then la operación se realiza correctamente

  Scenario: Posiciono un destructor en el tablero en una posicion que estaba ocupada
    Given un tablero de batalla naval
    And un barco ocupando la posicion ("C", 5)
    When un jugador posiciona un barco de tipo "destructor" en la posicion ("C", 5) en dirección "horizontal"
    Then la operación no se realiza por posicionar una nave en posiciones ocupadas

  Scenario: Posiciono un acorazado en el tablero en la posicion tal que una parte queda fuera del tablero
    Given un tablero de batalla naval
    When un jugador posiciona un barco de tipo "acorazado" en la posicion ("J", 7) en dirección "vertical"
    Then la operación no se realiza por posicionar una nave fuera del tablero

  Scenario: Disparo y toco agua
    Given un tablero de batalla naval
    When ataco la posicion ("F", 8)
    Then el disparo resulta en "agua"
