package topico_04;

public class Main {
	public static void main(String [] Args) {
		
		Item item1 = new Item("PC", 5.000, 2);
		Item item2 = new Item("Camisa", 125.0, 5);
		
		Fatura conta = new Fatura("Loja", "010.928.182.00", 2);
		
		conta.adicionarItem(2, item1);
		conta.adicionarItem(5, item2);
		
		double preco = conta.obtemPreco();
		
		System.out.println(preco);
		}
}
