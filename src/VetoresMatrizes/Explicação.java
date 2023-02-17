package VetoresMatrizes;

import java.util.Scanner;

public class Explicação {

	public static void main(String[] args) {
		// Vetor ele é uno dimensional - unica dimennsão - indices
		// Matrizes são bidimensionais

		Scanner sc = new Scanner(System.in);
		{

			// Array Vetores
			float[] media = new float[4];
			float n1, n2, n3, somaMedia = 0, mg;
			int x;
			String nome;

			for (x = 0; x < 4; x++) {
				System.out.println("Digite nome do(a) aluno(a)");
				nome = sc.nextLine();
				System.out.println("Entre com a primeira nota");
				n1 = sc.nextFloat();
				System.out.println("Entre com a nota dois");
				n2 = sc.nextFloat();
				System.out.println("Entre com a nota tres");
				n3 = sc.nextFloat();

				media[x] = (n1 + n2 + n3) / 3; // faz a soma da nota

				if (media[x] >= 6.75) {
					System.out.println("Apravado");
				} else {
					System.out.println("Reprovado");
				}

				somaMedia += media[x]; // armazena a media de todos os alunos
				System.out.println("/A media da turma " + somaMedia);
			}
			mg = somaMedia / 4; // soma geral da turma
			System.out.println("/nNota geral da Turma " + mg);

			System.out.println("---------------------------------------------------------------------");

			int valor[][] = new int[3][3];
			int linha, coluna, somaValor = 0;

			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					System.out.println("\nEntre com um valor ");
					valor[linha][coluna] = sc.nextInt();
					somaValor += valor[linha][coluna];

				}
			}
			System.out.println("Somatório dos valores da matriz foi de: " + somaValor);

			sc.close();
		}
	}

}
