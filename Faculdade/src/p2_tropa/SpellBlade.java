package p2_tropa;

import java.util.ArrayList;

public class SpellBlade extends Guerreiro{

	public SpellBlade(String nome, int vida, int mana, ArrayList<Item> itens) {
		super(nome, vida, mana, itens);
		
	}
	@Override
	public int calculaPoder() {
		int poder = getAtaque()*(getVida()+getMana());
		return poder;
	}

}
