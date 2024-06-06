package jogoP1;

import java.util.ArrayList;

public class Jogo {
	private Fase levels;
	private Personagem personagens;
	private Estado estados;
	
	private ArrayList<Fase> fases;
	
	public Jogo() {
		fases = new ArrayList<Fase>();
	}
	
	public void setLevels(Fase levels) {
		this.levels = levels;
	}
	
	public Fase getLevels() {
		return levels;
	}
	
	public void setPersonagens(Personagem personagens) {
		this.personagens = personagens;
	}
	
	public Personagem getPersonagem() {
		return personagens;
	}
	
	public Estado getEstados() {
        return estados;
    }

    public void setEstados(Estado estados) {
        this.estados = estados;
    }
    
    public void addFase(Fase fase) {
        fases.add(fase);
    }


    public ArrayList<Fase> getFases() {
        return fases;
    }
}
