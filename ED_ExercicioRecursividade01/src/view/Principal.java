package view;

import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {

		FatorialController fat = new FatorialController();

		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 12 "
				+ "para saber o seu fatorial"));

		if (n > 0 && n <= 12) {
			int fatorial = fat.fatorial(n);
			System.out.println("O fatorial de "+n + "! é " + fatorial);
		} else {
			System.out.print("Número inválido, digite outro número dentro do intervalo");
		}
		
	}
}
