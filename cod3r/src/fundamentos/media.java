package fundamentos;

import java.util.Scanner;


public class media {
	public static void main(String[] args) {
		
		class Pessoa{
			String nome;
			Integer idade;
		}

		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Pedro";
		pessoa1.idade = 25;
		
		System.out.println(pessoa1.nome);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 5.0) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}
