package juego;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs {

	Ahorcado ahorcado;

	@Given("^la palabra secreta es \"(.*?)\" y tengo (\\d+) vidas$")
	public void la_palabra_secreta_es_y_tengo_vidas(String palabraSecreta, int vidas) {
		ahorcado = new Ahorcado(palabraSecreta, vidas);
	}

	@Given("^el resultado inicial es \"(.*?)\"$")
	public void el_resultado_inicial_es(String resultado) {
		for (char letra : resultado.toCharArray()) {
			if (letra != '*') {
				ahorcado.arriesgar(letra);
			}
		}
	}

	@When("^arriesgo la letra '(.)'$")
	public void arriesgo_la_letra(char letra) {
		ahorcado.arriesgar(letra);
	}

	@Then("^el resultado actual es \"(.*?)\"$")
	public void el_resultado_actual_es(String resultado) {
		Assert.assertEquals(resultado, ahorcado.getResultado());
	}

	@Then("^me quedan (\\d+) vidas$")
	public void me_quedan_vidas(int vidas) {
		Assert.assertEquals(vidas, ahorcado.getVidas());
	}

	@Then("^el estado es \"(.*?)\"$")
	public void el_estado_es(String estado) {
		Assert.assertEquals(estado, ahorcado.getEstado());
	}

}
