package fundamentos;
import java.util.Scanner;

public class treinando_entrada_de_dados {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual sua idade?");
		Integer idade = entrada.nextInt();
		System.out.println(idade);
		
		System.out.println("Qual o seu nome?");
		String nome = entrada.next();
		System.out.println(nome);
		
		
		
		entrada.close();
	}
}
