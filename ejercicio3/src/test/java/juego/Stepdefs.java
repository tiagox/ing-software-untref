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

	@Given("^un barco ocupando la posicion \\(\"(.)\", (\\d+)\\)$")
	public void un_barco_ocupando_la_posicion(char fila, int columna) {
		batallaNaval.posicionarBarco("lancha", fila, columna, "horizontal");
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

	@Then("^la operación no se realiza por posicionar una nave en posiciones ocupadas$")
	public void la_operación_no_se_realiza_por_posicionar_una_nave_en_posiciones_ocupadas() {
		Assert.assertEquals("no es posible posicionar naves en posiciones ocupadas", resultado);
	}

	@Then("^la operación no se realiza por posicionar una nave fuera del tablero$")
	public void la_operación_no_se_realiza_por_posicionar_una_nave_fuera_del_tablero() {
		Assert.assertEquals("no es posible posicionar naves fuera del tablero", resultado);
	}

	@When("^ataco la posicion \\(\"(.)\", (\\d+)\\)$")
	public void ataco_la_posicion_F(char fila, int columna) {
		resultado = batallaNaval.atacar(fila, columna);
	}

	@Then("^el disparo resulta en \"(.*?)\"$")
	public void el_disparo_resulta_en(String resultado) {
		Assert.assertEquals(resultado, this.resultado);
	}

}
