package polimorfismo;

public class Cachorro extends Mamifero{
	
	public void enterrarOsso() {
		System.out.println("Enterrando o osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o rabo");
	}
	@Override
	public void locomover() {
		System.out.println("Correndo que nem doido");
	}
	
	public void reagir(String frase) {
		if(frase == "toma comida" || frase=="Olá") {
			System.out.println("Abanar e latir");
		}else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora,int min) {
		if(hora < 12) {
			System.out.println("Abanar");
		}else if(hora >= 18) {
			System.out.println("Ignorar");
		}else {
			System.out.println("Abanar e Latir");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar");
		}else {
			System.out.println("Rosnar e Latir");
		}
	}
	
}
