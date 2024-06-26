package jogoP1;

public class Personagem {
	private final String nome;
	private int pontuacao;
	private int qntForca;
	private int inteligencia;
	private int vida;
	private Mochila mochila;
	private Sexo sexo;
	
	

	public Personagem(String nome, int pontuacao, int qntForca, int inteligencia, int vida, Mochila mochila,
			Sexo sexo) {
		super();
		this.nome = nome;
		this.pontuacao = pontuacao;
		this.qntForca = qntForca;
		this.inteligencia = inteligencia;
		this.vida = vida;
		this.mochila = mochila;
		this.sexo = sexo;
		
		if(sexo.getSexo() == 1) {
			setQntForca(10);
			setInteligencia(5);
			setVida(100);
		}else if(sexo.getSexo() == 0) {
			setQntForca(5);
			setInteligencia(10);
			setVida(100);
		}
		
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public int getQntForca() {
		return qntForca;
	}

	public void setQntForca(int qntForca) {
		this.qntForca = qntForca;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Mochila getMochila() {
		return mochila;
	}

	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public Personagem(String nome) {
		this.nome = nome;
	}
}
