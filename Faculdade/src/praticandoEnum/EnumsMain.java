package praticandoEnum;
import java.util.Scanner;

public class EnumsMain {
	public static void main(String[] args) {
		
		//listando os valores do enum
		/*for(EnumPlanetas p : EnumPlanetas.values()) {
			System.out.printf("%s%n", p);
		}*/
		
		Scanner entrada = new Scanner(System.in);
		String planeta;
		System.out.println("Qual planeta maluco?");
		planeta = entrada.next().toUpperCase();
		entrada.close();
		
		ClasseTesteEnum pl = new ClasseTesteEnum(planeta);
			pl.viajarPlaneta();

		
	}
}
