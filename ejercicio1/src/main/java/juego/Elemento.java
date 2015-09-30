package juego;

public abstract class Elemento {

    private Forma forma;

    public Elemento(Forma forma) {
        this.forma = forma;
    }

    public Forma getForma() {
        return forma;
    }

    public abstract Resultado contra(ElementoVisitor elementoVisitor);

}
