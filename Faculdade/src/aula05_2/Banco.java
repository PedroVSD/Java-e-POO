package aula05_2;

public class Banco {
	
	public static void main(String[] args) {
		ContaBanco novaConta = new ContaBanco();
		
		novaConta.abrirConta("CC");
		novaConta.setDono("Pedro");
		novaConta.setNumconta(1010101);
		novaConta.depositar(10000);
		novaConta.sacar(1000);
		novaConta.getStatus();
	}

}
