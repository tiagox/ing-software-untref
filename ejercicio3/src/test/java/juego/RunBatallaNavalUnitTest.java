package juego;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import juego.dominio.CoordenadaTest;
import juego.dominio.NaveTest;
import juego.dominio.TableroTest;

@RunWith(Suite.class)
@SuiteClasses({ CoordenadaTest.class, NaveTest.class, TableroTest.class })
public class RunBatallaNavalUnitTest {

}
