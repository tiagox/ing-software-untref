package juego.dominio;

import org.junit.Assert;
import org.junit.Test;

public class NaveTest {

	@Test
	public void deberiaPoderCrearUnaLanchaIndicandoSuTipo() {
		Nave lancha = Nave.crear("lancha");

		Assert.assertEquals(Nave.LANCHA, lancha);
	}

	@Test
	public void unaLanchaDeberiaOcuparUnCasillero() {
		Nave lancha = Nave.crear("lancha");

		Assert.assertEquals(1, lancha.getCasilleros());
	}

	@Test
	public void deberiaPoderCrearUnAcorazadoIndicandoSuTipo() {
		Nave acorazado = Nave.crear("acorazado");

		Assert.assertEquals(Nave.ACORAZADO, acorazado);
	}

	@Test
	public void unAcorazadoDeberiaOcuparDosCasilleros() {
		Nave acorazado = Nave.crear("acorazado");

		Assert.assertEquals(2, acorazado.getCasilleros());
	}

	@Test
	public void deberiaPoderCrearUnDestructorIndicandoSuTipo() {
		Nave destructor = Nave.crear("destructor");

		Assert.assertEquals(Nave.DESTRUCTOR, destructor);
	}

	@Test
	public void unDestructorDeberiaOcuparTresCasilleros() {
		Nave destructor = Nave.crear("destructor");

		Assert.assertEquals(3, destructor.getCasilleros());
	}

}
