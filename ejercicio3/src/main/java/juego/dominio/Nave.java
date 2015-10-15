package juego.dominio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Nave {

	private final int casilleros;
	private Map<Coordenada, EstadoPosicion> posiciones;

	public Nave(int casilleros) {
		this.casilleros = casilleros;
	}

	public int getCasilleros() {
		return casilleros;
	}

	public void setPosiciones(List<Coordenada> posiciones) {
		this.posiciones = new HashMap<Coordenada, EstadoPosicion>();

		for (Coordenada coordenada : posiciones) {
			this.posiciones.put(coordenada, EstadoPosicion.INTACTA);
		}
	}

	public void atacarPosicion(Coordenada coordenada) {
		posiciones.put(coordenada, EstadoPosicion.TOCADA);
	}

	public EstadoNave getEstado() {
		if (!posiciones.containsValue(EstadoPosicion.INTACTA)) {
			return EstadoNave.HUNDIDA;
		} else if (posiciones.containsValue(EstadoPosicion.TOCADA)) {
			return EstadoNave.AVERIADA;
		} else {
			return EstadoNave.INTACTA;
		}
	}

	public static Nave crear(String tipo) {
		switch (tipo) {
		case "lancha":
			return new Lancha();
		case "acorazado":
			return new Acorazado();
		case "destructor":
			return new Destructor();
		default:
			throw new TipoNaveNoEncontradoException();
		}
	}

}
