package juego;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs {

    Jugador jugadorUno;
    Jugador jugadorDos;

    @Given("^jugadorUno juega PIEDRA$")
    public void jugadorUno_juega_piedra() {
        jugadorUno = new Jugador(Forma.PIEDRA);
    }

    @When("^jugadorDos juega PAPEL$")
    public void jugadorDos_juega_papel() {
        jugadorDos = new Jugador(Forma.PAPEL);
    }

    @When("^jugadorDos juega TIJERA$")
    public void jugadordos_juega_tijera() {
        jugadorDos = new Jugador(Forma.TIJERA);
    }

    @Then("^gana jugadorDos$")
    public void gana_jugadorDos() {
        Assert.assertEquals(Resultado.PIERDE, jugadorUno.juegaContra(jugadorDos));
    }

    @Then("^gana jugadorUno$")
    public void gana_jugadorUno() {
        Assert.assertEquals(Resultado.GANA, jugadorUno.juegaContra(jugadorDos));
    }

}