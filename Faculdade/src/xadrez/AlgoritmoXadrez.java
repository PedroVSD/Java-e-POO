package xadrez;

public class AlgoritmoXadrez {
	
	public enum JogadorXadrez{
        BRANCO(0), PRETO(1);
		
		private int valor;
		
		private JogadorXadrez(int valor) {
			this.valor = valor;
		}
		public int getValor() {
			return this.valor;
		}
    }
	
	private final JogadorXadrez primeiroJogador;
	
	public AlgoritmoXadrez() {
        this.primeiroJogador = JogadorXadrez.BRANCO;
    }
	
	public JogadorXadrez getPrimeiroJogador() {
		return primeiroJogador;
	}
}
