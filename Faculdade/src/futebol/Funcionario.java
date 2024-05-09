package futebol;

public class Funcionario {
	private String nome;
	private int idade;
	private String CPF;
	private float Salario;
	private String dataContatacao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	public String getDataContatacao() {
		return dataContatacao;
	}
	public void setDataContatacao(String dataContatacao) {
		this.dataContatacao = dataContatacao;
	}
}
