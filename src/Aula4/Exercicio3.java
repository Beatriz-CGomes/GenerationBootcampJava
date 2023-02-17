package Aula4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numIdade;
		int maiorIdade = 0, menorIdade = 0;

		System.out.println("Digite sua idade");
		numIdade = sc.nextInt();

		while (numIdade >= 0) {
			if (numIdade < 21) {
				menorIdade++;
			} else if (numIdade > 50) {
				maiorIdade++;
			}
		}
		
		System.out.println("Pessoas menor de 21 " + menorIdade);
		System.out.println("Pessoas maior de 21 " + maiorIdade);

		sc.close();
	}

}
