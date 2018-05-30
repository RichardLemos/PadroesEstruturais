package domain;

import java.util.ArrayList;

public class Caminho implements Trecho {
	private ArrayList<Trecho> trechos;

	public Caminho() {
		this.trechos = new ArrayList<Trecho>();
	}

	public void adiciona(Trecho trecho) {
		this.trechos.add(trecho);
	}

	public void remove(Trecho trecho) {
		this.trechos.remove(trecho);
	}

	public void imprime() {
		for (Trecho trecho : this.trechos) {
			trecho.imprime();
		}
	}
}