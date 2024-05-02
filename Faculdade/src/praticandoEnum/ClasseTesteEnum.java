package praticandoEnum;

public class ClasseTesteEnum {
	EnumPlanetas planeta;
	
	ClasseTesteEnum(String planeta){
		this.planeta = EnumPlanetas.valueOf(planeta);
	}
	
	public void viajarPlaneta() {
		switch(planeta) {
		case MERCURIO:
			System.out.println("Muito quente");
			break;
		case VENUS:
			System.out.println("Mulher");
			break;
		case TERRA:
			System.out.println("Casa");
			break;
		case MARTE:
			System.out.println("Planeta Vermelho");
			break;
		default:
			System.out.println("Tem lugar não doido");
			break;
		}
	}
}
