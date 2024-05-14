package carro;

public class Carro {
	private String cor;
	private final int numeroChassi;
	
	public Carro(String cor, int numeroChassi) {
		this.cor = cor;
		this.numeroChassi = numeroChassi;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int getNumeroChassi() {
		return numeroChassi;
	}
}
