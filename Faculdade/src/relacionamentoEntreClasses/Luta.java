package relacionamentoEntreClasses;
import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	int vencedor;
	Random numeroAleatorio = new Random();
	
	public void marcarLuta(Lutador l1,Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			setAprovada(true);
			setDesafiante(l1);
			setDesafiado(l2);
		}else {
			setAprovada(false);
			setDesafiante(null);
			setDesafiado(null);
		}
	}
	
	public void lutar() {
		if(getAprovada()) {
			desafiado.apresentar();
			desafiante.apresentar();
			vencedor = numeroAleatorio.nextInt(2);
			switch(vencedor) {
				case 0:
				System.out.println("Empate");
				desafiado.empatarLuta();
				desafiante.empatarLuta();
				break;
				
				case 1:
				System.out.println("Ganhou o desafiante");
				desafiante.getNome();
				desafiado.perderLuta();
				desafiante.ganharLuta();
				break;
				
				case 2:
				System.out.println("Ganhou o desafiado");
				desafiado.getNome();
				desafiado.ganharLuta();
				desafiante.perderLuta();
				break;
			}
		}else {
			System.out.println("Luta não pode acontecer");
		}
	}

	
	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
}
