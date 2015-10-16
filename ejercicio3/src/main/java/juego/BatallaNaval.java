package juego;

import juego.dominio.Coordenada;
import juego.dominio.Nave;
import juego.dominio.PosicionFueraDelTableroException;
import juego.dominio.Tablero;

public class BatallaNaval {

	Tablero tablero;

	public BatallaNaval() {
		tablero = new Tablero();
	}

	public String posicionarBarco(String tipo, char fila, int columna, String direccion) {
		try {
			if (tablero.asignarCoordenada(new Coordenada(fila, columna), Nave.crear(tipo), direccion)) {
				return "nave posicionada correctamente";
			} else {
				return "no es posible posicionar naves en posiciones ocupadas";
			}
		} catch (PosicionFueraDelTableroException e) {
			return "no es posible posicionar naves fuera del tablero";
		}
	}

}