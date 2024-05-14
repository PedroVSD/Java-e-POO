package jogoP1;

public class Fase {
	private final String nome;
	private int dificuldade;
	private static int numPersonagens;
	
	private Fase(String nome) {
		this.nome = nome;
	}
	
	public void faseDificuldade(int dificuldade) {
		this.dificuldade = getNumPersonagens() + 1;
	}


	public int getDificuldade() {
		return dificuldade;
	}


	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}


	public static int getNumPersonagens() {
		return numPersonagens;
	}


	public static void setNumPersonagens(int numPersonagens) {
		Fase.numPersonagens = numPersonagens;
	}


	public String getNome() {
		return nome;
	}
}
