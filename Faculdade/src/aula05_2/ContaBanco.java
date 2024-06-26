package aula05_2;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	public void mostraConta() {
		System.out.println("Dono:" + this.getDono());
		System.out.println("Número da conta:" + this.getNumconta());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getTipo());
	}
	
	
	public void abrirConta(String tipoConta) {
		this.setTipo(tipoConta);
		this.setStatus(false);
		
		if(tipoConta == "CC") {
			this.setSaldo(50);
		}else if(tipoConta == "CP") {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Não é possível fechar a conta, pois ainda há salo na conta");
		}else if(this.getSaldo() < 0) {
			System.out.println("Não é possível fechar a conta, pois ainda há débito na conta");
		}else {
			this.setStatus(false);
		}
	}
	
	public void depositar(float deposito) {
		this.setSaldo(this.getSaldo() + deposito);
		System.out.println("Deposito realizado com sucesso");
	}
	
	public void sacar(float saque) {
		if(this.getSaldo() >= saque) {
			this.setSaldo(this.getSaldo() - saque);
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Não é possível realizar o saque, pois seu saldo é insuficiente.");
		}
		
	}
	
	public int getNumconta() {
		return this.numConta;
	}

	public void setNumconta(int n) {
		this.numConta = n;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipoConta) {
		this.tipo = tipoConta;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
}