package juego;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs {

	Ahorcado ahorcado;

	@Given("^la palabra secreta es \"(.*?)\" y tengo (\\d+) vidas$")
	public void la_palabra_secreta_es_tengo_vidas_y_el_estado_actual_es(String palabraSecreta, int vidas) {
		ahorcado = new Ahorcado(palabraSecreta, vidas);
	}

	@Given("^el estado inicial es \"(.*?)\"$")
	public void el_estado_inicial_es(String estado) {
	}

	@When("^arriesgo la letra '(.)'$")
	public void arriesgo_la_letra(char letra) {
		ahorcado.arriesgar(letra);
	}

	@Then("^el estado actual es \"(.*?)\"$")
	public void el_estado_actual_es(String estado) {
		Assert.assertEquals(estado, ahorcado.getEstado());
	}

	@Then("^me quedan (\\d+) vidas$")
	public void me_quedan_vidas(int vidas) {
		Assert.assertEquals(vidas, ahorcado.getVidas());
	}

}
