package aula_10_heranca;

public class Funcionario extends Pessoa{
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String getSetor() {
		return this.setor;
	}
	
	public void setTraba(boolean work) {
		this.trabalhando = work;
	}
	
	public boolean getTraba() {
		return this.trabalhando;
	}
}
