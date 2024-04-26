package aula_10_heranca;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void cancelarMatricula() {
		
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getCurso(){
		return curso;
	}
	
}
