package juego;

public class PapelVisitor implements ElementoVisitor {

    @Override
    public Resultado contra(Piedra elemento) {
        return Resultado.PIERDE;
    }

    @Override
    public Resultado contra(Papel elemento) {
        return Resultado.EMPATE;
    }

    @Override
    public Resultado contra(Tijera elemento) {
        return Resultado.GANA;
    }

}
