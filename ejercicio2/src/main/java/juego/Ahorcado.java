package juego;

import java.util.ArrayList;
import java.util.List;

public class Ahorcado {

	String palabraSecreta;
	char[] resultado;
	int vidas;
	List<Character> letrasArriesgadas;

	public Ahorcado(String palabraSecreta, int vidas) {
		this.palabraSecreta = palabraSecreta;
		this.resultado = palabraSecreta.replaceAll(".", "*").toCharArray();
		this.vidas = vidas;
		this.letrasArriesgadas = new ArrayList<>();
	}

	public String getResultado() {
		return new String(resultado);
	}

	public int getVidas() {
		return vidas;
	}

	public void arriesgar(char letra) {
		if (!letrasArriesgadas.contains(letra) && !reemplazarLetraEnPalabraSecreta(letra)
				&& getEstado() == "en juego") {
			vidas--;
		}

		letrasArriesgadas.add(letra);
	}

	private boolean reemplazarLetraEnPalabraSecreta(char letra) {
		boolean acerto = false;

		for (int i = 0; i < palabraSecreta.length(); i++) {
			if (Character.toLowerCase(letra) == Character.toLowerCase(palabraSecreta.charAt(i))) {
				resultado[i] = palabraSecreta.charAt(i);
				acerto = true;
			}
		}
		
		return acerto;
	}

	public String getEstado() {
		if (!getResultado().contains("*")) {
			return "ganador";
		} else if (vidas > 0) {
			return "en juego";
		} else {
			return "ahorcado";
		}
	}

}
