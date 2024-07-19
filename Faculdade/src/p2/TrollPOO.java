package p2;

import java.util.ArrayList;

public class TrollPOO extends Entidade{
	
	public TrollPOO(String nome, int vida, int mana, ArrayList<Item> itens) {
		super(nome, vida, mana, itens);
	}
	
	@Override
	public void atacar(Lutavel oponente) {
		if(this.estaVivo() && oponente.estaVivo()) {
			int dano = oponente.getVida() - 1;
			oponente.receberDano(dano);
		}
	}
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		
	}
}
