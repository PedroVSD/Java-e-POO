package slide_P2;

public class Modelo_bike {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		
		b1.marcha = 1;
		b1.velocidade = 10;
		System.out.println(b1.velocidade);
		b1.acelerar(10);
		System.out.println(b1.velocidade);
		b1.acelerar(10);
		System.out.println(b1.marcha);
		b1.marcha = 2;
		b1.mudarMarcha(3);
		b1.imprimirEstados();
	}

}
