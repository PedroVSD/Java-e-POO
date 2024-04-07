package topico_04;

public class Item {
	private int qnt;
	private double precoUnitario;
	private String nome;
	
	public Item(String nome, double precoUnitario, int qnt) {
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.qnt = qnt;
	}
}
