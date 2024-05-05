package p1Jogo;

public enum EstadosJogo {
	ATIVO(0), PAUSADO(1), GAMEOVER(2);
	
	private int opcao;

	private EstadosJogo(int opcao) {
		this.opcao = opcao;
	}
	
	public int getOpcao() {
		return this.opcao;
	}
}
