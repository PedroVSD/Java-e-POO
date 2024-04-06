package fundamentos;

import java.util.Scanner;

public class TipoString {

	public static void main(String[] args) {
		
		String nome = "Pedro";
		
		int posicao = nome.charAt(1);
		System.out.println(posicao);
		System.out.println(nome.charAt(1));
		
		System.out.println(nome.startsWith("P"));
		System.out.println(nome.toLowerCase().startsWith("P"));
		System.out.println(nome.endsWith("o"));
		System.out.println(nome.length());
		
		if(nome.length() >= 5) {
			System.out.println("Haduken");
		}
		
		System.out.println("Pedro".contains("Pe"));
		System.out.println("Pedro".indexOf("Pe"));
		System.out.println("Pedro".substring(2));
		System.out.println("Pedro".substring(2, 4));
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = entrada.nextLine();
		
		System.out.println(palavra);
		entrada.close();
	}

}
