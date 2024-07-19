package p2;

import java.util.ArrayList;

public class SpellBlade extends Guerreiro{
	
	public SpellBlade(String nome, int vida, int mana, int ataque ,ArrayList<Item> itens) {
		super(nome, vida, mana, itens, ataque);
	}
	
	@Override
	protected void calcularPoder() {
		this.poder = getAtaque()*(this.vida*this.mana);
	}
	
}
