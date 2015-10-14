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

}
