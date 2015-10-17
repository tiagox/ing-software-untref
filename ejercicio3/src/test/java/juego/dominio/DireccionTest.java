package juego.dominio;

import org.junit.Assert;
import org.junit.Test;

public class DireccionTest {

	@Test
	public void unaDireccionDeberiaPoderCrearseDesdeUnStringSinImportarCapitalizacion() {
		String nombreDireccion = "HoriZontaL";
		Direccion direccion = Direccion.crear(nombreDireccion);

		Assert.assertEquals(Direccion.HORIZONTAL, direccion);

		nombreDireccion = "VERTical";
		direccion = Direccion.crear(nombreDireccion);

		Assert.assertEquals(Direccion.VERTICAL, direccion);
	}

	@Test(expected = DireccionInexistenteException.class)
	public void unaDireccionCreadaDesdeUnStringInvalidoDeberiaDevolverUnaExcepcion() {
		String nombreDireccion = "diagonal";
		Direccion.crear(nombreDireccion);
	}

}
