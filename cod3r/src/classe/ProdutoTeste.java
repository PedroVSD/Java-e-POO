package classe;

public class ProdutoTeste {
	
	public static void main(String[] args){
		
		Produto p1 = new Produto("PC");
		p1.nome = "PC";
		p1.preco = 3000.0;
		p1.desconto = 0.25;
	
		double valorFinal = p1.preco * (1 - p1.desconto);
		double valorFinal1 = p1.precoComDesconto();
		
		System.out.println(valorFinal1);
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.desconto);
		System.out.println(valorFinal);
	}
	
}
