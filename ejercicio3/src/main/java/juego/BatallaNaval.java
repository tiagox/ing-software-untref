package juego;

import juego.dominio.Coordenada;
import juego.dominio.Direccion;
import juego.dominio.Nave;
import juego.dominio.PosicionFueraDelTableroException;
import juego.dominio.ResultadoAtaque;
import juego.dominio.Tablero;

public class BatallaNaval {

	Tablero tablero;

	public BatallaNaval() {
		tablero = new Tablero();
	}

	public String posicionarNave(String tipo, char fila, int columna, String direccion) {
		try {
			if (tablero.posicionarNave(new Coordenada(fila, columna), Nave.crear(tipo), Direccion.crear(direccion))) {
				return "nave posicionada correctamente";
			} else {
				return "no es posible posicionar naves en posiciones ocupadas";
			}
		} catch (PosicionFueraDelTableroException e) {
			return "no es posible posicionar naves fuera del tablero";
		}
	}

	public String atacarPosicion(char fila, int columna) {
		ResultadoAtaque resultado = tablero.atacarPosicion(new Coordenada(fila, columna));

		return resultado.toString().toLowerCase();
	}

}