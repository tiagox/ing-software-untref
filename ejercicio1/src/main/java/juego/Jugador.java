package juego;

public class Jugador {

    private Forma forma;

    public Jugador(Forma forma) {
        this.forma = forma;
    }

    public Resultado juegaContra(Jugador otro){

        if (forma == otro.forma)
            return Resultado.EMPATE;

        if (forma == Forma.PIEDRA)
            if (otro.forma == Forma.PAPEL)
                return Resultado.PIERDE;
            else
                return Resultado.GANA;

        if (forma == Forma.PAPEL)
            if (otro.forma == Forma.PIEDRA)
                return Resultado.GANA;
            else
                return Resultado.PIERDE;

        if (forma == Forma.TIJERA)
            if (otro.forma == Forma.PIEDRA)
                return Resultado.PIERDE;
            else
                return Resultado.GANA;

        return null;
    }

}
