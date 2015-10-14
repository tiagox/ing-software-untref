package juego;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {

	BatallaNaval batallaNaval;
	String resultado;

	@Given("^un tablero de batalla naval$")
	public void un_tablero_de_batalla_naval() {
		batallaNaval = new BatallaNaval();
	}

	@When("^un jugador posiciona un barco de tipo \"(.*?)\" en la posicion \\(\"(.)\", (\\d+)\\) en dirección \"(.*?)\"$")
	public void un_jugador_posiciona_un_barco_de_tipo_en_la_posicion_en_dirección(String tipo, char fila, int columna,
			String direccion) {
		resultado = batallaNaval.posicionarBarco(tipo, fila, columna, direccion);
	}

	@Then("^la operación se realiza correctamente$")
	public void la_operación_se_realiza_correctamente() {
		Assert.assertEquals("nave posicionada correctamente", resultado);
	}

}
