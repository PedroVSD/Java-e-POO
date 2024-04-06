package classe;
import java.util.Scanner;


public class Produto_teste01 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Produto_01 produto = new Produto_01();
		
		
		produto.nome = "Computador";
		produto.preco = 2500.0;
		produto.desconto = 0.3;
		
		System.out.println(produto.nome);
		System.out.println("Qual o nome do produto??");
		produto.nome = entrada.nextLine();
		System.out.println(produto.nome);
		
		double preco_f = produto.desconto_final();
		System.out.println(preco_f);
		
	}
}
