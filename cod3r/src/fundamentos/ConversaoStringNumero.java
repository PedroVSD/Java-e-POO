package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {

		String valor1 = JOptionPane.showInputDialog("Digite um número bro:");
		String valor2 = JOptionPane.showInputDialog("Digite um segundo número bro:");
		
		double res = Double.parseDouble(valor1)+Double.parseDouble(valor2);
		System.out.println(res);

	}

}
