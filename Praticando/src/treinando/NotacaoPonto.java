package treinando;
import java.util.Scanner;

class Pessoa{
	String nome;
	Integer idade;
}

public class NotacaoPonto {

	public static void main(String[] args) {
		
		Scanner entrada_dados = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		
		System.out.println("Qual o seu nome?");
		pessoa1.nome = entrada_dados.next();
		
		entrada_dados.nextLine();//Limpando o buffer
		
		System.out.println("Qual a sua idade?");
		pessoa1.idade = entrada_dados.nextInt();
		
		System.out.println("Seu nome: " + pessoa1.nome);
		System.out.println("Sua idade: " + pessoa1.idade);
		
		entrada_dados.close();
	}

}
