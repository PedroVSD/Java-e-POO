package relacionamentoEntreClasses;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
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
		this.peso = pe;
		this.setCategoria();
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	private void setCategoria() {
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
	    System.out.println("Status do lutador:");
	    System.out.println("Nome: " + getNome());
	    System.out.println("Nacionalidade: " + getNacionalidade());
	    System.out.println("Idade: " + getIdade());
	    System.out.println("Altura: " + getAltura());
	    System.out.println("Peso: " + getPeso());
	    System.out.println("Categoria: " + getCategoria());
	    System.out.println("Vitórias: " + getVitorias());
	    System.out.println("Derrotas: " + getDerrotas());
	    System.out.println("Empates: " + getEmpates());
	}

	
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}
	
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}
}
