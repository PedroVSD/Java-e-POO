package p1Jogo;

public class Guerreiro extends Personagem{
	private int Estamina;
	
	public Guerreiro(String nome) {
		super(nome);
	}
	
	public int getEstamina() {
		return Estamina;
	}

	public void setEstamina(int estamina) {
		this.Estamina = estamina;
	}

	public int ataquePoderoso() {
		int ataque = getEstamina()*getQntForca();
		return ataque;
	}
	
}
