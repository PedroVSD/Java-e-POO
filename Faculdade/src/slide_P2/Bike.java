package slide_P2;

public class Bike {
	int velocidade;
	int marcha;
	
	
	public void mudarMarcha(int novaMarcha) {
		marcha = novaMarcha;
		//this.marcha = marcha;
	}
	
	public void acelerar(int incremento) {
		velocidade += incremento;
	}
	
	public void freiar(int decremento) {
		velocidade -= decremento;
	}
	
	public void imprimirEstados() {
		System.out.println(this.velocidade);
		System.out.println(this.marcha);
	}
	
}
