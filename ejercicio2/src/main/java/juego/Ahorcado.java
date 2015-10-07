package juego;

public class Ahorcado {

	String palabraSecreta;
	String resultado;
	int vidas;

	public Ahorcado(String palabraSecreta, int vidas) {
		this.palabraSecreta = palabraSecreta;
		this.resultado = palabraSecreta.replaceAll(".", "*");
		this.vidas = vidas;
	}

	public String getEstado() {
		return resultado;
	}

	public int getVidas() {
		return vidas;
	}

	public void arriesgar(char letra) {
		boolean acerto = false;

		resultado = "";
		for (int i = 0; i < palabraSecreta.length(); i++) {
			if (Character.toLowerCase(letra) == Character.toLowerCase(palabraSecreta.charAt(i))) {
				resultado += palabraSecreta.charAt(i);
				acerto = true;
			} else {
				resultado += '*';
			}
		}

		if (!acerto) {
			vidas--;
		}
	}

	public String getResultado() {
		return "ahorcado";
	}

}
