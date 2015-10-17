package juego.dominio;

import org.junit.Assert;
import org.junit.Test;

public class TableroTest {

	@Test
	public void asignarUnBarcoAUnaCoordenadaDeberiaRetornarVerdaderoSiFuePosiblePosicionarla() {
		Tablero tablero = new Tablero();

		Coordenada coordenada = new Coordenada('C', 5);
		Nave lancha = Nave.crear("lancha");
		Direccion direccion = Direccion.HORIZONTAL;

		boolean resultado = tablero.asignarCoordenada(coordenada, lancha, direccion);

		Assert.assertTrue(resultado);
	}

	@Test
	public void asignarUnBarcoAUnaCoordenadaOcupadaDeberiaRetornarVerdaderoSiFuePosiblePosicionarla() {
		Tablero tablero = new Tablero();

		Coordenada coordenada = new Coordenada('C', 5);
		Nave lancha = Nave.crear("lancha");
		Direccion direccion = Direccion.HORIZONTAL;

		tablero.asignarCoordenada(coordenada, lancha, direccion);

		Nave acorazado = Nave.crear("acorazado");
		Coordenada posicionAcorazado = new Coordenada('C', 4);

		boolean resultado = tablero.asignarCoordenada(posicionAcorazado, acorazado, direccion); 

		Assert.assertFalse(resultado);
	}

	}

	@Test
	public void atacarUnaPosicionDeUnTableroVacioDeberiaResultarEnAgua() {
		Tablero tablero = new Tablero();

		Coordenada coordenada = new Coordenada('C', 5);

		ResultadoAtaque resultado = tablero.atacarPosicion(coordenada);

		Assert.assertEquals(ResultadoAtaque.AGUA, resultado);
	}

}
