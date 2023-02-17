package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int valores[][] = new int[3][3];
		int linha, coluna;
		String valorPrincipal = "" ;

		for (linha = 0; linha < valores.length; linha++) {
			for (coluna = 0; coluna < valores.length; coluna++) {
				System.out.println("Digite o com os valores para linha e coluna");
				valores[linha][coluna] = sc.nextInt();

				if (linha == coluna) {
					valorPrincipal = +valores[linha][coluna]+ "";
				}

			}
		}

		System.out.println("Todos os elementos da Diagonal Principal " + valorPrincipal);

		sc.close();
	}

}
