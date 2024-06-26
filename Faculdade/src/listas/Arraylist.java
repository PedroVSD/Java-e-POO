package listas;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	public static void main(String[] args) {
		//Vetor normal
		int n = 10;
		String[] nomes = new String[n];
		nomes[0] = "Pedro";
		nomes[1] = "Maria";
		
		ArrayList<String> nome_novo = new ArrayList<String>();
		
		ArrayList<Integer> listaBruta = new ArrayList<Integer>();
		
		ArrayList<String> listaDeStrings = new ArrayList<>();
		listaDeStrings.add("Pedro");
		nome_novo.add("Maria");
		
		listaBruta.add(1);
		listaBruta.add(0);
		listaBruta.add(10);
		listaBruta.add(7);
		listaBruta.add(100);
		listaBruta.add(1);
		listaBruta.add(10);
		listaBruta.add(1);
		listaBruta.add(0);
		listaBruta.add(1);
		
		for(Integer num:listaBruta) {
			System.out.println(num);
		}
		
		Collections.sort(listaBruta);
		System.out.println("---------------");
		for(Integer num:listaBruta) {
			System.out.println(num);
		}
		System.out.println("---------------");
		
		Collections.sort(listaBruta, Collections.reverseOrder());
		
		for(Integer num:listaBruta) {
			System.out.println(num);
		}
		
		imprime(nome_novo);
		//Aqui em baixo é foreach
		for(String nome : listaDeStrings) {
			System.out.println(nome);
		}
		
		
	
	}
	public static void imprime(ArrayList<String> lista) {
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
