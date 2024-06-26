package provaP9;


public class Fase {
	private final String nome;
	private int dificuldade;
	private static int numPersonagens;// lista de personagem
		
	public Fase(String nome, Jogo novoJogo) {
		this.nome = nome;
		this.numPersonagens = novoJogo.tamVetor();
	}
	
	public void dificuldadeFase() {
		if(numPersonagens < 5) {
			this.dificuldade = numPersonagens + 1;
		}else {
			this.dificuldade = 5;
		}
	}
	
	public int getDificuldade() {
		return dificuldade;
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
