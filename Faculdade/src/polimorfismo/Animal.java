package polimorfismo;

public abstract class Animal {
	protected float Peso;
	protected int Idade;
	protected int Membros;
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public int getMembros() {
		return Membros;
	}
	public void setMembros(int membros) {
		Membros = membros;
	}
}
