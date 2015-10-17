package juego.dominio;

public class Coordenada {

	private char fila;
	private int columna;

	public Coordenada(char fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}

	public char getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	public Coordenada getSiguiente(Direccion direccion) {
		if (direccion == Direccion.HORIZONTAL) {
			return getSiguienteHorizontal();
		} else {
			return getSiguienteVertical();
		}
	}

	private Coordenada getSiguienteHorizontal() {
		return new Coordenada(fila, (columna + 1));
	}

	private Coordenada getSiguienteVertical() {
		return new Coordenada((char) (fila + 1), columna);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}

}
