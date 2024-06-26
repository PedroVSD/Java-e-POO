package provaP9;

import java.util.ArrayList;

public abstract class Personagem {
	private final String nome;
	private int pontuacao;
	private int qntForca;
	private int inteligencia;
	private int vida;
	private final Sexo sexo;
	
	ArrayList<Item> mochila = new ArrayList<>();
	
	public Personagem(String nome, int pontuacao, int qntForca, int inteligencia, int vida, Sexo sexo) {
		this.nome = nome;
		this.pontuacao = pontuacao;
		this.vida = 100;
		this.sexo = sexo;
		
		if(this.sexo == sexo.MASCULINO) {
			setInteligencia(5);
			setQntForca(10);
		}else if(this.sexo == sexo.FEMININO) {
			setInteligencia(10);
			setQntForca(5);
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
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public String getNome() {
		return nome;
	}
}
