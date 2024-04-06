package slide_P2;

public class Cachorro {
	
	private String nome;
	
	public Cachorro(String nome) {
		this.nome = nome;
	}
	
	public void late(){
		System.out.println("rogh rogh");
	}
	
	public static void main(String[] Args) {
		Cachorro bingo = new Cachorro("Bingo");
		bingo.late();
		
		Cachorro feijão = new Cachorro("feijão");
		feijão.late();
	}
}
