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
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPrecoUnitario() {
		return this.precoUnitario;
	}
	
	public int getQnt() {
		return this.qnt;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
}
