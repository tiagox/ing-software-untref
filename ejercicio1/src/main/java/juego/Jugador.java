package juego;

public class Jugador {

    Elemento elemento;

    public Jugador(Elemento elemento) {
        this.elemento = elemento;
    }

    public Resultado juegaContra(Jugador otro){
        if (elemento == Elemento.PAPEL && otro.elemento == Elemento.PIEDRA)
            return Resultado.GANA;
        if (otro.elemento == Elemento.PIEDRA)
            return Resultado.EMPATE;
        if (otro.elemento == Elemento.PAPEL)
            return Resultado.PIERDE;
        if (otro.elemento == Elemento.TIJERA)
            return Resultado.GANA;

        return Resultado.GANA;
    }

}
