package p1Jogo;

import java.util.ArrayList;

public class Personagem {
	private final String nome;
	private int pontuação;
	private int qntForca;
	private int qntInteligencia;
	private int HP;
	private String sexo;
	
	private ArrayList<Item> mochila;
	
	public void AddITem(Item item) {
		mochila.add(item);
		this.qntForca += item.forcaItem();
	    this.qntInteligencia += item.inteligenciaItem();
	    this.HP += item.vidaItem();
	}

	public Personagem(String nome) {
		this.nome = nome;
		this.mochila = new ArrayList<>();
	}

	public int getPontuação() {
		return pontuação;
	}

	public void setPontuação(int pontuação) {
		this.pontuação = pontuação;
	}

	public int getQntForca() {
		return qntForca;
	}

	public void setQntForca(int qntForca) {
		this.qntForca = qntForca;
	}

	public int getQntInteligencia() {
		return qntInteligencia;
	}

	public void setQntInteligencia(int qntInteligencia) {
		this.qntInteligencia = qntInteligencia;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}
	
	
}
