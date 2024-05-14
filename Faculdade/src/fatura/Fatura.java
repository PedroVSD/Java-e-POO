package fatura;

public class Fatura {
	private String nome;
	private String CPF;
	private Item itens[] = new Item[10];
	
	
	public double obtemPreco() {
		double precoTotal = 0;
		
		for(int i = 0; i<=itens.length; i++) {
			precoTotal += itens[i].getPrecoUnitario() * itens[i].getQuantidade();
			}
		return precoTotal;
	}
	
	public void adicionaItem(int i, Item item) {
		this.itens[i] = item;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}
}
