package futebol;
import java.util.ArrayList;

public class Time{
	private String estiloJogo;
	private float caixaContratacao;
	private float pagamentoBonus;
	
	ArrayList<Jogador> jogadores = new ArrayList<>();
	
	
	
	private Estadio estadioTime;
	
	public Time(Estadio estadioTime) {
		this.estadioTime = estadioTime;
	}
	
	public String getLocalizacaoEstadio() {
		return estadioTime.getLocalizacao();
	}
	
	public int getCapMaximaEstadio() {
		return estadioTime.getCapMaxima();
	}
	
	public int getTaxaEntradaEstadio() {
		return estadioTime.getTaxaEntrada();
	}
	
}
