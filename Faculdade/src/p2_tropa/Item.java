package p2_tropa;

public class Item {
	protected String nome;
	protected int ataque;
	protected int defesa;
	protected int vida;
	protected int mana;
	
	public Item(String nome, int ataque, int defesa, int vida, int mana) {
		this.nome = nome;
		this.ataque = ataque;
		this.defesa = defesa;
		this.vida = vida;
		this.mana = mana;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
	
	
}
