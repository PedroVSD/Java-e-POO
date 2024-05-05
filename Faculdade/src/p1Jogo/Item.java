package p1Jogo;

public class Item {
	private final String nome;
	private final int forca;
	private final int inteligencia;
	private final int vida;
	
	public Item(String nome, int forca, int inteligencia, int vida) {
		this.nome = nome;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.vida = vida;
	}
	
	public int forcaItem() {
		return forca;
	}
	
	public int inteligenciaItem() {
		return inteligencia;
	}
	
	public int vidaItem() {
		return vida;
	}
}
