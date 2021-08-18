package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}

	public int fatorial(int n) {

		// Condição de parada n == 1
		// Enquanto o n for > que 1, o cálculo será executado 
		// O resultado ficará armazenado na função fatorial e depois será decrementado em 1
		// Quando chegar a n = 1, retornará o valor 1 

		if (n == 1) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}

	}
}
