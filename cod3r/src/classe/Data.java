package classe;

public class Data {
	Integer dia;
	Integer mes;
	Integer ano;

	String DataFormatada() {
		return String.format("%d/%d/%d", dia, mes ,ano);
	}
}
