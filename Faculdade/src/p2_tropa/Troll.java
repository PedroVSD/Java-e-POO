package p2_tropa;

import java.util.ArrayList;

public class Troll extends Entidade{


	public Troll(String nome, int vida, int mana, ArrayList<Item> itens) {
		super(nome, vida, mana, itens);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculaAtaque() {
		return 0;
	}

	@Override
	public int calculaDefesa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculaVida() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculaMana() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculaPoder() {
		int poder;
		poder = getDefesa()*getMana();
		return poder;
	}}
