package view;

// Biblioteca que mostra a janela com a solicita��o ao usu�rio
import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {

		// M�todo construtor
		FatorialController fat = new FatorialController();

		// Entrada de dados
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero entre 1 e 12 "
				+ "para saber o seu fatorial"));

		// Condi��o para aceite da informa��o digitada, se estiver dentro do intervalo 
		if (n > 0 && n <= 12) {
			int fatorial = fat.fatorial(n);
			// Resultado final
			System.out.println("O fatorial de "+n + "! � " + fatorial);
		} else {
			// Mensagem caso a informa��o digitada n�o esteja de acordo com a estrutura condicional
			System.out.print("N�mero inv�lido, digite outro n�mero dentro do intervalo");
		}
		
	}
}
