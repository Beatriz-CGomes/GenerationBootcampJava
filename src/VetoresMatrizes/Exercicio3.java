package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int valores[][] = new int[3][3];
		String valorPrincipal = "";
		int soma = valores[0][0];

		for (int linha = 0; linha < valores.length; linha++) {
			for (int coluna = 0; coluna < valores.length; coluna++) {

				System.out.println("Digite o com os valores para linha e coluna");
				valores[linha][coluna] = sc.nextInt();
			}
		}

		for (int linha = 0; linha < valores.length; linha++) {
			for (int coluna = 0; coluna < valores.length; coluna++) {

				if (linha == coluna) {
					valorPrincipal += valores[linha][coluna] + "";
					soma += valores[linha][coluna];
				}

			}
		}

		

		System.out.println("Todos os elementos da Diagonal Principal " + valorPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Principal " + soma);

		sc.close();
	}

}
