package fatura;

public class Main {

	public static void main(String[] args) {
		Item PC = new Item();
		
		PC.setPrecoUnitario(1000);
		PC.setNome("PC bolado");
		PC.setQuantidade(10);
		
		Fatura boleto = new Fatura();
		
		boleto.setNome("Pedro");
		boleto.setCPF("12312405351");
		
		boleto.adicionaItem(1, PC);
		System.out.println(boleto.obtemPreco());

	}

}
