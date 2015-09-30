package juego;

public interface ElementoVisitor {

    Resultado contra(Piedra elemento);

    Resultado contra(Papel elemento);

    Resultado contra(Tijera elemento);

}
