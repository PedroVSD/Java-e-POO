package p2_tropa;

import java.util.ArrayList;

public abstract class Entidade implements Lutavel{
	protected final String nome;
	protected int vida;
	protected int mana;
	protected int poder;
	protected int ataque;
	protected int defesa;
	
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

	protected ArrayList<Item> itens;
	
	public Entidade(String nome, int vida, int mana, ArrayList<Item> itens) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.itens = itens;
		this.ataque = 0;
		this.defesa = 0;
		equipaItem();
	}
	
	public void equipaItem() {
		vida = getVida();
		mana = getMana();
		ataque = getAtaque();
		defesa = getDefesa();
		
		
		for(Item i : itens) {
			ataque += i.getAtaque();
			defesa += i.getDefesa();
			vida += i.getVida();
			mana += i.getMana();
		}
	}
}
