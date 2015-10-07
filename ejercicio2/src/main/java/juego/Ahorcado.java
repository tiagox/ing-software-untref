package juego;

public class Ahorcado {

	String palabraSecreta;
	char[] resultado;
	int vidas;

	public Ahorcado(String palabraSecreta, int vidas) {
		this.palabraSecreta = palabraSecreta;
		this.resultado = palabraSecreta.replaceAll(".", "*").toCharArray();
		this.vidas = vidas;
	}

	public String getResultado() {
		return new String(resultado);
	}

	public int getVidas() {
		return vidas;
	}

	public void arriesgar(char letra) {
		boolean acerto = false;

		for (int i = 0; i < palabraSecreta.length(); i++) {
			if (Character.toLowerCase(letra) == Character.toLowerCase(palabraSecreta.charAt(i))) {
				resultado[i] = palabraSecreta.charAt(i);
				acerto = true;
			}
		}

		if (!acerto) {
			vidas--;
		}
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
