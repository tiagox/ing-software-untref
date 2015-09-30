package juego;

public class PiedraVisitor implements ElementoVisitor {

    @Override
    public Resultado contra(Piedra elemento) {
        return Resultado.EMPATE;
    }

    @Override
    public Resultado contra(Papel elemento) {
        return Resultado.GANA;
    }

    @Override
    public Resultado contra(Tijera elemento) {
        return Resultado.PIERDE;
    }

}
