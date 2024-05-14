package carro;

public class Main {
	public static void main(String[] args) {
		Carro civic = FabricaCarros.criarCarro("Preto");
		System.out.println(civic.getNumeroChassi());
		
		Carro skyline = FabricaCarros.criarCarro("Prata");
		System.out.println(skyline.getNumeroChassi());
	}
}
