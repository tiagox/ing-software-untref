package juego;

import juego.dominio.Coordenada;
import juego.dominio.Nave;
import juego.dominio.Tablero;

public class BatallaNaval {

	Tablero tablero;

	public BatallaNaval() {
		tablero = new Tablero();
	}

	public String posicionarBarco(String tipo, char fila, int columna, String direccion) {
		if (tablero.asignarCoordenada(new Coordenada(fila, columna), Nave.crear(tipo))) {
			return "nave posicionada correctamente";
		} else {
			return null;
		}

	}

}