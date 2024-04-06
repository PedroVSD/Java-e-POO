package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		//(F-32)x5/9=C
		final int tres_dois = 32;
		final double cinco_nove = 5.0/9.0;
		double f = 86, c;
		
		c = (f-tres_dois) * cinco_nove;
		
		System.out.println(c);
	}
}
