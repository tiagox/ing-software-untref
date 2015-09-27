package juego;

public class Jugador {

    Forma forma;

    public Jugador(Forma forma) {
        this.forma = forma;
    }

    public Resultado juegaContra(Jugador otro){
        if (otro.forma == Forma.PAPEL) {
            return Resultado.PIERDE;
        } else {
            return Resultado.GANA;
        }
    }

}
