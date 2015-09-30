package juego;

public class Tijera extends Elemento {

    public Tijera(Forma forma) {
        super(forma);
    }

    @Override
    public Resultado contra(ElementoVisitor elementoVisitor) {
        return elementoVisitor.contra(this);
    }

}
