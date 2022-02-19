package desafioCap;
import javax.swing.JOptionPane;

/*
 * # Quest�o 01 - Escada

* Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * 
* e espa�os. A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o 
* deve conter nenhum espa�o.
*/

public class Escada {

	public static void main(String[] args) {
			
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura da escada"));
		
		for (int i = 0; i < n; i++) {
			String resultado = " ".repeat(n - i -1) + "*".repeat(i + 1);
			System.out.println(resultado);
		}
	}

}
