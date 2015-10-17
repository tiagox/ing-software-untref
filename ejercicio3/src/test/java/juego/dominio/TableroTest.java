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

		boolean resultado = tablero.posicionarNave(coordenada, lancha, direccion);

		Assert.assertTrue(resultado);
	}

	@Test
	public void asignarUnBarcoAUnaCoordenadaOcupadaDeberiaRetornarVerdaderoSiFuePosiblePosicionarla() {
		Tablero tablero = new Tablero();

		Coordenada coordenada = new Coordenada('C', 5);
		Nave lancha = Nave.crear("lancha");
		Direccion direccion = Direccion.HORIZONTAL;

		tablero.posicionarNave(coordenada, lancha, direccion);

		Nave acorazado = Nave.crear("acorazado");
		Coordenada posicionAcorazado = new Coordenada('C', 4);

		boolean resultado = tablero.posicionarNave(posicionAcorazado, acorazado, direccion);

		Assert.assertFalse(resultado);
	}

	@Test(expected = PosicionFueraDelTableroException.class)
	public void asignarUnBarcoDeModoQueAlMenosUnaParteQuedeFueraDelTableroDeberiaDevolverUnaExcepcion() {
		Tablero tablero = new Tablero();
		Coordenada coordenada = new Coordenada('J', 5);
		Nave acorazado = Nave.crear("acorazado");
		Direccion direccion = Direccion.VERTICAL;

		tablero.posicionarNave(coordenada, acorazado, direccion);
	}

	@Test
	public void atacarUnaPosicionDeUnTableroVacioDeberiaResultarEnAgua() {
		Tablero tablero = new Tablero();

		Coordenada coordenada = new Coordenada('C', 5);

		ResultadoAtaque resultado = tablero.atacarPosicion(coordenada);

		Assert.assertEquals(ResultadoAtaque.AGUA, resultado);
	}

	@Test
	public void atacarUnaPosicionDondeHayUnBarcoDeberiaResultarEnTocado() {
		Tablero tablero = new Tablero();

		Coordenada coordenada = new Coordenada('C', 5);
		Nave destructor = Nave.crear("destructor");
		Direccion direccion = Direccion.HORIZONTAL;

		tablero.posicionarNave(coordenada, destructor, direccion);

		Coordenada coordenadaDeAtaque = new Coordenada('C', 7);
		ResultadoAtaque resultado = tablero.atacarPosicion(coordenadaDeAtaque);

		Assert.assertEquals(ResultadoAtaque.TOCADO, resultado);

		coordenadaDeAtaque = new Coordenada('C', 5);
		resultado = tablero.atacarPosicion(coordenadaDeAtaque);

		Assert.assertEquals(ResultadoAtaque.TOCADO, resultado);
	}

	@Test
	public void atacarUnaPosicionDondeHayUnBarcoDeberiaResultarEnHundidoSiEraLaUltimaSana() {
		Tablero tablero = new Tablero();

		Coordenada coordenada = new Coordenada('C', 5);
		Nave destructor = Nave.crear("destructor");
		Direccion direccion = Direccion.HORIZONTAL;

		tablero.posicionarNave(coordenada, destructor, direccion);

		Coordenada coordenadaDeAtaque = new Coordenada('C', 5);
		tablero.atacarPosicion(coordenadaDeAtaque);
		coordenadaDeAtaque = new Coordenada('C', 6);
		tablero.atacarPosicion(coordenadaDeAtaque);

		coordenadaDeAtaque = new Coordenada('C', 7);
		ResultadoAtaque resultado = tablero.atacarPosicion(coordenadaDeAtaque);

		Assert.assertEquals(ResultadoAtaque.HUNDIDO, resultado);
	}

}
