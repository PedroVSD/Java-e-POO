package p2;

import java.util.ArrayList;

public class Jogo {
	private final String nome;
	ArrayList <Lutavel> luta = new ArrayList<Lutavel>();
	

	public Jogo(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void rinhaDeEntidades(Lutavel lutador1, Lutavel lutador2) {
		
	}
}
