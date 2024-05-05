package p1Jogo;

public class Mago extends Personagem{
	private int MP;
	
	public int lancarMagia() {
		int ataqueMagico = getMP()*getQntInteligencia();
		return ataqueMagico;
	}

	public Mago(String nome) {
		super(nome);
	}
	
	
	public int getMP() {
		return MP;
	}


	public void setMP(int mP) {
		MP = mP;
	}
}
