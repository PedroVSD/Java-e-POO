package batalha_naval;

import java.util.Random;

public class Jogador {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		Random random = new Random();
	
		int totPontos = 0;
		for(int i = 0; i < 5 ; i++) {
			int linha = random.nextInt(10);
            int coluna = random.nextInt(10);
            int pontuacaoTiro = tabuleiro.haduken(linha, coluna);
            totPontos += pontuacaoTiro;
            System.out.println("Tiro " + (i + 1) + ": Pontuação = " + pontuacaoTiro);
		}
		
		System.out.println("Pontuação total: " + totPontos);
	}

}
