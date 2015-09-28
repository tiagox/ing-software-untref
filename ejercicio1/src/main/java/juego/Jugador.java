package juego;

public class Jugador {

    Elemento elemento;

    public Jugador(Elemento elemento) {
        this.elemento = elemento;
    }

    public Resultado juegaContra(Jugador otro){
        if (otro.elemento == Elemento.PAPEL) {
            return Resultado.PIERDE;
        } else {
            return Resultado.GANA;
        }
    }

}
