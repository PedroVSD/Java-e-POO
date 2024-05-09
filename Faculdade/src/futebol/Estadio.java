package futebol;

public class Estadio {
	private String localizacao;
	private int capMaxima;
	private int taxaEntrada;
	
	
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public int getCapMaxima() {
		return capMaxima;
	}
	public void setCapMaxima(int capMaxima) {
		this.capMaxima = capMaxima;
	}
	public int getTaxaEntrada() {
		return taxaEntrada;
	}
	public void setTaxaEntrada(int taxaEntrada) {
		this.taxaEntrada = taxaEntrada;
	}
}
