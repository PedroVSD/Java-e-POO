package p2_tropa;

public class Jogo {
	protected final String nome;
	protected int ataque;
	protected int defesa;
	protected int vida;
	protected int mana;
	
	public Jogo(String nome, int ataque, int defesa, int vida, int mana) {
		this.nome = nome;
		this.ataque = ataque;
		this.defesa = defesa;
		this.vida = vida;
		this.mana = mana;
	}
	/*
	 * package p2_tropa;

import java.util.ArrayList;

public class Jogo {
    private final String nome;
    private ArrayList<Lutavel> lutaveis;

    public Jogo(String nome) {
        this.nome = nome;
        this.lutaveis = new ArrayList<>();
    }

    public void adicionarLutavel(Lutavel lutavel) {
        lutaveis.add(lutavel);
    }

    public void rinhaDeEntidades(Lutavel l1, Lutavel l2) {
        while (l1.getVida() > 0 && l2.getVida() > 0) {
            int poder1 = l1.calcularPoder();
            int poder2 = l2.calcularPoder();

            if (l1 instanceof TrollDePOO) {
                poder1 = ((TrollDePOO) l1).calcularPoder(l2.getVida());
            }

            if (l2 instanceof TrollDePOO) {
                poder2 = ((TrollDePOO) l2).calcularPoder(l1.getVida());
            }

            l2.setVida(l2.getVida() - poder1);
            if (l2.getVida() <= 0) {
                System.out.println(l1.getNome() + " venceu a luta!");
                return;
            }

            l1.setVida(l1.getVida() - poder2);
            if (l1.getVida() <= 0) {
                System.out.println(l2.getNome() + " venceu a luta!");
                return;
            }
        }
    }
}*/
}
