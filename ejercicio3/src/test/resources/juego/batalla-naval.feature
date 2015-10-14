Feature: Batalla Naval

  Scenario: Posiciono un destructor en el tablero en una posicion que estaba libre
    Given un tablero de batalla naval
    When un jugador posiciona un barco de tipo "destructor" en la posicion ("C", 5) en dirección "horizontal"
    Then la operación se realiza correctamente
