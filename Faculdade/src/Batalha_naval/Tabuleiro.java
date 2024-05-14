package batalha_naval;

import java.util.Random;

public class Tabuleiro {
	
	private Peca tabuleiro[][] = new Peca[8][8];
	
	 public Tabuleiro() {
	        encheTabuleiro();
	    }
	
	private void encheTabuleiro() {
		Random aleatorio = new Random();
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0;j < tabuleiro[i].length; j++){
				int valor = aleatorio.nextInt(10);
				tabuleiro[i][j] = new Peca(valor);
			}
		}
	}
	
	public int haduken(int linha, int coluna) {
		if(linha < 0 || linha  >= 8 || coluna < 0 || coluna >= 8) {
			System.out.println("Nâo pode mandar haduken ai");
			return 0;
		}
		
		Peca pecaAcertada = tabuleiro[linha][coluna];
		int pontos = pecaAcertada.getValor();
		
		pecaAcertada.setValor(-1);
		return pontos;
	}
	
	
}
