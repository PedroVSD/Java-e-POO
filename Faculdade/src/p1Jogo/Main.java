package p1Jogo;
public class Main {

	public static void main(String[] args) {
		
		Fase.setNumeroPersonagens(9);
		Fase level = new Fase("Fase 1", 2);
		level.definirDificuldade();
		
		System.out.println("A dificuldade da fase é " + level.getDificuldade());
		
		
		Guerreiro Aragorn = new Guerreiro("Aragorn");
		Mago Galadriel = new Mago("Gandalf");
		
		
		Aragorn.setSexo("Masculino");
		if(Aragorn.getSexo().equals("Masculino")) {
			Aragorn.setQntForca(10);
			Aragorn.setQntInteligencia(5);
			Aragorn.setHP(100);
			Aragorn.setEstamina(10);
		}
		
		if(Aragorn.getEstamina() > 0) {
			System.out.println("Ataque poderoso: " + Aragorn.ataquePoderoso());
		}else {
			System.out.println("Estamina Baixa");
		}
		
		System.out.println(Aragorn.getQntForca());		
		Item Espada = new Item("Andúril", 100, 50, 100);
		
		Aragorn.AddITem(Espada);
		
		System.out.println(Aragorn.getQntForca());
		
		Galadriel.setSexo("Feminino");
		if(Galadriel.getSexo().equals("Feminino")) {
			Galadriel.setQntForca(5);
			Galadriel.setQntInteligencia(10);
			Galadriel.setHP(100);
		}
		
		if(Galadriel.getMP() > 0) {
			System.out.println("Lançar magia: " + Galadriel.lancarMagia());
		}else {
			System.out.println("Magia Baixa");
		}
		
		
		
	}

}
