package provaP9;

public class Guerreiro extends Personagem{
	private int stamina;
	
	public Guerreiro(String nome, int pontuacao, int qntForca, int inteligencia, int vida, Sexo sexo, int stamina) {
		super(nome, pontuacao, qntForca, inteligencia, vida, sexo);
		this.stamina = stamina;
	}
	
	public String ataquePoderoso(int stamina) {
		if(getStamina() > 0) {
			int ataque = getStamina() * getQntForca();
			return "Ataque poderoso:" + ataque;
		}else {
			return "Não tem Stamina suficiente";
		}
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
}
