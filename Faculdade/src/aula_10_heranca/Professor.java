package aula_10_heranca;

public class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	public void ReceberAum(float aumento) {
		this.salario += aumento;
	}
	
	public void setEspecialidade(String espc) {
		this.especialidade = espc;
	}
	public String getEspecialidade(){
		return this.especialidade;
	}
	
	public void setSalario(float sal) {
		this.salario = sal;
	}
	public float getSalario() {
		return this.salario;
	}
}
