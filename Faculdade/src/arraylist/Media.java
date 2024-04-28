package arraylist;

import java.util.ArrayList;

public class Media {
	
	private ArrayList<Double> Media_notas = new ArrayList<>();
	
	public void adiciona_nota(double elemento) {
		Media_notas.add(elemento);
	}
	
	public double Media_calculada(){
		double tot = 0;
		for(double elementos : Media_notas) {
			tot += elementos;
		}
		return tot/Media_notas.size();
	}
	public ArrayList<Double> getNotas(){
		return Media_notas;
	}

}
