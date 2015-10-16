package juego.dominio;

import org.junit.Assert;
import org.junit.Test;

public class CoordenadaTest {

	@Test
	public void unaCoordenadaDeberiaSerIgualAOtraConLasMismasFilaYColumna() {
		char fila = 'C';
		int columna = 5;
		Coordenada coordenada = new Coordenada(fila, columna);

		Coordenada otraCoordenada = new Coordenada(fila, columna);

		Assert.assertEquals(coordenada, otraCoordenada);
	}

	@Test
	public void unaCoordenadaDeberiaSaberDevolverLaSiguienteCoordenadaHorizontal() {
		char fila = 'C';
		int columna = 5;
		Coordenada coordenada = new Coordenada(fila, columna);

		int siguienteColumna = 6;
		Coordenada siguienteCoordenada = coordenada.getSiguienteHorizontal();

		Assert.assertEquals(new Coordenada(fila, siguienteColumna), siguienteCoordenada);
	}

	@Test
	public void unaCoordenadaDeberiaSaberDevolverLaSiguienteCoordenadaVertical() {
		char fila = 'C';
		int columna = 5;
		Coordenada coordenada = new Coordenada(fila, columna);

		char siguienteFila = 'D';
		Coordenada siguienteCoordenada = coordenada.getSiguienteVertical();

		Assert.assertEquals(new Coordenada(siguienteFila, columna), siguienteCoordenada);
	}

}
