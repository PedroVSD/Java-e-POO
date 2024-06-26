package futebol;

public class Jogador extends Funcionario{
	private int golsFeitos;
	private int passes;
	private int roubadasBolas;
	private float precoPasse;
	private float BonusSalario;
	private float passesCorretos;
	

	private PosicaoAtuacao pos;
	
	public PosicaoAtuacao getPos() {
		return pos;
	}
	public void setPos(PosicaoAtuacao pos) {
		this.pos = pos;
	}
	public int getGolsFeitos() {
		return golsFeitos;
	}
	public void setGolsFeitos(int golsFeitos) {
		this.golsFeitos = golsFeitos;
	}
	public int getPasses() {
		return passes;
	}
	public void setPasses(int passes) {
		this.passes = passes;
	}
	public int getRoubadasBolas() {
		return roubadasBolas;
	}
	public void setRoubadasBolas(int roubadasBolas) {
		this.roubadasBolas = roubadasBolas;
	}
	public float getPrecoPasse() {
		return precoPasse;
	}
	public void setPrecoPasse(float precoPasse) {
		this.precoPasse = precoPasse;
	}
	
	public float getBonusSalario() {
		return BonusSalario;
	}
	public void setBonusSalario(float bonusSalario) {
		BonusSalario = bonusSalario;
	}
	
	public float getPassesCorretos() {
		return passesCorretos;
	}
	public void setPassesCorretos(float passesCorretos) {
		this.passesCorretos = passesCorretos;
	}
	
	public void BonusSal() {
		float bonusSal;
		
		bonusSal = (getGolsFeitos() * (0.01f * getSalario())) + (getPasses() * (0.01f * getSalario())) + (getRoubadasBolas() * (0.01f * getSalario()));
		setBonusSalario(bonusSal);
	}
	
	public void atualizarPrecoPasse() {
	    setPrecoPasse(getSalario() + getBonusSalario());
	}

}
