package classe;
import java.util.Scanner;


public class DataTeste {
	
	
	static int soma(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Data periodo = new Data();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos setar a data atual.");
		
		System.out.println("Primeiro vamos começar pelo dia, mas lembre-se o dia vai do intervalo 1 até 31:");
		periodo.dia = entrada.nextInt();
		
		while(periodo.dia < 1 || periodo.dia > 31){
			System.out.println("Digite um dia entre o intervalo");
			periodo.dia = entrada.nextInt();
		}
				
		System.out.println("Vamos ao mês agora, de 1 até 12");
		
		periodo.mes = entrada.nextInt();
		
		while(periodo.mes < 1 || periodo.mes > 12){
			System.out.println("Digite um mês entre o intervalo");
			periodo.mes = entrada.nextInt();
		}
		
		System.out.println("Vamos ao ano agora");
		periodo.ano = entrada.nextInt();
		
		
		System.out.println("Dia:" + periodo.dia + " do mês:" + periodo.mes + " do ano:" + periodo.ano);
		
		entrada.close();
		
		Data d1 = new Data();
		
		d1.dia = 19;
		d1.mes = 03;
		d1.ano = 1998;
		
		System.out.println(d1.DataFormatada());
		
		
		System.out.println(soma(9, 1));
		
	}
}
