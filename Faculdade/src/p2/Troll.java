package p2;

import java.util.ArrayList;

public class Troll extends Entidade{

	public Troll(String nome, int vida, int mana, ArrayList<Item> itens) {
		super(nome, vida, mana, itens);
	}

	public int getDefesa(){
		return defesa;
	}
	
	@Override
	public void setPoder(int poder) {
		this.poder = this.defesa*this.mana;
	}

	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		
	}
}
