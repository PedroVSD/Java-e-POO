package relacionamentoEntreClasses;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Lutador listaLutadores[] = new Lutador[5];
		
		ArrayList<Lutador> listaLutadores = new ArrayList<>();
		
		listaLutadores.add(new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 3, 1));
		listaLutadores.add(new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3));
		listaLutadores.add(new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1));
		listaLutadores.add(new Lutador("Dead codde", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2));
		
		Lutador l1 = listaLutadores.get(0);
		Lutador l2 = listaLutadores.get(1);
		
		//listaLutadores[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
		//listaLutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		
		l1.status();
		System.out.println("\n");
		l2.status();
		
		Luta novaLuta = new Luta();
		novaLuta.marcarLuta(listaLutadores.get(0), listaLutadores.get(1));
		System.out.println("\n");
		novaLuta.lutar();
		System.out.println("\n");
		
		l1.status();
		System.out.println("\n");
		l2.status();
		
	}

}
