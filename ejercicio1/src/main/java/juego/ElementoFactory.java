package juego;

public class ElementoFactory {

    public static Elemento crear(Forma forma) {
        switch (forma) {
            case PIEDRA:
                return new Piedra(forma);
            case PAPEL:
                return new Papel(forma);
            case TIJERA:
                return new Tijera(forma);
            default:
                return null;
        }
    }

}
