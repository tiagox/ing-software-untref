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

	public boolean asignarCoordenada(Coordenada coordenada, Nave nave, String direccion) {
		List<Coordenada> coordenadasRequeridas = getListaDeCoordenadas(coordenada, nave, direccion);

		if (validarCoordenadasDisponibles(coordenadasRequeridas)) {
			casilleros.put(coordenada, nave);
			return true;
		}

		return false;
	}

	private List<Coordenada> getListaDeCoordenadas(Coordenada coordenada, Nave nave, String direccion) {
		List<Coordenada> coordenadas = new ArrayList<Coordenada>();
		Coordenada posicion = coordenada;

		for (int i = 0; i < nave.getCasilleros(); i++) {
			coordenadas.add(posicion);
			if (direccion == "horizontal") {
				posicion = posicion.getSiguienteHorizontal();
			} else {
				posicion = posicion.getSiguienteVertical();
			}
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

}
