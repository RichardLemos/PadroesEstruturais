package control;

import model.GeradorDeArquivo;
import model.GeradorDeArquivoTXT;
import model.Recibo;

public class TesteRecibo {
	public static void main(String[] args) {
		GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT();
		Recibo recibo = new Recibo("K19 Treinamentos ", " Richard Oliveira", 1000, geradorDeArquivoTXT);
		recibo.geraArquivo();	
	}
}