package juego;

public class Jugador {

    private Elemento elemento;

    public Jugador(Forma forma) {
        this.elemento = ElementoFactory.crear(forma);
    }

    public Resultado juegaContra(Jugador otro){
        return elemento.contra(ElementoVisitorFactory.crear(otro.elemento));
    }

}
