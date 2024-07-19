package polimorfismo;

public class Main {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		
		m.setPeso(85.3f);
		m.setIdade(10);
		m.setMembros(4);
		m.alimentar();
		m.emitirSom();
		m.locomover();
		
		Mamifero g =(Gato) new Gato();
		
		g.locomover();
		((Gato) g).pulando();
		
		Cachorro dog = (Cachorro) new Cachorro();
		

	}

}
