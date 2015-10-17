package juego.dominio;

public enum Direccion {
	HORIZONTAL, VERTICAL;

	public static Direccion crear(String name) {
		switch (name.toUpperCase()) {
		case "HORIZONTAL":
			return Direccion.HORIZONTAL;
		case "VERTICAL":
			return Direccion.VERTICAL;
		default:
			throw new DireccionInexistenteException();
		}
	}

}
