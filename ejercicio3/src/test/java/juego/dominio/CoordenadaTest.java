package juego.dominio;

import org.junit.Assert;
import org.junit.Test;

public class CoordenadaTest {

	@Test
	public void unaCoordenadaDeberiaSerIgualAOtraConLasMismasFilaYColumna() {
		char fila = 'C';
		int columna = 5;
		Coordenada coordenada = new Coordenada(fila, columna);

		Assert.assertEquals(coordenada, new Coordenada(fila, columna));
		Assert.assertEquals(coordenada, coordenada);
	}

	@Test
	public void unaCoodenadaDeberiaSerDistintaAOtraSiLasFilasOLasColumnasDifieren() {
		char fila = 'C', filaDisinta = 'F';
		int columna = 5, columnaDistinta = 8;
		Coordenada coordenada = new Coordenada(fila, columna);

		Assert.assertNotEquals(coordenada, new Coordenada(filaDisinta, columna));
		Assert.assertNotEquals(coordenada, new Coordenada(fila, columnaDistinta));
		Assert.assertNotEquals(coordenada, "(C, 5)");
		Assert.assertNotEquals(coordenada, null);
	}

	@Test
	public void unaCoordenadaDeberiaSaberDevolverLaSiguienteCoordenadaEnBaseALaDireccionIndicada() {
		char fila = 'C';
		int columna = 5;
		Coordenada coordenada = new Coordenada(fila, columna);

		int siguienteColumna = 6;
		Coordenada siguienteCoordenada = coordenada.getSiguiente(Direccion.HORIZONTAL);

		Assert.assertEquals(new Coordenada(fila, siguienteColumna), siguienteCoordenada);

		char siguienteFila = 'D';
		siguienteCoordenada = coordenada.getSiguiente(Direccion.VERTICAL);

		Assert.assertEquals(new Coordenada(siguienteFila, columna), siguienteCoordenada);
	}

}
