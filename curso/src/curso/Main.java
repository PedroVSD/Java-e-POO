package curso;

//import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int a = 10;
		double x = 10.101011;
		double res = a+x;
		System.out.println("Olá amigo "+a+" "+x);
		System.out.printf("%.2f%n", x);
		
		//Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.printf("A soma de %d + %f = %.2f%n", a, x, res);
		
		Scanner sc = new Scanner(System.in);
		
		String y = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		char letra = sc.next().charAt(0);
		
		System.out.println(y);
		System.out.println(idade);
		System.out.printf("%.2f%n",altura);
		System.out.println(letra);
		sc.close();
		
	}

}
