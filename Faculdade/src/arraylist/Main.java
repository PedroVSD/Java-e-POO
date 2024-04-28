package arraylist;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Media notas = new Media();
		
		notas.adiciona_nota(10);
		notas.adiciona_nota(8.5);
		
		double media = notas.Media_calculada();
		System.out.println("Média total: " + media);
		
	}

}
