package juego.dominio;

import java.util.HashMap;
import java.util.Map;

public class Tablero {

	Map<Coordenada, Nave> casilleros = new HashMap<>();

	public boolean asignarCoordenada(Coordenada coordenada, Nave nave) {
		casilleros.put(coordenada, nave);
		return true;
	}

}
