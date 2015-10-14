package juego.dominio;

public enum Nave {
	LANCHA(1), ACORAZADO(2), DESTRUCTOR(3);

	private final int casilleros;

	private Nave(int casilleros) {
		this.casilleros = casilleros;
	}

	public int getCasilleros() {
		return casilleros;
	}

	public static Nave crear(String tipo) {
		switch (tipo) {
		case "lancha":
			return Nave.LANCHA;
		case "acorazado":
			return Nave.ACORAZADO;
		case "destructor":
			return Nave.DESTRUCTOR;
		default:
			return null;
		}
	}

}
