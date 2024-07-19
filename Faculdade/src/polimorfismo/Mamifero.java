package polimorfismo;

public class Mamifero extends Animal{

	private String corPelo;
	
	public void setCorPelo(String CorPelo) {
		this.corPelo = CorPelo;
	}
	
	public String getCorPelo(){
		return corPelo;
	}
	
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Um som ai");
	}
	
}
