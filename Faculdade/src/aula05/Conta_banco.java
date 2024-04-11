package aula05;

public class Conta_banco {
	private float saldo;
	public int numConta;
	private String dono;
	private boolean Status;
	protected String tipo;
	
	
	public void estadoConta() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void Conta_banco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void AbrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(false);
		
		if(tipo == "CC") {
			this.setSaldo(50);
		}else if(tipo == "CP"){
			this.setSaldo(150);
		}
	}
	
	public void FecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta com débito");
		}else{
			this.setStatus(false);
		}
	}
	
	
	public void Depositar(float deposito) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + deposito);
			System.out.println("Deposito realizado com sucesso.");
		}else {
			System.out.println("Não é possível depositar");
		}
	}
	
	public void Sacar(float saque) {
		if(this.getStatus()) {
			if(this.getSaldo() > saque) {
				this.setSaldo(this.getSaldo() - saque);
				System.out.println("Saque realizado com sucesso");
			}else {
				System.out.println("Saldo insuficiente para o saque");
			}
		}else {
			System.out.println("Não foi possível sacar o dinheiro");
		}
	}
	
	public void pagarMensal() {
		int valor = 0;
		if(this.getTipo() == "CC") {
			valor = 12;
		}else if(this.getTipo() == "CP"){
			valor = 20;
		}
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() - valor);
		}else {
			
		}
	}
	
	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public boolean getStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
}
