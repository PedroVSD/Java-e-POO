package fundamentos;

import java.util.Scanner;

public class desafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String sal1 = entrada.nextLine().replace(",",".");
		String sal2 = entrada.nextLine().replace(",",".");
		String sal3 = entrada.nextLine().replace(",",".");
		
		double media = (Double.parseDouble(sal1)+Double.parseDouble(sal2)+Double.parseDouble(sal3))/3;
		
		System.out.printf("Média salárial: %.2f%n" , media);
		
		entrada.close();
	}

}
