package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "senhora");
		s = s.concat("!!!!");
		System.out.println(s);
		
		System.out.println("Pedro".toUpperCase());
		
		int tam = s.length();
		System.out.println(tam);
	}
}
