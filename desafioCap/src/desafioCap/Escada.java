package desafioCap;
import javax.swing.JOptionPane;

/*
 * # Questão 01 - Escada

* Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * 
* e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não 
* deve conter nenhum espaço.
*/

public class Escada {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura da escada"));
		StringBuilder escada = new StringBuilder();

		
        for (int i = 0; i < n; i++) {
            escada.append("*");
            if (i == 0)
                System.out.print(escada);
            else
                System.out.print("\n" + escada);
        }
    }
}

