package juego;

public class TijeraVisitor implements ElementoVisitor {

    @Override
    public Resultado contra(Piedra elemento) {
        return Resultado.GANA;
    }

    @Override
    public Resultado contra(Papel elemento) {
        return Resultado.PIERDE;
    }

    @Override
    public Resultado contra(Tijera elemento) {
        return Resultado.EMPATE;
    }

}
