package juego.dominio;

import org.junit.Assert;
import org.junit.Test;

public class TableroTest {

	@Test
	public void asignarUnBarcoAUnaCoordenadaDeberiaRetornarVerdaderoSiFuePosible() {
		Tablero tablero = new Tablero();

		Coordenada coordenada = new Coordenada('C', 5);
		Nave tipo = Nave.LANCHA;
		
		boolean resultado = tablero.asignarCoordenada(coordenada, tipo);

		Assert.assertTrue(resultado);

	}

}
