package futebol;

public class Jogo {
	private int data;
	private int horaInicio;
	private String timeCasa;
	private String timeVisitante;
	private int placarFinal;
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getTimeCasa() {
		return timeCasa;
	}
	public void setTimeCasa(String timeCasa) {
		this.timeCasa = timeCasa;
	}
	public String getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(String timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public int getPlacarFinal() {
		return placarFinal;
	}
	public void setPlacarFinal(int placarFinal) {
		this.placarFinal = placarFinal;
	}
}
