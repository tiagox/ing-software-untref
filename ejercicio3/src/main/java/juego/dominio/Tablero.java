package juego.dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tablero {

	private final char minimaFila = 'A';
	private final char maximaFila = 'J';
	private final int minimaColumna = 1;
	private final int maximaColumna = 10;

	private Map<Coordenada, Nave> casilleros = new HashMap<>();

	public boolean posicionarNave(Coordenada coordenada, Nave nave, Direccion direccion) {
		List<Coordenada> coordenadasRequeridas = getListaDeCoordenadas(coordenada, nave, direccion);

		if (validarCoordenadasDisponibles(coordenadasRequeridas)) {
			asignarCoordenadasRequeridas(coordenadasRequeridas, nave);

			return true;
		}

		return false;
	}

	private List<Coordenada> getListaDeCoordenadas(Coordenada coordenada, Nave nave, Direccion direccion) {
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		Coordenada posicion = coordenada;

		for (int i = 0; i < nave.getCasilleros(); i++) {
			coordenadas.add(posicion);
			posicion = posicion.getSiguiente(direccion);
		}

		return coordenadas;
	}

	private boolean validarCoordenadasDisponibles(List<Coordenada> coordenadas) {
		for (Coordenada coordenada : coordenadas) {
			if (coordenadaFueraDelTablero(coordenada)) {
				throw new PosicionFueraDelTableroException();
			}
			if (casilleros.containsKey(coordenada)) {
				return false;
			}
		}

		return true;
	}

	private boolean coordenadaFueraDelTablero(Coordenada coordenada) {
		return (coordenada.getFila() < minimaFila || coordenada.getFila() > maximaFila)
				|| (coordenada.getColumna() < minimaColumna || coordenada.getColumna() > maximaColumna);
	}

	private void asignarCoordenadasRequeridas(List<Coordenada> coordenadasRequeridas, Nave nave) {
		for (Coordenada coordenadaRequerida : coordenadasRequeridas) {
			casilleros.put(coordenadaRequerida, nave);
		}
	}

	public ResultadoAtaque atacarPosicion(Coordenada coordenada) {
		if (casilleros.containsKey(coordenada)) {
			return ResultadoAtaque.TOCADO;
		} else {
			return ResultadoAtaque.AGUA;
		}
	}

}
