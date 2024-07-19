package p2;

public interface Lutavel {
	int getVida();
	void atacar(Lutavel oponente);
	boolean estaVivo();
	String getNome();
	void receberDano(int dano);
	void setVida(int vida);
}
