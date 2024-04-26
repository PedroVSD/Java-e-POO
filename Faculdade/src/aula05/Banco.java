package aula05;

public class Banco {

	public static void main(String[] args) {
		Conta_banco novaConta = new Conta_banco();
		
		novaConta.setNumConta(101);
		novaConta.setDono("Pedro");
		novaConta.AbrirConta("CP");
		novaConta.estadoConta();
	}

}
