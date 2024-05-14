package carro;

public class FabricaCarros {
	private static int proximoNumChassis = 0;
	
	
	public static Carro criarCarro(String cor) {
		Carro novoCarro = new Carro(cor, getProximoNumChassis());
		proximoNumChassis++ ;
		return novoCarro;
	}


	public static int getProximoNumChassis() {
		return proximoNumChassis;
	}

}
