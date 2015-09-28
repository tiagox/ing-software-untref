package juego;

public class Jugador {

    Elemento elemento;

    public Jugador(Elemento elemento) {
        this.elemento = elemento;
    }

    public Resultado juegaContra(Jugador otro){

        if (elemento == Elemento.PIEDRA && otro.elemento == Elemento.PIEDRA)
            return Resultado.EMPATE;
        if (elemento == Elemento.PIEDRA && otro.elemento == Elemento.PAPEL)
            return Resultado.PIERDE;
        if (elemento == Elemento.PIEDRA && otro.elemento == Elemento.TIJERA)
            return Resultado.GANA;

        if (elemento == Elemento.PAPEL && otro.elemento == Elemento.PIEDRA)
            return Resultado.GANA;
        if (elemento == Elemento.PAPEL && otro.elemento == Elemento.PAPEL)
            return Resultado.EMPATE;
        if (elemento == Elemento.PAPEL && otro.elemento == Elemento.TIJERA)
            return Resultado.PIERDE;

        if (elemento == Elemento.TIJERA && otro.elemento == Elemento.PIEDRA)
            return Resultado.PIERDE;
        if (elemento == Elemento.TIJERA && otro.elemento == Elemento.PAPEL)
            return Resultado.GANA;
        if (elemento == Elemento.TIJERA && otro.elemento == Elemento.TIJERA)
            return Resultado.EMPATE;

        return null;
    }

}
