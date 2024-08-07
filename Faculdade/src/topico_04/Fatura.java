package topico_04;

public class Fatura {
	private Item itens[];
	private String nome;
	private String CPF;
	//private String nome2;


	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nomeitem) {
		//this.nome = nome;
		nome = nomeitem;
	}
	
	public String getCpf() {
		return this.CPF;
	}
	
	public void setCpf(String CPF) {
		this.CPF = CPF;
	}
	
	
	public Fatura(String nome, String CPF, int qnt) {
		this.nome = nome;
		this.CPF = CPF;
		itens = new Item[qnt];
	}
	
	
	public double obtemPreco() {
		double tot = 0;
		
		for(int i = 0; i < itens.length; i++) {
			tot += (itens[i].getQnt()*itens[i].getPrecoUnitario());
		}
		
		return tot;
	}
	
	public void adicionarItem(int i, Item novoItem) {
		this.itens[i] = novoItem;
	}
}
