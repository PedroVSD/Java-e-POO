package exercicioPOO;

public class Aluno {
	private String nome;
	private String sexo;
	private int idade;
	private float n1;
	private float n2;
	private float n3;
	private float n4;
	private float notaFinal;
	private boolean aprovado;
	

	public Aluno(String nome, float n1, float n2, float n3, float n4) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getN1() {
		return n1;
	}
	public void setN1(float n1) {
		this.n1 = n1;
	}
	public float getN2() {
		return n2;
	}
	public void setN2(float n2) {
		this.n2 = n2;
	}
	public float getN3() {
		return n3;
	}
	public void setN3(float n3) {
		this.n3 = n3;
	}
	public float getN4() {
		return n4;
	}
	public void setN4(float n4) {
		this.n4 = n4;
	}
	public float getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	public void responderChamada() {
		System.out.println("Está presente");
	}
	
	public String infomacoes() {
		return "Aluno [n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + ", notaFinal=" + notaFinal + "]";
	}
}
