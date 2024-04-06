package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//byte
		
		Byte b = 100;
		Short s = 1000;
		
		Integer i = Integer.parseInt(entrada.next());
		System.out.println(i*10);
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		
		entrada.close();
	}
}
