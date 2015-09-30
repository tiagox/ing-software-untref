package juego;

public class Papel extends Elemento {

    public Papel(Forma forma) {
        super(forma);
    }

    @Override
    public Resultado contra(ElementoVisitor elementoVisitor) {
        return elementoVisitor.contra(this);
    }

}
