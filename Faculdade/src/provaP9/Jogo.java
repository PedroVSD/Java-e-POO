package provaP9;

import java.util.ArrayList;

public class Jogo {
	private ArrayList <Fase> fases = new ArrayList<>();
	private ArrayList <Personagem> listaPersonagens = new ArrayList<>();
	private Estados estadosJogo;
	
	public int tamVetor() {
		int tam = this.listaPersonagens.size();
		return tam;
	}
	
	public ArrayList<Fase> getFases() {
		return fases;
	}
	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}
	public ArrayList<Personagem> getListaPersonagens() {
		return listaPersonagens;
	}
	public void setListaPersonagens(ArrayList<Personagem> listaPersonagens) {
		this.listaPersonagens = listaPersonagens;
	}
	public Estados getEstadosJogo() {
		return estadosJogo;
	}
	public void setEstadosJogo(Estados estadosJogo) {
		this.estadosJogo = estadosJogo;
	}
}
