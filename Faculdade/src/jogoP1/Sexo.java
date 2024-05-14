package jogoP1;

public enum Sexo {
	FEMININO(0), MASCULINO(1);
	
	private int valor;
	
	private Sexo(int valor) {
		this.valor = valor;
	}
	
	public int getSexo() {
		return valor;
	}
}
