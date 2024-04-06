package slide_P3;
import java.util.Scanner;

class Pessoa{
	//variáveis de classe
	String nome;
	int idade;
	float altura;
	char sexo;
}

public class Var {
		
	public void imprime(Pessoa p1) {
		System.out.println("Seu nome: " + p1.nome + "\nSua idade: " +p1.idade + "\nSua altura: "+p1.altura + "\nSeu sexo: "+p1.sexo);
	}
	
	
	public static void main(String[] Args) {
		Scanner entrada = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		
		System.out.println("Qual o seu nome?");
		p1.nome = entrada.next();
		
		System.out.println("Qual a sua idade?");
		p1.idade = entrada.nextInt();
		
		System.out.println("Qual a sua altura?");
		p1.altura = entrada.nextFloat();
		
		System.out.println("Qual o seu sexo?");
		p1.sexo= entrada.next().charAt(0);
		
		Var var = new Var();
		var.imprime(p1);
		
		
		entrada.close();
	}
}
