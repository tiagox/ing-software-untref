package juego;

public class Jugador {

    Elemento elemento;

    public Jugador(Elemento elemento) {
        this.elemento = elemento;
    }

    public Resultado juegaContra(Jugador otro){

        if (elemento == otro.elemento)
            return Resultado.EMPATE;

        if (elemento == Elemento.PIEDRA)
            if (otro.elemento == Elemento.PAPEL)
                return Resultado.PIERDE;
            else
                return Resultado.GANA;

        if (elemento == Elemento.PAPEL)
            if (otro.elemento == Elemento.PIEDRA)
                return Resultado.GANA;
            else
                return Resultado.PIERDE;

        if (elemento == Elemento.TIJERA)
            if (otro.elemento == Elemento.PIEDRA)
                return Resultado.PIERDE;
            else
                return Resultado.GANA;

        return null;
    }

}
