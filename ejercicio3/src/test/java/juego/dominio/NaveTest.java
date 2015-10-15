package juego.dominio;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NaveTest {

	List<Coordenada> posiciones;

	@Test
	public void deberiaPoderCrearUnaLanchaIndicandoSuTipo() {
		Assert.assertTrue(Nave.crear("lancha") instanceof Lancha);
	}

	@Test
	public void unaLanchaDeberiaOcuparUnCasillero() {
		Nave lancha = Nave.crear("lancha");

		Assert.assertEquals(1, lancha.getCasilleros());
	}

	@Test
	public void deberiaPoderCrearUnAcorazadoIndicandoSuTipo() {
		Assert.assertTrue(Nave.crear("acorazado") instanceof Acorazado);
	}

	@Test
	public void unAcorazadoDeberiaOcuparDosCasilleros() {
		Nave acorazado = Nave.crear("acorazado");

		Assert.assertEquals(2, acorazado.getCasilleros());
	}

	@Test
	public void deberiaPoderCrearUnDestructorIndicandoSuTipo() {
		Assert.assertTrue(Nave.crear("destructor") instanceof Destructor);
	}

	@Test
	public void unDestructorDeberiaOcuparTresCasilleros() {
		Nave destructor = Nave.crear("destructor");

		Assert.assertEquals(3, destructor.getCasilleros());
	}

	@Test(expected = TipoNaveNoEncontradoException.class)
	public void crearUnaNaveNoExistenteDeberiaLanzarUnaExcepcion() {
		Nave.crear("avion");
	}

	@Before
	public void setup() {
		posiciones = new ArrayList<Coordenada>();

		posiciones.add(new Coordenada('C', 5));
		posiciones.add(new Coordenada('C', 6));
	}

	@Test
	public void unaNaveRecienPosicionadaDeberiaTenerEstadoIntacto() {
		Nave acorazado = Nave.crear("acorazado");

		acorazado.setPosiciones(posiciones);

		Assert.assertEquals(EstadoNave.INTACTA, acorazado.getEstado());
	}

	@Test
	public void unaNavePosicionadaYConAlMenosUnaPosicionTocadaDeberiaTenerEstadoAveriada() {
		Nave acorazado = Nave.crear("acorazado");

		acorazado.setPosiciones(posiciones);

		acorazado.atacarPosicion(new Coordenada('C', 6));

		Assert.assertEquals(EstadoNave.AVERIADA, acorazado.getEstado());
	}

	@Test
	public void unaNavePosicionadaYConTodasSusPosicionesTocadasDeberiaTenerEstadoHundida() {
		Nave acorazado = Nave.crear("acorazado");

		acorazado.setPosiciones(posiciones);

		acorazado.atacarPosicion(new Coordenada('C', 5));
		acorazado.atacarPosicion(new Coordenada('C', 6));

		Assert.assertEquals(EstadoNave.HUNDIDA, acorazado.getEstado());
	}

}
