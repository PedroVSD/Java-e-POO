package relacionamentoEntreClasses;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	public Lutador(String no, String na, int id, float al, float pe, String cat, int vi, int de, int em) {
		nome = no;
		nacionalidade = na;
		idade = id;
		altura = al;
		setPeso(pe);
		vitorias = vi;
		derrotas = de;
		empates = em;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String no) {
		nome = no;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float pe) {
		peso = pe;
		setCategoria(categoria);
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		if(peso < 52.2) {
			categoria = "Invalido";
		}else if(peso <= 70.3) {
			categoria = "Leve";
		}else if(peso <= 83.9) {
			categoria = "Médio";
		}else if(peso <= 120.2) {
			categoria = "Pesado";
		}else {
			categoria = "Invalido";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getEmpates() {
		return empates;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public void apresentar() {
		
	}
	
	public void status() {
		
	}
	
	public void ganharLuta() {
		setVitorias(getVitorias()+1);
	}
	
	public void perderLuta() {
		setDerrotas(getDerrotas()+1);
	}
	public void empatarLuta() {
		setEmpates(getEmpates()+1);
	}
}