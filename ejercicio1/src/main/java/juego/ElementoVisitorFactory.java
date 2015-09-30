package juego;

public class ElementoVisitorFactory {

    public static ElementoVisitor crear(Elemento elemento) {
        switch (elemento.getForma()) {
            case PIEDRA:
                return new PiedraVisitor();
            case PAPEL:
                return new PapelVisitor();
            case TIJERA:
                return new TijeraVisitor();
            default:
                return null;
        }
    }

}
