package classe;
import java.util.Scanner;


public class DataTeste_01 {
	
	static int soma(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Data_01 tempo = new Data_01();
		Scanner entrada_dados = new Scanner(System.in);
		
		
		System.out.println("Qual o dia?");
		tempo.dia = entrada_dados.nextInt();
		
		System.out.println("Qual o mês?");
		tempo.mes = entrada_dados.nextInt();
		
		System.out.println("Qual o ano?");
		tempo.ano = entrada_dados.nextInt();
		
		System.out.println(tempo.dia + "/" + tempo.mes + "/" + tempo.ano);
		
		int res = soma(1, 9);
		System.out.println(res);
		
		entrada_dados.close();
	}
}
