package provaP9;

public class Mago extends Personagem{
	private int mana;
	
	public Mago(String nome, int pontuacao, int qntForca, int inteligencia, int vida, Sexo sexo, int mana) {
		super(nome, pontuacao, qntForca, inteligencia, vida, sexo);
		this.mana = mana;
	}
	
	public String lancaMagia(int mana) {
		if(getmana() > 0) {
			int ataque = getmana() * getInteligencia();
			return "Lanca Magia:" + ataque;
		}else {
			return "Não tem mana suficiente";
		}
	}

	public int getmana() {
		return mana;
	}

	public void setmana(int mana) {
		this.mana = mana;
	}
}
