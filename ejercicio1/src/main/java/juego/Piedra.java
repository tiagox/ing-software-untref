package juego;

public class Piedra extends Elemento {

    public Piedra(Forma forma) {
        super(forma);
    }

    @Override
    public Resultado contra(ElementoVisitor elementoVisitor) {
        return elementoVisitor.contra(this);
    }

}
