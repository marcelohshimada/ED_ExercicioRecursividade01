package view;

// Biblioteca que mostra a janela com a solicitação ao usuário
import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {

		// Método construtor
		FatorialController fat = new FatorialController();

		// Entrada de dados
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 12 "
				+ "para saber o seu fatorial"));

		// Condição para aceite da informação digitada, se estiver dentro do intervalo 
		if (n > 0 && n <= 12) {
			int fatorial = fat.fatorial(n);
			// Resultado final
			System.out.println("O fatorial de "+n + "! é " + fatorial);
		} else {
			// Mensagem caso a informação digitada não esteja de acordo com a estrutura condicional
			System.out.print("Número inválido, digite outro número dentro do intervalo");
		}
		
	}
}
