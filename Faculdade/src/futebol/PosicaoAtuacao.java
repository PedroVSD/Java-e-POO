package futebol;

public enum PosicaoAtuacao {
	GOLEIRO(0), ZAGUEIRO(1), LATERAL(2), VOLANTE(3), MEIO(4), ATACANTE(5), TECNICO(6);
		
	private int valor;
	
	private PosicaoAtuacao(int valor) {
		this.valor = valor;
	}
}
